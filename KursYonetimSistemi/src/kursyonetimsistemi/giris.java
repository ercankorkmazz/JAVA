package kursyonetimsistemi;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class giris extends javax.swing.JFrame {
    public giris() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBox_kadi = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        txt_sifre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/yazi.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 80, 250, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/amblem.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 10, 130, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kullanıcı.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 190, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/sifre.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 240, 50, 50);

        ComboBox_kadi.setToolTipText("");
        ComboBox_kadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_kadiActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox_kadi);
        ComboBox_kadi.setBounds(260, 210, 172, 29);

        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 290, 100, 30);

        txt_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sifreActionPerformed(evt);
            }
        });
        txt_sifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_sifreKeyPressed(evt);
            }
        });
        jPanel1.add(txt_sifre);
        txt_sifre.setBounds(260, 250, 172, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/arayüz1.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(646, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    
    private void ComboBox_kadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_kadiActionPerformed
        
    }//GEN-LAST:event_ComboBox_kadiActionPerformed

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        kullaniciSorgula();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        baglanti = SqlServerBaglantisi.Baglan();
        kullanicileriGetir();
    }//GEN-LAST:event_formWindowOpened

    private void txt_sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sifreKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           baglanti = SqlServerBaglantisi.Baglan();
           kullaniciSorgula();
       }
    }//GEN-LAST:event_txt_sifreKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_kadi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_sifre;
    // End of variables declaration//GEN-END:variables
private void kullanicileriGetir(){
    try{
        preparedStatement = baglanti.prepareStatement("Select * From kullaniciler");
        resultSet = preparedStatement.executeQuery();
        
        while(resultSet.next()){
            String kullaniciAdiGelen = resultSet.getString("unvan");
            ComboBox_kadi.addItem(kullaniciAdiGelen);
        }
    }catch(Exception e){
        
    }
}
private void kullaniciSorgula(){
    try{
        preparedStatement = baglanti.prepareStatement("Select * From kullaniciler where unvan = '"+ComboBox_kadi.getSelectedItem().toString()+"'");
        resultSet = preparedStatement.executeQuery();
        
        while(resultSet.next()){
            String kullaniciSifre = resultSet.getString("sifre");
            
            if(txt_sifre.getText().equals(kullaniciSifre))
            {
                if(ComboBox_kadi.getSelectedItem().toString().equals("Mudur"))
                {
                    Mudur MD = new Mudur();
                    this.setVisible(false);
                    MD.setVisible(true);
                    dispose();
                }
                else if(ComboBox_kadi.getSelectedItem().toString().equals("Sekreter"))
                {
                    Sekreter SK = new Sekreter();
                    this.setVisible(false);
                    SK.setVisible(true);
                    dispose();
                }
                else if(ComboBox_kadi.getSelectedItem().toString().equals("Muhasebe"))
                {
                    Muhasebee MS = new Muhasebee();
                    this.setVisible(false);
                    MS.setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Kullanıcı penceresine ulaşılamadı!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Kullanıcı adı ya da şifre hatalı!");
            }
        }
    }catch(Exception e){
        
    }
}
}
