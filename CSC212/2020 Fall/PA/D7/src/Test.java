
public class Test {

	public static void main(String[] args) {

		LinkedList<String> tag1 = new LinkedList<String>(); // empty tag
		LinkedList<String> tag2 = new LinkedList<String>(); 
		tag2.insert("hello");


		Photo p1 = new Photo("hedgehog.jpg", tag1);
		Photo p2 = new Photo("bear.jpg", tag1);
		Photo p3 = new Photo("butterfly1.jpg", tag1);
	

		PhotoManager pm = new PhotoManager();

		pm.addPhoto(p1);
		pm.addPhoto(p2);
		pm.addPhoto(p3);
		pm.addPhoto(new Photo("something.jpg", null)); // shouldn't be added
		pm.addPhoto(new Photo("bear.jpg", tag2)); // shouldn't be added
		pm.addPhoto(new Photo("cockatoo.jpg", new LinkedList<String>())); // add it

		Album album = new Album("ALL", "", pm);
		System.out.println("All Photos in Album");
		display(album.getPhotos()); // displays all photos
		System.out.println("_________________________________________");

		pm.deletePhoto("butterfly1.jpg");
		pm.deletePhoto("hedgehog.jpg");
		pm.deletePhoto("hedgehog.jpg");

		album = new Album("empty", "gecko", pm);
		System.out.println("All Photos Containing gecko Tag");
		display(album.getPhotos()); // should be empty
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		pm.addPhoto(p1);
		album = new Album("Bears", "animal AND grass AND bear", pm);
		System.out.println("All Photos Containing animal and grass and bear Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		album = new Album("Wolf", "wolf AND sky AND snow AND cloud", pm);
		System.out.println("All Photos Containing wolf and sky and snow and cloud Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		
		System.out.println("_________________________________________");

		album = new Album("Lizard", "animal AND desert", pm);
		System.out.println("All Photos Containing desert and animal Tags");
		display(album.getPhotos());
		System.out.println(album.getNbComps());
		System.out.println();
		
		System.out.println("_________________________________________");

		pm.deletePhoto("image.jpg");
		pm.addPhoto(new Photo("image.jpg", new LinkedList<String>()));
		pm.deletePhoto("image.jpg");
		
		album = new Album("ALL", "", pm);
		System.out.println("All Photos in Album");
		display(album.getPhotos()); 
		System.out.println(album.getNbComps());
	}

	public static void display(LinkedList<Photo> l) {
		if (l == null || l.empty()) {
			System.out.println("Empty Photo List \n");
			return;
		}
		l.findFirst();
		while (!l.last()) {
			System.out.print(l.retrieve().getPath() + " --> ");
			l.findNext();
		}
		System.out.print(l.retrieve().getPath());
		System.out.println("\n");
	}

}