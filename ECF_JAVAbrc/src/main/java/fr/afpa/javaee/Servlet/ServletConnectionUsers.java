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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		
		
		if (request.getParameter("cookie_remember_me") != null) { // Si la case "se souvenir de moi" est coché créer le cookie
            Cookie monCookie = new Cookie("username", username);
            monCookie.setMaxAge(60 * 60 * 24 * 30); // Durée de vie du cookie 1mois 
            response.addCookie(monCookie);
        }
		
		
		try {
			Users user = userManager.envoiDonnePourConnection(username,password);
		    HttpSession session = request.getSession();
		    session.setAttribute("utilisateurConnecte", user);
		    request.getRequestDispatcher("./WEB-INF/accueil.jsp").forward(request, response);
		    //response.sendRedirect("/WEB-INF/accueil.jsp");
		} catch (BusinessException e) {
			 request.setAttribute("erreur", "Username ou mot de passe non valide");
			 request.getRequestDispatcher("./WEB-INF/connectionJSP.jsp").forward(request, response);
		}
		
		// faire un truc comme ça mais il faut demander les parametres à la bdd
//		if (utilisateur == null) {
//			// j'affiche un message d'erreur et je redirige sur le formulaire
//			request.setAttribute("erreur", "username ou mot de pase non valide");
//			this.doGet(request, response);
//		}
//		// sinon : on ajoute l'utilisateur en session et on redirige sur la page d'accueil
//		else {
//			// l'objet HttpSession est le même dans TOUS les servlets de l'application, mais différent pour chaque utilisateur
//			HttpSession session = request.getSession();
//			session.setAttribute("utilisateurConnecte", utilisateur);
//			response.sendRedirect("./");
//		}
		
		//Users user = userManager.verifPseudoPassword(username,password);
	}

}
