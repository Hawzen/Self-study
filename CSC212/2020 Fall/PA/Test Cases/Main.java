//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p9 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p9);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "insect", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}

//OUTPUT: 5

//----------------------------------------------------------------------------------------------------------------------------------------
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "insect AND black", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT:12
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("grass");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT: 7
//---------------------------------------------------------------------------------------------------------
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("grass");
//		tag1.insert("animal");
//		tag1.insert("apple");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}

//OUTPUT: 6
//
//----------------------------------------------------------------------------------------
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("grass");
//		tag1.insert("apple");
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("animal");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("insect");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear AND grass AND animal", pm);
//
//		System.out.println(a.getNbComps());
//	}
//}
//
//OUTPUT: 7

//The Second File

//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bear", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("panda.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//
//OUTPUT:
//bear.jpg
//panda.jpg
//----------------------------------------
//bear.jpg
//
//
//---------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "animal AND grass", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("panda.jpg");
//		pm.deletePhoto("bear.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//hedgehog.jpg
//bear.jpg
//fox.jpg
//panda.jpg
//----------------------------------------
//hedgehog.jpg
//fox.jpg
//
//---------------------------------------------------------------------------------------------------------------------------------------
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//hedgehog.jpg
//bear.jpg
//butterfly1.jpg
//butterfly2.jpg
//fox.jpg
//panda.jpg
//wolf.jpg
//raccoon.jpg
//----------------------------------------
//hedgehog.jpg
//bear.jpg
//butterfly1.jpg
//butterfly2.jpg
//fox.jpg
//panda.jpg
//wolf.jpg
//raccoon.jpg
//
//---------------------------------------------------------------------------------------------------------------------------------------

//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "snakes", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//
//No Photos
//----------------------------------------
//No Photos
//
//----------------------------------------------------------------------------------------------------------------------
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> tag1 = new LinkedList<String>();
//		tag1.insert("animal");
//		tag1.insert("headgehog");
//		tag1.insert("apple");
//		tag1.insert("grass");
//
//		LinkedList<String> tag2 = new LinkedList<String>();
//		tag2.insert("animal");
//		tag2.insert("bear");
//		tag2.insert("cub");
//		tag2.insert("grass");
//
//		LinkedList<String> tag3 = new LinkedList<String>();
//		tag3.insert("insect");
//		tag3.insert("butterfly");
//		tag3.insert("flower");
//		tag3.insert("color");
//
//		LinkedList<String> tag4 = new LinkedList<String>();
//		tag4.insert("insect");
//		tag4.insert("butterfly");
//		tag4.insert("flower");
//		tag4.insert("black");
//
//		LinkedList<String> tag5 = new LinkedList<String>();
//		tag5.insert("animal");
//		tag5.insert("fox");
//		tag5.insert("tree");
//		tag5.insert("grass");
//
//		LinkedList<String> tag6 = new LinkedList<String>();
//		tag6.insert("animal");
//		tag6.insert("bear");
//		tag6.insert("panda");
//		tag6.insert("grass");
//
//		LinkedList<String> tag7 = new LinkedList<String>();
//		tag7.insert("animal");
//		tag7.insert("wolf");
//		tag7.insert("sky");
//		tag7.insert("snow");
//
//		LinkedList<String> tag8 = new LinkedList<String>();
//		tag8.insert("animal");
//		tag8.insert("raccoon");
//		tag8.insert("log");
//		tag8.insert("snow");
//
//		Photo p1 = new Photo("hedgehog.jpg", tag1);
//		Photo p2 = new Photo("bear.jpg", tag2);
//		Photo p3 = new Photo("butterfly1.jpg", tag3);
//		Photo p4 = new Photo("butterfly2.jpg", tag4);
//		Photo p5 = new Photo("fox.jpg", tag5);
//		Photo p6 = new Photo("panda.jpg", tag6);
//		Photo p7 = new Photo("wolf.jpg", tag7);
//		Photo p8 = new Photo("raccoon.jpg", tag8);
//
//		PhotoManager pm = new PhotoManager();
//
//		pm.addPhoto(p1);
//		pm.addPhoto(p2);
//		pm.addPhoto(p3);
//		pm.addPhoto(p4);
//		pm.addPhoto(p5);
//		pm.addPhoto(p6);
//		pm.addPhoto(p7);
//		pm.addPhoto(p8);
//
//		Album a = new Album("bears", "bearANDgrassANDsnow", pm);
//
//		LinkedList<Photo> PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//		System.out.println("----------------------------------------");
//
//		pm.deletePhoto("lion.jpg");
//		
//		PhotosOfA = a.getPhotos();
//
//		if (!PhotosOfA.empty()) {
//
//			PhotosOfA.findFirst();
//
//			while (!PhotosOfA.last()) {
//
//				System.out.println(PhotosOfA.retrieve().getPath());
//				PhotosOfA.findNext();
//
//			}
//
//			System.out.println(PhotosOfA.retrieve().getPath());
//
//		} else {
//
//			System.out.println("No Photos");
//		}
//	}
//
//}
//
//OUTPUT:
//
//No Photos
//----------------------------------------
//No Photos

