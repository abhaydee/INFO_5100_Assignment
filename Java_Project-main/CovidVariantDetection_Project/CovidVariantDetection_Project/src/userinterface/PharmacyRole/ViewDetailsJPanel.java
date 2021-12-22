/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Business.Enterprise.Enterprise;
import Business.MedicalInventory.MedicalInventory;
import Business.MedicalInventory.MedicalInventoryList;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author venu0
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList medInvList;
    private Organization org;
    private PharmacyOrganization pharmorg;
    private MedicalInventory mi;
    private static Logger log = Logger.getLogger(ViewDetailsJPanel.class);
    private static final String CLASS_NAME = ViewDetailsJPanel.class.getName();

    public ViewDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, MedicalInventory mi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.pharmorg = pharmorg;
        this.mi = mi;
        this.setSize(1920,1080);
        serialNumTxtField.setText(String.valueOf(mi.getRollNum()));
        availQuantityTxtField.setText(String.valueOf(mi.getQtyAvail()));
        drugNameTxtField.setText(mi.getMedName());
        saveButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNumLbl = new javax.swing.JLabel();
        serialNumTxtField = new javax.swing.JTextField();
        drugLbl = new javax.swing.JLabel();
        drugNameTxtField = new javax.swing.JTextField();
        availLbl = new javax.swing.JLabel();
        availQuantityTxtField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        medicineLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));

        serialNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        serialNumLbl.setText("SERIAL NUMBER:");

        serialNumTxtField.setEditable(false);

        drugLbl.setForeground(new java.awt.Color(255, 255, 255));
        drugLbl.setText("MEDICINE NAME:");

        drugNameTxtField.setEditable(false);

        availLbl.setForeground(new java.awt.Color(255, 255, 255));
        availLbl.setText("AVAILABILITY:");

        availQuantityTxtField.setEditable(false);
        availQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availQuantityTxtFieldActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 0, 255));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 0, 255));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SAVE");
        saveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 255));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        medicineLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        medicineLbl.setForeground(new java.awt.Color(255, 255, 255));
        medicineLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicineLbl.setText("MEDICINE INFORMATION");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vitamin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(availLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(availQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicineLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(serialNumLbl)
                                    .addComponent(drugLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialNumTxtField)
                                    .addComponent(drugNameTxtField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(1092, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(medicineLbl)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumLbl)
                            .addComponent(serialNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drugLbl)
                            .addComponent(drugNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availLbl))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void availQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availQuantityTxtFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        drugNameTxtField.setEditable(true);
        serialNumTxtField.setEditable(true);
        availQuantityTxtField.setEditable(true);
        updateButton.setEnabled(false);
        saveButton.setEnabled(true);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        if(drugNameTxtField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"please enter a valid medicine name");
            return;
        }
        mi.setMedName(drugNameTxtField.getText());
        try{
        int availableQuantity = Integer.parseInt(availQuantityTxtField.getText());
          mi.setQtyAvail(availableQuantity);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
      try
      {
        int serialNumber = Integer.parseInt(serialNumTxtField.getText());
        mi.setRollNum(serialNumber);
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null, "serial number must be integer!");
          return;
      }
        
        drugNameTxtField.setEditable(false);
        serialNumTxtField.setEditable(false);
        availQuantityTxtField.setEditable(false);
        saveButton.setEnabled(false);
        updateButton.setEnabled(true);
        log.debug(userAccount+" "+" updated the medicine details");

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyWorkArea me = (PharmacyWorkArea) component;
        me.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availLbl;
    private javax.swing.JTextField availQuantityTxtField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel drugLbl;
    private javax.swing.JTextField drugNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel medicineLbl;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel serialNumLbl;
    private javax.swing.JTextField serialNumTxtField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
