package kursyonetimsistemi;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Date;
public class Muhasebee extends javax.swing.JFrame {

    public void DBBaglanti() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kurs_yonetim?useUnicode=true&characterEncoding=latin5","root",""); // veritabanına bağlatı kodu
    }
    public Muhasebee() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Tarihh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ogrenciAra_txt = new javax.swing.JTextField();
        Tarih = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muhasebeOgrenci = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ComboTaksit = new javax.swing.JComboBox();
        ogrFiyat = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ogretmenAra_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogretmenTablo = new javax.swing.JTable();
        odendiOlarakKaydetOgretmen = new javax.swing.JButton();
        tarihOgretmen = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        personelAra_txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        personelTablo = new javax.swing.JTable();
        odendiOlarakKaydetPersonel = new javax.swing.JButton();
        tarihPersonel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_unvan = new javax.swing.JLabel();
        sifreUyari2 = new javax.swing.JLabel();
        sifreUyari1 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txt_yeniSifre = new javax.swing.JPasswordField();
        txt_sifre = new javax.swing.JPasswordField();
        jLabel61 = new javax.swing.JLabel();
        ComboBox_kadi = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        txt_yeniSifre2 = new javax.swing.JPasswordField();
        jLabel62 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane4.setPreferredSize(new java.awt.Dimension(1360, 650));

        jPanel5.setPreferredSize(new java.awt.Dimension(1360, 640));
        jPanel5.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/hesap.png"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(1130, 400, 220, 250);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/KapatT.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7);
        jLabel7.setBounds(1180, 30, 150, 37);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tarihh.setText("-");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sorgula (TC / Ad Soyad):");

        ogrenciAra_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ogrenciAra_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciAra_txtActionPerformed(evt);
            }
        });

        Tarih.setText("-");

        muhasebeOgrenci.setAutoCreateRowSorter(true);
        muhasebeOgrenci.setBackground(new java.awt.Color(217, 217, 217));
        muhasebeOgrenci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        muhasebeOgrenci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(muhasebeOgrenci);

        jButton1.setText("Seç");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboTaksit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ComboTaksit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ödenecek Taksit Yok" }));
        ComboTaksit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTaksitActionPerformed(evt);
            }
        });

        ogrFiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setText("Ödendi Olarak Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ara");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrenciAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tarih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tarihh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(ComboTaksit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ogrFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Tarih)
                    .addComponent(Tarihh)
                    .addComponent(jLabel1)
                    .addComponent(ogrenciAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(ComboTaksit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(303, 303, 303))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Öğrenci Kayıtları", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sorgula (TC / Ad Soyad):");

        ogretmenAra_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ogretmenAra_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogretmenAra_txtActionPerformed(evt);
            }
        });

        ogretmenTablo.setBackground(new java.awt.Color(217, 217, 217));
        ogretmenTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ogretmenTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ogretmenTablo);

        odendiOlarakKaydetOgretmen.setText("Ödendi Olarak Kaydet");
        odendiOlarakKaydetOgretmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odendiOlarakKaydetOgretmenActionPerformed(evt);
            }
        });

        tarihOgretmen.setText("-");

        jButton4.setText("Ara");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odendiOlarakKaydetOgretmen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogretmenAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarihOgretmen)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogretmenAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(tarihOgretmen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(odendiOlarakKaydetOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Öğretmen Kayıtları", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Sorgula (TC / Ad Soyad):");

        personelAra_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personelAra_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelAra_txtActionPerformed(evt);
            }
        });

        personelTablo.setBackground(new java.awt.Color(217, 217, 217));
        personelTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personelTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(personelTablo);

        odendiOlarakKaydetPersonel.setText("Ödendi Olarak Kaydet");
        odendiOlarakKaydetPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odendiOlarakKaydetPersonelActionPerformed(evt);
            }
        });

        tarihPersonel.setText("-");

        jButton5.setText("Ara");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personelAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarihPersonel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odendiOlarakKaydetPersonel)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton5)
                    .addComponent(tarihPersonel)
                    .addComponent(personelAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odendiOlarakKaydetPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personel Kayıtları", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txt_unvan.setText("-");

        sifreUyari2.setText(" ");

        sifreUyari1.setText(" ");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Yeni Şifre:");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Personel:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Giriş Bilgileri Güncelle");

        txt_yeniSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yeniSifreActionPerformed(evt);
            }
        });
        txt_yeniSifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_yeniSifreKeyPressed(evt);
            }
        });

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

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("Şifre Doğrula:");

        ComboBox_kadi.setToolTipText("");
        ComboBox_kadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_kadiActionPerformed(evt);
            }
        });

        jButton6.setText("Şifreyi Güncelle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("Mevcut Şifre:");

        txt_yeniSifre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yeniSifre2ActionPerformed(evt);
            }
        });
        txt_yeniSifre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_yeniSifre2KeyPressed(evt);
            }
        });

        jLabel62.setText("Şifrenizi tekrar giriniz.");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kullanıcılar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59)
                    .addComponent(jButton6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel60)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(sifreUyari1)
                    .addComponent(sifreUyari2)
                    .addComponent(txt_unvan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreUyari1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(sifreUyari2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(txt_unvan)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel6)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı Bilgileri", jPanel4);

        jPanel5.add(jTabbedPane1);
        jTabbedPane1.setBounds(28, 65, 1300, 542);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/backgroundb.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setAutoscrolls(true);
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 1593, 770);

        jScrollPane4.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Connection con;
    private Statement st;
    private ResultSet rs;
    Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRowIndex = muhasebeOgrenci.getSelectedRow();
        //int selectedColumnIndex = muhasebeOgrenci.getSelectedColumn();
        Object odemeSekli = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 10);
        Object taksit = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 8);
        Object odenenTaksit = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 9);
        Object fiyat = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 11);
        Object durum = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 13);
        if(durum.equals("Odendi")){
            JOptionPane.showMessageDialog(null, "Ödenecek aidat kalmamıştır.");
        }else{
            if(odemeSekli.equals("Nakit")){
                ComboTaksit.removeAllItems();
                ComboTaksit.addItem("Ödenecek Taksit Yok");
                ogrFiyat.setText(fiyat.toString());
            }
            if(odemeSekli.equals("Kredi Karti")){
                String Taksitt = taksit.toString();
                if(!Taksitt.equals("-")){
                    Integer fiyatt =  new Integer(fiyat.toString());
                    Integer fiyatArtan = fiyatt;
                    Integer taksitt =  new Integer(taksit.toString());
                    fiyatt /= taksitt;
                    Integer fiyatYedek = fiyatt * taksitt;
                    fiyatArtan -= fiyatYedek;
                    String yedek = "0";
                    if(taksit.equals(odenenTaksit))
                    {
                        JOptionPane.showMessageDialog(null, "Ödenecek Taksit kalmamıştır.");
                    }else{
                        ogrFiyat.setText(fiyatt.toString());

                        if(odenenTaksit.toString().equals("0")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("1");
                        }
                        else if(odenenTaksit.toString().equals("1")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("2");
                            yedek = "2";
                        }
                        else if(odenenTaksit.toString().equals("2")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("3");
                            yedek = "3";
                        }
                        else if(odenenTaksit.toString().equals("3")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("4");
                            yedek = "4";
                        }
                        else if(odenenTaksit.toString().equals("4")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("5");
                            yedek = "5";
                        }
                        else if(odenenTaksit.toString().equals("5")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("6");
                            yedek = "6";
                        }
                        else if(odenenTaksit.toString().equals("6")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("7");
                            yedek = "7";
                        }
                        else if(odenenTaksit.toString().equals("7")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("8");
                            yedek = "8";
                        }
                        else if(odenenTaksit.toString().equals("8")){
                            ComboTaksit.removeAllItems();
                            ComboTaksit.addItem("9");
                            yedek = "9";
                        }
                        else{
                            if(taksitt.equals(12)){
                                if(odenenTaksit.toString().equals("9")){
                                    ComboTaksit.removeAllItems();
                                    ComboTaksit.addItem("10");
                                    yedek = "10";
                                }
                                else if(odenenTaksit.toString().equals("10")){
                                    ComboTaksit.removeAllItems();
                                    ComboTaksit.addItem("11");
                                    yedek = "11";
                                }
                                else if(odenenTaksit.toString().equals("11")){
                                    ComboTaksit.removeAllItems();
                                    ComboTaksit.addItem("12");
                                    yedek = "12";
                                }else{
                                    ComboTaksit.removeAllItems();
                                    ComboTaksit.addItem("Ödenecek Taksit Yok");
                                }
                            }
                        }
                        if(taksit.toString().equals(yedek))
                        {
                            Integer artanEkle = Integer.parseInt(ogrFiyat.getText())+fiyatArtan;
                            ogrFiyat.setText(artanEkle.toString());
                        }
                    }
                }else{

                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!ogrFiyat.getText().isEmpty()){
            int selectedRowIndex = muhasebeOgrenci.getSelectedRow();
            Object id = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 0);
            Object odenecekFiyat = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 12);
            Integer odenecek_fiyat =  new Integer(odenecekFiyat.toString());
            Integer odenecek = odenecek_fiyat-Integer.parseInt(ogrFiyat.getText());
            String odeme = odenecek.toString();
            try{
                baglanti = SqlServerBaglantisi.Baglan();
                Object odemeSekli = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 10);
                if(odemeSekli.equals("Nakit")){
                    String sql = "update muhasebe set OdenecekFiyat='"+odeme+"', Durum='Odendi' where id='"+id+"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                    ogrenciTarihArtir();
                    JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!");
                    ogrFiyat.setText("");
                    tabloDoldur();
                }
                if(odemeSekli.equals("Kredi Karti")){
                    String odenecekTaksit = ComboTaksit.getSelectedItem().toString();
                    String sql = "UPDATE muhasebe SET OdenenTaksit = '"+odenecekTaksit+"', OdenecekFiyat = '"+odeme+"', Durum = '"+odenecekTaksit+" Taksit Odendi' WHERE id ='"+id+"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                    ogrenciTarihArtir();
                    JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!");
                    ogrFiyat.setText("");
                    tabloDoldur();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Kayıt Seçiniz!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        baglanti = SqlServerBaglantisi.Baglan();
        tabloDoldur();
        ogretmenTabloDoldur();
        personelTabloDoldur();
        kullanicileriGetir();
        txt_unvan.setVisible(false);
        Tarih.setVisible(false);
        Tarihh.setVisible(false);
        tarihOgretmen.setVisible(false);
        tarihPersonel.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void odendiOlarakKaydetOgretmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odendiOlarakKaydetOgretmenActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
         
        try{
          int selectedRowIndex = ogretmenTablo.getSelectedRow();
          Object id = (Object) ogretmenTablo.getModel().getValueAt(selectedRowIndex, 0);
          Object Tarih = (Object) ogretmenTablo.getModel().getValueAt(selectedRowIndex, 5);
          preparedStatement = baglanti.prepareStatement("SELECT * FROM muhasebeogretmen WHERE id='"+id+"'");
        
          String sql = "update muhasebeogretmen set Durum = '"+Tarih+" Odendi' where id='"+id+"'";
          preparedStatement = baglanti.prepareStatement(sql);
          preparedStatement.execute();
          ogretmenTarihArtir();
          JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!");
          ogretmenTabloDoldur();                   
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Kayıt Seçiniz!");
        }
    }//GEN-LAST:event_odendiOlarakKaydetOgretmenActionPerformed

    private void ComboTaksitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTaksitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTaksitActionPerformed

    private void odendiOlarakKaydetPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odendiOlarakKaydetPersonelActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
         
        try{
          int selectedRowIndex = personelTablo.getSelectedRow();
          Object id = (Object) personelTablo.getModel().getValueAt(selectedRowIndex, 0);
          Object Tarih = (Object) personelTablo.getModel().getValueAt(selectedRowIndex, 5);
          preparedStatement = baglanti.prepareStatement("SELECT * FROM muhasebepersonel WHERE id='"+id+"'");
        
          String sql = "update muhasebepersonel set Durum = '"+Tarih+" Odendi' where id='"+id+"'";
          preparedStatement = baglanti.prepareStatement(sql);
          preparedStatement.execute();
          personelTarihArtir();
          JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!");
          personelTabloDoldur();                         
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Kayıt Seçiniz!");
        }
    }//GEN-LAST:event_odendiOlarakKaydetPersonelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tabloDoldur();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ogrenciAra_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciAra_txtActionPerformed
        tabloDoldur();
    }//GEN-LAST:event_ogrenciAra_txtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ogretmenTabloDoldur();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ogretmenAra_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogretmenAra_txtActionPerformed
        ogretmenTabloDoldur();
    }//GEN-LAST:event_ogretmenAra_txtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        personelTabloDoldur();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void personelAra_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelAra_txtActionPerformed
        personelTabloDoldur();
    }//GEN-LAST:event_personelAra_txtActionPerformed

    private void txt_yeniSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yeniSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifreActionPerformed

    private void txt_yeniSifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yeniSifreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifreKeyPressed

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void txt_sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sifreKeyPressed

    }//GEN-LAST:event_txt_sifreKeyPressed

    private void ComboBox_kadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_kadiActionPerformed
        txt_unvan.setText(ComboBox_kadi.getSelectedItem().toString());
    }//GEN-LAST:event_ComboBox_kadiActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sifreGuncelle();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_yeniSifre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yeniSifre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifre2ActionPerformed

    private void txt_yeniSifre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yeniSifre2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifre2KeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
        new giris().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Muhasebee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muhasebee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muhasebee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muhasebee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muhasebee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_kadi;
    private javax.swing.JComboBox ComboTaksit;
    private javax.swing.JLabel Tarih;
    private javax.swing.JLabel Tarihh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable muhasebeOgrenci;
    private javax.swing.JButton odendiOlarakKaydetOgretmen;
    private javax.swing.JButton odendiOlarakKaydetPersonel;
    private javax.swing.JTextField ogrFiyat;
    private javax.swing.JTextField ogrenciAra_txt;
    private javax.swing.JTextField ogretmenAra_txt;
    private javax.swing.JTable ogretmenTablo;
    private javax.swing.JTextField personelAra_txt;
    private javax.swing.JTable personelTablo;
    private javax.swing.JLabel sifreUyari1;
    private javax.swing.JLabel sifreUyari2;
    private javax.swing.JLabel tarihOgretmen;
    private javax.swing.JLabel tarihPersonel;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JLabel txt_unvan;
    private javax.swing.JPasswordField txt_yeniSifre;
    private javax.swing.JPasswordField txt_yeniSifre2;
    // End of variables declaration//GEN-END:variables