//public class Main {
//
//    public static void main(String[] args) {
//
//        /*
//        Tags Diagram (Tags before deletion of any photo):
//                 Animal
//                   +
//                   |
//                   |
//                   |
//                   |
//                   +---------->Creature
//                                 ++
//                                 ||
//                                 ||
//                                 ||
//                                 ||
//                  Big  <-------------------->Fly
//                   +
//                   |
//                   |
//                   |
//                   |
//                   +---->Bug
//
//        */
//        String[][] tags = {{"animal", "creature"}, {"big", "animal"}, {"bug", "fly", "animal"}};
//        String[] names = {"panda.jpg", "bigfoot.png", "butterfly.jpg"};
//        PhotoManager pm = new PhotoManager();
//
//        for (int i = 0; i < 3; i++)
//            pm.addPhoto(new Photo(names[i], arrToLL(tags[i])));
//
//        Album album;
//        LinkedList<Photo> albumPhotos;
//
//        /*
//         * FOR THE FOLLOWING TESTS TO WORK YOU NEED TO FOLLOW THIS:
//         *   The list of photos that belong to the album is determined at the time when
//         *   the method getPhotos is called, not when the album is created.
//         * */
//
//        System.out.println("___________Album 0___________\n\tTest: General condition\n");
//        album = new Album("doesn't matter", "fly", pm);
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//        System.out.println("\n\n\n___________Album 1___________\n\tTest: Tag deletion (empty tags in BST should be removed)\n");
//        album = new Album("doesn't matter", "fly", pm);
//        pm.deletePhoto("butterfly.jpg");
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//        System.out.println("\n\n\n___________Album 2___________\n\tTest: Double addition\n");
//        album = new Album("doesn't matter", "fly", pm);
//        pm.addPhoto(new Photo("butterfly.jpg", new LinkedList<>()));
//        LinkedList<String> fakeList = new LinkedList<>(); fakeList.insert("fly");
//        pm.addPhoto(new Photo("butterfly.jpg", fakeList));
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//        System.out.println("\n\n\n___________Album 3___________\n\tTest: Empty condition\n");
//        album = new Album("doesn't matter", "", pm);
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//
//        System.out.println("\n\n\n___________Album 4___________\n\tTest: Foreign condition\n");
//        album = new Album("doesn't matter", "alien", pm);
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//        System.out.println("\n\n\n___________Album 5___________\n\tTest: Partially foreign condition\n");
//        album = new Album("doesn't matter", "animal AND alien", pm);
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//
//        System.out.println("\n\n\n___________Album 6___________\n\tTest: Addition of a photo with no tags\n");
//        album = new Album("doesn't matter", "", pm);
//        pm.addPhoto(new Photo("Tyrannosaurus_x.jpg", new LinkedList<>()));
//        albumPhotos = album.getPhotos();
//        System.out.printf("Photos found using the condition \"%s\" are:\n", album.getCondition()); printLL(albumPhotos);
//        System.out.printf("Number of comparisons of condition \"%s\" is %d", album.getCondition(), album.getNbComps());
//    }
//
//    private static <T> LinkedList<T> arrToLL(T[] arr){
//        LinkedList<T> list = new LinkedList<T>();
//        for (T el : arr)
//            list.insert(el);
//        return list;
//    }
//
//    private static void printLL(LinkedList<Photo> ll){
//        ll.findFirst();
//        if(ll.empty()) return;
//        while(true){
//            System.out.println(ll.retrieve().getPath());
//            if(ll.last()) return;
//            ll.findNext();
//        }
//    }
//}
// Output
//___________Album 0___________
//	Test: General condition
//
//Photos found using the condition "fly" are:
//butterfly.jpg
//Number of comparisons of condition "fly" is 3
//
//
//___________Album 1___________
//	Test: Tag deletion (empty tags in BST should be removed)
//
//Photos found using the condition "fly" are:
//Number of comparisons of condition "fly" is 2
//
//
//___________Album 2___________
//	Test: Double addition
//
//Photos found using the condition "fly" are:
//Number of comparisons of condition "fly" is 2
//
//
//___________Album 3___________
//	Test: Empty condition
//
//Photos found using the condition "" are:
//panda.jpg
//bigfoot.png
//butterfly.jpg
//Number of comparisons of condition "" is 0
//
//
//___________Album 4___________
//	Test: Foreign condition
//
//Photos found using the condition "alien" are:
//Number of comparisons of condition "alien" is 1
//
//
//___________Album 5___________
//	Test: Partially foreign condition
//
//Photos found using the condition "animal AND alien" are:
//Number of comparisons of condition "animal AND alien" is 2
//
//
//___________Album 6___________
//	Test: Addition of a photo with no tags
//
//Photos found using the condition "" are:
//panda.jpg
//bigfoot.png
//butterfly.jpg
//Tyrannosaurus_x.jpg
//Number of comparisons of condition "" is 0

