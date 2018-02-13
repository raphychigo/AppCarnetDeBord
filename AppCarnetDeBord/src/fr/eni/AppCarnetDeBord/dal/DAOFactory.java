package fr.eni.AppCarnetDeBord.dal;

public class DAOFactory {
	public static DAOUtilisateur getArticleDAO(){
		DAOUtilisateur  daoUtilisateur = new DAOUtilisateur();
		return daoUtilisateur;
	}
}
