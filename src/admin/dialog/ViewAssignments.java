package admin.dialog;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.util.List;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.table.DefaultTableModel;
import lecture.model.AssignmentData;
import lecture.model.StudentAssignment;

public final class ViewAssignments extends javax.swing.JDialog {
    
    public AssignmentData assignmentData = new AssignmentData();
    private String assignmentId;
    private String batchId;
    public DefaultTableModel model;
    
    public ViewAssignments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        this.model=(DefaultTableModel)assignmentDetailsTable.getModel();
        loadTable();
        
    }
    
    private void init() {
        
        assignmentDetailsPanel.putClientProperty(FlatClientProperties.STYLE,"arc:20");
        
        assignmentDetailsTable.getTableHeader().setDefaultRenderer(
                (table, value, isSelected, hasFocus, row, column) -> {
                    JLabel header = new JLabel(value.toString());
                    header.setForeground(new Color(140,140,140));
                    header.setFont(new Font("Tahoma",BOLD,13));
                    header.setHorizontalAlignment(LEFT);
                    return header;
                }
        );
          
    }
    
    public void AssignmentDetails(String assignmentId, String batch) {
        this.assignmentId = assignmentId;
        this.batchId = batch;
    }
    
    public void loadTable() {
        List<StudentAssignment> data = assignmentData.loadStudentAssignment(batchId, assignmentId);
        for (StudentAssignment s : data) {
            model.addRow(new Object[]{s.getNic(),s.getName(),s.getBatch()});
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        assignmentDetailsPanel = new javax.swing.JPanel();
        assignmentDetailsScrollPanel = new javax.swing.JScrollPane();
        assignmentDetailsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(" Assignments+batch");

        jLabel1.setText("jLabel1");

        assignmentDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        assignmentDetailsScrollPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        assignmentDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignmentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "Batch", "status", "Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assignmentDetailsTable.setRowHeight(35);
        assignmentDetailsTable.setShowHorizontalLines(true);
        assignmentDetailsScrollPanel.setViewportView(assignmentDetailsTable);

        javax.swing.GroupLayout assignmentDetailsPanelLayout = new javax.swing.GroupLayout(assignmentDetailsPanel);
        assignmentDetailsPanel.setLayout(assignmentDetailsPanelLayout);
        assignmentDetailsPanelLayout.setHorizontalGroup(
            assignmentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentDetailsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(assignmentDetailsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        assignmentDetailsPanelLayout.setVerticalGroup(
            assignmentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignmentDetailsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(assignmentDetailsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignmentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(assignmentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAssignments dialog = new ViewAssignments(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignmentDetailsPanel;
    private javax.swing.JScrollPane assignmentDetailsScrollPanel;
    private javax.swing.JTable assignmentDetailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
