package fr.afpa.javaee.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.afpa.javaee.bll.BusinessException;
import fr.afpa.javaee.bll.UsersManager;
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

		Cookie[] cookies = request.getCookies();
		   for (Cookie cookie : cookies) {
	            if (cookie.getName().equals(request.getParameter("username"))) {
	                System.out.println(cookie.getValue());
	                request.setAttribute("pseudo", cookie.getValue());
	            }
	        }
		
		request.setCharacterEncoding("UTF-8");

		request.getRequestDispatcher("/WEB-INF/connectionJSP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userPseudo = request.getParameter("account_pseudo");
		String userPassword = request.getParameter("account_password");
		
		
		if (request.getParameter("cookie_remember_me") != null) { // Si la case "se souvenir de moi" est coché créer le cookie
            Cookie monCookie = new Cookie("username", username);
            monCookie.setMaxAge(60 * 60 * 24 * 30); // Durée de vie du cookie 1mois 
            response.addCookie(monCookie);
        }
		
		
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
