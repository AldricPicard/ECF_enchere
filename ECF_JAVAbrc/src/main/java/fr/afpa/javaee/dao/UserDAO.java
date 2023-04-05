package fr.afpa.javaee.dao;

import java.sql.SQLException;

import fr.afpa.javaee.bo.Users;


public interface UserDAO {
	public void ajouter(Users user) throws SQLException;
	public String getName(Users user) throws SQLException;
	
}
