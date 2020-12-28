public class Album {
	private String name;
	private String condition;
	private PhotoManager manager;
	// Constructor
	public Album(String name, String condition, PhotoManager manager){
		this.name = name;
		this.condition = condition;
		this.manager = manager;
	}
	// Return the name of the album
	public String getName(){
		return this.name;
	}

	// Return the condition associated with the album
	public String getCondition(){
		return this.condition;
	}

	// Return the manager
	public PhotoManager getManager(){
		return this.manager;
	}

	// Return all photos that satisfy the album condition
	public LinkedList<Photo> getPhotos(){
		if(condition.isEmpty()) // If condition is empty return all
			return manager.getPhotos().getAllPhotos();

		// Create a linked list of tags
		LinkedList<Photo> output = new LinkedList<Photo>();
		String[] tags = this.condition.split(" AND ");

		BST<LinkedList<Photo>> bst = manager.getPhotos();

		for (int i = 0; i < tags.length; i++) // If a tag is NOT in the bst return empty list
			if(!bst.findKey(tags[i]))
				return new LinkedList<Photo>();

		// Get all photos
		LinkedList<Photo> everyPhoto = bst.getAllPhotos();
		if(everyPhoto.empty()) return everyPhoto;
		everyPhoto.findFirst();

		Photo cur;
		boolean inTags; // inTags: Photo exists in all relevant tags
		LinkedList<Photo> tagImgs;
		while (true) { // For each image
			cur = everyPhoto.retrieve();
			inTags = true;
			for (int i = 0; i < tags.length; i++) { // For each tag
				bst.findKey(tags[i]);
				tagImgs = bst.retrieve(); // Tags inside BST are always non-empty

				if (!findll(cur, tagImgs)) {
					inTags = false;
					break;
				}
			}
			// If Photo is in condition tags then insert into output
			if (inTags)
				output.insert(cur);

			if (everyPhoto.last()) break;
			everyPhoto.findNext();
		}
		return output;
	}

	// Return the number of tag comparisons used to find all photos of the album
	public int getNbComps(){
		if (condition.isEmpty()) return 0;

		BST<LinkedList<Photo>> bst = manager.getPhotos();
		int counter = 0;

		String[] tags = this.condition.split(" AND ");
		for (int i=0; i < tags.length; i++)
			counter += bst.getNbComp(tags[i]);

		return counter;
	}

	public <G> boolean findll(G p, LinkedList<G> ll) {
		// Searched the LinkedList until finding p (and leaves current there). Returns true on success and false otherwise
		if(ll.empty()) return false;

		ll.findFirst();
		while(true) {
			if(p.equals(ll.retrieve()))
				return true;
			if(ll.last()) break;
			ll.findNext();
		}

		return false;
	}
}
