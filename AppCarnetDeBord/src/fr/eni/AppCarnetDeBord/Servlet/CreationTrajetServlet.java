package fr.eni.AppCarnetDeBord.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Lieu;
import fr.eni.AppCarnetDeBord.bo.Motif;
import fr.eni.AppCarnetDeBord.bo.Trajet;
import fr.eni.AppCarnetDeBord.bo.Vehicule;
import fr.eni.AppCarnetDeBord.dal.DAOTrajet;
import fr.eni.AppCarnetDeBord.dal.DAOUtilisateur;
import fr.eni.AppCarnetDeBord.dal.DAOVehicule;

/**
 * Servlet implementation class CreationTrajetServlet
 */
@WebServlet("/Login/Conducteur/CreationTrajet")
public class CreationTrajetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationTrajetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("creationTrajet.jsp");
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		try {
			String dateDebut = request.getParameter("dateDebutTrajet");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dDebut = sdf.parse(dateDebut);
			GregorianCalendar gcDebut = new GregorianCalendar();
			gcDebut.setTime(dDebut);
			
			Motif motif = new Motif(request.getParameter("nomMotif"));
			motif.setIdMotif(Integer.parseInt(request.getParameter("idMotif")));
			
			Lieu lieuReception = new Lieu(request.getParameter("nomLieuReception"));
			lieuReception.setIdLieu(Integer.parseInt(request.getParameter("idLieuReception")));
			
			Lieu lieuDestination = new Lieu(request.getParameter("nomLieuDestination"));
			lieuDestination.setIdLieu(Integer.parseInt(request.getParameter("idLieuDestination")));
			
			Vehicule vehicule = new Vehicule();
			vehicule = DAOVehicule.selectById(Integer.parseInt(request.getParameter("idVehicule")));
			
			Conducteur conducteur = new Conducteur();
			conducteur = (Conducteur) DAOUtilisateur.selectById(Integer.parseInt(session.getAttribute("id").toString()));
			
			ArrayList listConducteurs = new ArrayList<>();
			
			Trajet trajet = new Trajet(gcDebut,motif,request.getParameter("commentaire"),lieuReception,lieuDestination,vehicule.getKilometrage(),vehicule,listConducteurs);
		
			DAOTrajet.insert(trajet);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e){
			// TODO: handle exception
			e.printStackTrace();
		}
		request.getRequestDispatcher("/CarnetDeBord/Administrateur/Vehicule").forward(request, response);
	}

}
