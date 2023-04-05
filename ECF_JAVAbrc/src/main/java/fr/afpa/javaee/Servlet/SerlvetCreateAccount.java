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
        //faire Servelt avec les récupération utilisateurs
        //testpush
        String pseudo = request.getParameter("creationAccountNickName");
        String nom = request.getParameter("creationAccountLastName");
        String prenom = request.getParameter("creationAccountName");
        String email = request.getParameter("creationAccountEmail");
        String phone = request.getParameter("creationAccountPhone");
        String street = request.getParameter("creationAccountStreet");
        int number = Integer.parseInt(request.getParameter("creationAccountNumber"));
        String city = request.getParameter("creationAccountCity");
        String password = request.getParameter("creationAccountPassword");
//        String passwordConfirmation = request.getParameter("creationAccountPasswordConfirmation");
//        if(password.equals(passwordConfirmation)) {
//            validPassword = password;
//        }
        Users user = new Users(pseudo,nom,prenom,email,phone,street,number,city,password, 300 , false);
        
        try {
            this.usersManager.ajouter(user);
            response.sendRedirect("./");
        }catch(BusinessException e) {
            request.setAttribute("messageErreur", e.getMessage());
        }
        System.out.println("User qui va être créé : " + user.toString());
        // il y a une erreur à se niveau
        request.getRequestDispatcher("./index.html").forward(request, response);
    }
    

}