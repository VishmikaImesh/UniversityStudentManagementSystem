package admin.gui;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import admin.panel.BatchesPanel;
import com.formdev.flatlaf.FlatClientProperties;

import admin.panel.AssignmentPanel;
import admin.panel.AttendancePanel;
import admin.panel.Dashboard;
import admin.panel.ExamsPanel;
import admin.panel.LecturersPanel;
import admin.panel.PaymentsPanel;
import admin.panel.ProfilePanel;
import admin.panel.StudentsPanel;
import admin.panel.TimeTablePanel;
import admin.panel.UnitsPanel;


import javax.swing.JButton;

public class Home extends javax.swing.JFrame {

    private CardLayout layout;
    
    private Dashboard dashboard;
    private AssignmentPanel assignment;
    private BatchesPanel batches;
    private AttendancePanel attendance;
    private ExamsPanel exams;
    private LecturersPanel lecturers;
    private PaymentsPanel payments;
    private ProfilePanel profile;
    private StudentsPanel students;
    private TimeTablePanel timetable;
    private UnitsPanel units;

    private static Home home;

    private Home() {
        initComponents();
        init();
        loadPanels();
    }

    public static synchronized Home getHome() {
        if (home == null) {
            home = new Home();
        }

        return home;
    }

    private void init() {
        profilePic.setIcon(new FlatSVGIcon("student/icon/noprofile.svg", 50, 50));

        dashboardbtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/dashboard.svg")));
        //dashboardbtn.putClientProperty(FlatClientProperties.STYLE, "arc:40; ");

        studentsBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/student.svg")));
        lecturersBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/lecturers.svg")));
        batchesBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/batches.svg")));
        timeTablebtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/timetable.svg")));
        unitsBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/subjects.svg")));
        attendanceBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/attendance.svg")));
        assignmentsBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/assignments.svg")));
        paymentsBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/payments.svg")));
        examsBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/exams2.svg")));
        //profileBtn.setIcon(new FlatSVGIcon(getClass().getResource("/icons/user.svg")));
    }

    private void loadPanels() {

        layout = new CardLayout();
        mainPanel.setLayout(layout);

        dashboard = new Dashboard();
        assignment = new AssignmentPanel();
        attendance=new AttendancePanel();
        batches=new BatchesPanel();
        exams=new ExamsPanel();
        lecturers=new LecturersPanel();
        payments=new PaymentsPanel();
        profile=new ProfilePanel();
        students=new StudentsPanel();
        timetable=new TimeTablePanel();
        units=new UnitsPanel();
        
        mainPanel.add(assignment, "Assignment");
        mainPanel.add(dashboard, "Dashboard");
        mainPanel.add(attendance,"Attendance");
        mainPanel.add(batches,"Batches");
        mainPanel.add(exams,"Exams");
        mainPanel.add(lecturers,"Lecturers");
        mainPanel.add(payments,"Payments");
        mainPanel.add(profile,"Profile");
        mainPanel.add(students,"Students");
        mainPanel.add(timetable,"TimeTable");
        mainPanel.add(units,"Units");    

    }
    
    public void setPanels(String panel){       
        layout.show(mainPanel, panel);
    }
    
    
    public JButton getAssignmentsBtn() {
        return assignmentsBtn;
    }

    public JButton getExamsBtn() {
        return examsBtn;
    }

    public JButton getStudentsBtn() {
        return studentsBtn;
    }

