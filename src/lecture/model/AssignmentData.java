
package lecture.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AssignmentData {

    private String q = ("""
                                          SELECT `student_info`.`student_nic`,`first_name`,`last_name`,`assigment`.`assignment_id`,`batch_name`,`subject`.`subject_name`,`student_has_assignment`.`file_path` FROM `student_has_assignment` JOIN `student_info`
                                                              ON  `student_has_assignment`.`student_nic`=`student_info`.`student_nic`
                                                              JOIN `assigment` ON `student_has_assignment`.`assignment_id`=`assigment`.`assignment_id`
                                                              JOIN `subject` ON `assigment`.`subject_subject_id`=`subject`.`subject_id` 
                                                              JOIN `batch` ON `student_info`.`batch_id`=`batch`.`batch_id` """);

    public List<StudentAssignment> loadData(String txt) {
        List<StudentAssignment> assignments = new ArrayList<>();

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
                StudentAssignment data=new StudentAssignment(rs.getString("student_nic"),rs.getString("first_name"),rs.getString("batch_id"),rs.getString("subject_name"),rs.getString("subject_id"),rs.getString("marks"),rs.getString("file_pat"));
                assignments.add(data);
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
    
    public List<String> loadSubject(){
        String sq="SELECT * FROM `subject`";
        List<String> subject=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sq);
            while (rs.next()) {
                subject.add(rs.getString("subject_name"));
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return subject;
    }
    
    public List<Assignment> loadAssignment(){
        
        String aq="SELECT * FROM `assignment_details` " ;
        List<Assignment> assignments=new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(aq);
            
            while (rs.next()) {
                Assignment assignment=new Assignment(rs.getString("assignment_id"),rs.getString("assignment_name"),rs.getString("batch_name"),rs.getString("start_time"),rs.getString("due_time"),rs.getString("subject_name"));
                assignments.add(assignment);
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }
    
     public List<StudentAssignment> loadStudentAssignment(String batchId,String assignmentId){
        
        String aq="SELECT * FROM `studentassignment_details` WHERE `batch_Id`="+batchId;
        List<StudentAssignment> assignments=new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university_db", "root", "Imesh#14681");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(aq);
            
            while (rs.next()) {
               StudentAssignment data=new StudentAssignment(rs.getString("student_nic"),rs.getString("first_name"),rs.getString("batch_id"),rs.getString("subject_name"),rs.getString("subject_id"),rs.getString("marks"),rs.getString("file_path"));
               assignments.add(data);
            }

            rs.close();
            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }
}