// ----------------------------------------------------------------------------------------------------------------------------------

//public class Main {
//
// First add this method in your BST 
	//    public BSTNode<T> getRoot() {
	//        return root;
	//    }
//	public static void inOrder(BST<LinkedList<Photo>> index) {
//		if (index.empty())
//			System.out.println("empty tree");
//		else
//			recinOrder(index.getRoot());
//	}
//
//	private static void recinOrder(BSTNode<LinkedList<Photo>> p) {
//		if (p == null)
//			return;
//		recinOrder(p.left);
//		System.out.println("key= " + p.key);
//		displayListOfPhoto(p.data);
//		recinOrder(p.right);
//	}
//
//	public static void displayListOfPhoto(LinkedList<Photo> L) {
//		if (L == null) {
//			System.out.println("null List");
//		} else if (L.empty()) {
//			System.out.println("empty list");
//		} else {
//			L.findFirst();
//			while (!L.last()) {
//				System.out.print(L.retrieve().getPath() + " ");
//				L.findNext();
//			}
//			// L.retrieve().display();
//			System.out.println(L.retrieve().getPath() + " ");
//			System.out.println("---------------- --------------");
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println("the follwing checking photo manager ");
//		System.out.println("==================== ==================");
//		LinkedList<String> tags1 = new LinkedList<String>();
//		tags1.insert("animal");
//		tags1.insert("hedgehog");
//		tags1.insert("apple");
//		tags1.insert("grass");
//		tags1.insert("green");
//		// L.retrieve().display();
//		Photo p1 = new Photo("hedgehog.jpg", tags1);
//		LinkedList<String> tags2 = new LinkedList<String>();
//		tags2.insert("animal");
//		tags2.insert("bear");
//		tags2.insert("cub");
//		tags2.insert("grass");
//		tags2.insert("wind");
//		Photo p2 = new Photo("bear.jpg", tags2);
//		LinkedList<String> tags3 = new LinkedList<String>();
//		tags3.insert("insect");
//		tags3.insert("butterfly");
//		tags3.insert("flower");
//		tags3.insert("color");
//		Photo p3 = new Photo("butterfly1.jpg", tags3);
//		LinkedList<String> tags4 = new LinkedList<String>();
//		tags4.insert("insect");
//		tags4.insert("butterfly");
//		tags4.insert("black");
//		tags4.insert("flower");
//		Photo p4 = new Photo("butterfly2.jpg", tags4);
//
//		LinkedList<String> tags5 = new LinkedList<String>();
//		tags5.insert("animal");
//		tags5.insert("fox");
//		tags5.insert("tree");
//		tags5.insert("forest");
//		tags5.insert("grass");
//		Photo p5 = new Photo("fox.jpg", tags5);
//		LinkedList<String> tags6 = new LinkedList<String>();
//		tags6.insert("animal");
//		tags6.insert("bear");
//		tags6.insert("panda");
//		tags6.insert("grass");
//		Photo p6 = new Photo("panda.jpg", tags6);
//		LinkedList<String> tags7 = new LinkedList<String>();
//		tags7.insert("animal");
//		tags7.insert("wolf");
//		tags7.insert("mountain");
//		tags7.insert("sky");
//		tags7.insert("snow");
//		tags7.insert("cloud");
//		Photo p7 = new Photo("wolf.jpg", tags7);
//
//		LinkedList<String> tags8 = new LinkedList<String>();
//		tags8.insert("animal");
//		tags8.insert("raccoon");
//		tags8.insert("log");
//		tags8.insert("snow");
//		Photo p8 = new Photo("raccoon.jpg", tags8);
//		//////////////////
//		PhotoManager manager1 = new PhotoManager();
//		manager1.addPhoto(p1);
//		manager1.addPhoto(p1);
//		BST<LinkedList<Photo>> index = manager1.getPhotos();
//		System.out.println("==================== ==================");
//		System.out.println("After Adding first Photo index as follwing");
//		inOrder(index);
//		System.out.println("End Adding first Photo index .........");
//		System.out.println("==================== ==================");
//		manager1.deletePhoto("hedgehog.jpg");
//		index = manager1.getPhotos();
//
//		System.out.println("==================== ==================");
//		System.out.println("After deleting first Photo index as follwing");
//		inOrder(index);
//		System.out.println("End deleting first Photo index .........");
//		System.out.println("==================== ==================");
//		manager1.addPhoto(p2);
//		manager1.addPhoto(p3);
//		manager1.addPhoto(p4);
//		manager1.addPhoto(p5);
//		manager1.addPhoto(p6);
//		manager1.addPhoto(p7);
//		manager1.addPhoto(p8);
//		index = manager1.getPhotos();
//		System.out.println("==================== ==================");
//		System.out.println("After Adding 8 Photos index as follwing");
//		inOrder(index);
//		System.out.println("End Adding 8 Photos index .........");
//		System.out.println("==================== ==================");
//
//		manager1.deletePhoto("hedgehog.jpg");
//		manager1.deletePhoto("bear.jpg");
//		manager1.deletePhoto("butterfly1.jpg");
//		manager1.deletePhoto("butterfly2.jpg");
//		manager1.deletePhoto("fox.jpg");
//		manager1.deletePhoto("panda.jpg");
//		manager1.deletePhoto("wolf.jpg");
//		manager1.deletePhoto("raccoon.jpg");
//		index = manager1.getPhotos();
//		System.out.println("==================== ==================");
//		System.out.println("After deleting All Photo index as follwing");
//		inOrder(index);
//		System.out.println("End deleting All Photo index .........");
//		System.out.println("==================== ==================");
//		System.out.println("End checking photo manager ");
//		System.out.println("==================== ==================");
//
//		System.out.println("the follwing checking Album......... ");
//		System.out.println("==================== ==================");
//		manager1.addPhoto(p1);
//		manager1.addPhoto(p2);
//		manager1.addPhoto(p3);
//		manager1.addPhoto(p4);
//		manager1.addPhoto(p5);
//		manager1.addPhoto(p6);
//		manager1.addPhoto(p7);
//		manager1.addPhoto(p8);
//		Album A = new Album("album1", "animal AND grass", manager1);
//		LinkedList<Photo> res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//		A = new Album("album1", "animal", manager1);
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//		A = new Album("album1", "animal AND gra", manager1);
//
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//		A = new Album("album1", "animal AND grass AND panda", manager1);
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//		A = new Album("album1", "animal AND grass AND bear", manager1);
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//		A = new Album("album1", "animal AND gra AND bear", manager1);
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//
//		A = new Album("album1", "", manager1);
//		res = A.getPhotos();
//		displayListOfPhoto(res);
//		System.out.println(A.getNbComps());
//
//	}
//
//}

