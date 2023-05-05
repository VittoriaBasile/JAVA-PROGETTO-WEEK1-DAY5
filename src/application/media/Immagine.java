package application.media;

public class Immagine extends ElementoMultimediale implements Mostrabile {
	private int luminosità = 0;

	public Immagine(String tipoFile, String Titolo) {
		super(tipoFile, Titolo, false);
		setLuminosità(luminosità);

	}

	public Immagine(String tipoFile, String Titolo, int luminosità) {
		super(tipoFile, Titolo, false);
		setLuminosità(luminosità);
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

}
