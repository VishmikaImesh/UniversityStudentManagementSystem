package lecturer.panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;


public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        init();
        SetStudentCount();
    }
    
    private void SetStudentCount(){
        studentCount.setText("8");
    }

    private void init() {
        studentcard.putClientProperty(FlatClientProperties.STYLE, "arc:0");
        //studentIcon.setIcon(new FlatSVGIcon("icon/Test.svg", 100, 100));             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        studentcard = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        dsstudentbtn = new javax.swing.JButton();
        studentIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studentcard1 = new javax.swing.JPanel();
        studentCount1 = new javax.swing.JLabel();
        dsstudentbtn1 = new javax.swing.JButton();
        studentIcon1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentcard3 = new javax.swing.JPanel();
        studentCount3 = new javax.swing.JLabel();
        dsstudentbtn3 = new javax.swing.JButton();
        studentIcon3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        studentcard.setBackground(new java.awt.Color(0, 197, 255));

        studentCount.setBackground(new java.awt.Color(0, 255, 255));
        studentCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentCount.setForeground(new java.awt.Color(0, 255, 255));
        studentCount.setText("5");

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
                        .addComponent(studentCount)
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
                        .addComponent(studentCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(studentcard);

        studentcard1.setBackground(new java.awt.Color(0, 197, 255));

        studentCount1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentCount1.setForeground(new java.awt.Color(102, 255, 255));
        studentCount1.setText("5");

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

        javax.swing.GroupLayout studentcard1Layout = new javax.swing.GroupLayout(studentcard1);
        studentcard1.setLayout(studentcard1Layout);
        studentcard1Layout.setHorizontalGroup(
            studentcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcard1Layout.createSequentialGroup()
                .addGroup(studentcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentcard1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(studentcard1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(studentCount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentcard1Layout.setVerticalGroup(
            studentcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcard1Layout.createSequentialGroup()
                .addGroup(studentcard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentcard1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentcard1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(studentCount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(studentcard1);

        studentcard3.setBackground(new java.awt.Color(0, 197, 255));

        studentCount3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentCount3.setForeground(new java.awt.Color(102, 255, 255));
        studentCount3.setText("5");

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

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Time Table");

        javax.swing.GroupLayout studentcard3Layout = new javax.swing.GroupLayout(studentcard3);
        studentcard3.setLayout(studentcard3Layout);
        studentcard3Layout.setHorizontalGroup(
            studentcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcard3Layout.createSequentialGroup()
                .addGroup(studentcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentcard3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(studentcard3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(studentCount3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentcard3Layout.setVerticalGroup(
            studentcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcard3Layout.createSequentialGroup()
                .addGroup(studentcard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentcard3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentcard3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(studentCount3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(studentcard3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dsstudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtnActionPerformed

    }//GEN-LAST:event_dsstudentbtnActionPerformed

    private void dsstudentbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsstudentbtn1ActionPerformed

    private void dsstudentbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsstudentbtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dsstudentbtn;
    private javax.swing.JButton dsstudentbtn1;
    private javax.swing.JButton dsstudentbtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel studentCount;
    private javax.swing.JLabel studentCount1;
    private javax.swing.JLabel studentCount3;
    private javax.swing.JLabel studentIcon;
    private javax.swing.JLabel studentIcon1;
    private javax.swing.JLabel studentIcon3;
    private javax.swing.JPanel studentcard;
    private javax.swing.JPanel studentcard1;
    private javax.swing.JPanel studentcard3;
    // End of variables declaration//GEN-END:variables
}
