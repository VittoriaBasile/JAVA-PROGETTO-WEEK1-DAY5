package application.media;

public abstract class ElementoMultimediale {
	private String tipoFile;
	private String Titolo;

	public ElementoMultimediale(String tipoFile, String Titolo) {
		setTipoFile(tipoFile);
		setTitolo(Titolo);

	}

	public String getTipoFile() {
		return tipoFile;
	}

	public void setTipoFile(String tipoFile) {
		this.tipoFile = tipoFile;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

}