public void tabloDoldur(){
        String baslik[] = new String[]{"id", "Kurs Adı", "Tc", "Adı Soyadı", "Tel", "Adres", "Ödemeye Başlama Tarihi", "Taksit Tarihi", "Taksit Sayısı", "Ödenen Taksit", "Ödeme Sekli", "Kursun Fiyatı", "Ödenecek Fiyat", "Durum"}; 
        try{
            DBBaglanti();
            String gelenOgrenci = ogrenciAra_txt.getText();
            String sorgu = "select * from muhasebe where AdSoyad like '"+gelenOgrenci+"%' or Tc  like '"+gelenOgrenci+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            
            rs.last();
            int kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            Object data[][] = new Object[kayitSayisi][];
            int i=0;
            while(rs.next()){
                Tarih.setText(rs.getString("Tarih"));
                Tarihh.setText(rs.getString("TaksitTarih"));
                data[i] = new Object[]{
                    rs.getInt("id"),
                    rs.getString("KursAdi"),
                    rs.getString("Tc"),
                    rs.getString("AdSoyad"),
                    rs.getString("Tel"),
                    rs.getString("Adres"),
                    Tarih.getText(),
                    Tarihh.getText(),
                    rs.getString("Taksit"),
                    rs.getString("OdenenTaksit"),
                    rs.getString("OdemeSekli"),
                    rs.getString("Fiyat"),
                    rs.getString("OdenecekFiyat"),
                    rs.getString("Durum")
                };
                i++;
                
                
            }
            muhasebeOgrenci.setModel(new DefaultTableModel(data, baslik));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
        }
    }
    public void ogretmenTabloDoldur(){
        String baslik[] = new String[]{"id", "Tc", "Adı Soyadı", "Tel", "Adres", "Ödeme Tarihi", "Saatlik Ücret", "Ders Saati", "Maaşı", "Durum"}; 
        String gelenAd = ogretmenAra_txt.getText();
        try{
            DBBaglanti();
            String sorgu = "select * from muhasebeogretmen where AdSoyad like '"+gelenAd+"%' or Tc  like '"+gelenAd+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            
            rs.last();
            int kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            Object data[][] = new Object[kayitSayisi][];
            int i=0;
            while(rs.next()){
                tarihOgretmen.setText(rs.getString("odemeTarihi"));
                data[i] = new Object[]{
                    rs.getInt("id"),
                    rs.getString("Tc"),
                    rs.getString("AdSoyad"),
                    rs.getString("Tel"),
                    rs.getString("Adres"),
                    tarihOgretmen.getText(),
                    rs.getString("SaatlikUcret"),
                    rs.getInt("DersSaati"),
                    rs.getString("Fiyat")+" TL",
                    rs.getString("Durum")
                };
                i++;
                
                
            }
            ogretmenTablo.setModel(new DefaultTableModel(data, baslik));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
        }
    }
    public void ogrenciTarihArtir(){
        try{
            int selectedRowIndex = muhasebeOgrenci.getSelectedRow();
            Object id = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 0);
            Object T1 = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 8);
            Object T2 = (Object) muhasebeOgrenci.getModel().getValueAt(selectedRowIndex, 9);
            if(!T1.equals(T2)){
                baglanti = SqlServerBaglantisi.Baglan();
                preparedStatement = baglanti.prepareStatement("SELECT * FROM muhasebe WHERE id='"+id+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    Date tarih = new Date();

                    SimpleDateFormat ay = new SimpleDateFormat ("MM");
                    SimpleDateFormat yil = new SimpleDateFormat ("YYYY");
                    SimpleDateFormat gun = new SimpleDateFormat ("dd");
                    tarih=resultSet.getDate("TaksitTarih");
                    if(!ay.format(tarih).toString().equals("12")){
                        Integer yedekAy = Integer.parseInt(ay.format(tarih))+1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih));
                        String Tarih = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebe set TaksitTarih='"+Tarih+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll); 
                    }else{
                        Integer yedekAy = 1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih))+1;
                        String Tarih = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebe set TaksitTarih='"+Tarih+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll); 
                    }
                }
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
       }
    }
    public void ogretmenTarihArtir(){

    try{
            int selectedRowIndex = ogretmenTablo.getSelectedRow();
            Object id = (Object) ogretmenTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object T1 = (Object) ogretmenTablo.getModel().getValueAt(selectedRowIndex, 5);
                baglanti = SqlServerBaglantisi.Baglan();
                preparedStatement = baglanti.prepareStatement("SELECT * FROM muhasebeogretmen WHERE id='"+id+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    Date tarih = new Date();

                    SimpleDateFormat ay = new SimpleDateFormat ("MM");
                    SimpleDateFormat yil = new SimpleDateFormat ("YYYY");
                    SimpleDateFormat gun = new SimpleDateFormat ("dd");
                    tarih=resultSet.getDate("odemeTarihi");
                    if(!ay.format(tarih).toString().equals("12")){
                        Integer yedekAy = Integer.parseInt(ay.format(tarih))+1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih));
                        String Tarih = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebeogretmen set odemeTarihi='"+Tarih+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll); 
                    }else{
                        Integer yedekAy = 1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih))+1;
                        String Tarih = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebeogretmen set odemeTarihi='"+Tarih+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll); 
                    }
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
       }
    
}
    public void personelTarihArtir(){

    try{
            int selectedRowIndex = personelTablo.getSelectedRow();
            Object id = (Object) personelTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object T1 = (Object) personelTablo.getModel().getValueAt(selectedRowIndex, 5);
                baglanti = SqlServerBaglantisi.Baglan();
                preparedStatement = baglanti.prepareStatement("SELECT * FROM muhasebepersonel WHERE id='"+id+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    Date tarih = new Date();

                    SimpleDateFormat ay = new SimpleDateFormat ("MM");
                    SimpleDateFormat yil = new SimpleDateFormat ("YYYY");
                    SimpleDateFormat gun = new SimpleDateFormat ("dd");
                    tarih=resultSet.getDate("odemeTarih");
                    if(!ay.format(tarih).toString().equals("12")){
                        Integer yedekAy = Integer.parseInt(ay.format(tarih))+1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih));
                        String Tarih = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebepersonel set odemeTarih='"+Tarih+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll); 
                    }else{
                        Integer yedekAy = 1;
                        Integer YedekYil = Integer.parseInt(yil.format(tarih))+1;
                        String Tarih1 = YedekYil+"-"+yedekAy+"-"+gun.format(tarih);

                        String sqll = "update muhasebepersonel set odemeTarih='"+Tarih1+"' where id = '"+id+"'";
                        Statement kaydet1 = baglanti.createStatement();
                        kaydet1.executeUpdate(sqll);
                    }
                }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
       }
    
}
    public void personelTabloDoldur(){
        String gelenAd = personelAra_txt.getText();
        String baslik[] = new String[]{"id", "Tc", "Adı Soyadı", "Tel", "Adres", "Ödeme Tarihi", "Durum"}; 
        try{
            DBBaglanti();
            String sorgu = "select * from muhasebepersonel where AdSoyad like '"+gelenAd+"%' or Tc  like '"+gelenAd+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            
            rs.last();
            int kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            Object data[][] = new Object[kayitSayisi][];
            int i=0;
            while(rs.next()){
                tarihPersonel.setText(rs.getString("odemeTarih"));
                data[i] = new Object[]{
                    rs.getInt("id"),
                    rs.getString("Tc"),
                    rs.getString("AdSoyad"),
                    rs.getString("Tel"),
                    rs.getString("Adres"),
                    tarihPersonel.getText(),
                    rs.getString("Durum")
                };
                i++;
                
                
            }
            personelTablo.setModel(new DefaultTableModel(data, baslik));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
        }
    }
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
    private void sifreGuncelle(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From kullaniciler where unvan = '"+ComboBox_kadi.getSelectedItem().toString()+"'");
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                String kullaniciSifre = resultSet.getString("sifre");

                if(!txt_sifre.getText().isEmpty())
                {
                    if(txt_sifre.getText().equals(kullaniciSifre))
                    {
                        sifreUyari1.setText(" ");
                        if(!txt_yeniSifre.getText().isEmpty() || !txt_yeniSifre2.getText().isEmpty())
                        {
                            if(txt_yeniSifre.getText().equals(txt_yeniSifre2.getText()))
                            {
                                String sql1 = "update kullaniciler set sifre='"+txt_yeniSifre.getText()+"' where unvan='"+txt_unvan.getText()+"'";
                                preparedStatement = baglanti.prepareStatement(sql1);
                                preparedStatement.execute();
                                
                                sifreUyari1.setText(" ");
                                sifreUyari2.setText(" ");
                                txt_sifre.setText("");
                                txt_unvan.setText("");
                                txt_yeniSifre.setText("");
                                txt_yeniSifre2.setText("");
                                JOptionPane.showMessageDialog(null,"Şifreniz Güncellendi!");
                            }else{
                                sifreUyari1.setText(" ");
                                sifreUyari2.setText("Yeni Şifreniz Uyuşmuyor!");
                            }
                        }else{
                            sifreUyari2.setText("Bu alanlar boş bırakılamaz!");
                        }
                    }
                    else{
                        sifreUyari1.setText("Mevcut Şifre Hatalı!");
                    }
                }
                else{
                    sifreUyari1.setText("Bu alan boş bırakılamaz!");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncellene Yapılamadı!");
        }
    }
}
