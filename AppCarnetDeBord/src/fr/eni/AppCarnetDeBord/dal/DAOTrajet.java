package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Lieu;
import fr.eni.AppCarnetDeBord.bo.Motif;
import fr.eni.AppCarnetDeBord.bo.Trajet;
import fr.eni.AppCarnetDeBord.bo.Vehicule;

public class DAOTrajet implements DAO {

	
	
	
	
	
	
	public static Trajet selectById(int id) throws SQLException {
		Connection cnx = null;
		Trajet leTrajet = new Trajet();
		Motif motifTrajet = new Motif();
		Vehicule vehiculeTrajet = new Vehicule();
		Lieu lieuReception = new Lieu();
		Lieu lieuDestination = new Lieu();
		List<Conducteur> conducteurs = new ArrayList<>();

		try {
			cnx = AccesBase.getConnection();
			// Recupération du lieu de destination
			String select = "select idLieu, nomLieu from Lieux inner join Trajets on idLieu=idDestination where idLieu=idDestination and Trajets.idTrajet=?";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if (res.next()) {
				lieuDestination.setIdLieu(res.getInt("idLieu"));
				lieuDestination.setNomLieu(res.getString("nomLieu"));
			}

			// Recupération du lieu de reception
			select = "select idLieu, nomLieu from Lieux inner join Vehicules on Vehicules.idLieu=Lieux.idLieu inner join Trajets on Vehicules.idVehicule=Trajets.idVehicule where Lieux.idLieu=Vehicules.idlieu and Trajets.idTrajet=?";
			rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			res = rqt.executeQuery();
			if (res.next()) {
				lieuReception.setIdLieu(res.getInt("idLieu"));
				lieuReception.setNomLieu(res.getString("nomLieu"));
			}

			select = "select * from Trajets " + "inner join Motifs on Trajets.idMotif = Motifs.idMotif "
					+ "inner join Vehicules on Trajets.idVehicule = Vehicules.idVehicule "
					+ "inner join Lieux on Vehicules.idLieu = Lieux.idLieu " + " where idTrajet = ? ";
			rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			res = rqt.executeQuery();
			if (res.next()) {
				leTrajet.setId(res.getInt("idTrajet"));
				leTrajet.setDateDebut((GregorianCalendar) res.getObject("debutTrajet"));
				leTrajet.setDateFin((GregorianCalendar) res.getObject("finTrajet"));
				leTrajet.setCommentaire(res.getString("commentaire"));
				leTrajet.setKilometrageOrigine(res.getDouble("kilometrageDepart"));
				leTrajet.setKmParcourus(res.getDouble("kilometrageFin"));
				leTrajet.setNbLitres(res.getDouble("volumeCarburant"));
				leTrajet.setPrixTotal(res.getDouble("montantCarburant"));
				// Recupération des éléments du motif
				motifTrajet.setIdMotif(res.getInt("idMotif"));
				motifTrajet.setNomMotif(res.getString("nomMotif"));
				leTrajet.setMotif(motifTrajet);
				// Récupération des éléments du véhicule
				vehiculeTrajet.setId(res.getInt("idVehicule"));
				vehiculeTrajet.setImmatriculation(res.getString("immatriculation"));
				vehiculeTrajet.setMarque(res.getString("marque"));
				vehiculeTrajet.setModele(res.getString("modele"));
				vehiculeTrajet.setKilometrage(res.getInt("kilometrage"));
				vehiculeTrajet.setNbPlaces(res.getInt("nbPlaces"));
				vehiculeTrajet.setEnCirculation(res.getBoolean("enCirculation"));
				vehiculeTrajet.setLocalisation(lieuReception);
				leTrajet.setVehicule(vehiculeTrajet);
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
		return leTrajet;
	}
}
