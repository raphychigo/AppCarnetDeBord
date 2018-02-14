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

import fr.eni.AppCarnetDeBord.bo.Motif;
import fr.eni.AppCarnetDeBord.bo.Vehicule;
import fr.eni.AppCarnetDeBord.dal.DAOMotif;
import fr.eni.AppCarnetDeBord.dal.DAOVehicule;

/**
 * Servlet implementation class ModificationMotifServlet
 */
@WebServlet("/Login/Administrateur/ModificationMotif")
public class ModificationMotifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificationMotifServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("modifMotif.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DAOMotif.update(new Motif(request.getParameter("motif")));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		request.getRequestDispatcher("/CarnetDeBord/Administrateur/Motif").forward(request, response);
	}

}
