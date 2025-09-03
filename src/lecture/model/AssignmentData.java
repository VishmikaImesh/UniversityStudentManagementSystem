/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture.model;

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
public class AssignmentData {

    private String q = ("""
                                          SELECT `student_info`.`student_nic`,`first_name`,`last_name`,`assigment`.`assignment_id`,`batch_name`,`subject`.`subject_name`,`student_has_assignment`.`file_path` FROM `student_has_assignment` JOIN `student_info`
                                                              ON  `student_has_assignment`.`student_nic`=`student_info`.`student_nic`
                                                              JOIN `assigment` ON `student_has_assignment`.`assignment_id`=`assigment`.`assignment_id`
                                                              JOIN `subject` ON `assigment`.`subject_subject_id`=`subject`.`subject_id` 
                                                              JOIN `batch` ON `student_info`.`batch_id`=`batch`.`batch_id` """);

    public List<Assignment> loadData(String txt) {
        List<Assignment> assignments = new ArrayList<>();

        String sq = q;

        if (!txt.isBlank()) {
            if (txt.matches("^(?:20|19)\\d{10}$")) {
                sq += " WHERE `student_nic`='" + txt + "' ";
            } else if (txt.contains("@")) {
                sq += " WHERE `email` LIKE '" + txt + "' ";
            } else {
                sq += " WHERE `first_name` LIKE '" + txt + "%' OR `last_name` LIKE'" + txt + "%' ";
            }
        } else {
            sq = q;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sq);
            while (rs.next()) {
                Assignment a = new Assignment(rs.getString("student_nic"), rs.getString("first_name"), rs.getString("batch_name"), rs.getString("subject_name"), rs.getString("assignment_id"), rs.getString("file_path"));
                assignments.add(a);
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }

    public List<String> loadBatch() {
        String bq="SELECT * FROM `batch`";
        List<String> batch=new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(bq);
            while (rs.next()) {
                System.out.println(rs.getString("batch_name"));
                batch.add(rs.getString("batch_name"));
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  batch;
    }
}
