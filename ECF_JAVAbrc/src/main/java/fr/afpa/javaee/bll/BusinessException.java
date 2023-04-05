package fr.afpa.javaee.bll;

public class BusinessException extends Exception {
    
    public BusinessException() {
        
    }
    //erreur
    public BusinessException(String message) {
        super(message);
    }

}