//Output
//the follwing checking photo manager
//======================================
//======================================
//After Adding first Photo index as follwing
//key= animal
//hedgehog.jpg
//------------------------------
//key= apple
//hedgehog.jpg
//------------------------------
//key= grass
//hedgehog.jpg
//------------------------------
//key= green
//hedgehog.jpg
//------------------------------
//key= hedgehog
//hedgehog.jpg
//------------------------------
//End Adding first Photo index .........
//======================================
//======================================
//After deleting first Photo index as follwing
//empty tree
//End deleting first Photo index .........
//======================================
//======================================
//After Adding 8 Photos index as follwing
//key= animal
//bear.jpg fox.jpg panda.jpg wolf.jpg
//raccoon.jpg
//------------------------------
//key= bear
//bear.jpg panda.jpg
//------------------------------
//key= black
//butterfly2.jpg
//------------------------------
//key= butterfly
//butterfly1.jpg butterfly2.jpg
//------------------------------
//key= cloud
//wolf.jpg
//------------------------------
//key= color
//butterfly1.jpg
//------------------------------
//key= cub
//bear.jpg
//------------------------------
//key= flower
//butterfly1.jpg butterfly2.jpg
//------------------------------
//key= forest
//fox.jpg
//------------------------------
//key= fox
//fox.jpg
//------------------------------
//key= grass
//bear.jpg fox.jpg panda.jpg
//------------------------------
//key= insect
//butterfly1.jpg butterfly2.jpg
//------------------------------
//key= log
//raccoon.jpg
//------------------------------
//key= mountain
//wolf.jpg
//------------------------------
//key= panda
//panda.jpg
//------------------------------
//key= raccoon
//raccoon.jpg
//------------------------------
//key= sky
//wolf.jpg
//------------------------------
//key= snow
//wolf.jpg raccoon.jpg
//------------------------------
//key= tree
//fox.jpg
//------------------------------
//key= wind
//bear.jpg
//------------------------------
//key= wolf
//wolf.jpg
//------------------------------
//End Adding 8 Photos index .........
//======================================
//======================================
//After deleting All Photo index as follwing
//empty tree
//End deleting All Photo index .........
//======================================
//End checking photo manager
//======================================
//the follwing checking Album.........
//======================================
//hedgehog.jpg bear.jpg fox.jpg panda.jpg
//------------------------------
//5
//hedgehog.jpg bear.jpg fox.jpg panda.jpg wolf.jpg raccoon.jpg
//------------------------------
//1
//empty list
//9
//panda.jpg
//------------------------------
//11
//bear.jpg panda.jpg
//------------------------------
//10
//empty list
//14
//hedgehog.jpg bear.jpg fox.jpg panda.jpg wolf.jpg raccoon.jpg butterfly2.jpg butterfly1.jpg
//------------------------------
//0


