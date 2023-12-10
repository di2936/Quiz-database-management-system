/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Div
 */
public class DBConnection {
    
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/quiz";
    private String user = "root";
    private String password = "mego2028";
    
    public DBConnection() {
        try {
            conn = DriverManager.getConnection(url, user, password);
             System.out.println("Successfully connected ");
        } catch (SQLException ex) {
            System.out.println("Error connecting to database: " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    void close() {
       try {
        if (conn != null) {
            conn.close();
            System.out.println("Connection closed");
        }
    } catch (SQLException ex) {
        System.out.println("Error closing connection: " + ex.getMessage());
    }
}
boolean authenticate(String user_id, char[] password) {
    boolean authenticated = false;
    String sql = "SELECT password FROM students WHERE user_id = ?";
    
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, user_id);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            String dbPassword = rs.getString("password");
            String inputPassword = new String(password);
            
            if (dbPassword.equals(inputPassword)) {
                authenticated = true;
            }
        }
        
    } catch (SQLException ex) {
        System.out.println("Error authenticating user: " + ex.getMessage());
    }
    
    return authenticated;
}

    

}


    



