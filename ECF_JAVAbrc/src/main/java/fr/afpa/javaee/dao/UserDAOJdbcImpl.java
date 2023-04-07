package fr.afpa.javaee.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.afpa.javaee.bo.Users;

public class UserDAOJdbcImpl implements UserDAO {
    //correctif de l'erreur sql
    private static final String INSERT_USER="INSERT INTO utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_PSEUDO_PASSWORD="SELECT * from utilisateurs where pseudo=? and mot_de_passe=?;";
    private static final String UPDATE_USER ="UPDATE encheres SET utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe) VALUES(?,?,?,?,?,?,?,?,?);";
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
    
    public Users envoiDonnePourConnection(String pseudo, String password) throws SQLException {
    	Connection cnx = ConnectionBDD.getConnection();
        PreparedStatement pstmt = cnx.prepareStatement(SELECT_PSEUDO_PASSWORD);
        pstmt.setString(1, pseudo);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        Users user = new Users();
        if (rs.next()) {
            user = new Users();
            user.setNo_utilisateur(rs.getInt("no_utilisateur"));
            user.setPseudo(rs.getString("pseudo"));
            user.setNom(rs.getString("nom"));
            user.setPrenom(rs.getString("prenom"));
            user.setEmail(rs.getString("email"));
            user.setTelephone(rs.getString("telephone"));
            user.setRue(rs.getString("rue"));
            user.setCodePostal(rs.getInt("code_postal"));
            user.setVille(rs.getString("ville"));
            user.setMotDePasse(rs.getString("mot_de_passe"));
            user.setCredit(rs.getInt("credit"));
            user.setAdmin(rs.getBoolean("administrateur"));
            return user;
        }else {
        	return null;	
        }
	}
    
    //methode pas fini
	@Override
	public void modifier(Users user) throws SQLException {
		Connection cnx = ConnectionBDD.getConnection();
        
        try (PreparedStatement pstmt = cnx.prepareStatement(UPDATE_USER)){
            pstmt.setString(1 , user.getPseudo());
            pstmt.setString(2 , user.getNom());
            pstmt.setString(3 , user.getPrenom());
            pstmt.setString(4 , user.getEmail());
            pstmt.setString(5 , user.getTelephone());
            pstmt.setString(6 , user.getRue());
            pstmt.setInt(7 , user.getCodePostal());
            pstmt.setString(8 , user.getVille());
            pstmt.setString(9 , user.getMotDePasse());
            int rowsUpdate = pstmt.executeUpdate();
            if (rowsUpdate == 0) {
                throw new SQLException("La mise à jour de l'utilisateur a échoué.");
            }
        } catch (SQLException e) {
            // Gérer l'exception ici
            e.printStackTrace();
        } finally {
            cnx.close();
        }
		
	}   
}