//public class Main {

//First Add this method in your classes

//add to LinkedList
	//    @Override
	//    public String toString() {
	//	String s = "[";
	//	for (Node<T> c = head; c != null; c = c.next) {
	//	    s += c.data + " ";
	//	}
	//	return s + "]";
	// 

//add to BSTNode

	//    @Override
	//    public String toString() {
	//	return toString("");
	//    }
	//
	//    private String toString(String ident) {
	//	return ident + key + " = " + data.toString() +
	//		((left == null) ? "" : "\n" + left.toString(ident + '\t')) +
	//		((right == null) ? "" : "\n" + right.toString(ident + '\t'));
	//    }

//add to BST
	//    @Override
	//    public String toString() {
	//	if (root == null)
	//	    return "NULL";
	//	return root.toString();
	//    }

//add to photo
	//    @Override
	//    public String toString() {
	//	return "Photo {path=" + path + "}";
	//    }

//add to PhotoManager
//  @Override
//    public String toString() {
//	return (put which has BST<LinkedList<Photo>> data type) inverted index.toString();
//    }
	    
//    public static void main(String[] args) {
//	
//	
//	//these are some simple test cases that cover the basic utility of the PA
//	PhotoManager pm = testAdd();
//	testDelete();
//	testGetPhotos(pm);
//    }
//
//    private static void testGetPhotos(PhotoManager pm) {
//	Album a = new Album("A", "", pm);
//	System.out.println(a.getPhotos());
//
//	Album b = new Album("B", "bear", pm);
//	System.out.println(b.getPhotos());
////	
//	Album ag = new Album("ab", "animal AND grass", pm);
//	System.out.println(ag.getPhotos());
//
//	ag = new Album("ab2", "grass AND animal", pm);
//	System.out.println(ag.getPhotos());
////	
//	Album e = new Album("R", "fsdfg", pm);
//	System.out.println(e.getPhotos());
//
//	e = new Album("R2", "grass AND fsdfg", pm);
//	System.out.println(e.getPhotos());
//
//	Album s = new Album("R", "snow AND bear", pm);
//	System.out.println(s.getPhotos());
////	
//    }
//
//    private static PhotoManager testAdd() {
//
//	PhotoManager pm = new PhotoManager();
//	pm.addPhoto(creatPhoto("hedgehog.jpg", "animal", "hedgehog", "apple", "grass", "green"));
//	pm.addPhoto(creatPhoto("bear.jpg", "animal", "bear", "cub", "grass", "wind"));
//	pm.addPhoto(creatPhoto("butterfly1.jpg", "insect", "butterfly", "flower", "color"));
//	pm.addPhoto(creatPhoto("butterfly2.jpg", "insect", "butterfly", "flower", "black"));
//	pm.addPhoto(creatPhoto("fox.jpg", "animal", "fox", "tree", "forest", "grass"));
//	pm.addPhoto(creatPhoto("panda.jpg", "animal", "bear", "panda", "grass"));
//	pm.addPhoto(creatPhoto("wolf.jpg", "animal", "wolf", "mountain", "sky", "snow", "cloud"));
//	pm.addPhoto(creatPhoto("raccoon.jpg", "animal", "raccoon", "log", "snow"));
//
//	Print(pm);
//	return pm;
//    }
//
//    private static Photo creatPhoto(String path, String... tags) {
//	LinkedList<String> ll = new LinkedList<String>();
//	for (String string : tags) {
//	    ll.insert(string);
//	}
//	return new Photo(path, ll);
//    }
//
//    private static void testDelete() {
//
//	PhotoManager pm = new PhotoManager();
//
//	LinkedList<String> ll = new LinkedList<String>();
//	ll.insert("Foxtrot");
//	ll.insert("Tango");
//	ll.insert("Charlie");
//	pm.addPhoto(new Photo("x", ll));
//
//	LinkedList<String> ll2 = new LinkedList<String>();
//	ll2.insert("Foxtrot");
//	ll2.insert("3");
//	pm.addPhoto(new Photo("y", ll2));
//
//	System.out.println("deleting x");
//	Print(pm);
//
//	pm.deletePhoto("x");
//
//	System.out.println("deleting non-existing");
//	Print(pm);
//
//	pm.deletePhoto("y");
//
//	System.out.println("deleting y");
//	Print(pm);
//    }
//
//    private static void Print(PhotoManager pm) {
//	System.out.println("========================");
//	System.out.println(pm);
//	System.out.println("========================");
//
//    }
//}

