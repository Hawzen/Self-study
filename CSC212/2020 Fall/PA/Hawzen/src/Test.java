public class Test {

    public static void main(String[] args) {

        /*
        Tags Diagram (Tags before deletion of any photo):
                 Animal
                   +
                   |
                   |
                   |
                   |
                   +---------->Creature
                                 ++
                                 ||
                                 ||
                                 ||
                                 ||
                  Big  <-------------------->Fly
                   +
                   |
                   |
                   |
                   |
                   +---->Bug
        */
        String[][] tags = {{"animal", "creature"}, {"big", "animal"}, {"bug", "fly", "animal"}};
        String[] names = {"panda.jpg", "bigfoot.png", "butterfly.jpg"};
        PhotoManager pm = new PhotoManager();

        for (int i = 0; i < 3; i++)
            pm.addPhoto(new Photo(names[i], arrToLL(tags[i])));

        Album album;
        LinkedList<Photo> albumPhotos;

        /*
         * FOR THE FOLLOWING TESTS TO WORK YOU NEED TO FOLLOW THIS:
         *   The list of photos that belong to the album is determined at the time when
         *   the method getPhotos is called, not when the album is created.
         * */

        System.out.println("___________Album 0___________\n\tTest: General condition\n");
        album = new Album("doesn't matter", "fly", pm);
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 1___________\n\tTest: Tag deletion (empty tags in BST should be removed)\n");
        album = new Album("doesn't matter", "fly", pm);
        pm.deletePhoto("butterfly.jpg");
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 2___________\n\tTest: Double addition\n");
        album = new Album("doesn't matter", "fly", pm);
        pm.addPhoto(new Photo("butterfly.jpg", new LinkedList<>()));
        LinkedList<String> fakeList = new LinkedList<>(); fakeList.insert("fly");
        pm.addPhoto(new Photo("butterfly.jpg", fakeList));
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 3___________\n\tTest: Empty condition\n");
        album = new Album("doesn't matter", "", pm);
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 4___________\n\tTest: Foreign condition\n");
        album = new Album("doesn't matter", "alien", pm);
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 5___________\n\tTest: Partially foreign condition\n");
        album = new Album("doesn't matter", "animal AND alien", pm);
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());

        System.out.println("\n\n\n___________Album 6___________\n\tTest: Addition of a photo with no tags\n");
        album = new Album("doesn't matter", "", pm);
        pm.addPhoto(new Photo("Tyrannosaurus_x.jpg", new LinkedList<>()));
        albumPhotos = album.getPhotos();
        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
    }

    private static <T> LinkedList<T> arrToLL(T[] arr){
        LinkedList<T> list = new LinkedList<T>();
        for (T el : arr)
            list.insert(el);
        return list;
    }

    private static void printLL(LinkedList<Photo> ll){
        ll.findFirst();
        if(ll.empty()) return;
        while(true){
            System.out.println(ll.retrieve().getPath());
            if(ll.last()) return;
            ll.findNext();
        }
    }
}
