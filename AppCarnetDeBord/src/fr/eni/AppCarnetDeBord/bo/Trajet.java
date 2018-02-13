
package fr.eni.AppCarnetDeBord.bo;
import java.util.GregorianCalendar;

public class Trajet {

	private Integer id;
	private GregorianCalendar dateDebut;
	private GregorianCalendar dateFin;
	private String nature;
	private String lieuReception;
	private String destination;
	private Double kilometrageOrigine;
	private Double kmParcourue;
	private Double nbLitres;
	private Double prixTotal;
	private Vehicule vehicule;
	private Conducteur conducteur;

	public Trajet() {
		super();
	}

	public Trajet(GregorianCalendar dateDebut, String nature, String lieuReception, String destination,
			Double kilometrageOrigine, Vehicule vehicule, Conducteur conducteur) {
		super();
		this.dateDebut = dateDebut;
		this.nature = nature;
		this.lieuReception = lieuReception;
		this.destination = destination;
		this.kilometrageOrigine = kilometrageOrigine;
		this.vehicule = vehicule;
		this.conducteur = conducteur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GregorianCalendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(GregorianCalendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public GregorianCalendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(GregorianCalendar dateFin) {
		this.dateFin = dateFin;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getLieuReception() {
		return lieuReception;
	}

	public void setLieuReception(String lieuReception) {
		this.lieuReception = lieuReception;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getKilometrageOrigine() {
		return kilometrageOrigine;
	}

	public void setKilometrageOrigine(Double kilometrageOrigine) {
		this.kilometrageOrigine = kilometrageOrigine;
	}

	public Double getKmParcourue() {
		return kmParcourue;
	}

	public void setKmParcourue(Double kmParcourue) {
		this.kmParcourue = kmParcourue;
	}

	public Double getNbLitres() {
		return nbLitres;
	}

	public void setNbLitres(Double nbLitres) {
		this.nbLitres = nbLitres;
	}

	public Double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Conducteur getConducteur() {
		return conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

}