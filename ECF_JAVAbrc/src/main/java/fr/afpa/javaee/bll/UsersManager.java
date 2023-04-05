package fr.afpa.javaee.bll;

import fr.afpa.javaee.dao.DAOFactory;
import fr.afpa.javaee.dao.UserDAO;

import java.sql.SQLException;

import fr.afpa.javaee.bo.Users;

public class UsersManager {
    private UserDAO userDAO = DAOFactory.getUserDAO();
    
    
    public void ajouter(Users user) throws BusinessException {
        
//        validation(user);        
        try {
            this.userDAO.ajouter(user);
        }catch (SQLException e) {
            e.printStackTrace();
            throw new BusinessException("erreur SQL lors de l'insertion en base de donnée");
        }
    }
    // a voir si c'est utile
    private void validation(Users user)  throws BusinessException{
        
        if (user.getPseudo().length() > 30 ) {
            throw new BusinessException("Le pseudo ne peut contenir que 30 caractère");
        }
        if (user.getNom().length() > 30 ) {
            throw new BusinessException("Le nom ne peut contenir que 30 caractère");
        }
        if (user.getPrenom().length() > 30 ) {
            throw new BusinessException("Le prenom ne peut contenir que 30 caractère");
        }
        if (user.getEmail().length() > 30 ) {
            throw new BusinessException("L'email ne peut contenir que 30 caractère");
        }
        if (user.getTelephone().length() > 30 ) {
            throw new BusinessException("Le téléphone ne peut contenir que 15 caractère");
        }
    }
}