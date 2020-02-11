/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rachc
 */
public class ViewVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     */
    private VitalSignHistory vsh;
    public ViewVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh=vsh;
        populateTable();
        
    }
 public void populateTable() {
     DefaultTableModel dtm = (DefaultTableModel)tblVitalSign.getModel();
     //The table refreshes everytime it's viewed, so it needs to be reset
     dtm.setRowCount(0);
     
     for (VitalSigns vs : vsh.getVitalSignHistory()) 
//Object for VitalSgns because VSH is of type(VitalSigns) and get arraylist from vitalsignshistory to fetch it
     {
         Object row[] = new Object[2];
         row[0]=vs;
         row[1]=vs.getBloodPressure();
         dtm.addRow(row);
         
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSign = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnDeleteDetails = new javax.swing.JButton();
        tempLabel = new javax.swing.JLabel();
        tempText = new javax.swing.JTextField();
        tempLabel1 = new javax.swing.JLabel();
        bpText = new javax.swing.JTextField();
        tempLabel2 = new javax.swing.JLabel();
        pulseText = new javax.swing.JTextField();
        tempLabel3 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setText("VIEW VITAL SIGNS");

        tblVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSign);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeleteDetails.setText("Delete Details");
        btnDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDetailsActionPerformed(evt);
            }
        });

        tempLabel.setText("Temperature");

        tempText.setEnabled(false);

        tempLabel1.setText("BLood Pressure");

        bpText.setEnabled(false);

        tempLabel2.setText("Pulse");

        pulseText.setEnabled(false);
        pulseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseTextActionPerformed(evt);
            }
        });

        tempLabel3.setText("Date");

        dateText.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteDetails)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempLabel)
                                .addGap(18, 18, 18)
                                .addComponent(tempText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pulseText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(bpText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnDeleteDetails))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel)
                    .addComponent(tempText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel1)
                    .addComponent(bpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel2)
                    .addComponent(pulseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel3)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSign.getSelectedRow();
         if (selectedRow >=0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSign.getValueAt(selectedRow, 0);
            vsh.deleteVitals(vs);
            JOptionPane.showMessageDialog(null, "Vital sign has been deleted!");
            populateTable();
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a row!");
    }//GEN-LAST:event_btnDeleteDetailsActionPerformed

    private void pulseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseTextActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSign.getSelectedRow();
        if (selectedRow >=0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSign.getValueAt(selectedRow, 0);
            bpText.setText(String.valueOf(vs.getBloodPressure()));
            tempText.setText(String.valueOf(vs.getTemperature()));
            pulseText.setText(String.valueOf(vs.getPulse()));
            dateText.setText(vs.getDate());
            
             
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a row!");
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpText;
    private javax.swing.JButton btnDeleteDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseText;
    private javax.swing.JTable tblVitalSign;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JLabel tempLabel1;
    private javax.swing.JLabel tempLabel2;
    private javax.swing.JLabel tempLabel3;
    private javax.swing.JTextField tempText;
    // End of variables declaration//GEN-END:variables
}