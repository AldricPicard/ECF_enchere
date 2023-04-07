package fr.afpa.javaee.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.afpa.javaee.bo.*;
import fr.afpa.javaee.bll.*;

/**
 * Servlet implementation class ServletUpdateAccount
 */
@WebServlet("/ServletUpdateAccount")
public class ServletUpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsersManager usersManager = new UsersManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUpdateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Récupérer les paramètres de la requête HTTP pour créer l'objet Users
	    String pseudo = request.getParameter("pseudo");
	    String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	    String email = request.getParameter("email");
	    String telephone = request.getParameter("telephone");
	    String rue = request.getParameter("rue");
	    int codePostal = Integer.parseInt(request.getParameter("codePostal"));
	    String ville = request.getParameter("ville");
	    String motDePasse = request.getParameter("motDePasse");

	    Users user = new Users(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
	    
	    try {
	        // Appeler la méthode modifier() pour mettre à jour les informations de l'utilisateur
	        this.usersManager.modifier(user);
	        
	    } catch (BusinessException e) {
	        // Gérer l'exception ici en la journalisant ou en affichant un message d'erreur à l'utilisateur
	        e.printStackTrace();
	        request.setAttribute("errorMessage", "Une erreur s'est produite lors de la mise à jour de votre profil.");
	        request.getRequestDispatcher("profilUser.jsp").forward(request, response);
	    }
	}

}
