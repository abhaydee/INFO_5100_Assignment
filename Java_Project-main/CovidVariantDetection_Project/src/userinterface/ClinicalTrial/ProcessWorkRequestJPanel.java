/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicalTrial;

import Business.DoctorClass.Patient;
import Business.Enterprise.Enterprise;
import Business.Variant.Variant;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalTrialWorkRequest;
import Business.WorkQueue.MedicineWorkRequest;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author bhuva
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ClinicalTrialWorkRequest request;
    private ClinicOrganization clinicOrganization;
    private UserAccount userAccount;
    private Network network;
    private static Logger log = Logger.getLogger(ProcessWorkRequestJPanel.class);
    private static final String CLASS_NAME = ProcessWorkRequestJPanel.class.getName();

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, ClinicalTrialWorkRequest request, Organization organization, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.clinicOrganization = (ClinicOrganization) organization;
        patientTxtField.setText(request.getPatientName());
        this.setSize(1920, 1080);
        System.out.println(request.getStatus());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        resultLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        patientNameLbl = new javax.swing.JLabel();
        addSampleBtn = new javax.swing.JButton();
        geneLbl = new javax.swing.JLabel();
        genetxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));

        submitBtn.setBackground(new java.awt.Color(0, 0, 255));
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("UPDATE THE PATIENT RECORD");
        submitBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        resultLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        resultLbl.setForeground(new java.awt.Color(255, 255, 255));
        resultLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLbl.setText("CLINICAL TRIAL RESULTS FOR SAMPLE DETECTION");

        patientTxtField.setEditable(false);

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        patientNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        patientNameLbl.setText("PATIENT NAME:");

        addSampleBtn.setBackground(new java.awt.Color(0, 0, 255));
        addSampleBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSampleBtn.setText("ADD SAMPLE");
        addSampleBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addSampleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSampleBtnActionPerformed(evt);
            }
        });

        geneLbl.setForeground(new java.awt.Color(255, 255, 255));
        geneLbl.setText("NEW SAMPLE DETECTED:");

        genetxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genetxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chemical-reaction.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(geneLbl)
                            .addComponent(patientNameLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genetxtField)
                            .addComponent(patientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addSampleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(resultLbl)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLbl)
                    .addComponent(patientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geneLbl)
                    .addComponent(genetxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(addSampleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(309, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClinicAssistantWorkAreaJPanel dwjp = (ClinicAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        submitBtn.setEnabled(true);
        String sampleCheck;
        Variant v = ((ClinicalTrialWorkRequest) request).getPatient().getVariantHistory().getVariantHistory();
        sampleCheck = v.getVariantName();

        if (sampleCheck == null) {
            JOptionPane.showMessageDialog(null, "no variant has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        MedicineWorkRequest medReq = new MedicineWorkRequest();

        medReq.setPatient(((ClinicalTrialWorkRequest) request).getPatient());

        medReq.setEndUser(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(medReq);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("***** Organization Name:" + enterprise.getName());
            for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                System.out.println("***** Organization Name:" + organization.getName());
                if (organization.getName().equals("Medicine Organization") || organization.getName().equals("Lab Organization")| organization.getName().equals("Clinic Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getName());

                    organization.getWQ().getWorkRequestList().add(medReq);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        submitBtn.setEnabled(false);


    }//GEN-LAST:event_submitBtnActionPerformed

    private void genetxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genetxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genetxtFieldActionPerformed

    private void addSampleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSampleBtnActionPerformed
        // TODO add your handling code here:
        Patient patient = ((ClinicalTrialWorkRequest) request).getPatient();
        String sampleName = genetxtField.getText().trim();
        if (sampleName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a variant");
            return;
        }

        ArrayList<String> sampleCheck = new ArrayList<>();

        patient.getVariantHistory().getVariantHistory().setVariantName(sampleName);

        Variant v = patient.getVariantHistory().getVariantHistory();
        v.setVariantName(sampleName);
        request.setPatient(patient);

        genetxtField.setText("");
    }//GEN-LAST:event_addSampleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSampleBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel geneLbl;
    private javax.swing.JTextField genetxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}
