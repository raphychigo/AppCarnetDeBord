package fr.eni.AppCarnetDeBord.bo;

public class Motif {
	private int idMotif;
	private String nomMotif;
	
	
	public Motif() {
		super();
	}
	
	public Motif(String nomMotif) {
		super();
		this.nomMotif = nomMotif;
	}

	public int getIdMotif() {
		return idMotif;
	}

	public void setIdMotif(int idMotif) {
		this.idMotif = idMotif;
	}

	public String getNomMotif() {
		return nomMotif;
	}

	public void setNomMotif(String nomMotif) {
		this.nomMotif = nomMotif;
	}

	@Override
	public String toString() {
		return "Motif [idMotif=" + idMotif + ", nomMotif=" + nomMotif + "]";
	}
	
	
	
	
}
