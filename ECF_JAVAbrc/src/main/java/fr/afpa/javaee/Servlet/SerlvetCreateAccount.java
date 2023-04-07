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
 * Servlet implementation class SerlvetCreateAccount
 */
@WebServlet("/SerlvetCreateAccount")
public class SerlvetCreateAccount extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UsersManager usersManager = new UsersManager();

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/createAccountJSP.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Servelt avec les récupération utilisateurs
   
        String pseudo = request.getParameter("creationAccountNickName");
        String nom = request.getParameter("creationAccountLastName");
        String prenom = request.getParameter("creationAccountName");
        String email = request.getParameter("creationAccountEmail");
        String phone = request.getParameter("creationAccountPhone");
        String street = request.getParameter("creationAccountStreet");
        int number = Integer.parseInt(request.getParameter("creationAccountNumber"));
        String city = request.getParameter("creationAccountCity");
        String password = request.getParameter("creationAccountPassword");

        request.setAttribute("pseudo", pseudo);
        request.setAttribute("nom", nom);
        request.setAttribute("prenom", prenom);
        request.setAttribute("email", email);
        request.setAttribute("phone", phone);
        request.setAttribute("street", street);
        request.setAttribute("number", number);
        request.setAttribute("city", city);
        request.setAttribute("password", password);
        Users user = new Users(pseudo,nom,prenom,email,phone,street,number,city,password, 300 , false);
        
        try {
            this.usersManager.ajouter(user);
            
            request.getRequestDispatcher("/WEB-INF/profilUser.jsp").forward(request, response);
        }catch(BusinessException e) {
            request.setAttribute("messageErreur", e.getMessage());
        }
        System.out.println("User qui va être créé : " + user.toString());
        
    }
    

}