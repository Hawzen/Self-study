public class Album {

	public String name, condition;
	private PhotoManager manager;

	// Constructor
	public Album(String name, String condition, PhotoManager manager) {

		this.name = name;
		this.condition = condition;
		this.manager = manager;

	}

	// Return the name of the album
	public String getName() {
		return name;

	}

	// Return the condition associated with the album
	public String getCondition() {
		return condition;

	}

	// Return the manager
	public PhotoManager getManager() {
		return manager;

	}

	// Return all photos that satisfy the album condition
	// TODO what if cond " "
	public LinkedList<Photo> getPhotos() {

		// Checks if the condition is empty(no tags)
		if (condition == null || condition.equals("")) {

			LinkedList<Photo> temp = GetAllPhotos(manager.getPhotos().GetKeys()),
					NoTags = manager.getPhotos().GetListNoTags();

			if (!NoTags.empty()) {

				temp.findFirst();
				while (!temp.last())
					temp.findNext();

				NoTags.findFirst();

				while (!NoTags.last()) {
					System.out.println(NoTags.retrieve());
					temp.insert(NoTags.retrieve());
					NoTags.findNext();
				}

				temp.insert(NoTags.retrieve());
			}

			return temp;

		}

		String[] tags;
		tags = condition.split("AND");

		int size = 0, LastIndex = 0;

		// count the size of each linkedlist of a tag and adds it to size
		for (int i = 0; i < tags.length; i++) {

			if (manager.getPhotos().findKey(tags[i].trim()))
				size += size(manager.getPhotos().retrieve());
			else
				return new LinkedList<Photo>();
		}

		Photo ArrPhotos[] = new Photo[size];

		// adds all photos of each linkedlist of each tag to the array ArrPhotos
		for (int i = 0; i < tags.length; i++) {

			manager.getPhotos().findKey(tags[i].trim());
			LastIndex = AddPhotos(ArrPhotos, manager.getPhotos().retrieve(), LastIndex);

		}

		return GetAlbumPhotos(ArrPhotos, tags.length);

	}

	// Return the number of tag comparisons used to find all photos of the album
	public int getNbComps() {

		if (condition == null || condition.equals(""))
			return 0;

		String[] AlbumTags = condition.split("AND");

		int count = 0;

		for (int i = 0; i < AlbumTags.length; i++) {

			count += manager.getPhotos().getNbComps(AlbumTags[i].trim());
		}

		return count;

	}

	private int AddPhotos(Photo[] allPhotos, LinkedList<Photo> TagPhotos, int LastIndex) {

		/*
		 * add all photos of the linkedlist to the array and return the last index that
		 * avilable index
		 */
		if (TagPhotos.empty())
			return 0;

		int i = LastIndex;
		TagPhotos.findFirst();

		while (!TagPhotos.last()) {

			allPhotos[i++] = TagPhotos.retrieve();
			TagPhotos.findNext();

		}

		allPhotos[i++] = TagPhotos.retrieve();

		return i;

	}

	private LinkedList<Photo> GetAlbumPhotos(Photo allPhotos[], int NumberOfDuplicate) {

		/*
		 * NumberOfDuplicate is the number of tags in condiation we will check if the
		 * photo occurs that number of times if yes we add it to the album if no we
		 * continue untill we check all the array
		 */

		if (allPhotos.length == 0)
			return null;

		LinkedList<Photo> AlbumPhotos = new LinkedList<Photo>();
		int count = 1;

		for (int i = 0; i < allPhotos.length; i++) {

			for (int j = i + 1; j < allPhotos.length; j++)
				if (allPhotos[i].equals(allPhotos[j]))
					count++;

			if (count == NumberOfDuplicate)
				AlbumPhotos.insert(allPhotos[i]);

			count = 1;

		}

		return AlbumPhotos;
	}

	private <T> int size(LinkedList<T> retrieve) {

		if (retrieve.empty())
			return 0;

		int count = 1;

		retrieve.findFirst();

		while (!retrieve.last()) {
			count++;
			retrieve.findNext();
		}

		return count;
	}

	private LinkedList<Photo> GetAllPhotos(LinkedList<String> getKeys) {

		LinkedList<Photo> all = new LinkedList<Photo>();
		LinkedList<Photo> TagPhoto;
		if (getKeys.empty())
			return all;

		getKeys.findFirst();

		while (!getKeys.last()) {

			TagPhoto = manager.getPhotos().findKey(getKeys.retrieve()) ? manager.getPhotos().retrieve() : null;

			AddWithoutDup(all, TagPhoto);

			getKeys.findNext();

		}

		TagPhoto = manager.getPhotos().findKey(getKeys.retrieve()) ? manager.getPhotos().retrieve() : null;

		AddWithoutDup(all, TagPhoto);

		return all;
	}

	private void AddWithoutDup(LinkedList<Photo> all, LinkedList<Photo> tagPhoto) {

		if (tagPhoto == null || tagPhoto.empty())
			return;

		tagPhoto.findFirst();

		while (!tagPhoto.last()) {

			if (all.empty())
				all.insert(tagPhoto.retrieve());
			else {

				all.findFirst();

				while (!all.last()) {

					if (all.retrieve().equals(tagPhoto.retrieve()))
						break;

					all.findNext();
				}

				if (!(all.retrieve().equals(tagPhoto.retrieve())) && all.last())
					all.insert(tagPhoto.retrieve());
			}

			tagPhoto.findNext();
		}

		all.findFirst();

		if (all.empty())
			all.insert(tagPhoto.retrieve());
		else {

			all.findFirst();

			while (!all.last()) {

				if (all.retrieve().equals(tagPhoto.retrieve()))
					break;

				all.findNext();
			}

			if (!(all.retrieve().equals(tagPhoto.retrieve())) && all.last())
				all.insert(tagPhoto.retrieve());
		}
	}
}
