package fr.afpa.javaee.dao;

public class DAOFactory {
	public static UserDAO getUserDAO() {
		return new UserDAOJdbcImpl();
	}
}
