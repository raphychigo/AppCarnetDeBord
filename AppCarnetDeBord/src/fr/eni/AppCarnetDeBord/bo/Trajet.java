
package fr.eni.AppCarnetDeBord.bo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Trajet {

	private Integer id;
	private GregorianCalendar dateDebut;
	private GregorianCalendar dateFin;
	private String commentaire;	
	private Double kilometrageOrigine;
	private Double kilometrageFin;
	private Double kmParcourus;
	private Double nbLitres;
	private Double prixTotal;
	private Motif motif;
	private Lieu lieuReception;
	private Lieu destination;
	private Vehicule vehicule;
	private List<Conducteur> conducteurs;

	public Trajet() {
		super();
	}

	public Trajet(GregorianCalendar dateDebut, Motif motif, String commentaire, Lieu lieuReception, Lieu destination,
			Double kilometrageOrigine, Vehicule vehicule, List<Conducteur> conducteurs) {
		super();
		this.dateDebut = dateDebut;
		this.commentaire = commentaire;
		this.setMotif(motif);
		this.lieuReception = lieuReception;
		this.destination = destination;
		this.kilometrageOrigine = kilometrageOrigine;
		this.vehicule = vehicule;
		this.conducteurs = conducteurs;
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

	

	public Lieu getLieuReception() {
		return lieuReception;
	}

	public void setLieuReception(Lieu lieuReception) {
		this.lieuReception = lieuReception;
	}

	public Lieu getDestination() {
		return destination;
	}

	public void setDestination(Lieu destination) {
		this.destination = destination;
	}

	public Double getKilometrageOrigine() {
		return kilometrageOrigine;
	}

	public void setKilometrageOrigine(Double kilometrageOrigine) {
		this.kilometrageOrigine = kilometrageOrigine;
	}

	public Double getKmParcourus() {
		return kmParcourus;
	}

	public void setKmParcourus(Double kmParcourue) {
		this.kmParcourus = kmParcourue;
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

	

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	public Double getKilometrageFin() {
		return kilometrageFin;
	}

	public void setKilometrageFin(Double kilometrageFin) {
		this.kilometrageFin = kilometrageFin;
	}

	public List<Conducteur> getConducteurs() {
		return conducteurs;
	}

	public void setConducteurs(List<Conducteur> conducteurs) {
		this.conducteurs = conducteurs;
	}

}