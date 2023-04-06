package fr.afpa.javaee.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.afpa.javaee.bo.Users;

public class UserDAOJdbcImpl implements UserDAO {
    //correctif de l'erreur sql
    private static final String INSERT_USER="INSERT INTO utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_PSEUDO_PASSWORD="SELECT pseudo,mot_de_passe from utilisateurs where pseudo=? and mot_de_passe=?;";
    
    // ajouter un user dans la base de donner
    @Override
    public void ajouter(Users user) throws SQLException {
        Connection cnx = ConnectionBDD.getConnection();
        
        PreparedStatement pstmt = cnx.prepareStatement(INSERT_USER, PreparedStatement.RETURN_GENERATED_KEYS);
        
        pstmt.setString(1 , user.getPseudo());
        pstmt.setString(2 , user.getNom());
        pstmt.setString(3 , user.getPrenom());
        pstmt.setString(4 , user.getEmail());
        pstmt.setString(5 , user.getTelephone());
        pstmt.setString(6 , user.getRue());
        pstmt.setInt(7 , user.getCodePostal());
        pstmt.setString(8 , user.getVille());
        pstmt.setString(9 , user.getMotDePasse());
        pstmt.setInt(10 , user.getCredit());
        pstmt.setBoolean(11, user.isAdmin());
        
        pstmt.executeUpdate();
        ResultSet rs = pstmt.getGeneratedKeys();
        
        if (rs.next()) {
            user.setNo_utilisateur(rs.getInt(1));
        }
        cnx.close();
    }

//	@Override
//	public Users verifPseudoPassword(String pseudo, String password) throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}
    
    public Users verifPseudoPassword(String pseudo, String password) throws SQLException {
    	Connection cnx = ConnectionBDD.getConnection();
    	
        PreparedStatement pstmt = cnx.prepareStatement(SELECT_PSEUDO_PASSWORD);
        pstmt.setString(1 , pseudo);
        pstmt.setString(2 , password);
        ResultSet rs = pstmt.executeQuery();
        //cnx.close();
        if (rs.next()) {
            // Les informations sont valides
            Users user = new Users();
            user.setPseudo(rs.getString("pseudo"));
            user.setMotDePasse(rs.getString("mot_de_passe"));
            return user;
        }
        else {
            // Les informations ne sont pas valides
            return null;
        }
        
    }

}