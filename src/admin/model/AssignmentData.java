package admin.model;

import Connection.DBConnection;
import lecture.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AssignmentData {

    private final String q = ("SELECT * FROM `studentassignment_details`");

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
            ResultSet rs = DBConnection.executeQuery(sq);
            while (rs.next()) {
                StudentAssignment data = new StudentAssignment(rs.getString("student_nic"), rs.getString("first_name"), rs.getString("batch_id"), rs.getString("subject_name"), rs.getString("subject_id"), rs.getString("marks"), rs.getString("file_pat"));
                assignments.add(data);
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }

    public List<String> loadBatch() {
        String bq = "SELECT * FROM `batch`";
        List<String> batch = new ArrayList<>();

        try {
            ResultSet rs = DBConnection.executeQuery(bq);
            while (rs.next()) {
                batch.add(rs.getString("batch_name"));
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return batch;
    }

    public List<String> loadSubject() {
        String sq = "SELECT * FROM `subject`";
        List<String> subject = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.executeQuery(sq);
            while (rs.next()) {
                subject.add(rs.getString("subject_name"));
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subject;
    }
    
    String assignmentQuery = "SELECT * FROM `assignment_details`  ";

    public List<Assignment> loadAssignment() {
        

        List<Assignment> assignments = new ArrayList<>();

        try {
            ResultSet rs = DBConnection.executeQuery(assignmentQuery);

            while (rs.next()) {
                Assignment assignment = new Assignment(rs.getString("assignment_id"), rs.getString("assignment_name"), rs.getString("batch_id"), rs.getString("batch_name"), rs.getString("start_time"), rs.getString("due_time"), rs.getString("subject_name"));
                assignments.add(assignment);
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }

    public List<StudentAssignment> loadStudentAssignment(String batchId, String assignmentId) {

        String AssignmentSearchQuery=assignmentQuery;

        if (batchId != null & assignmentId==null) {
            AssignmentSearchQuery+="WHERE `batch_Id`="+batchId;
        }else if(batchId == null & assignmentId!=null){
               AssignmentSearchQuery+="WHERE `assignment_id`="+assignmentId;
        }else{
            AssignmentSearchQuery+="WHERE `assignment_id`="+assignmentId+" AND `batch_Id`="+batchId;
        }

        List<StudentAssignment> assignments = new ArrayList<>();

        try {
            ResultSet rs = DBConnection.executeQuery(AssignmentSearchQuery);

            while (rs.next()) {
                StudentAssignment data = new StudentAssignment(rs.getString("student_nic"), rs.getString("first_name"), rs.getString("batch_id"), rs.getString("subject_name"), rs.getString("subject_id"), rs.getString("marks"), rs.getString("file_path"));
                assignments.add(data);
            }

            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }
}
