/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import Business.ProductDirectory;
import java.awt.Component;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    private JPanel rightPanel;
    private ProductDirectory prodDir;
    private Product product;
    
    ViewPanel(JPanel rightPanel, Product product) {
        initComponents();
        this.rightPanel=rightPanel;
        this.product=product;
        //populateProductDetails();
        txtAvailablity.setText(String.valueOf(product.getAvailNum()));
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtProdName.setText(product.getName());
        txtDesc.setText(product.getDescription());
    }
    
    private void populateProductDetails() {
        txtProdName.setText(product.getName());
        txtAvailablity.setText(String.valueOf(product.getAvailNum()));
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtDesc.setText(product.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrice = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        txtPrice.setEditable(false);

        txtProdName.setEditable(false);

        txtAvailablity.setEditable(false);

        lblBankName.setText("Price");

        lblRoutingNo.setText("Product Name");

        lblAccNo.setText("Availablity");

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("View Product");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Description");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRoutingNo)
                                .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBankName)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAvailablity)
                            .addComponent(txtPrice)
                            .addComponent(txtProdName)
                            .addComponent(txtDesc)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(53, 53, 53)
                        .addComponent(lblHead)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHead)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(0, 83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEditable(true);
            txtPrice.setEditable(true);
            txtProdName.setEditable(true);
            txtDesc.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEditable(false);
            txtPrice.setEditable(false);
            txtProdName.setEditable(false);
            txtDesc.setEnabled(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
        
            try {
                
                 if(txtAvailablity.getText().equals("") || txtPrice.getText().equals("") || txtProdName.getText().equals("") || txtDesc.getText().equals("") || txtPrice.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Fields Cannot be Empty"); }
                 else {
                
            Double.parseDouble(txtPrice.getText());          
            Integer.parseInt(txtAvailablity.getText());         
            product.setName(txtProdName.getText());
            product.setPrice(Double.parseDouble(txtPrice.getText()));
            product.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
            product.setDescription(txtDesc.getText());
            JOptionPane.showMessageDialog(null,"You've updated product successfully!");
             } 
            }
            catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null,"You've entered incorrect details. Please enter again.");
        }
        
            //JOptionPane.showMessageDialog(null, "Account updated successfully");        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);        
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        //layout.previous(rightPanel);
        Component[] comps =rightPanel.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ManageProdPanel) {
                ManageProdPanel manageP = (ManageProdPanel)comp;
                manageP.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}