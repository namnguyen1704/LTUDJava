package lab3;

import java.util.Optional;
import javax.swing.JOptionPane;
import java.lang.String;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class XepOSo extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public XepOSo() {
        initComponents();
        
        
         String name=JOptionPane.showInputDialog("Họ và tên người chơi:");
        this.setTitle(name);
          

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
        lbltrochoixeposo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnbatdau = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        so15 = new javax.swing.JButton();
        so14 = new javax.swing.JButton();
        so13 = new javax.swing.JButton();
        so12 = new javax.swing.JButton();
        so11 = new javax.swing.JButton();
        so10 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so1 = new javax.swing.JButton();
        so0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltrochoixeposo.setBackground(new java.awt.Color(204, 204, 204));
        lbltrochoixeposo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbltrochoixeposo.setText("TRÒ CHƠI XẾP Ô SỐ");
        jPanel1.add(lbltrochoixeposo);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btnbatdau.setText("Bắt đầu");
        btnbatdau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnbatdau.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnbatdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatdauActionPerformed(evt);
            }
        });
        jPanel2.add(btnbatdau);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(4, 4));

        so15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so15.setText("15");
        so15.setEnabled(false);
        so15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so15ActionPerformed(evt);
            }
        });
        jPanel3.add(so15);

        so14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so14.setText("14");
        so14.setEnabled(false);
        so14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so14ActionPerformed(evt);
            }
        });
        jPanel3.add(so14);

        so13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so13.setText("13");
        so13.setEnabled(false);
        so13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so13ActionPerformed(evt);
            }
        });
        jPanel3.add(so13);

        so12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so12.setText("12");
        so12.setEnabled(false);
        so12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so12ActionPerformed(evt);
            }
        });
        jPanel3.add(so12);

        so11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so11.setText("11");
        so11.setEnabled(false);
        so11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so11ActionPerformed(evt);
            }
        });
        jPanel3.add(so11);

        so10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so10.setText("10");
        so10.setEnabled(false);
        so10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so10ActionPerformed(evt);
            }
        });
        jPanel3.add(so10);

        so9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so9.setText("9");
        so9.setEnabled(false);
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        jPanel3.add(so9);

        so8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so8.setText("8");
        so8.setEnabled(false);
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        jPanel3.add(so8);

        so7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so7.setText("7");
        so7.setEnabled(false);
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        jPanel3.add(so7);

        so6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so6.setText("6");
        so6.setEnabled(false);
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        jPanel3.add(so6);

        so5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so5.setText("5");
        so5.setEnabled(false);
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        jPanel3.add(so5);

        so4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so4.setText("4");
        so4.setEnabled(false);
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        jPanel3.add(so4);

        so3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so3.setText("3");
        so3.setEnabled(false);
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        jPanel3.add(so3);

        so2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so2.setText("2");
        so2.setEnabled(false);
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });
        jPanel3.add(so2);

        so1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so1.setText("1");
        so1.setEnabled(false);
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel3.add(so1);

        so0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        so0.setEnabled(false);
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        jPanel3.add(so0);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbatdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatdauActionPerformed
        // TODO add your handling code here:
        so0.setEnabled(true);
        so1.setEnabled(true);
        so2.setEnabled(true);
        so3.setEnabled(true);
        so4.setEnabled(true);
        so5.setEnabled(true);
        so6.setEnabled(true);
        so7.setEnabled(true);
        so8.setEnabled(true);
        so9.setEnabled(true);
        so10.setEnabled(true);
        so11.setEnabled(true);
        so12.setEnabled(true);
        so13.setEnabled(true);
        so14.setEnabled(true);
        so15.setEnabled(true);
        
       int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        tronMang(a);
       so1.setText(""+a[0]);
       so2.setText(""+a[1]);
       so3.setText(""+a[2]);
       so4.setText(""+a[3]);
       so5.setText(""+a[4]);
       so6.setText(""+a[5]);
       so7.setText(""+a[6]);
       so8.setText(""+a[7]);
       so9.setText(""+a[8]);
       so10.setText(""+a[9]);
       so11.setText(""+a[10]);
       so12.setText(""+a[11]);
       so13.setText(""+a[12]);
       so14.setText(""+a[13]);
       so15.setText(""+a[14]);
       so0.setText("");
      
       
        
    }//GEN-LAST:event_btnbatdauActionPerformed

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so1, so2, so5, so0);
    }//GEN-LAST:event_so1ActionPerformed
 public void tronMang(int[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
        // TODO add your handling code here:
        KiemTraKe2(so0, so1, so4);
        Win();
    }//GEN-LAST:event_so0ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
     // TODO add your handling code here:
        KiemTraKe3(so2, so3, so6, so1);
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        // TODO add your handling code here:
        KiemTraKe2(so3, so2, so7);
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so4, so0, so5, so8);
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        // TODO add your handling code here:
        KiemTraKe4(so5, so6, so1, so4, so9);
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        // TODO add your handling code here:
        KiemTraKe4(so6, so7, so2, so5, so10);
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so7, so3, so6, so11);
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so8, so4, so9, so12);
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
        // TODO add your handling code here:
        KiemTraKe4(so9, so10, so5, so13, so8);
    }//GEN-LAST:event_so9ActionPerformed

    private void so10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so10ActionPerformed
        // TODO add your handling code here:
        KiemTraKe4(so10, so11, so6, so9, so14);
    }//GEN-LAST:event_so10ActionPerformed

    private void so11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so11ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so11, so7, so10, so15);
    }//GEN-LAST:event_so11ActionPerformed

    private void so12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so12ActionPerformed
        // TODO add your handling code here:
        KiemTraKe2(so12, so13, so8);
    }//GEN-LAST:event_so12ActionPerformed

    private void so13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so13ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so13, so9, so12, so14);
    }//GEN-LAST:event_so13ActionPerformed

    private void so14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so14ActionPerformed
        // TODO add your handling code here:
        KiemTraKe3(so14, so10, so15, so13);
    }//GEN-LAST:event_so14ActionPerformed

    private void so15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so15ActionPerformed
        // TODO add your handling code here:
        KiemTraKe2(so15, so11, so14);
    }//GEN-LAST:event_so15ActionPerformed

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
            java.util.logging.Logger.getLogger(XepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
    
    
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XepOSo().setVisible(true);
                
    
            }
        });
    }
  public void Win(){
      if(so15.getText().equals("15")&&so14.getText().equals("14")&&so13.getText().equals("13")
              &&so12.getText().equals("12")&&so11.getText().equals("11")
              &&so10.getText().equals("10")&&so9.getText().equals("9")
              &&so8.getText().equals("8")&&so7.getText().equals("7")&&so6.getText().equals("6")
              &&so5.getText().equals("5")&&so4.getText().equals("4")&&so3.getText().equals("3")
              &&so2.getText().equals("2")&&so1.getText().equals("1")){
          JOptionPane.showMessageDialog(null, "Chúc mừng chiến thắng");
      }
  }
