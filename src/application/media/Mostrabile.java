package application.media;

public interface Mostrabile {
	int luminosità = 0;

	public static int getLuminosità() {

		return luminosità;
	}

	public static int setLuminosità(int luminosità) {

		return luminosità;
	}

	static public int aumentaLuminosità(int luminosità) {

		return setLuminosità(luminosità);

	}

	static public int diminuisciLuminosità(int luminosità) {
		return setLuminosità(luminosità);
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
