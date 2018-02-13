package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AccesBase {
	public static Connection getConnection() throws SQLException{
		Connection cnx = null;
		InitialContext jndi= null;
		DataSource ds = null;
		//----> Obtenir une référence sur le contexte initial JNDI
		try{
			jndi = new InitialContext();
		}catch(NamingException e){
			throw new SQLException("Erreur d'accès au contexte initial JNDI");
		}
		//----> recherche du pool de connexion dans l'annuaire
		try{
			ds=(DataSource)jndi.lookup("java:comp/env/jdbc/GESTION_FLOTTE_DB");
		}catch(NamingException e){
			throw new SQLException("Objet introuvable dans l'arbre JNDI:"+e.getMessage());
		}
		//----> obtenir une connexion
		try{
			cnx = ds.getConnection();
			return cnx;
		}
		catch(SQLException e){
			throw new SQLException("Impossible d'obtenir une connexion:"+e.getMessage());
		}
	}
	
	
//	private static String connectionString;
//	static {
//		try{
//			//chargement du driver pour SQLServer (paramètres externalisés dans le fichier settings.xml)
//			Class.forName(Settings.getProperty("driver"));
//			connectionString = Settings.getProperty("url");
//		}catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	}
//	
//	public static Connection getConnection() throws SQLException{
//		
//		Connection connexion =  DriverManager.getConnection(connectionString);
//		
//		return connexion;		
//	}
}