public void KiemTraKe2(JButton btnan, JButton btn1,JButton btn2 ){
    if(btn1.getText().length()==0){
          btn1.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn2.getText().length()==0){
          btn2.setText(btnan.getText());
          btnan.setText("");
      }
      
    
}
public void KiemTraKe3(JButton btnan, JButton btn1,JButton btn2,JButton btn3  ){
    if(btn1.getText().length()==0){
          btn1.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn2.getText().length()==0){
          btn2.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn3.getText().length()==0){
          btn3.setText(btnan.getText());
          btnan.setText("");
      }
    
}
public void KiemTraKe4(JButton btnan, JButton btn1,JButton btn2,JButton btn3,JButton btn4  ){
    if(btn1.getText().length()==0){
          btn1.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn2.getText().length()==0){
          btn2.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn3.getText().length()==0){
          btn3.setText(btnan.getText());
          btnan.setText("");
      }
      if(btn4.getText().length()==0){
          btn4.setText(btnan.getText());
          btnan.setText("");
      }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatdau;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbltrochoixeposo;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so10;
    private javax.swing.JButton so11;
    private javax.swing.JButton so12;
    private javax.swing.JButton so13;
    private javax.swing.JButton so14;
    private javax.swing.JButton so15;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    // End of variables declaration//GEN-END:variables
}