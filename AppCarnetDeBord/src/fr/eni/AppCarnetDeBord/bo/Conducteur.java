package fr.eni.AppCarnetDeBord.bo;

public class Conducteur implements Utilisateur {

  	private Integer id;
  	private String nom;
  	private String prenom;
  	private String login;

  	public Conducteur() {
		super();
	}
	
	public Conducteur(String nom, String prenom) {
		super();
		setNom(nom);
		setPrenom(prenom);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}