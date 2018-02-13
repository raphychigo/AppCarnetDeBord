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
		return lf;
	}
	
//	public static Utilisateur selectUser(String email,String mdp) throws SQLException {
//		Connection cnx = null;
//		Utilisateur u = null;
//		try {
//			
//
//			cnx = AccesBase.getConnection();
//			String select = "select idUser,nom,prenom,email,droits from Utilisateurs where email = ? and mdp = ?";
//			PreparedStatement rqt = cnx.prepareStatement(select);
//			rqt.setString(1, email);
//			rqt.setString(2, mdp);
//			ResultSet res = rqt.executeQuery();
//			if(res.next()){
//				u = new Utilisateur(res.getString("nom"),res.getString("prenom"),res.getString("email"),res.getString("droits"));
//				u.setIdUser(res.getInt("idUser"));	
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} finally {
//			if (cnx != null) {
//				try {
//					cnx.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		return u;
//	}
//
//	
//	public static Utilisateur selectUserById(int id) throws SQLException {
//		Connection cnx = null;
//		Utilisateur u = null;
//		try {
//			
//
//			cnx = AccesBase.getConnection();
//			String select = "select idUser,nom,prenom,email,droits from Utilisateurs where idUser = ?";
//			PreparedStatement rqt = cnx.prepareStatement(select);
//			rqt.setInt(1, id);
//			
//			ResultSet res = rqt.executeQuery();
//			if(res.next()){
//				u = new Utilisateur(res.getString("nom"),res.getString("prenom"),res.getString("email"),res.getString("droits"));
//				u.setIdUser(res.getInt("idUser"));	
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} finally {
//			if (cnx != null) {
//				try {
//					cnx.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		return u;
//	}
//	
//	
//	
//}
