package application.media;

public class Audio extends ElementoMultimediale implements Riproducibile {

	private int volume = 10;

	private int durata = 3;

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
		if (durata >= 0) {
			this.durata = durata;
		}
	}

	public Audio(String tipoFile, String Titolo) {
		super(tipoFile, Titolo, true);
	}

	public Audio(String tipoFile, String Titolo, int durata) {
		super(tipoFile, Titolo, true);
		setDurata(durata);
	}

	public Audio(String tipoFile, String Titolo, int durata, int volume) {
		super(tipoFile, Titolo, true);
		setDurata(durata);
		setVolume(volume);
	}

}
