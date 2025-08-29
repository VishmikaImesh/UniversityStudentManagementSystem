package student.panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import student.gui.Home;




public class Dashboard extends javax.swing.JPanel {
    

    public Dashboard() {
        initComponents();
        init();
    }
     

    private void init() {
        studentcard.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        attendanceCard.putClientProperty(FlatClientProperties.STYLE,"arc:10");
        timetableCard.putClientProperty(FlatClientProperties.STYLE,"arc:10");
        //studentIcon.setIcon(new FlatSVGIcon("icon/Test.svg", 100, 100));   
        
        assignmentsCount.setText("8");
        attendanceCount.setText("10");
        timetableCount.setText("5");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        studentcard = new javax.swing.JPanel();
        assignmentsCount = new javax.swing.JLabel();
        dsstudentbtn = new javax.swing.JButton();
        studentIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        attendanceCard = new javax.swing.JPanel();
        attendanceCount = new javax.swing.JLabel();
        dsstudentbtn1 = new javax.swing.JButton();
        studentIcon1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timetableCard = new javax.swing.JPanel();
        timetableCount = new javax.swing.JLabel();
        dsstudentbtn3 = new javax.swing.JButton();
        studentIcon3 = new javax.swing.JLabel();
        timetablelabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        noticeBoard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        studentcard.setBackground(new java.awt.Color(0, 197, 255));

        assignmentsCount.setBackground(new java.awt.Color(0, 255, 255));
        assignmentsCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        assignmentsCount.setForeground(new java.awt.Color(0, 255, 255));
        assignmentsCount.setText("5");

        dsstudentbtn.setBackground(new java.awt.Color(0, 173, 255));
        dsstudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsstudentbtn.setForeground(new java.awt.Color(170, 255, 255));
        dsstudentbtn.setText("More Info >>");
        dsstudentbtn.setBorder(null);
        dsstudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsstudentbtnActionPerformed(evt);
            }
        });

        studentIcon.setBackground(new java.awt.Color(0, 197, 255));

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Assignmets");

        javax.swing.GroupLayout studentcardLayout = new javax.swing.GroupLayout(studentcard);
        studentcard.setLayout(studentcardLayout);
        studentcardLayout.setHorizontalGroup(
            studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcardLayout.createSequentialGroup()
                .addGroup(studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(assignmentsCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentcardLayout.setVerticalGroup(
            studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcardLayout.createSequentialGroup()
                .addGroup(studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(assignmentsCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(studentcard);

        attendanceCard.setBackground(new java.awt.Color(0, 197, 255));

        attendanceCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        attendanceCount.setForeground(new java.awt.Color(102, 255, 255));
        attendanceCount.setText("5");

        dsstudentbtn1.setBackground(new java.awt.Color(0, 173, 255));
        dsstudentbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsstudentbtn1.setForeground(new java.awt.Color(170, 255, 255));
        dsstudentbtn1.setText("More Info >>");
        dsstudentbtn1.setBorder(null);
        dsstudentbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsstudentbtn1ActionPerformed(evt);
            }
        });

        studentIcon1.setBackground(new java.awt.Color(0, 197, 255));

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Attendance");

        javax.swing.GroupLayout attendanceCardLayout = new javax.swing.GroupLayout(attendanceCard);
        attendanceCard.setLayout(attendanceCardLayout);
        attendanceCardLayout.setHorizontalGroup(
            attendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceCardLayout.createSequentialGroup()
                .addGroup(attendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendanceCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(attendanceCardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(attendanceCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        attendanceCardLayout.setVerticalGroup(
            attendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceCardLayout.createSequentialGroup()
                .addGroup(attendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(attendanceCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(attendanceCardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(attendanceCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(attendanceCard);

        timetableCard.setBackground(new java.awt.Color(0, 197, 255));

        timetableCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timetableCount.setForeground(new java.awt.Color(102, 255, 255));
        timetableCount.setText("5");

        dsstudentbtn3.setBackground(new java.awt.Color(0, 173, 255));
        dsstudentbtn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsstudentbtn3.setForeground(new java.awt.Color(170, 255, 255));
        dsstudentbtn3.setText("More Info >>");
        dsstudentbtn3.setBorder(null);
        dsstudentbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsstudentbtn3ActionPerformed(evt);
            }
        });

        studentIcon3.setBackground(new java.awt.Color(0, 197, 255));

        timetablelabel.setBackground(new java.awt.Color(0, 255, 255));
        timetablelabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        timetablelabel.setForeground(new java.awt.Color(0, 255, 255));
        timetablelabel.setText("Time Table");

        javax.swing.GroupLayout timetableCardLayout = new javax.swing.GroupLayout(timetableCard);
        timetableCard.setLayout(timetableCardLayout);
        timetableCardLayout.setHorizontalGroup(
            timetableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timetableCardLayout.createSequentialGroup()
                .addGroup(timetableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timetableCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timetablelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(timetableCardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(timetableCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        timetableCardLayout.setVerticalGroup(
            timetableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timetableCardLayout.createSequentialGroup()
                .addGroup(timetableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(timetableCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timetableCardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(timetableCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timetablelabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(timetableCard);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Notice Board");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("There are no active notices at this time.");

        javax.swing.GroupLayout noticeBoardLayout = new javax.swing.GroupLayout(noticeBoard);
        noticeBoard.setLayout(noticeBoardLayout);
        noticeBoardLayout.setHorizontalGroup(
            noticeBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeBoardLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        noticeBoardLayout.setVerticalGroup(
            noticeBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeBoardLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noticeBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dsstudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtnActionPerformed
        Home h=Home.getHome();
        h.getAssignmentsBtn();
    }//GEN-LAST:event_dsstudentbtnActionPerformed

    private void dsstudentbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsstudentbtn1ActionPerformed

    private void dsstudentbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsstudentbtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignmentsCount;
    private javax.swing.JPanel attendanceCard;
    private javax.swing.JLabel attendanceCount;
    private javax.swing.JButton dsstudentbtn;
    private javax.swing.JButton dsstudentbtn1;
    private javax.swing.JButton dsstudentbtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel noticeBoard;
    private javax.swing.JLabel studentIcon;
    private javax.swing.JLabel studentIcon1;
    private javax.swing.JLabel studentIcon3;
    private javax.swing.JPanel studentcard;
    private javax.swing.JPanel timetableCard;
    private javax.swing.JLabel timetableCount;
    private javax.swing.JLabel timetablelabel;
    // End of variables declaration//GEN-END:variables
}
