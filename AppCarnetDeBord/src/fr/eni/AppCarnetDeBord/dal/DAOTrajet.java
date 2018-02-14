package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.AppCarnetDeBord.bo.Lieu;
import fr.eni.AppCarnetDeBord.bo.Motif;
import fr.eni.AppCarnetDeBord.bo.Trajet;
import fr.eni.AppCarnetDeBord.bo.Vehicule;

public class DAOTrajet implements DAO {

	public static Trajet selectById(int id) throws SQLException {
		Connection cnx = null;
		Trajet leTrajet = null;
		Vehicule vehiculeTrajet = null;
		Motif motiftrajet = null;
		
		
		try {
			cnx = AccesBase.getConnection();
			String select = "select * from Trajets "
							+ "inner join Motifs on Trajets.idMotif = Motifs.idMotif "
							+ "inner join Vehicules on Trajets.idVehicule = Vehicules.idVehicule"
							+ "  where idTrajet = ? ";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){				
				leTrajet = new Trajet();
				leTrajet.setId(res.getInt("idTrajet"));
				leTrajet.setDateDebut();
				leTrajet.setDateFin(dateFin);
				leTrajet.setMotif(nature);
				
				return leTrajet;				
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
}
