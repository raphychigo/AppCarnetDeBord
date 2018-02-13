package fr.eni.AppCarnetDeBord.bo;

public class Lieu {

	private Integer idLieu;
	private String nomLieu;
	
	public  Lieu(){
		super();
	}	
	
	public Lieu(String nomLieu) {
		super();		
		setNomLieu(nomLieu);
	}
	
	public Integer getIdLieu() {
		return idLieu;
	}
	public void setIdLieu(Integer idLieu) {
		this.idLieu = idLieu;
	}
	public String getNomLieu() {
		return nomLieu;
	}
	public void setNomLieu(String nomLieu) {
		this.nomLieu = nomLieu;
	}

	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", nomLieu=" + nomLieu + "]";
	}
	
	
	
}


