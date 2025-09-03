/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture.model;

/**
 *
 * @author USER
 */
public class Assignment {
    private final String nic;
    private final String name;
    private final String batch;
    private final String subject;
    private final String AssignmentID;

    public Assignment(String nic, String name, String batch, String subject, String AssignmentID) {
        this.nic = nic;
        this.name = name;
        this.batch = batch;
        this.subject = subject;
        this.AssignmentID = AssignmentID;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public String getSubject() {
        return subject;
    }

    public String getAssignmentID() {
        return AssignmentID;
    }
    
    
}
