/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import car.Attributes;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Admin
 */
public class CreateCar extends javax.swing.JPanel {
    /**
     * Creates new form CreateCar
     */
    
    private Attributes attributes;
    private JLabel jlabel99;
    private JLabel t;
    
    public CreateCar(Attributes attributes,JLabel jlabel99) {
        initComponents();
        this.attributes=attributes;           
        this.jlabel99=jlabel99;
        t = new JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BrandText = new javax.swing.JTextField();
        ModelText = new javax.swing.JTextField();
        ColorText = new javax.swing.JTextField();
        ClassText = new javax.swing.JTextField();
        PassText = new javax.swing.JTextField();
        DriveText = new javax.swing.JTextField();
        TyreText = new javax.swing.JTextField();
        TransText = new javax.swing.JTextField();
        EngineText = new javax.swing.JTextField();
        AirText = new javax.swing.JTextField();
        GasText = new javax.swing.JTextField();
        PaintText = new javax.swing.JTextField();
        FuelText = new javax.swing.JTextField();
        PriceText = new javax.swing.JTextField();
        MileageText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        jLabel1.setText("Enter car DETAILS");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jLabel2.setText("Brand Name :");

        jLabel3.setText("Model :");

        jLabel4.setText("Color :");

        jLabel5.setText("Class (SUV/Sedan) :");

        jLabel6.setText("No. of Passengers :");

        jLabel7.setText("Drive(4WD/2WD) :");

        jLabel8.setText("Tyre Type :");

        jLabel9.setText("Transmission :");

        jLabel10.setText("Engine Type :");

        jLabel11.setText("No. of Airbags :");

        jLabel12.setText("Gas Type :");

        jLabel13.setText("Paint Job Type :");

        jLabel14.setText("Mileage :");

        jLabel15.setText("Fuel Capacity :");

        jLabel16.setText("Price :");

        BrandText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTextActionPerformed(evt);
            }
        });

        ModelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTextActionPerformed(evt);
            }
        });

        ColorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorTextActionPerformed(evt);
            }
        });

        MileageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MileageTextActionPerformed(evt);
            }
        });

        submitButton.setText("SUBMIT!");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Upload Image :");

        uploadButton.setText("Upload");
        uploadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(259, 259, 259)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BrandText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ClassText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(PassText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(DriveText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(ColorText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(TyreText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(TransText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(ModelText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(259, 259, 259)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(GasText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EngineText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AirText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PaintText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PriceText)
                                .addComponent(FuelText)
                                .addComponent(MileageText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uploadButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BrandText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ModelText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClassText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DriveText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TyreText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TransText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(EngineText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(AirText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(GasText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PaintText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MileageText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FuelText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uploadButton)
                            .addComponent(jLabel17))))
                .addGap(65, 65, 65)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTextActionPerformed

    private void ColorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorTextActionPerformed

    private void BrandTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTextActionPerformed

    private void MileageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MileageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MileageTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        attributes.setBrand(BrandText.getText());
        attributes.setModel(ModelText.getText());
        attributes.setColor(ColorText.getText());
        attributes.setCarClass(ClassText.getText());
        attributes.setPassNumber(PassText.getText());
        attributes.setDriveType(DriveText.getText());
        attributes.setTyreType(TyreText.getText());
        attributes.setTransmission(TransText.getText());
        attributes.setEngineType(EngineText.getText());
        attributes.setAirbagNo(AirText.getText());
        attributes.setGasType(GasText.getText());
        attributes.setPaintType(PaintText.getText());
        attributes.setMileage(MileageText.getText());
        attributes.setFuelCapacity(FuelText.getText());
        attributes.setPrice(PriceText.getText());
        attributes.setJlabel99(t);
        
        JOptionPane.showMessageDialog(null, "Your car details have been entered successfully", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private ImageIcon Setimage(String imagePath,JLabel imageLabel){
        ImageIcon img1 = new ImageIcon(imagePath);            
        Image img2 = img1.getImage();
        Image img3 = img2.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img3);
        return i;
    }
    
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.getCurrentDirectory();
        int returnval = chooseFile.showSaveDialog(null);
        if (returnval == JFileChooser.APPROVE_OPTION)
            {
                File imagename = chooseFile.getSelectedFile();
                t.setBounds(200, 200, 400, 200);
                t.setIcon(Setimage(imagename.getAbsolutePath(), t));
            } 
    }//GEN-LAST:event_uploadButtonActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirText;
    private javax.swing.JTextField BrandText;
    private javax.swing.JTextField ClassText;
    private javax.swing.JTextField ColorText;
    private javax.swing.JTextField DriveText;
    private javax.swing.JTextField EngineText;
    private javax.swing.JTextField FuelText;
    private javax.swing.JTextField GasText;
    private javax.swing.JTextField MileageText;
    private javax.swing.JTextField ModelText;
    private javax.swing.JTextField PaintText;
    private javax.swing.JTextField PassText;
    private javax.swing.JTextField PriceText;
    private javax.swing.JTextField TransText;
    private javax.swing.JTextField TyreText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
