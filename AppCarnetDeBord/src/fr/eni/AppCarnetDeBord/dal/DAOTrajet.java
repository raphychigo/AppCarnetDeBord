package fr.eni.AppCarnetDeBord.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		Conducteur conducteurTrajet = new Conducteur();
		
		
		
		try {
			cnx = AccesBase.getConnection();
			String select = "select * from Trajets "
							+ "inner join Motifs on Trajets.idMotif = Motifs.idMotif "
							+ "inner join Vehicules on Trajets.idVehicule = Vehicules.idVehicule "
							+ "inner join Lieux on Vehicules.idLieu = Lieux.idLieu "
							+ "inner join Effectuer on Trajets.idTrajet = Effectuer.idTrajet "
							+ "inner join Utilisateurs on Effectuer.idUtilisateur = Utilisateurs.idUtilisateur"
							+ " where idTrajet = ? ";
			PreparedStatement rqt = cnx.prepareStatement(select);
			rqt.setInt(1, id);
			ResultSet res = rqt.executeQuery();
			if(res.next()){				
				leTrajet.setId(res.getInt("idTrajet"));
				leTrajet.setDateDebut(dateDebut);
				leTrajet.setDateFin(dateFin);
				leTrajet.setCommentaire(res.getString("commentaire"));
				leTrajet.setKilometrageOrigine(res.getDouble("kilometrageDepart"));
				leTrajet.setKmParcourus(res.getDouble("kilometrageFin"));
				leTrajet.setNbLitres(res.getDouble("volumeCarburant"));
				leTrajet.setPrixTotal(res.getDouble("montantCarburant"));				
				//Recupération des éléments du motif
				motifTrajet.setIdMotif(res.getInt("idMotif"));
				motifTrajet.setNomMotif(res.getString("nomMotif"));
				leTrajet.setMotif(motifTrajet);
				//Récupération des éléments du véhicule
				vehiculeTrajet.setId(res.getInt("idVehicule"));
				vehiculeTrajet.setImmatriculation(res.getString("immatriculation"));
				vehiculeTrajet.setMarque(res.getString("marque"));
				vehiculeTrajet.setModele(res.getString("modele"));
				vehiculeTrajet.setKilometrage(res.getInt("kilometrage"));
				vehiculeTrajet.setNbPlaces(res.getInt("nbPlaces"));
				vehiculeTrajet.setEnCirculation(res.getBoolean("enCirculation"));
					//récupération des éléments du lieu de reception
					lieuReception.setIdLieu(res.getInt(columnLabel));
				vehiculeTrajet.setLocalisation();
				
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
