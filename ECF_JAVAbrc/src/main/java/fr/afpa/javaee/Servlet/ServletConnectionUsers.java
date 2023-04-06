package fr.afpa.javaee.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.afpa.javaee.bll.*;
import fr.afpa.javaee.bo.Users;


/**
 * Servlet implementation class ServletConnectionUsers
 */
@WebServlet("/ServletConnectionUsers")
public class ServletConnectionUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsersManager userManager = new UsersManager();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/connectionJSP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userPseudo = request.getParameter("account_pseudo");
		String userPassword = request.getParameter("account_password");
		
		try {
			Users utilisateur = userManager.envoiDonnePourConnection(userPseudo,userPassword);
			if(utilisateur != null) {
				
				HttpSession session = request.getSession();
				request.getSession().setAttribute("utilisateur", utilisateur);
				System.out.println("salut");
				request.getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/WEB-INF/connectionJSP.jsp").forward(request, response);
				
			}
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		
				
	}

}
