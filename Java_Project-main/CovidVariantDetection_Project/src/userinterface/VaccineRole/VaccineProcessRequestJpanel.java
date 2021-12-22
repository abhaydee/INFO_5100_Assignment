/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Business.WorkQueue.VaccineWorkRequest;
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
public class VaccineProcessRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineProcessRequestJpanel
     */
    JPanel userProcessContainer;
    VaccineWorkRequest request;
    private static Logger log = Logger.getLogger(VaccineProcessRequestJpanel.class);
    private static final String CLASS_NAME = VaccineProcessRequestJpanel.class.getName();

    public VaccineProcessRequestJpanel(JPanel userprocessContainer, VaccineWorkRequest request) {
        initComponents();
        this.userProcessContainer = userprocessContainer;
        this.request = request;
        dateFld.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processlbl = new javax.swing.JLabel();
        datedeliveryBtn = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        dateFld = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processlbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        processlbl.setForeground(new java.awt.Color(255, 255, 255));
        processlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processlbl.setText("PROCESSING MEDICINE SUPPLIER REQUEST ");
        add(processlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 178, 560, -1));

        datedeliveryBtn.setForeground(new java.awt.Color(255, 255, 255));
        datedeliveryBtn.setText("SELECT DATE OF DELIVERY : ");
        add(datedeliveryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        dateTxt.setEditable(false);
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 89, -1));

        dateFld.setBackground(new java.awt.Color(0, 0, 255));
        add(dateFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 94, 39));

        updateBtn.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE STATUS ");
        updateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 269, 148, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fast-delivery.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 52, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine-2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 350, 272, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineWorkArea dwjp = (VaccineWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        request.setStatus("Completed");
        try {
            int year = dateFld.getCalendar().get(Calendar.YEAR);
            int month = dateFld.getCalendar().get(Calendar.MONTH);
            int day = dateFld.getCalendar().get(Calendar.DAY_OF_MONTH);
            String result = year + "-" + month + "-" + day;
            ((VaccineWorkRequest) request).setTOD(result);
            dateTxt.setText(result);
            JOptionPane.showMessageDialog(null, "Request updated successfully!");
            log.debug("request updated successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "please enter the valid date");
            return;
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateFld;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel datedeliveryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel processlbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
