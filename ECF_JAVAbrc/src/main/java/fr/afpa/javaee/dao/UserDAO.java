package fr.afpa.javaee.dao;

import java.sql.SQLException;

import fr.afpa.javaee.bo.Users;


public interface UserDAO {
	public void ajouter(Users user) throws SQLException;
	public Users envoiDonnePourConnection(String pseudo, String password) throws SQLException;
	void modifier(Users user) throws SQLException;
}
// il faut faire la methode dans la usermanager
// avec une instance de userDAO pour faire le lien a une methode get DAO qui nous retourne une
// instance de jdbcimpl qui nous traite la commande sql