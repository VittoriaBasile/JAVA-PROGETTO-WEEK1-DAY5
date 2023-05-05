package application.media;

public interface Mostrabile {

	static public void aumentaLuminosità() {

	}

	static public void diminuisciLuminosità() {

	}

	public static String Luminosità(int luminosità) {
		String barraLuminosità = "";

		for (int i = 0; i < luminosità; i++) {
			barraLuminosità += "*";
		}
		return barraLuminosità;
	}

	public static void show(String titolo, int luminosità) {

		System.out.println(titolo + " " + Luminosità(luminosità));

	}

	public static String show(int luminosità) {

		return Luminosità(luminosità);

	}

}
