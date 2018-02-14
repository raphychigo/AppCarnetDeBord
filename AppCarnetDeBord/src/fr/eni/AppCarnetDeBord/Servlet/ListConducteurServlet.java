package fr.eni.AppCarnetDeBord.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class ListConducteurServlet
 */
@WebServlet("/ListConducteurServlet")
public class ListConducteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListConducteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		List<Conducteur> listConducteur = new ArrayList<>();
		try {
			listConducteur = DAOUtilisateur.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listConducteur", listConducteur);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("listConducteur.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
