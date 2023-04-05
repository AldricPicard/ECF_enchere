package fr.afpa.javaee.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionBDD {
    private static DataSource dataSource;
    //conection
    static
    {
        Context context;
        try {
            context = new InitialContext();
            ConnectionBDD.dataSource = (DataSource)context.lookup("java:comp/env/jdbc/pool_cnx");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException
    {
        return ConnectionBDD.dataSource.getConnection();
    }
}