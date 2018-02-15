package fr.eni.AppCarnetDeBord.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.AppCarnetDeBord.bo.Administrateur;
import fr.eni.AppCarnetDeBord.bo.Conducteur;
import fr.eni.AppCarnetDeBord.bo.Utilisateur;
import fr.eni.AppCarnetDeBord.dal.DAOUtilisateur;
import fr.eni.ecole.jeeproject.servlet.Servlet;


/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/AppCarnetDeBord/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//ServletConfig permettant de charger des paramètres de configuration propres à la servlet
		super.init(config);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			HttpSession session = request.getSession();
			
			if(session.getAttribute("id")!=null){
				response.sendRedirect("/AppCarnetDeBord/Accueil");
			}else{
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Conducteur/Menu");
				if(dispatcher!=null){
					dispatcher.include(request, response);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			HttpSession session = request.getSession();
			
			if(session.getAttribute("id")!=null){
				response.sendRedirect("/AppCarnetDeBord/Conducteur");
			}else{
				Utilisateur user =  null;
			    user =DAOUtilisateur.selectUser(request.getParameter("identifiant"),request.getParameter("password"));			    
			    if(user!=null){
			    	session.setMaxInactiveInterval(600);
			    	if(user instanceof Administrateur){
			    		session.setAttribute("id", ((Administrateur)user).getId());
			    		response.sendRedirect("/AppCarnetDeBord/Administrateur");
			    	}
			    	if(user instanceof Conducteur){
			    		session.setAttribute("id", ((Conducteur)user).getId());
			    		response.sendRedirect("/AppCarnetDeBord/Conducteur");
			    	}
			    	
			    }else{
			    	request.getRequestDispatcher("/Login/ErreurConnexion").forward(request, response);
			    }
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
