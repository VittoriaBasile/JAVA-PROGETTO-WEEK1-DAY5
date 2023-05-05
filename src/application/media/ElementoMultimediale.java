package application.media;

public abstract class ElementoMultimediale {
	private String tipoFile;
	private String Titolo;
	private boolean riproducibile;

	public ElementoMultimediale(String tipoFile, String Titolo, boolean riproducibile) {
		setTipoFile(tipoFile);
		setTitolo(Titolo);
		setRiproducibile(riproducibile);
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

	public boolean isRiproducibile() {
		return riproducibile;
	}

	public void setRiproducibile(boolean riproducibile) {
		this.riproducibile = riproducibile;
	}

}
