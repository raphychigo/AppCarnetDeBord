package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
