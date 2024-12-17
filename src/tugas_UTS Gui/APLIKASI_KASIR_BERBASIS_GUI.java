/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_GUI;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class APLIKASI_KASIR_BERBASIS_GUI extends javax.swing.JFrame {

    /**
     * Creates new form APLIKASI_KASIR_BERBASIS_GUI
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public APLIKASI_KASIR_BERBASIS_GUI() {
        initComponents();
        kodebarang();
        total();
    }
    private void total(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               
                       int hasil = 0;
                       if (txtQTY.getText().equals("")){
                           hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                       }else{
                           hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 
                                   Integer.parseInt(txtQTY.getText());
                       }
                       txttotalharga.setText(nf.format(hasil));
                   
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           int hasil = 0;
                       if (txtQTY.getText().equals("")){
                           hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                       }else{
                           hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 
                                   Integer.parseInt(txtQTY.getText());
                       }
                       txttotalharga.setText(nf.format(hasil));
                   
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
   private void kodebarang(){
       txtkodebarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
              // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
              String kodeBarang;
              kodeBarang = (String) txtkodebarang.getText();
              
              switch(kodeBarang){
                  case "B001" :
                      txtnamabarang.setText("Acer Aspire 5");
                      txtharga.setText(nf.format(7500000));
                      txtQTY.grabFocus();
                      break;
                  case "B002" :
                      txtnamabarang.setText("Lenovo Think Pad 11");
                      txtharga.setText(nf.format(10500000));
                      txtQTY.grabFocus();
                      break;
                  case "B003" :
                      txtnamabarang.setText("Asus Vivobook 14");
                      txtharga.setText(nf.format(8500000));
                      txtQTY.grabFocus();
                      break;
                  case "B004" :
                      txtnamabarang.setText("Acer 4755G");
                      txtharga.setText(nf.format(6500000));
                      txtQTY.grabFocus();
                      break;
                  case "B005" :
                      txtnamabarang.setText("Asus TUF");
                      txtharga.setText(nf.format(17500000));
                      txtQTY.grabFocus();
                      break;
                  default:
                      txtnamabarang.setText("");
                      txtharga.setText("");
                      
              }
           }

           @Override
           public void removeUpdate(DocumentEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String kodeBarang;
              kodeBarang = (String) txtkodebarang.getText();
              
              switch(kodeBarang){
                  case "B001" :
                      txtnamabarang.setText("Acer Aspire 5");
                      txtharga.setText(nf.format(7500000));
                      txtQTY.grabFocus();
                      break;
                  case "B002" :
                      txtnamabarang.setText("Lenovo Think Pad 11");
                      txtharga.setText(nf.format(10500000));
                      txtQTY.grabFocus();
                      break;
                  case "B003" :
                      txtnamabarang.setText("Asus Vivobook 14");
                      txtharga.setText(nf.format(8500000));
                      txtQTY.grabFocus();
                      break;
                  case "B004" :
                      txtnamabarang.setText("Acer 4755G");
                      txtharga.setText(nf.format(6500000));
                      txtQTY.grabFocus();
                      break;
                  case "B005" :
                      txtnamabarang.setText("Asus TUF");
                      txtharga.setText(nf.format(17500000));
                      txtQTY.grabFocus();
                      break;
                  default:
                      txtnamabarang.setText("");
                      txtharga.setText("");
                      
              }
           }
           

           @Override
           public void changedUpdate(DocumentEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
       });
      
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfaktur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtkodebarang = new javax.swing.JTextField();
        txtnamabarang = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        txttotalharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttabellist = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtjumlahharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtjmlQTY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No.Faktur");

        txtfaktur.setBackground(new java.awt.Color(204, 204, 204));
        txtfaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfakturActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kode Barang");

        txtkodebarang.setBackground(new java.awt.Color(204, 204, 204));
        txtkodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodebarangActionPerformed(evt);
            }
        });

        txtnamabarang.setBackground(new java.awt.Color(204, 204, 204));

        txtharga.setBackground(new java.awt.Color(204, 204, 204));
        txtharga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfaktur, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtkodebarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotalharga, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        txttabellist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga", "QTY", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(txttabellist);

        jLabel4.setText("Jumlah Harga");

        txtjumlahharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahhargaActionPerformed(evt);
            }
        });

        jLabel7.setText("Item Yang Dibeli : ");

        txtjmlQTY.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtjmlQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtjumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtjumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtjmlQTY))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(914, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfakturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfakturActionPerformed

    private void txtkodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodebarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodebarangActionPerformed

    private void txtjumlahhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahhargaActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
        if (txtQTY.getText().equals("")) {
            return;
            
        }else{
            DefaultTableModel model = (DefaultTableModel) txttabellist.getModel();
            
            Object obj [] = new Object [6];
            obj [1] = txtkodebarang.getText();
            obj [2] = txtnamabarang.getText();
            obj [3] = txtharga.getText();
            obj [4] = txtQTY.getText();
            obj [5] = txttotalharga.getText();
            
            model.addRow(obj);
            ;
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a ++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            txttabellist.setRowHeight(30);
            
            txtjmlQTY.setText(String.valueOf(baris));
            
            jmlTotalHarga(); 
            
          
                    }          
    }//GEN-LAST:event_txtQTYActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(APLIKASI_KASIR_BERBASIS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APLIKASI_KASIR_BERBASIS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APLIKASI_KASIR_BERBASIS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APLIKASI_KASIR_BERBASIS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APLIKASI_KASIR_BERBASIS_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtfaktur;
    private javax.swing.JTextField txtharga;
    private javax.swing.JLabel txtjmlQTY;
    private javax.swing.JTextField txtjumlahharga;
    private javax.swing.JTextField txtkodebarang;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTable txttabellist;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration//GEN-END:variables
private void jmlTotalHarga(){
 int sub_total = 0;
 for(int a = 0; a < txttabellist.getRowCount(); a ++){
     sub_total += Integer.parseInt((String) txttabellist.getValueAt(a, 5).toString().replace(".", ""));
 }
 
 txtjumlahharga.setText(nf.format(sub_total));
 
 //Diskon
 int diskon, hasil_diskon;
 diskon = Integer.parseInt(txtjumlahharga.getText().replace(".", "")) * Integer.parseInt(txtdiskon.getText().replace(".", "0")) / 100;
 hasil_diskon = Integer.parseInt(txtjumlahharga.getText().replace(".", "")) - diskon;
 
 //PPN
 int hasil_ppn = 0;
 if (chkPPN.isSelected()){
    hasil_ppn = hasil_diskon * 10 / 100;
    txthasilppn.setText(nf.format(hasil_ppn));
 }else {
           hasil_ppn = hasil_diskon * 0 / 100;
    txthasilppn.setText(nf.format(hasil_ppn));  
            }
 int  totalbersih;
 totalbersih = hasil_ppn + hasil_diskon;
 lbljumlahharga.setText("Rp. " + nf.format(totalbersih));
 }
}

   
