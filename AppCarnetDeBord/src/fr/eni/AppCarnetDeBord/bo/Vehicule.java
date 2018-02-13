package fr.eni.AppCarnetDeBord.bo;

public class Vehicule {

  	 private Integer id;
	 private String immatriculation;
	 private String marque;
	 private String modele;
	 private Integer nbPlaces;
	 private Double kilometrage;
	
	 public Vehicule(){
		 super();
	 }
	 
	 public Vehicule(String immatriculation, String marque, String modele, Integer nbPlaces, Double kilometrage) {
		super();
		setImmatriculation(immatriculation);
		setMarque(marque);
		setModele(modele);
		setNbPlaces(nbPlaces);
		setKilometrage(kilometrage);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Integer getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public Double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(Double kilometrage) {
		this.kilometrage = kilometrage;
	}
  
}