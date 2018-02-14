package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.AppCarnetDeBord.bo.Administrateur;
import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Utilisateur;
import fr.eni.AppCarnetDeBord.bo.Vehicule;

public class DAOVehicule implements DAO{
	
	public static void insert(Vehicule vehicule) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String insert = "insert into Vehicules(immatriculation,marque,modele,kilometrage,places,enCirculation) " + "values(?,?,?,?,?,?);";
			PreparedStatement rqt = cnx.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			
				
				rqt.setString(1, vehicule.getImmatriculation());
				rqt.setString(2, vehicule.getMarque());
				rqt.setString(3, vehicule.getModele());
				rqt.setInt(4, vehicule.getKilometrage());
				rqt.setInt(5, vehicule.getNbPlaces());
				rqt.setBoolean(6, vehicule.isEnCirculation());
			
			
			rqt.executeUpdate();
			ResultSet key = rqt.getGeneratedKeys();
			key.next();
				vehicule.setId(key.getInt(1));
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
	
	public static ArrayList<Vehicule> selectAll() throws SQLException {
		Connection cnx = null;
		ArrayList<Vehicule> lv = new ArrayList<>();
		try {
			

			cnx = AccesBase.getConnection();
			String select = "select * from Vehicules";
			Statement rqt = cnx.createStatement();
			ResultSet res = rqt.executeQuery(select);
			while (res.next()) {
					Vehicule vehicule = new Vehicule(res.getString("immatriculation"), res.getString("marque"), res.getString("modele"), res.getInt("places"), res.getInt("kilometrage"), res.getBoolean("enCirculation"));
					vehicule.setId(res.getInt("idVehicule"));
					lv.add(vehicule);
	
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
		return lv;
	}
	
	
	
	
	public static Vehicule selectById(int id) throws SQLException {
		Connection cnx = null;
		Vehicule vehicule = null;
		try {
			cnx = AccesBase.getConnection();
			String select = "select * from Vehicules where idVehicule = ?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){
				vehicule = new Vehicule(res.getString("immatriculation"), res.getString("marque"), res.getString("modele"), res.getInt("places"), res.getInt("kilometrage"), res.getBoolean("enCirculation"));
				vehicule.setId(res.getInt("idVehicule"));
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
		return vehicule;
	}
	
	
	public static void delete(int id) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String delete = "delete from Vehicules where idVehicule = ?";
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
