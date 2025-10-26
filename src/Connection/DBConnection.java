/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author USER
 */
import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/university_db";
    private static final String username = "root";
    private static final String password = "Imesh#14681";
    private static Connection conn;

    public static Connection getConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;

    }

    public static ResultSet executeQuery(String q) {

        ResultSet rs=null;
        try {
            Connection c = getConnection();
            Statement s = c.createStatement();
            rs=s.executeQuery(q);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;

    }
    
    public static void updateQuery(String q){
        try{
        Connection c=getConnection();
        Statement s=c.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
