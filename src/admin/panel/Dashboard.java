package admin.panel;

import com.formdev.flatlaf.FlatClientProperties;
import admin.gui.Home;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        init();
        SetStudentCount();
    }

    private void SetStudentCount() {
        studentCount.setText("8");
    }

    private void init() {

        assignmentstcard.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        assignmentstcard1.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        assignmentstcard2.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        assignmentstcard3.putClientProperty(FlatClientProperties.STYLE, "arc:30");

        examsmoreinfobtn.putClientProperty(FlatClientProperties.STYLE, "arc:10; borderColor:#BA0045");
        studentsmoreinfobtn.putClientProperty(FlatClientProperties.STYLE, "arc:10; borderColor:#00AB7C");
        assignmentsmoreinfobtn2.putClientProperty(FlatClientProperties.STYLE, "arc:10; borderColor:#0070FF");
        subjectmoreinfobtn3.putClientProperty(FlatClientProperties.STYLE, "arc:10; borderColor:#CEA400");

        noticeBoardPanel.putClientProperty(FlatClientProperties.STYLE, "arc:30");

        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        assignmentstcard2 = new javax.swing.JPanel();
        studentCount4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        assignmentsmoreinfobtn2 = new javax.swing.JButton();
        assignmentstcard1 = new javax.swing.JPanel();
        studentCount2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentsmoreinfobtn = new javax.swing.JButton();
        assignmentstcard3 = new javax.swing.JPanel();
        studentCount5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        subjectmoreinfobtn3 = new javax.swing.JButton();
        assignmentstcard = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        examsmoreinfobtn = new javax.swing.JButton();
        noticeBoardPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 30, 10));

        assignmentstcard2.setBackground(new java.awt.Color(0, 173, 255));

        studentCount4.setBackground(new java.awt.Color(0, 255, 255));
        studentCount4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        studentCount4.setForeground(new java.awt.Color(255, 255, 255));
        studentCount4.setText("5");

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Assignmets");

        assignmentsmoreinfobtn2.setBackground(new java.awt.Color(0, 112, 255));
        assignmentsmoreinfobtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        assignmentsmoreinfobtn2.setForeground(new java.awt.Color(255, 255, 255));
        assignmentsmoreinfobtn2.setText("More Info >>");
        assignmentsmoreinfobtn2.setBorder(null);
        assignmentsmoreinfobtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignmentsmoreinfobtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignmentstcard2Layout = new javax.swing.GroupLayout(assignmentstcard2);
        assignmentstcard2.setLayout(assignmentstcard2Layout);
        assignmentstcard2Layout.setHorizontalGroup(
            assignmentstcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(assignmentstcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignmentstcard2Layout.createSequentialGroup()
                        .addComponent(studentCount4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignmentstcard2Layout.createSequentialGroup()
                        .addGroup(assignmentstcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(assignmentsmoreinfobtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        assignmentstcard2Layout.setVerticalGroup(
            assignmentstcard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studentCount4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignmentsmoreinfobtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(assignmentstcard2);

        assignmentstcard1.setBackground(new java.awt.Color(0, 204, 115));

        studentCount2.setBackground(new java.awt.Color(0, 255, 255));
        studentCount2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        studentCount2.setForeground(new java.awt.Color(255, 255, 255));
        studentCount2.setText("5");

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Students");

        studentsmoreinfobtn.setBackground(new java.awt.Color(0, 171, 124));
        studentsmoreinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentsmoreinfobtn.setForeground(new java.awt.Color(255, 255, 255));
        studentsmoreinfobtn.setText("More Info >>");
        studentsmoreinfobtn.setBorder(null);
        studentsmoreinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsmoreinfobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignmentstcard1Layout = new javax.swing.GroupLayout(assignmentstcard1);
        assignmentstcard1.setLayout(assignmentstcard1Layout);
        assignmentstcard1Layout.setHorizontalGroup(
            assignmentstcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(assignmentstcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignmentstcard1Layout.createSequentialGroup()
                        .addComponent(studentCount2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignmentstcard1Layout.createSequentialGroup()
                        .addGroup(assignmentstcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentsmoreinfobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        assignmentstcard1Layout.setVerticalGroup(
            assignmentstcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studentCount2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentsmoreinfobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(assignmentstcard1);

        assignmentstcard3.setBackground(new java.awt.Color(255, 204, 0));

        studentCount5.setBackground(new java.awt.Color(0, 255, 255));
        studentCount5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        studentCount5.setForeground(new java.awt.Color(255, 255, 255));
        studentCount5.setText("5");

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Subjects");

        subjectmoreinfobtn3.setBackground(new java.awt.Color(206, 164, 0));
        subjectmoreinfobtn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subjectmoreinfobtn3.setForeground(new java.awt.Color(255, 255, 255));
        subjectmoreinfobtn3.setText("More Info >>");
        subjectmoreinfobtn3.setBorder(null);
        subjectmoreinfobtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectmoreinfobtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignmentstcard3Layout = new javax.swing.GroupLayout(assignmentstcard3);
        assignmentstcard3.setLayout(assignmentstcard3Layout);
        assignmentstcard3Layout.setHorizontalGroup(
            assignmentstcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(assignmentstcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignmentstcard3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignmentstcard3Layout.createSequentialGroup()
                        .addComponent(studentCount5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignmentstcard3Layout.createSequentialGroup()
                        .addComponent(subjectmoreinfobtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        assignmentstcard3Layout.setVerticalGroup(
            assignmentstcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcard3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studentCount5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectmoreinfobtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(assignmentstcard3);

        assignmentstcard.setBackground(new java.awt.Color(213, 0, 69));

        studentCount.setBackground(new java.awt.Color(0, 255, 255));
        studentCount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        studentCount.setForeground(new java.awt.Color(255, 255, 255));
        studentCount.setText("5");

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exams");

        examsmoreinfobtn.setBackground(new java.awt.Color(186, 0, 69));
        examsmoreinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        examsmoreinfobtn.setForeground(new java.awt.Color(255, 255, 255));
        examsmoreinfobtn.setText("More Info >>");
        examsmoreinfobtn.setBorder(null);
        examsmoreinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examsmoreinfobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignmentstcardLayout = new javax.swing.GroupLayout(assignmentstcard);
        assignmentstcard.setLayout(assignmentstcardLayout);
        assignmentstcardLayout.setHorizontalGroup(
            assignmentstcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(assignmentstcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignmentstcardLayout.createSequentialGroup()
                        .addComponent(studentCount)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignmentstcardLayout.createSequentialGroup()
                        .addGroup(assignmentstcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examsmoreinfobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        assignmentstcardLayout.setVerticalGroup(
            assignmentstcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentstcardLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studentCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(examsmoreinfobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(assignmentstcard);

        noticeBoardPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Noticeboard");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(93, 93, 93));

        jLabel4.setText("imesh 8.11");

        javax.swing.GroupLayout noticeBoardPanelLayout = new javax.swing.GroupLayout(noticeBoardPanel);
        noticeBoardPanel.setLayout(noticeBoardPanelLayout);
        noticeBoardPanelLayout.setHorizontalGroup(
            noticeBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeBoardPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(noticeBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noticeBoardPanelLayout.setVerticalGroup(
            noticeBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeBoardPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                    .addComponent(noticeBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(noticeBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void examsmoreinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examsmoreinfobtnActionPerformed
       Home home=Home.getHome();
        home.setPanels("Exams");
    }//GEN-LAST:event_examsmoreinfobtnActionPerformed

    private void studentsmoreinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsmoreinfobtnActionPerformed
         Home home=Home.getHome();
        home.setPanels("Students");
    }//GEN-LAST:event_studentsmoreinfobtnActionPerformed

    private void assignmentsmoreinfobtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignmentsmoreinfobtn2ActionPerformed
        Home home=Home.getHome();
        home.setPanels("Assignment");
    }//GEN-LAST:event_assignmentsmoreinfobtn2ActionPerformed

    private void subjectmoreinfobtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectmoreinfobtn3ActionPerformed
        Home home=Home.getHome();
        home.setPanels("Units");
    }//GEN-LAST:event_subjectmoreinfobtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignmentsmoreinfobtn2;
    private javax.swing.JPanel assignmentstcard;
    private javax.swing.JPanel assignmentstcard1;
    private javax.swing.JPanel assignmentstcard2;
    private javax.swing.JPanel assignmentstcard3;
    private javax.swing.JButton examsmoreinfobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel noticeBoardPanel;
    private javax.swing.JLabel studentCount;
    private javax.swing.JLabel studentCount2;
    private javax.swing.JLabel studentCount4;
    private javax.swing.JLabel studentCount5;
    private javax.swing.JButton studentsmoreinfobtn;
    private javax.swing.JButton subjectmoreinfobtn3;
    // End of variables declaration//GEN-END:variables
}
