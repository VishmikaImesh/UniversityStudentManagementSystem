package admin.gui;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import javax.swing.JPanel;
import lecturer.panel.Assignment;
import lecturer.panel.Dashboard;

public class Home extends javax.swing.JFrame {

    private Dashboard dashboard;
    private CardLayout layout;
    private Assignment assignment;
    
    public Home() {
        initComponents();
        init();
        loadPanels();
    }

    private void init() {
        profilePic.setIcon(new FlatSVGIcon("student/icon/noprofile.svg", 50, 50));
    }

    private void loadPanels() {

        layout = new CardLayout();
        mainPanel.setLayout(layout);
        
        dashboard = new Dashboard();
        assignment=new Assignment();
                
        mainPanel.add(assignment,"Assignment");
        mainPanel.add(dashboard, "Dashboard");
        
        layout.show(mainPanel, "Dashboard");
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
        AssignmentsBtn = new javax.swing.JButton();
        PaymentsBtn = new javax.swing.JButton();
        examsBtn = new javax.swing.JButton();
        ProfileBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        profilePic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

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
        jPanel2.setLayout(new java.awt.GridLayout(11, 1));

        dashboardbtn.setBackground(new java.awt.Color(0, 33, 71));
        dashboardbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        dashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardbtn.setText("Dashboard");
        dashboardbtn.setBorder(null);
        dashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbtnActionPerformed(evt);
            }
        });
        jPanel2.add(dashboardbtn);

        studentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        studentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        studentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentsBtn.setText("Studnets");
        studentsBtn.setBorder(null);
        studentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(studentsBtn);

        lecturersBtn.setBackground(new java.awt.Color(0, 33, 71));
        lecturersBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lecturersBtn.setForeground(new java.awt.Color(255, 255, 255));
        lecturersBtn.setText("lecturers");
        lecturersBtn.setBorder(null);
        lecturersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturersBtnActionPerformed(evt);
            }
        });
        jPanel2.add(lecturersBtn);

        batchesBtn.setBackground(new java.awt.Color(0, 33, 71));
        batchesBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        batchesBtn.setForeground(new java.awt.Color(255, 255, 255));
        batchesBtn.setText("Batches");
        batchesBtn.setBorder(null);
        batchesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchesBtnActionPerformed(evt);
            }
        });
        jPanel2.add(batchesBtn);

        timeTablebtn.setBackground(new java.awt.Color(0, 33, 71));
        timeTablebtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        timeTablebtn.setForeground(new java.awt.Color(255, 255, 255));
        timeTablebtn.setText("Time Table");
        timeTablebtn.setBorder(null);
        timeTablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTablebtnActionPerformed(evt);
            }
        });
        jPanel2.add(timeTablebtn);

        unitsBtn.setBackground(new java.awt.Color(0, 33, 71));
        unitsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        unitsBtn.setForeground(new java.awt.Color(255, 255, 255));
        unitsBtn.setText("Units");
        unitsBtn.setBorder(null);
        unitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(unitsBtn);

        attendanceBtn.setBackground(new java.awt.Color(0, 33, 71));
        attendanceBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        attendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        attendanceBtn.setText("Attendance");
        attendanceBtn.setBorder(null);
        attendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceBtnActionPerformed(evt);
            }
        });
        jPanel2.add(attendanceBtn);

        AssignmentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        AssignmentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        AssignmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AssignmentsBtn.setText("Assignments");
        AssignmentsBtn.setBorder(null);
        AssignmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AssignmentsBtn);

        PaymentsBtn.setBackground(new java.awt.Color(0, 33, 71));
        PaymentsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        PaymentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        PaymentsBtn.setText("Payments");
        PaymentsBtn.setBorder(null);
        PaymentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PaymentsBtn);

        examsBtn.setBackground(new java.awt.Color(0, 33, 71));
        examsBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        examsBtn.setForeground(new java.awt.Color(255, 255, 255));
        examsBtn.setText("Exams");
        examsBtn.setBorder(null);
        examsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(examsBtn);

        ProfileBtn.setBackground(new java.awt.Color(0, 33, 71));
        ProfileBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProfileBtn.setText("Profile");
        ProfileBtn.setBorder(null);
        ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ProfileBtn);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Admin Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void attendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceBtnActionPerformed

    }//GEN-LAST:event_attendanceBtnActionPerformed

    private void timeTablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTablebtnActionPerformed

    }//GEN-LAST:event_timeTablebtnActionPerformed

    private void unitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsBtnActionPerformed

    }//GEN-LAST:event_unitsBtnActionPerformed

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed

    }//GEN-LAST:event_dashboardbtnActionPerformed

    private void AssignmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentsBtnActionPerformed
        layout.show(assignment,"Assignment");
    }//GEN-LAST:event_AssignmentsBtnActionPerformed

    private void PaymentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentsBtnActionPerformed

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void studentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsBtnActionPerformed

    private void lecturersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecturersBtnActionPerformed

    private void batchesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchesBtnActionPerformed

    private void examsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examsBtnActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignmentsBtn;
    private javax.swing.JButton PaymentsBtn;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton attendanceBtn;
    private javax.swing.JButton batchesBtn;
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JButton examsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lecturersBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel profilePic;
    private javax.swing.JButton studentsBtn;
    private javax.swing.JButton timeTablebtn;
    private javax.swing.JButton unitsBtn;
    // End of variables declaration//GEN-END:variables
}
