/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.VaccineEnterprise;
import Business.Enterprise.MedicineEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Enterprise.SampleEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author deepa
 */
public class ManageOrganizationJpanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(ManageOrganizationJpanel.class);
    private static final String CLASS_NAME = ManageOrganizationJpanel.class.getName();

    /**
     * Creates new form ManageOrganizationJpanel
     */
    public ManageOrganizationJpanel(JPanel userProcessContainer, OrganizationDirectory organizationDir, Enterprise enterprise) {
        initComponents();
        this.organizationDir = organizationDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();

    }

    private void populateComboBox() {
        organizationComboBox.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {

            if (!type.getValue().equals(Organization.Type.Admin.getValue())) {
                if (enterprise instanceof HospitalEnterprise) {

                    organizationComboBox.addItem(Organization.Type.Doctor);
                    organizationComboBox.addItem(Organization.Type.Lab);
                    organizationComboBox.addItem(Organization.Type.Clinic);
                    break;
                } else if (enterprise instanceof PharmacyEnterprise) {

                    organizationComboBox.addItem(Organization.Type.Pharmacy);
                    break;

                } else if (enterprise instanceof MedicineEnterprise) {
                    organizationComboBox.addItem(Organization.Type.Medicine);
                    break;
                } else if (enterprise instanceof VaccineEnterprise) {
                    organizationComboBox.addItem(Organization.Type.Vaccine);
                    break;
                } else if (enterprise instanceof SampleEnterprise) {
                    organizationComboBox.addItem(Organization.Type.Sample);
                    break;
                }

            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationtbl.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDir.getOrgList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrgID();
            row[1] = organization.getName();

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

        manageorglbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationtbl = new javax.swing.JTable();
        orglbl = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        backbtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageorglbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageorglbl.setForeground(new java.awt.Color(255, 255, 255));
        manageorglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageorglbl.setText("MANAGE ORGANIZATION");
        add(manageorglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 51, 454, -1));

        organizationtbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        organizationtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationtbl.setRowHeight(22);
        organizationtbl.getTableHeader().setResizingAllowed(false);
        organizationtbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 93, -1, 269));

        orglbl.setForeground(new java.awt.Color(255, 255, 255));
        orglbl.setText("ORGANIZATION TYPE:");
        add(orglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 398, -1, -1));

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 129, -1));

        backbtn.setBackground(new java.awt.Color(0, 0, 255));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 70, 32));

        addBtn.setBackground(new java.awt.Color(0, 0, 255));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD ORGANIZATION");
        addBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organization-2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        Type type = (Type) organizationComboBox.getSelectedItem();
        organizationDir.createOrganization(type);
        log.debug("Enterprise admin adding the following Organization" + type);
        populateTable();

    }//GEN-LAST:event_addBtnActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageorglbl;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationtbl;
    private javax.swing.JLabel orglbl;
    // End of variables declaration//GEN-END:variables
}
