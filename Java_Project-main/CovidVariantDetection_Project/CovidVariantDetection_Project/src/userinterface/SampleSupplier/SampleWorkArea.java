/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SampleSupplier;

import userinterface.SampleSupplier.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.SampleOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SampleWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author kasai
 */
public class SampleWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SampleWorkArea
     *
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private SampleOrganization sampleOrganization;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(SampleWorkArea.class);
    private static final String CLASS_NAME = SampleWorkArea.class.getName();

    public SampleWorkArea(JPanel userProcessContainer, UserAccount userAccount, SampleOrganization sampleOrganization, Enterprise enterprise, EcoSystem business, Network network) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.sampleOrganization = sampleOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.setSize(1920, 1080);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestTbl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : sampleOrganization.getWQ().getWorkRequestList()) {
            if(request instanceof SampleWorkRequest){
            Object[] row = new Object[6];
            row[0] = ((SampleWorkRequest) request);
            row[1] = ((SampleWorkRequest) request).getQty();
            row[2] = request.getEndUser().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            if(request.getReceiver() == null || request.getReceiver().equals("Processing"))
            {row[5] = null;}
            else
            {row[5] = ((SampleWorkRequest) request).getTOD();}

            model.addRow(row);
        }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drugSupplierLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestTbl = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));

        drugSupplierLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        drugSupplierLbl.setForeground(new java.awt.Color(255, 255, 255));
        drugSupplierLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drugSupplierLbl.setText("SAMPLE SUPPLIER WORK AREA ");

        workRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SAMPLE NAME", "QUANTITY", "SENDER", "RECEIVER", "STATUS", "DELIVERY TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestTbl.setRowHeight(30);
        jScrollPane2.setViewportView(workRequestTbl);

        assignBtn.setBackground(new java.awt.Color(0, 0, 255));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("ASSIGN TO ME");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBtn.setBackground(new java.awt.Color(0, 0, 255));
        processBtn.setForeground(new java.awt.Color(255, 255, 255));
        processBtn.setText("PROCESS");
        processBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(0, 0, 255));
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("REFRESH");
        refreshBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blood-sample.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addComponent(jScrollPane2)
                    .addComponent(drugSupplierLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(drugSupplierLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        int selectedRow = workRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (((workRequestTbl.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (workRequestTbl.getValueAt(selectedRow, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        if (workRequestTbl.getValueAt(selectedRow, 3) != null) {

            if (!workRequestTbl.getValueAt(selectedRow, 3).equals(userAccount.getUsername())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }

        int flag = 0;
        for (WorkRequest request : sampleOrganization.getWQ().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Assigned") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag = 1;
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : sampleOrganization.getWQ().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag1 = 1;
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) workRequestTbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        populateTable();
        log.debug(userAccount + " " + "assigned a task to himself");
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed

        int selectedRow = workRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        SampleWorkRequest request = (SampleWorkRequest) workRequestTbl.getValueAt(selectedRow, 0);
        if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

            if (((workRequestTbl.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

        if (workRequestTbl.getValueAt(selectedRow, 4) == null) {
            JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
            return;
        }
        int flag = 0;

        if (workRequestTbl.getValueAt(selectedRow, 4).equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {

            flag = 1;
        }
        if (flag != 1) {
            if (workRequestTbl.getValueAt(selectedRow, 4) != null) {

                if (!(((workRequestTbl.getValueAt(selectedRow, 4).equals("Assigned"))) && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString()))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        SampleProcessRequestJpanel processWorkRequestJPanel = new SampleProcessRequestJpanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        log.debug(userAccount + " " + "processes the task");
    }//GEN-LAST:event_processBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed

        //populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel drugSupplierLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable workRequestTbl;
    // End of variables declaration//GEN-END:variables
}
