package it.andrea.libri.model;

public class Libro {
	


	private String titolo;
	private int annoPublicazione;
	
	public Libro(String titolo, int annoPublicazione) {
		super();
		this.titolo = titolo;
		this.annoPublicazione = annoPublicazione;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPublicazione() {
		return annoPublicazione;
	}

	public void setAnnoPublicazione(int annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annoPublicazione;
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (annoPublicazione != other.annoPublicazione)
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", annoPublicazione=" + annoPublicazione + "]";
	}
	
	

}
