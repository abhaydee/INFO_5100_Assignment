/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineManufactureResearch;

import Business.WorkQueue.MedicineWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author deepa
 */
public class ProcessMedicineWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessMedicineWorkRequest
     */
    JPanel userProcessContainer;
    MedicineWorkRequest request;
    private static Logger log = Logger.getLogger(ProcessMedicineWorkRequest.class);
    private static final String CLASS_NAME = ProcessMedicineWorkRequest.class.getName();

    public ProcessMedicineWorkRequest(JPanel userprocessContainer, MedicineWorkRequest request) {
        initComponents();
        this.userProcessContainer = userprocessContainer;
        this.request = request;
        dateFld.setMinSelectableDate(new Date());
        this.setSize(1920, 1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        dateTxt = new javax.swing.JTextField();
        dateFld = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setPreferredSize(new java.awt.Dimension(2000, 1200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROCESSING PHARMACY REQUEST ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 124, 407, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT DATE OF DELIVERY : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 200, -1, -1));

        updateBtn.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE STATUS ");
        updateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 248, 118, 29));

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 248, 70, 29));

        dateTxt.setForeground(new java.awt.Color(0, 0, 102));
        dateTxt.setEnabled(false);
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 195, 105, -1));

        dateFld.setBackground(new java.awt.Color(0, 0, 255));
        add(dateFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 195, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fast-delivery.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 6, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine-2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 260, 270));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/location.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 260, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        request.setStatus("Completed");
        try {
            int year = dateFld.getCalendar().get(Calendar.YEAR);
            int month = dateFld.getCalendar().get(Calendar.MONTH);
            int day = dateFld.getCalendar().get(Calendar.DAY_OF_MONTH);
            String result = year + "-" + month + "-" + day;
            ((MedicineWorkRequest) request).setTOD(result);
            dateTxt.setText(result);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "please enter the delivery date ");
            return;
        }

        JOptionPane.showMessageDialog(null, "Request updated successfully!");
        log.debug("delivery date updated");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicineManufactureWorkArea dwjp = (MedicineManufactureWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateFld;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
