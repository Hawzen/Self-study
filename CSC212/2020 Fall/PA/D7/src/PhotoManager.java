public class PhotoManager {

	private BST<LinkedList<Photo>> BSTPhotos;
	// Stores All Photos
	private LinkedList<Photo> LinkedPhotos;

	// Constructor
	public PhotoManager() {
		BSTPhotos = new BST<LinkedList<Photo>>();
		LinkedPhotos = new LinkedList<Photo>();
	}

	// Add a photo
	// TODO if tag is ""
	public void addPhoto(Photo p) {

		// Checks if there is a photo or if it already exist
		if (p == null || p.getPath() == null || IsExist(p))
			return;

		LinkedList<String> tags = p.getTags();

		if (!tags.empty()) {

			InsertPhoto(LinkedPhotos, p);
			tags.findFirst();
			String tag = tags.retrieve();

			while (!tags.last()) {

				FindLinkedPhoto(p, tag);
				tags.findNext();
				tag = tags.retrieve();

			}

			FindLinkedPhoto(p, tag);

		} else {

			InsertPhoto(BSTPhotos.GetListNoTags(), p);
			InsertPhoto(LinkedPhotos, p);

		}
	}

	// Delete a photo
	public void deletePhoto(String path) {

		// Checks if there is somthing to delete
		if (LinkedPhotos.empty() || path == null)
			return;

		LinkedPhotos.findFirst();
		Photo p = null;

		// searchs for the path in LinkedPhotos
		while (!LinkedPhotos.last()) {
			if (LinkedPhotos.retrieve().getPath().equals(path))
				break;
			LinkedPhotos.findNext();
		}

		if (LinkedPhotos.retrieve().getPath().equals(path))
			p = LinkedPhotos.retrieve();

		if (p == null)
			return;

		LinkedList<String> tags = p.getTags();

		tags.findFirst();

		if (tags.empty())
			SearchAndDelete(null, path);
		else {
			while (!tags.last()) {
				SearchAndDelete(tags.retrieve(), path);
				tags.findNext();
			}
			SearchAndDelete(tags.retrieve(), path);
		}
		LinkedPhotos.remove();

	}

	// Return the inverted index of all managed photos
	public BST<LinkedList<Photo>> getPhotos() {
		return BSTPhotos;

	}

	private void InsertPhoto(LinkedList<Photo> l, Photo p) {

		/*
		 * search for the photo in a linkedlist if exist exit if not then we add it to
		 * the last of the linkedlist
		 */
		l.findFirst();

		if (l.empty())
			l.insert(p);
		else {
			while (!l.last()) {

				if (l.retrieve().equals(p))
					return;

				l.findNext();
			}
			l.insert(p);
		}

	}

	private void FindLinkedPhoto(Photo p, String tag) {

		/*
		 * serach if the tag exist in the BST if yes we insert the photo in that
		 * linkedlist if no we creat linkedlist with that tag and add it to the BST
		 */
		if (BSTPhotos.findKey(tag)) {

			InsertPhoto(BSTPhotos.retrieve(), p);

		} else {

			LinkedList<Photo> temp = new LinkedList<Photo>();
			temp.insert(p);
			BSTPhotos.insert(tag, temp);

		}

	}

	private void SearchAndDelete(String tag, String path) {

		LinkedList<Photo> TagPhotos;
		boolean InBST = true;

		if (tag == null) {
			TagPhotos = BSTPhotos.GetListNoTags();
			InBST = false;
		} else if (BSTPhotos.findKey(tag))
			TagPhotos = BSTPhotos.retrieve();
		else
			return;

		TagPhotos.findFirst();

		// Checks if it is the last photo in that LinkedList
		if (TagPhotos.last())
			if (TagPhotos.retrieve().getPath().equals(path)) {

				if (InBST)
					BSTPhotos.removeKey(tag);
				else
					TagPhotos.remove();
				return;
			}

		while (!TagPhotos.last())
			if (TagPhotos.retrieve().getPath().equals(path)) {

				TagPhotos.remove();
				return;

			} else
				TagPhotos.findNext();

		if (TagPhotos.retrieve().getPath().equals(path))
			TagPhotos.remove();
	}

	/*
	 * @Override public String toString() { return BSTPhotos.toString(); }
	 */

	private boolean IsExist(Photo p) {

		if (LinkedPhotos.empty())
			return false;

		LinkedPhotos.findFirst();

		while (!LinkedPhotos.last()) {
			if (LinkedPhotos.retrieve().getPath().equals(p.getPath()))
				return true;
			LinkedPhotos.findNext();
		}

		if (LinkedPhotos.retrieve().getPath().equals(p.getPath()))
			return true;

		return false;
	}

}
