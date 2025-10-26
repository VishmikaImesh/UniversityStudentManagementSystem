/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.model;

public class Assignment {
    
    private final String assignmentID;
    private final String assignmentName;
    private final String batch;
    private final String batchID;
    private final String startDate;
    private final String dueDate;
    private final String subject;

    public Assignment(String assignmentID, String assignmentName,String batchID, String batch, String startDate, String dueDate,String subject) {
        this.assignmentID = assignmentID;
        this.assignmentName = assignmentName;
        this.batch = batch;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.subject=subject;
        this.batchID=batchID;
    }

    public String getAssignmentID() {
        return assignmentID;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getBatch() {
        return batch;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getSubject() {
        return subject;
    }

    public String getBatchID() {
        return batchID;
    }
    
}
