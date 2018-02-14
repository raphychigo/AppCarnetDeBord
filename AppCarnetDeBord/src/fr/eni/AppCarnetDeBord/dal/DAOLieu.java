package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.AppCarnetDeBord.bo.Lieu;

public class DAOLieu implements DAO{

	public static void insert(Lieu lieu) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String insert = "insert into Lieux(nomLieu) " + "values(?);";
			PreparedStatement rqt = cnx.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
						
			Lieu leLieu = lieu;
			rqt.setString(1, leLieu.getNomLieu());			
			
			rqt.executeUpdate();
			ResultSet key = rqt.getGeneratedKeys();
			key.next();
			leLieu.setIdLieu(key.getInt(1));			
			
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
	
	public static ArrayList<Lieu> selectAll() throws SQLException {
		Connection cnx = null;
		ArrayList<Lieu> lesLieux = new ArrayList<>();
		try {
			cnx = AccesBase.getConnection();
			String select = "select idUtilisateur,nomLieu from Lieux";
			Statement rqt = cnx.createStatement();
			ResultSet res = rqt.executeQuery(select);
			while (res.next()) {				
				Lieu unLieu = new Lieu(res.getString("nomLieu"));
				unLieu.setIdLieu(res.getInt("idLieu"));
				lesLieux.add(unLieu);				
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
		return lesLieux;
	}
	
	public static Lieu selectById(int id) throws SQLException {
		Connection cnx = null;
		Lieu leLieu = null;
		try {
			cnx = AccesBase.getConnection();
			String select = "select nomLieu from Lieux where idLieu = ?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){				
				leLieu = new Lieu(res.getString("nomLieu"));
				leLieu.setIdLieu(res.getInt("idLieu"));
				return leLieu;				
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
		return leLieu;
	}
	
	public static void delete(int id) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String delete = "delete from Lieux where idlieu = ?";
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
	
	public static void update(Lieu unLieu, String nom) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String update = "update Lieux set nomLieu=? where idlieu=?";
			PreparedStatement rqt = cnx.prepareStatement(update);
			
			Lieu leLieu = unLieu;
			rqt.setString(1, nom);
			rqt.setInt(2, leLieu.getIdLieu());
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
