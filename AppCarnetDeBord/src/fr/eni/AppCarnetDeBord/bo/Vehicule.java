package fr.eni.AppCarnetDeBord.bo;

public class Vehicule {

  	 private Integer id;
	 private String immatriculation;
	 private String marque;
	 private String modele;
	 private double kilometrage;
	 private Integer nbPlaces;	 
	 private boolean enCirculation;
	 private Lieu localisation;
	 
	 public Vehicule(){
		 super();
	 }
	 
	 public Vehicule(String immatriculation, String marque, String modele, double kilometrage, Integer nbPlaces, boolean enCirculation, Lieu localisation) {
		super();
		setImmatriculation(immatriculation);
		setMarque(marque);
		setModele(modele);
		setKilometrage(kilometrage);
		setNbPlaces(nbPlaces);		
		setEnCirculation(enCirculation);
		setLocalisation(localisation);
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

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	public boolean isEnCirculation() {
		return enCirculation;
	}

	public void setEnCirculation(boolean enCirculation) {
		this.enCirculation = enCirculation;
	}

	public Lieu getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Lieu localisation) {
		this.localisation = localisation;
	}
	
	
	
}