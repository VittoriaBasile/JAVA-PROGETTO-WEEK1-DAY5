package application.media;

public interface Riproducibile {
	int volume = 0;

	public static int getVolume() {

		return volume;
	}

	public static int setVolume(int volume) {

		return volume;
	}

	public static int alzaVolume(int volume) {
		return setVolume(volume);

	}

	public static int abbassaVolume(int volume) {
		return setVolume(volume);

	}

	public static String Volume(int volume) {
		String barraVolume = "";

		for (int i = 0; i < volume; i++) {
			barraVolume += "!";
		}
		return barraVolume;
	}

	public static void play(String titolo, int durata, int volume) {

		for (int i = 0; i < durata; i++) {

			System.out.println(titolo + " " + Volume(volume));

		}

	}

	public static void play(String titolo, int durata, int volume, String luminosità) {

		for (int i = 0; i < durata; i++) {

			System.out.println(titolo + " " + Volume(volume) + "" + luminosità);

		}

	}
}
