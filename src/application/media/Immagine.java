package application.media;

public class Immagine extends ElementoMultimediale implements Mostrabile {
	public int luminosità = 0;

	public Immagine(String tipoFile, String Titolo) {
		super(tipoFile, Titolo, false);
		setLuminosità(getLuminosità());

	}

	public Immagine(String tipoFile, String Titolo, int luminosità) {
		super(tipoFile, Titolo, false);
		setLuminosità(luminosità);
	}

	public int getLuminosità() {

		return luminosità;
	}

	public int setLuminosità(int luminosità) {
		if (luminosità >= 0) {
			this.luminosità = luminosità;

		}
		return luminosità;
	}

}