    public JButton getUnitsBtn() {
        return unitsBtn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dashboardbtn = new javax.swing.JButton();
        studentsBtn = new javax.swing.JButton();
        lecturersBtn = new javax.swing.JButton();
        batchesBtn = new javax.swing.JButton();
        timeTablebtn = new javax.swing.JButton();
        unitsBtn = new javax.swing.JButton();
        attendanceBtn = new javax.swing.JButton();
        assignmentsBtn = new javax.swing.JButton();
        paymentsBtn = new javax.swing.JButton();
        examsBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        profilePic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managment System");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 33, 71));
        jPanel1.setForeground(new java.awt.Color(0, 50, 232));

        jPanel2.setBackground(new java.awt.Color(0, 33, 71));
        jPanel2.setForeground(new java.awt.Color(0, 50, 232));
        jPanel2.setLayout(new java.awt.GridLayout(11, 1, 5, 0));

        dashboardbtn.setBackground(new java.awt.Color(0, 33, 71));
        dashboardbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        dashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardbtn.setText(" Dashboard");
        dashboardbtn.setBorder(null);
        dashboardbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbtnActionPerformed(evt);
            }
        });
        jPanel2.add(dashboardbtn);

        studentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        studentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        studentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentsBtn.setText(" Students");
        studentsBtn.setBorder(null);
        studentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(studentsBtn);

        lecturersBtn.setBackground(new java.awt.Color(0, 33, 71));
        lecturersBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lecturersBtn.setForeground(new java.awt.Color(255, 255, 255));
        lecturersBtn.setText(" lecturers");
        lecturersBtn.setBorder(null);
        lecturersBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lecturersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturersBtnActionPerformed(evt);
            }
        });
        jPanel2.add(lecturersBtn);

        batchesBtn.setBackground(new java.awt.Color(0, 33, 71));
        batchesBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        batchesBtn.setForeground(new java.awt.Color(255, 255, 255));
        batchesBtn.setText(" Batches");
        batchesBtn.setBorder(null);
        batchesBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        batchesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchesBtnActionPerformed(evt);
            }
        });
        jPanel2.add(batchesBtn);

        timeTablebtn.setBackground(new java.awt.Color(0, 33, 71));
        timeTablebtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        timeTablebtn.setForeground(new java.awt.Color(255, 255, 255));
        timeTablebtn.setText(" Time Table");
        timeTablebtn.setBorder(null);
        timeTablebtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeTablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTablebtnActionPerformed(evt);
            }
        });
        jPanel2.add(timeTablebtn);

        unitsBtn.setBackground(new java.awt.Color(0, 33, 71));
        unitsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        unitsBtn.setForeground(new java.awt.Color(255, 255, 255));
        unitsBtn.setText(" Units");
        unitsBtn.setBorder(null);
        unitsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        unitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(unitsBtn);

        attendanceBtn.setBackground(new java.awt.Color(0, 33, 71));
        attendanceBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        attendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        attendanceBtn.setText(" Attendance");
        attendanceBtn.setBorder(null);
        attendanceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        attendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceBtnActionPerformed(evt);
            }
        });
        jPanel2.add(attendanceBtn);

        assignmentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        assignmentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        assignmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignmentsBtn.setText(" Assignments");
        assignmentsBtn.setBorder(null);
        assignmentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignmentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(assignmentsBtn);

        paymentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        paymentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        paymentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentsBtn.setText(" Payments");
        paymentsBtn.setBorder(null);
        paymentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(paymentsBtn);

        examsBtn.setBackground(new java.awt.Color(0, 33, 71));
        examsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        examsBtn.setForeground(new java.awt.Color(255, 255, 255));
        examsBtn.setText(" Exams");
        examsBtn.setBorder(null);
        examsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        examsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(examsBtn);

        profileBtn.setBackground(new java.awt.Color(0, 33, 71));
        profileBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText(" Profile");
        profileBtn.setBorder(null);
        profileBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        jPanel2.add(profileBtn);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void attendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceBtnActionPerformed
        setPanels("Attendance");
    }//GEN-LAST:event_attendanceBtnActionPerformed

    private void timeTablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTablebtnActionPerformed
        setPanels("TimeTable");
    }//GEN-LAST:event_timeTablebtnActionPerformed

    private void unitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsBtnActionPerformed
        setPanels("Units");
    }//GEN-LAST:event_unitsBtnActionPerformed

    private void assignmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignmentsBtnActionPerformed
        setPanels("Assignment");
    }//GEN-LAST:event_assignmentsBtnActionPerformed

    private void paymentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsBtnActionPerformed
       setPanels("Payments");
    }//GEN-LAST:event_paymentsBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
       setPanels("Profile");
    }//GEN-LAST:event_profileBtnActionPerformed

    private void studentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsBtnActionPerformed
        setPanels("Students");
    }//GEN-LAST:event_studentsBtnActionPerformed

    private void lecturersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturersBtnActionPerformed
        setPanels("Lecturers");
    }//GEN-LAST:event_lecturersBtnActionPerformed

    private void batchesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchesBtnActionPerformed
       setPanels("Batches");
    }//GEN-LAST:event_batchesBtnActionPerformed

    private void examsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examsBtnActionPerformed
        setPanels("Exams");
    }//GEN-LAST:event_examsBtnActionPerformed

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed
         setPanels("Dashboard");
    }//GEN-LAST:event_dashboardbtnActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home.getHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignmentsBtn;
    private javax.swing.JButton attendanceBtn;
    private javax.swing.JButton batchesBtn;
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JButton examsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lecturersBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton paymentsBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel profilePic;
    private javax.swing.JButton studentsBtn;
    private javax.swing.JButton timeTablebtn;
    private javax.swing.JButton unitsBtn;
    // End of variables declaration//GEN-END:variables

}