// output
//========================
//animal = [Photo {path=hedgehog.jpg} Photo {path=bear.jpg} Photo {path=fox.jpg} Photo {path=panda.jpg} Photo {path=wolf.jpg} Photo {path=raccoon.jpg} ]
//	hedgehog = [Photo {path=hedgehog.jpg} ]
//		apple = [Photo {path=hedgehog.jpg} ]
//			grass = [Photo {path=hedgehog.jpg} Photo {path=bear.jpg} Photo {path=fox.jpg} Photo {path=panda.jpg} ]
//				bear = [Photo {path=bear.jpg} Photo {path=panda.jpg} ]
//					cub = [Photo {path=bear.jpg} ]
//						butterfly = [Photo {path=butterfly1.jpg} Photo {path=butterfly2.jpg} ]
//							black = [Photo {path=butterfly2.jpg} ]
//							color = [Photo {path=butterfly1.jpg} ]
//								cloud = [Photo {path=wolf.jpg} ]
//						flower = [Photo {path=butterfly1.jpg} Photo {path=butterfly2.jpg} ]
//							fox = [Photo {path=fox.jpg} ]
//								forest = [Photo {path=fox.jpg} ]
//				green = [Photo {path=hedgehog.jpg} ]
//		wind = [Photo {path=bear.jpg} ]
//			insect = [Photo {path=butterfly1.jpg} Photo {path=butterfly2.jpg} ]
//				tree = [Photo {path=fox.jpg} ]
//					panda = [Photo {path=panda.jpg} ]
//						mountain = [Photo {path=wolf.jpg} ]
//							log = [Photo {path=raccoon.jpg} ]
//						sky = [Photo {path=wolf.jpg} ]
//							raccoon = [Photo {path=raccoon.jpg} ]
//							snow = [Photo {path=wolf.jpg} Photo {path=raccoon.jpg} ]
//			wolf = [Photo {path=wolf.jpg} ]
//========================
//deleting x
//========================
//Foxtrot = [Photo {path=x} Photo {path=y} ]
//	Charlie = [Photo {path=x} ]
//		3 = [Photo {path=y} ]
//	Tango = [Photo {path=x} ]
//========================
//deleting non-existing
//========================
//Foxtrot = [Photo {path=y} ]
//	3 = [Photo {path=y} ]
//========================
//deleting y
//========================
//NULL
//========================
//[Photo {path=hedgehog.jpg} Photo {path=bear.jpg} Photo {path=fox.jpg} Photo {path=panda.jpg} Photo {path=wolf.jpg} Photo {path=raccoon.jpg} Photo {path=butterfly1.jpg} Photo {path=butterfly2.jpg} ]
//[Photo {path=bear.jpg} Photo {path=panda.jpg} ]
//[Photo {path=hedgehog.jpg} Photo {path=bear.jpg} Photo {path=fox.jpg} Photo {path=panda.jpg} ]
//[Photo {path=hedgehog.jpg} Photo {path=bear.jpg} Photo {path=fox.jpg} Photo {path=panda.jpg} ]
//[]
//[]
//[]