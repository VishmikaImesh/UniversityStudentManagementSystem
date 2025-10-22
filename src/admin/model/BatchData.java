/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.model;

import lecture.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class BatchData {
    
    public List<String> Data(){
        
        String q="SELECT * FROM `batch`";
        List<String> batches= new ArrayList<>();
        
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(q);
            
            while (rs.next()) {
               String batch=rs.getString("batch_name");
                batches.add(batch);
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
          
          return batches;
    }
    
}
