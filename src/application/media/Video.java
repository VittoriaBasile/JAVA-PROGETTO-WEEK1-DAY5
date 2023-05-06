package application.media;

public class Video extends ElementoMultimediale implements Mostrabile, Riproducibile {
	private int volume = 10;

	private int durata = 3;

	private int luminosità = 5;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

	public Video(String tipoFile, String Titolo) {
		super(tipoFile, Titolo, true);
		setLuminosità(luminosità);
		setDurata(durata);

	}

	public Video(String tipoFile, String Titolo, int durata) {
		super(tipoFile, Titolo, true);
		setDurata(durata);
		setLuminosità(luminosità);

	}

	public Video(String tipoFile, String Titolo, int durata, int luminosità) {
		super(tipoFile, Titolo, true);
		setDurata(durata);
		setLuminosità(luminosità);
	}

	public Video(String tipoFile, String Titolo, int durata, int luminosità, int volume) {
		super(tipoFile, Titolo, true);
		setDurata(durata);
		setLuminosità(luminosità);
		setVolume(volume);
	}

}
