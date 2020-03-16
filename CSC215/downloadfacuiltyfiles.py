from requests import get
import os
from bs4 import BeautifulSoup


def downloadFiles(sources):
    """
    A function that gets all links for supported files in a KSU faculty page and downloads them locally
    supported file = 'pdf', 'doc', 'docx', 'csv', 'xls', 'html', 'txt', 'rtf', 'jpg', 'png', 'ppt', 'pptx'
    
    Input:
        Sources: A string of links and directories to tell getTargets what to get and in what directory they go 
                                                                              in the format LINK$$$$DIRCTORY\n..        
    The function also prints each successful download and its directory, and also prints each unsuccessful
    """
    supportedFiles = ('pdf', 'doc', 'docx', 'csv', 'xls', 'html', 'txt', 'rtf', 'jpg', 'png', 'ppt', 'pptx')
    for source in sources.split('\n'):
        url = source[0: source.find('$$$$')]
        directory = source[source.find('$$$$') + 4:].replace(' ', '')

        if directory == "":
            print("Ignored Link unnamed link at {}".format(url))
            continue
        elif directory[0] == "/" or directory[0] == "\\":
            directory = directory[1:]
        if directory[-1] != "\\":
            directory = directory + "\\"

        os.makedirs(os.path.dirname(directory), exist_ok=True)  # Make all needed dirs

        request = get(url)  # Get the page
        soup = BeautifulSoup(request.text, 'html.parser')  # Pass it to Beautiful Soup and extract all links (targets)
        targets = [element.find('a')['href'] for element in soup.find_all('span', 'file') if
                   element.find('a', href=True)]

        for target in targets:  # For every target, get target and make a file of it
            dot = target.rfind('.')  # Gets the file extension dot index
            start = target.rfind('/')  # Gets the index of start of file name

            if target[dot + 1:] not in supportedFiles:  # Check for support
                print('File {} not supported'.format(target))
                continue

            fetchedFile = get(target, stream=True)
            name = '{}.{}'.format(directory + target[start + 1: dot], target[dot + 1:])  # DIRECTORY.EXTENSION
            with open(name, 'wb') as file:  # Creates the file
                file.write(fetchedFile.content)
                print('Added {}'.format(name))


def getSubpages(sources, ignoreSet=None):
    """A function that takes in a String of links of KSU faculty separated by lines and gets all content filled sub
    pages of that page """
    if ignoreSet is None:
        ignoreSet = set()

    for source in sources.split('\n'):
        if source.find('$$$$') == -1:
            url = source
        else:
            url = source[:source.find('$$$$')]

        headers = {'Accept': 'text/html', 'Accept-Encoding': '', 'User-Agent': None}
        request = get(url, headers=headers)  # Get the page
        soup = BeautifulSoup(request.text, 'html.parser')  # Pass it to Beautiful Soup and extract all links (targets)

        subdirs = soup.find_all('span', 'field-content')
        hrefs = set(subdir.find('a')['href'] for subdir in subdirs if subdir.find('a', href=True))
        nodeTitle = '' if soup.find('h4', 'node-title') is None else soup.find('h4', 'node-title').text

        unexplored = hrefs.difference(ignoreSet)  # Unexplored hrefs
        allInfo = {source: nodeTitle}  # All of the info in this node

        for href in unexplored:
            ignoreSet.add(href)
        for href in unexplored:
            results = (getSubpages("https://faculty.ksu.edu.sa" + href, ignoreSet))
            for key in results:
                results[key] = nodeTitle + "/" + results[key]
            allInfo.update(results)

        return allInfo


if __name__ == '__main__':

    while True:
        choice = input(
            "Enter a number for action:\n"
            "1 : Download contents of one page\n"
            "2 : Download contents of all pages\n")
        if choice == '1':
            downloadFiles("{}$$$${}".format(input("input link:\t"), input("input folder name:\t")))
            break
        elif choice == '2':
            choice = input("Enter a number for action:\n"
                           "1 : Do for one faculty member\n"
                           "2 : Do for multiple faculty members\n")
            if choice == '1':
                a = getSubpages(input("Enter link to faculty member's homepage:\t"))

            elif choice == '2':
                members = input("Enter links of faculty members, each separated by a semicolon:\t")
                a = getSubpages(members.replace(";", '\n'))

            for link, name in a.items():
                downloadFiles("{}$$$${}".format(link, name))
