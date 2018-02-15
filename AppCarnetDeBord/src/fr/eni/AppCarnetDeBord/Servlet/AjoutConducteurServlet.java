package fr.eni.AppCarnetDeBord.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Vehicule;
import fr.eni.AppCarnetDeBord.dal.DAOUtilisateur;
import fr.eni.AppCarnetDeBord.dal.DAOVehicule;

/**
 * Servlet implementation class AjoutConducteurServlet
 */
@WebServlet("/Login/Administrateur/AjoutConducteur")
public class AjoutConducteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutConducteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("ajoutConducteur.jsp");
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DAOUtilisateur.insert(new Conducteur(request.getParameter("immatriculation"),request.getParameter("marque")),request.getParameter("password"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/CarnetDeBord/Administrateur/Conducteur").forward(request, response);
	}

}
