package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.AppCarnetDeBord.bo.Lieu;
import fr.eni.AppCarnetDeBord.bo.Motif;

public class DAOMotif implements DAO{

	public static void insert(Motif motif) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String insert = "insert into Motifs(libelleMotif) " + "values(?);";
			PreparedStatement rqt = cnx.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
						
			
			rqt.setString(1, motif.getNomMotif());			
			
			rqt.executeUpdate();
			ResultSet key = rqt.getGeneratedKeys();
			key.next();
			motif.setIdMotif(key.getInt(1));			
			
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
	
	public static ArrayList<Motif> selectAll() throws SQLException {
		Connection cnx = null;
		ArrayList<Motif> lesMotifs = new ArrayList<>();
		try {
			cnx = AccesBase.getConnection();
			String select = "select idMotif,libelleMotif from Motifs";
			Statement rqt = cnx.createStatement();
			ResultSet res = rqt.executeQuery(select);
			while (res.next()) {				
				Motif unMotif = new Motif(res.getString("libelleMotif"));
				unMotif.setIdMotif(res.getInt("idMotif"));
				lesMotifs.add(unMotif);				
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
		return lesMotifs;
	}
	
	public static Motif selectById(int id) throws SQLException {
		Connection cnx = null;
		Motif leMotif = null;
		try {
			cnx = AccesBase.getConnection();
			String select = "select libelleMotif from Motifs where idMotif = ?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){				
				leMotif = new Motif(res.getString("libelleMotif"));
				leMotif.setIdMotif(res.getInt("idMotif"));
				return leMotif;				
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
		return leMotif;
	}
	
	public static void delete(int id) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String delete = "delete from Motifs where idMotif = ?";
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
	
	public static void update(Motif motif) throws SQLException {
		Connection cnx = null;
		try {
			cnx = AccesBase.getConnection();
			String update = "update Motifs set libelleMotif=? where idMotif=?";
			PreparedStatement rqt = cnx.prepareStatement(update);
			rqt.setString(1, motif.getNomMotif());
			rqt.setInt(2, motif.getIdMotif());
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
