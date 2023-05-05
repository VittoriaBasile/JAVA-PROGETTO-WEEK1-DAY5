package application.media;

public interface Riproducibile {

	public static int alzaVolume(int volume) {
		return volume++;

	}

	public static int abbassaVolume(int volume) {
		return volume--;

	}

	public static String Volume(int volume) {
		String barraVolume = "!";

		for (int i = 0; i < volume; i++) {
			barraVolume += barraVolume;
		}
		return barraVolume;
	}

	public static void play(String titolo, int durata, int volume) {

		for (int i = 0; i < durata; i++) {

			System.out.println(titolo + " " + Volume(volume));

		}

	}
}
