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

import fr.eni.AppCarnetDeBord.bo.Vehicule;
import fr.eni.AppCarnetDeBord.dal.DAOVehicule;

/**
 * Servlet implementation class ListVehiculeServlet
 */
@WebServlet("/Compte/Administrateur/Vehicule")
public class ListVehiculeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListVehiculeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		List<Vehicule> listVehicule = new ArrayList<>();
		try {
			listVehicule = DAOVehicule.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listVehicule", listVehicule);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("listVehicule.jsp");
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
