public class PhotoManager {

	// Constructor
	private BST<LinkedList<Photo>> inverted;
	public PhotoManager(){
		inverted = new BST<LinkedList<Photo>>();
	}

	// Add a photo
	public void addPhoto(Photo p){
		if (exists(p, inverted.getAllPhotos()))
			return;

		LinkedList<String> tags = p.getTags();
		if(!tags.empty()){
			tags.findFirst();
			while(true) {
				String key = tags.retrieve();
				if (!inverted.findKey(key))  // If tag not in bst then add it
					inverted.insert(key, new LinkedList<Photo>());
				inverted.retrieve().insert(p);
				if (tags.last()) break;
				tags.findNext();
			}
		}

		// Insert photo in BST's LinkedList
		inverted.getAllPhotos().insert(p);
	}

	// Delete a photo
	public void deletePhoto(String path){

		// Search
		LinkedList<Photo> photos = inverted.getAllPhotos();

		if(photos.empty()) return;
		photos.findFirst();
		Photo cur = photos.retrieve();
		while(!cur.getPath().equals(path)){
			photos.findNext();
			cur = photos.retrieve();
			if(cur == null) return;
		}

		// Remove Node from BST's list of nodes
		photos.remove();

		// Delete
		LinkedList<String> tags = cur.getTags();
		LinkedList<Photo> tagImgs;

		if(tags.empty()) return;
		tags.findFirst();
		while (true) {
			inverted.findKey(tags.retrieve());
			tagImgs = inverted.retrieve();
			tagImgs.findFirst();
			while (true){
				if (tagImgs.retrieve().equals(cur)) {
					tagImgs.remove();
					if (tagImgs.empty())  // Delete tag if empty
						inverted.removeKey(tags.retrieve());
					break;
				}
				tagImgs.findNext();
			}
			if (tags.last()) return;
			tags.findNext();
		}
	}
	// Return the inverted index of all managed photos
	public BST<LinkedList<Photo>> getPhotos(){
		return this.inverted;
	}

	public boolean exists(Photo p, LinkedList<Photo> ll) {
		// Searched the LinkedList until finding p (and leaves current there). Returns true on success and false otherwise
		if(ll.empty()) return false;

		ll.findFirst();
		while(true) {
			if(p.getPath().equals(ll.retrieve().getPath()))
				return true;
			if(ll.last()) break;
			ll.findNext();
		}

		return false;
	}
}
