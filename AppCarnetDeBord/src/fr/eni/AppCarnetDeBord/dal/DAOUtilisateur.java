package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import fr.eni.AppCarnetDeBord.bo.Administrateur;
import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Utilisateur;

public class DAOUtilisateur implements DAO {
	
	private final static String  ADMIN = "Administrateur";
	private final static String  CONDUCTEUR = "Conducteur";
	
	
	public static void insert(Utilisateur user, String mdp) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String insert = "insert into Utilisateurs(codeUtilisateur,nomUtilisateur,prenomUtilisateur,mdpUtilisateur,typeUtilisateur) " + "values(?,?,?,?,?);";
			PreparedStatement rqt = cnx.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			
			
			if(user instanceof Administrateur){
				Administrateur admin = (Administrateur)user;
				rqt.setString(1, admin.getLogin());
				rqt.setString(2, admin.getNom());
				rqt.setString(3, admin.getPrenom());
				rqt.setString(4, mdp);
				rqt.setString(5, ADMIN);
			}
			
			if(user instanceof Conducteur){
				Conducteur conducteur = (Conducteur)user;
				rqt.setString(1, conducteur.getLogin());
				rqt.setString(2, conducteur.getNom());
				rqt.setString(3, conducteur.getPrenom());
				rqt.setString(4, mdp);
				rqt.setString(5, CONDUCTEUR);
			}
			
			
			rqt.executeUpdate();
			ResultSet key = rqt.getGeneratedKeys();
			key.next();
			if(user instanceof Administrateur){
				((Administrateur) user).setId(key.getInt(1));
			}
			if(user instanceof Conducteur){
				((Conducteur) user).setId(key.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	public static ArrayList<Utilisateur> selectAll() throws SQLException {
		Connection cnx = null;
		ArrayList<Utilisateur> lu = new ArrayList<>();
		try {
			

			cnx = AccesBase.getConnection();
			String select = "select idUtilisateur,nomUtilisateur,prenomUtilisateur from Utilisateurs";
			Statement rqt = cnx.createStatement();
			ResultSet res = rqt.executeQuery(select);
			while (res.next()) {
				if(res.getString("typeUtilisateur").trim().equals(ADMIN)){
					Administrateur u = new Administrateur(res.getString("nom"), res.getString("prenom"));
					u.setId(res.getInt("idUtilisateur"));
					lu.add(u);
				}
				if(res.getString("typeUtilisateur").trim().equals(CONDUCTEUR)){
					Conducteur u = new Conducteur(res.getString("nom"), res.getString("prenom"));
					u.setId(res.getInt("idUtilisateur"));
					lu.add(u);
				}
			}
				
				
				
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return lu;
	}
	
	
	public static Utilisateur selectUser(String login,String mdp) throws SQLException {
		Connection cnx = null;
		
		try {
			cnx = AccesBase.getConnection();
			String select = "select idUtilisateur,nomUtilisateur,prenomUtilisateur,typeUtilisateur from Utilisateurs where codeUtilisateur = ? and mdpUtilisateur = ?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setString(1, login);
			rqt.setString(2, mdp);
			ResultSet res = rqt.executeQuery();
			if(res.next()){
				if(res.getString("typeUtilisateur").trim().equals(ADMIN)){
					Administrateur admin = new Administrateur(res.getString("nomUtilisateur"),res.getString("prenomUtilisateur"));
					admin.setId(res.getInt("idUtilisateur"));
					return admin;
				}
				if(res.getString("typeUtilisateur").trim().equals(CONDUCTEUR)){
					Conducteur conducteur = new Conducteur(res.getString("nomUtilisateur"),res.getString("prenomUtilisateur"));
					conducteur.setId(res.getInt("idUtilisateur"));
					return conducteur;
				}	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	
	public static Utilisateur selectById(int id) throws SQLException {
		Connection cnx = null;
		
		try {
			cnx = AccesBase.getConnection();
			String select = "select nomUtilisateur,prenomUtilisateur,typeUtilisateur from Utilisateurs where idUtilisateur = ?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){
				if(res.getString("typeUtilisateur").trim().equals(ADMIN)){
					Administrateur admin = new Administrateur(res.getString("nomUtilisateur"),res.getString("prenomUtilisateur"));
					admin.setId(res.getInt("idUtilisateur"));
					return admin;
				}
				if(res.getString("typeUtilisateur").trim().equals(CONDUCTEUR)){
					Conducteur conducteur = new Conducteur(res.getString("nomUtilisateur"),res.getString("prenomUtilisateur"));
					conducteur.setId(res.getInt("idUtilisateur"));
					return conducteur;
				}	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	
	public static void delete(int id) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String delete = "delete from Utilisateurs where idUtilisateur = ?";
			PreparedStatement rqt = cnx.prepareStatement(delete);
			rqt.setInt(1, id);
			rqt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	
	public static void update(Utilisateur user, String mdp) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String update = "update Utilisateurs set codeUtilisateur=?,nomUtilisateur=?,prenomUtilisateur=?,mdpUtilisateur=? where idUtilisateur=?";
			PreparedStatement rqt = cnx.prepareStatement(update);
			
			if(user instanceof Administrateur){
				Administrateur admin = (Administrateur)user;
				rqt.setString(1, admin.getLogin());
				rqt.setString(2, admin.getNom());
				rqt.setString(3, admin.getPrenom());
				rqt.setString(4, mdp);	
			}
			if(user instanceof Conducteur){
				Conducteur conducteur = (Conducteur)user;
				rqt.setString(1, conducteur.getLogin());
				rqt.setString(2, conducteur.getNom());
				rqt.setString(3, conducteur.getPrenom());
				rqt.setString(4, mdp);	
			}
			
			rqt.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (cnx != null) {
				try {
					cnx.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
}

 

