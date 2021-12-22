/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Business.Enterprise.Enterprise;
import Business.Organization.VaccineOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineWorkRequest;
import Business.WorkQueue.SampleWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import userinterface.PharmacyRole.PharmacyWorkArea;

/**
 *
 * @author deepa
 */
public class ViewRequestsSampleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private VaccineOrganization drugOrganization;
     private static Logger log = Logger.getLogger(ViewRequestsSampleJPanel.class);
    private static final String CLASS_NAME = ViewRequestsSampleJPanel.class.getName();
    public ViewRequestsSampleJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, VaccineOrganization vaccineOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.drugOrganization = vaccineOrganization;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)drugRequestsTable.getModel();
        
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((SampleWorkRequest) request);
            row[1] = ((SampleWorkRequest) request).getQty();
            row[2] = request.getReceiver();
            String result = ((SampleWorkRequest) request).getStatus();
            row[3] = result == null ? "Waiting" : result;
            if(((SampleWorkRequest) request).getTOD()==null){
                row[4]="Details yet to be updated by supplier";
            }
            else{
            row[4]  = "Expected delivery time " +((SampleWorkRequest) request).getQty();
                    }
            
            model.addRow(row);
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

        jScrollPane = new javax.swing.JScrollPane();
        drugRequestsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SAMPLE NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drugRequestsTable.setRowHeight(30);
        jScrollPane.setViewportView(drugRequestsTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 234, 655, 213));

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 458, 72, 26));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW STATUS OF REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 192, 655, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 31, -1, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewSampleRequestsJPanel dw = (ViewSampleRequestsJPanel) component;
        dw.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable drugRequestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
