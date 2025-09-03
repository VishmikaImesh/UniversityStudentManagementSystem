package lecturer.panel;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import lecture.model.AssignmentData;
import lecture.model.Assignment;

public class AssignmentPanel extends javax.swing.JPanel {

    private AssignmentData data = new AssignmentData();

    public AssignmentPanel() {
        initComponents();
        setTable();
        init();

    }
    
    private void init(){
        searchbtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        searchField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
    }

    private void setTable() {

        int count = 7;

        List<Assignment> assignments = data.loadData(searchField.getText());

        JPanel columns = new JPanel(new GridLayout(0, 7));
        columns.setPreferredSize(new Dimension(700, 20));
    
        JLabel caid = new JLabel();
        caid.setText("Assignment ID");
        columns.add(caid);
        
        JLabel csub = new JLabel();
        csub.setText("Subject");
        columns.add(csub);
        
        JLabel cnic = new JLabel();
        cnic.setText("NIC");
        columns.add(cnic);
        
        JLabel cname = new JLabel();
        cname.setText("Name");
        columns.add(cname);
        
        JLabel cbatch = new JLabel();
        cbatch.setText("batch");
        columns.add(cbatch);
        
        JLabel cva = new JLabel();
        cva.setText("View Assignment");
        columns.add(cva);
        
        JLabel cmarks = new JLabel();
        cmarks.setText("Marks");
        columns.add(cmarks);
        
        contents.add(columns);

        for (Assignment a : assignments) {
            JPanel row = new JPanel(new GridLayout(0, 7));
            row.setPreferredSize(new Dimension(700,10));

            //JPanel btnpanel = new JPanel(new GridBagLayout());
            JLabel assignmentid = new JLabel();
            assignmentid.setText(a.getAssignmentID());
            row.add(assignmentid);

            JLabel subject = new JLabel();
            subject.setText(a.getSubject());
            row.add(subject);

            JLabel nic = new JLabel();
            nic.setText(a.getNic());
            row.add(nic);

            JLabel name = new JLabel();
            name.setText(a.getName());
            row.add(name);

            JLabel batch = new JLabel();
            batch.setText(a.getBatch());
            row.add(batch);

            JPanel btnpanel = new JPanel(new GridBagLayout());
            JButton btn = new JButton();
            btn.setSize(new Dimension(2, 2));
            btn.setBackground(new java.awt.Color(0, 153, 255));
            btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            btn.setForeground(new java.awt.Color(255, 255, 255));
            btn.setText("View");
            btn.setName(a.getAssignmentID());
            btn.addActionListener((java.awt.event.ActionEvent evt) -> {
                try {
                    URL resource = Assignment.class.getResource("/student/assignment/001.pdf");
                    File pdfFile = new File(resource.toURI());
                    if (pdfFile.exists()) {
                        if (Desktop.isDesktopSupported()) {
                            Desktop.getDesktop().open(pdfFile);
                        } else {
                            System.out.println("Desktop not supported");
                        }
                    } else {
                        System.out.println("File does not exist");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            btnpanel.add(btn);
            row.add(btnpanel);

            JLabel marks = new JLabel();
            marks.setText("");
            row.add(marks);

            contents.add(row);

            //l.setHorizontalAlignment(SwingConstants.CENTER);
            //l.setBackground(Color.white);
            //btnpanel.add(l);
            //contents.add(btnpanel);
//            if ((i + 1) % 6 == 0) {
//                JPanel btnpanel = new JPanel(new GridBagLayout());
//                JButton btn = new JButton();
//                btn.setBackground(new java.awt.Color(0, 102, 255));
//                btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
//                btn.setForeground(new java.awt.Color(255, 255, 255));
//                btn.setText("View Assignment");
//                btn.setName(Integer.toString(i));
//                btn.addActionListener((java.awt.event.ActionEvent evt) -> {
//                    try {
//                        URL resource = Assignment.class.getResource("/student/assignment/001.pdf");
//                        File pdfFile = new File(resource.toURI());
//                        if (pdfFile.exists()) {
//                            if (Desktop.isDesktopSupported()) {
//                                Desktop.getDesktop().open(pdfFile);
//                            } else {
//                                System.out.println("Desktop not supported");
//                            }
//                        } else {
//                            System.out.println("File does not exist");
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (URISyntaxException ex) {
//                        Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                });
//
//                btn.setSize(new Dimension(2, 2));
//                btnpanel.add(btn);
//                row.add(btnpanel);
//                contents.add(btnpanel);
//            } else {
//                JPanel btnpanel = new JPanel(new GridBagLayout());
//                JLabel l = new JLabel();
//                l.setText("20030980032");
//                l.setHorizontalAlignment(SwingConstants.CENTER);
//                l.setBackground(Color.white);
//                //l.setBorder(BorderFactory.createLineBorder(new Color(102,102,102)));
//                btnpanel.add(l);
//                contents.add(btnpanel);
//            }
        }

        while (count < 9) {
            JLabel l = new JLabel();
            contents.add(l);
            count++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contents = new javax.swing.JPanel();
        searchbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Assignments");

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 2, 0));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 5, true));

        contents.setLayout(new java.awt.GridLayout(0, 1, 0, 15));
        jScrollPane1.setViewportView(contents);

        jPanel3.add(jScrollPane1);

        searchbtn.setBackground(new java.awt.Color(0, 153, 255));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Batch");
        jPanel5.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("subject");
        jPanel5.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Assignment");
        jPanel5.add(jLabel4);

        jLabel5.setText("NIC");
        jPanel5.add(jLabel5);

        jPanel6.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox3);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1);

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel4.add(searchField);

        jPanel6.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchbtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(325, 325, 325))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        setTable();
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contents;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
