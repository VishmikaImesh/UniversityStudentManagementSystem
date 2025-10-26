/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin.panel;

import admin.dialog.NewAssignment;
import admin.dialog.ViewAssignments;
import com.formdev.flatlaf.FlatClientProperties;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Window;
import javax.swing.SwingUtilities;
import java.awt.Frame;

import admin.model.Assignment;
import admin.model.AssignmentData;
import admin.model.BatchData;


public class AssignmentPanel extends javax.swing.JPanel {

    public AssignmentData Assignment = new AssignmentData();
    public BatchData batchData = new BatchData();
    public DefaultTableModel model;

    public AssignmentPanel() {
        initComponents();
        this.model = (DefaultTableModel) AssignmetnTable.getModel();
        init();
        loadTable();
        loadBatches();
        loadSubjects();
    }

    public final void init() {
        
        newAssignmentBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10;");
        searchField.putClientProperty(FlatClientProperties.STYLE, "arc:10; borderColor:#CCCCCC;");
        BatchComboBox.putClientProperty(FlatClientProperties.STYLE, "arc:10 ");
        subjectComboBox.putClientProperty(FlatClientProperties.STYLE, "arc:10 ");
        searchPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        assignmentTablePanel.putClientProperty(FlatClientProperties.STYLE, "arc:20;");

        AssignmetnTable.setIntercellSpacing(new java.awt.Dimension(0, 1)); 
        
        AssignmetnTable.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        AssignmetnTable.setGridColor(new java.awt.Color(230, 230, 230));
        AssignmetnTable.setRowHeight(35);
        AssignmetnTable.getTableHeader().setDefaultRenderer(
                (table, value, isSelected, hasFocus, row, column) -> {
                    javax.swing.JLabel headerLabel = new javax.swing.JLabel(value.toString());
                    headerLabel.setForeground(new java.awt.Color(140, 140, 140)); 
                    headerLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 13));
                    return headerLabel;
                }
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }

    public final void loadBatches() {
        List<String> batches = batchData.Data();
        DefaultComboBoxModel<String> batchItems = new DefaultComboBoxModel<>();
        for (String batch : batches) {
            batchItems.addElement(batch);
        }
        BatchComboBox.setModel(batchItems);
    }

    public final void loadSubjects() {
        List<Assignment> subjects = Assignment.loadAssignment();;
        DefaultComboBoxModel<String> subejctItems = new DefaultComboBoxModel<>();
        for (Assignment subject : subjects) {
            subejctItems.addElement(subject.getSubject());
        }
        subjectComboBox.setModel(subejctItems);
    }

    public final void loadTable() {
        List<Assignment> assignments = Assignment.loadAssignment();
        for (Assignment a : assignments) {
            model.addRow(new Object[]{a.getAssignmentID(), a.getAssignmentName(), a.getDueDate(), a.getBatch(), a.getSubject()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        newAssignmentBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        BatchComboBox = new javax.swing.JComboBox<>();
        subjectComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BatchComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        assignmentTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssignmetnTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Assignment");

        newAssignmentBtn.setBackground(new java.awt.Color(0, 77, 255));
        newAssignmentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newAssignmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        newAssignmentBtn.setText("+ New Assignment");
        newAssignmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAssignmentBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Assignments");

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchField.setBackground(new java.awt.Color(250, 250, 250));
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("Search By name or subject");
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchFieldMousePressed(evt);
            }
        });

        BatchComboBox.setBackground(new java.awt.Color(250, 250, 250));
        BatchComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BatchComboBox.setForeground(new java.awt.Color(102, 102, 102));
        BatchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter By: Status" }));

        subjectComboBox.setBackground(new java.awt.Color(250, 250, 250));
        subjectComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        subjectComboBox.setForeground(new java.awt.Color(102, 102, 102));
        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter By: Subject" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Search");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Status");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Subject");

        BatchComboBox1.setBackground(new java.awt.Color(250, 250, 250));
        BatchComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BatchComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        BatchComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter By: Batch" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Batch");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(searchField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BatchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BatchComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BatchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BatchComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        assignmentTablePanel.setBackground(new java.awt.Color(255, 255, 255));

        AssignmetnTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AssignmetnTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AssignmetnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assignment ID", "Assignment Name", "Due Date", "Status", "Batch", "Subject"
            }
        ));
        AssignmetnTable.setFocusable(false);
        AssignmetnTable.setOpaque(false);
        AssignmetnTable.setShowHorizontalLines(true);
        AssignmetnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignmetnTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AssignmetnTable);
        if (AssignmetnTable.getColumnModel().getColumnCount() > 0) {
            AssignmetnTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            AssignmetnTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            AssignmetnTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            AssignmetnTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            AssignmetnTable.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        javax.swing.GroupLayout assignmentTablePanelLayout = new javax.swing.GroupLayout(assignmentTablePanel);
        assignmentTablePanel.setLayout(assignmentTablePanelLayout);
        assignmentTablePanelLayout.setHorizontalGroup(
            assignmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        assignmentTablePanelLayout.setVerticalGroup(
            assignmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("Test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignmentTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newAssignmentBtn))
                            .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(newAssignmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(assignmentTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignmetnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignmetnTableMouseClicked
        String assignmentId = (String) AssignmetnTable.getValueAt(AssignmetnTable.getSelectedRow(), 0);
        String batchId = (String) AssignmetnTable.getValueAt(AssignmetnTable.getSelectedRow(), 3);
        Window parentWindow = SwingUtilities.getWindowAncestor(this);

        ViewAssignments dialog = new ViewAssignments((java.awt.Frame) parentWindow, true);
        dialog.AssignmentDetails(assignmentId, batchId);
        dialog.setLocationRelativeTo(parentWindow); // center on parent
        dialog.setVisible(true);
    }//GEN-LAST:event_AssignmetnTableMouseClicked

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMousePressed

    }//GEN-LAST:event_searchFieldMousePressed

    private void searchFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseExited
       if(searchField.getText().isBlank()){
           searchField.setText("Search By ID or Name");
       }
    }//GEN-LAST:event_searchFieldMouseExited

    private void newAssignmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAssignmentBtnActionPerformed
       Window parentWindow= SwingUtilities.getWindowAncestor(this);
       NewAssignment newAssignment=new NewAssignment((Frame)parentWindow,true);
       newAssignment.setLocationRelativeTo(parentWindow);
       newAssignment.setVisible(true);
       
    }//GEN-LAST:event_newAssignmentBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssignmetnTable;
    private javax.swing.JComboBox<String> BatchComboBox;
    private javax.swing.JComboBox<String> BatchComboBox1;
    private javax.swing.JPanel assignmentTablePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAssignmentBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> subjectComboBox;
    // End of variables declaration//GEN-END:variables
}
