package kursyonetimsistemi;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Mudur extends javax.swing.JFrame {
    public void DBBaglanti() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kurs_yonetim?useUnicode=true&characterEncoding=latin5","root",""); // veritabanına bağlatı kodu
    }
    public Mudur() {
        initComponents();
    }
    private SqlServerBaglantisi TR;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ogrenciKursSec = new javax.swing.JComboBox();
        ogrenciKursSirala = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ogr_kontencan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ogr_ucret = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Ogrc_adSoyad_txt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Ogrc_yas_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ogrc_tc_txt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Ogrc_tel_txt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Ogrc_ePos_txt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ogrc_adrs_txt = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        Combo_Siniflar = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_odemesekli = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        combo_taksit = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        ogr_tarih = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ogr_sure = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        kursAdi = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        odeme_tarihi = new com.toedter.calendar.JDateChooser();
        Ogrc_cins_txt = new javax.swing.JLabel();
        adUyari = new javax.swing.JLabel();
        cinsUyari = new javax.swing.JLabel();
        tcUyari = new javax.swing.JLabel();
        telUyari = new javax.swing.JLabel();
        adresUyari = new javax.swing.JLabel();
        odemeTarihUyari = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kursAdi_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kursFiyat_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kursKontenjan_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ComboKursSure = new javax.swing.JComboBox();
        YeniKurs_btn = new javax.swing.JButton();
        Combo_KursSec = new javax.swing.JComboBox();
        KursEkleSec_btn = new javax.swing.JButton();
        kursDuzenleFiyat = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        kursDuzenlebaslangicTarihi = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        kursDuzenleKontencan = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        kursGuncelle_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        kursBaslamaTarih = new com.toedter.calendar.JDateChooser();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        kursDuzenleSure = new javax.swing.JTextField();
        kontencan_guncelle = new javax.swing.JLabel();
        kursDuzenleKalanKontencan = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        ComboOgretmen = new javax.swing.JComboBox();
        jLabel65 = new javax.swing.JLabel();
        sinifAdi_txt = new javax.swing.JTextField();
        YeniSinif = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        sinifSil = new javax.swing.JButton();
        ComboSinif = new javax.swing.JComboBox();
        sinifUyari = new javax.swing.JLabel();
        sinifID = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        kursEkleUyari = new javax.swing.JLabel();
        kursEkleDuzenleId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Ogr_ad_soyad_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Ogr_yas_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Ogr_tc_txt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Ogr_sicil_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Ogr_tel_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Ogr_posta_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Ogr_ucret_txt = new javax.swing.JTextField();
        Ogr_ekle_btn = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        Ogr_alan_txt = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Ogr_adres_txt = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        ogretmenUyari = new javax.swing.JLabel();
        personel_maas_tarih = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Prs_ad_soyad_txt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Prs_yas_txt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Prs_tc_txt = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        Prs_sicil_txt = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Prs_tel_txt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Prs_posta_txt = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Prs_maas_txt = new javax.swing.JTextField();
        Prs_ekle_btn = new javax.swing.JButton();
        Prs_unvan_txt1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prs_adres_txt = new javax.swing.JTextArea();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        personelUyari = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Personel_maas_tarih2 = new com.toedter.calendar.JDateChooser();
        jLabel91 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        mudur_kurs_listele = new javax.swing.JComboBox();
        mudur_kurs_sec = new javax.swing.JButton();
        Kursun_Adi = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Kursun_Baslama_Tarihi = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        Kursun_Suresi = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Kursun_Fiyati = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GelirGiderTabloGoster = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        ToplamGelirler = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        ComboDersProgramiKurs = new javax.swing.JComboBox();
        dersProgramiKurslar_btn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        dersProgrami_Tablo = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        DersProgramiOgretmen_txt = new javax.swing.JTextField();
        ComboOgretmen1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        DersProgrami_id = new javax.swing.JLabel();
        ComboOgretmenn = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        ders_saat = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        OGRID = new javax.swing.JLabel();
        saatlik_ucret = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        ComboBox_kadi = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        txt_sifre = new javax.swing.JPasswordField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_yeniSifre = new javax.swing.JPasswordField();
        jLabel61 = new javax.swing.JLabel();
        txt_yeniSifre2 = new javax.swing.JPasswordField();
        jLabel62 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        sifreUyari1 = new javax.swing.JLabel();
        sifreUyari2 = new javax.swing.JLabel();
        txt_unvan = new javax.swing.JLabel();
        txt_personelSifre = new javax.swing.JLabel();
        personelLabel = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ComboAra = new javax.swing.JComboBox();
        ara_txt = new javax.swing.JTextField();
        ara_btn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        araTablo = new javax.swing.JTable();
        bilgiBuncelle_btn = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane7.setPreferredSize(new java.awt.Dimension(1360, 657));

        jPanel9.setPreferredSize(new java.awt.Dimension(1360, 657));
        jPanel9.setLayout(null);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/KapatT.png"))); // NOI18N
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel100);
        jLabel100.setBounds(1160, 30, 150, 40);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/mudur.png"))); // NOI18N
        jPanel9.add(jLabel95);
        jLabel95.setBounds(10, 510, 170, 140);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ogrenciKursSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kurs Seçiniz" }));
        ogrenciKursSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciKursSecActionPerformed(evt);
            }
        });

        ogrenciKursSirala.setText("Seç");
        ogrenciKursSirala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciKursSiralaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kontenjan:");

        ogr_kontencan.setText("-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kursun Ücreti:");

        ogr_ucret.setText("-");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Kişisel Bilgiler");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Adı Soyadı:");

        Ogrc_adSoyad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrc_adSoyad_txtActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Yaş:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cinsiyet:");

        Ogrc_tc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrc_tc_txtActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Tc No:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Tel:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("E-Posta:");

        Ogrc_adrs_txt.setColumns(20);
        Ogrc_adrs_txt.setRows(5);
        jScrollPane2.setViewportView(Ogrc_adrs_txt);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Adres:");

        Combo_Siniflar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Combo_Siniflar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sınıf Seçiniz", "Sınıf 1", "Sınıf 2", "Sınıf 3", "Sınıf 4", "Sınıf 5", "Sınıf 6", "Sınıf 7", "Sınıf 8", "Sınıf 9", "Sınıf 10" }));
        Combo_Siniflar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_SiniflarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sınıflar:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ödeme Şekli:");

        combo_odemesekli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_odemesekli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kredi Karti", "Nakit" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Taksit:");

        combo_taksit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_taksit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "12" }));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Ödeme Seçenekleri");

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Başlangıç Tarihi:");

        ogr_tarih.setText("-");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("Kurs Bilgileri");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Kurs Süresi:");

        ogr_sure.setText("-");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Kız");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Erkek");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seçili Kurs:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Ödeme Tarihi:");

        odeme_tarihi.setDateFormatString("yyyy.MM.dd");
        odeme_tarihi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Ogrc_cins_txt.setText("-");

        adUyari.setText("*");

        cinsUyari.setText("*");

        tcUyari.setText("*");

        telUyari.setText("*");

        adresUyari.setText("*");

        odemeTarihUyari.setText("*");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ogrenciKursSec, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrenciKursSirala)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogr_kontencan)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kursAdi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ogrc_ePos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Ogrc_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telUyari))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(Ogrc_cins_txt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Ogrc_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tcUyari))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabel27))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cinsUyari))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ogrc_yas_txt)
                                            .addComponent(Ogrc_adSoyad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adUyari)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresUyari)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel53))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Combo_Siniflar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_odemesekli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_taksit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(odeme_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel32))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(odemeTarihUyari))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ogr_ucret))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ogr_tarih))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel52)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ogr_sure))
                                            .addComponent(jLabel51))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogrenciKursSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrenciKursSirala)
                            .addComponent(jLabel1)
                            .addComponent(ogr_kontencan)
                            .addComponent(jLabel2)
                            .addComponent(kursAdi))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(Ogrc_adSoyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adUyari)))
                                    .addComponent(Ogrc_cins_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ogrc_yas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(cinsUyari))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ogrc_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(tcUyari)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Combo_Siniflar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(combo_odemesekli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(combo_taksit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(odeme_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addComponent(jLabel53))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel51)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(ogr_ucret))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel49)
                                        .addComponent(ogr_tarih))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(ogr_sure))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(odemeTarihUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ogrc_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(telUyari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ogrc_ePos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(adresUyari)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Öğrenci Kaydı", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kursAdi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursAdi_txtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kursun Adı: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fiyatı: ");

        kursFiyat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursFiyat_txtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Kontenjan:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Kurs Süresi:");

        ComboKursSure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Hafta", "2 Hafta", "3 Hafta", "4 Hafta", "1 Ay", "2 Ay", "3 Ay", "4 Ay", "5 Ay", "6 Ay", "1 Yıl" }));
        ComboKursSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboKursSureActionPerformed(evt);
            }
        });

        YeniKurs_btn.setText("Ekle");
        YeniKurs_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniKurs_btnActionPerformed(evt);
            }
        });

        Combo_KursSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_KursSecActionPerformed(evt);
            }
        });

        KursEkleSec_btn.setText("Seç");
        KursEkleSec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KursEkleSec_btnActionPerformed(evt);
            }
        });

        kursDuzenleFiyat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Fiyatı:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Başlangıç Tarihi:");

        kursDuzenlebaslangicTarihi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kursDuzenlebaslangicTarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursDuzenlebaslangicTarihiActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Kontenjan:");

        kursDuzenleKontencan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Kurs Bilgisi Güncelle");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Yeni Kurs");

        kursGuncelle_btn.setText("Güncelle");
        kursGuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursGuncelle_btnActionPerformed(evt);
            }
        });

        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        kursBaslamaTarih.setDateFormatString("yyyy.MM.dd");
        kursBaslamaTarih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Başlama Tarihi:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Süre:");

        kursDuzenleSure.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        kontencan_guncelle.setText("-");

        kursDuzenleKalanKontencan.setText("-");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Öğretmen:");

        ComboOgretmen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Öğretmen Seçiniz" }));
        ComboOgretmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboOgretmenActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setText("Yeni Sınıf Aç");

        sinifAdi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifAdi_txtActionPerformed(evt);
            }
        });

        YeniSinif.setText("Ekle");
        YeniSinif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniSinifActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel67.setText("Sınıf Sil");

        sinifSil.setText("Sil");
        sinifSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifSilActionPerformed(evt);
            }
        });

        ComboSinif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sınıf Seçiniz" }));
        ComboSinif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSinifActionPerformed(evt);
            }
        });

        sinifUyari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sinifUyari.setText("Bu alan boş bırakılamaz!");

        sinifID.setText("-");

        jLabel84.setText("*");

        jLabel85.setText("*");

        jLabel86.setText("*");

        jLabel87.setText("*");

        jLabel88.setText("*");

        jLabel89.setText("*");

        kursEkleUyari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kursEkleUyari.setText("Dikkat! :  *  ile belirtilen alanları boş bırakamazsın!");

        kursEkleDuzenleId.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(kursEkleDuzenleId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kontencan_guncelle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kursDuzenleKalanKontencan))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Combo_KursSec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(KursEkleSec_btn)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kursDuzenlebaslangicTarihi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(kursDuzenleKontencan, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(kursGuncelle_btn))
                                            .addComponent(kursDuzenleFiyat, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kursDuzenleSure, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel43)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kursAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kursFiyat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kursKontenjan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kursBaslamaTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboKursSure, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(YeniKurs_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sinifID)
                                .addGap(119, 119, 119))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel84)
                                            .addComponent(jLabel85)
                                            .addComponent(jLabel86)
                                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel65)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(ComboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sinifSil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel67)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sinifAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(YeniSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(sinifUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel89))
                                .addContainerGap(396, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(kursEkleUyari)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_KursSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KursEkleSec_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kursDuzenleFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kursDuzenleKontencan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kursDuzenlebaslangicTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kursDuzenleSure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sinifID)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kursGuncelle_btn)
                                    .addComponent(jButton3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kursAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel84))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kursFiyat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85)
                                    .addComponent(jLabel10)
                                    .addComponent(sinifUyari)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sinifAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YeniSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kursKontenjan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kursBaslamaTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinifSil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(jLabel88))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboKursSure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel89))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YeniKurs_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kursEkleDuzenleId)
                            .addComponent(kontencan_guncelle)
                            .addComponent(kursDuzenleKalanKontencan))
                        .addGap(18, 18, 18)
                        .addComponent(kursEkleUyari)
                        .addContainerGap(160, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Kurs İşlemleri", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Kişisel Bilgiler");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Adı Soyadı:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Yaş:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tc No:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Sicil No:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Tel:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("E-Posta:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Maaş Bilgileri");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Saatlik Ders Ücreti:");

        Ogr_ucret_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogr_ucret_txtActionPerformed(evt);
            }
        });

        Ogr_ekle_btn.setText("Ekle");
        Ogr_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogr_ekle_btnActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Alanı:");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Adres:");

        Ogr_adres_txt.setColumns(20);
        Ogr_adres_txt.setRows(5);
        jScrollPane5.setViewportView(Ogr_adres_txt);

        jLabel77.setText("*");

        jLabel78.setText("*");

        jLabel79.setText("*");

        jLabel80.setText("*");

        jLabel81.setText("*");

        jLabel82.setText("*");

        jLabel83.setText("*");

        ogretmenUyari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ogretmenUyari.setText("Dikkat! :  *  ile belirtilen alanları boş bırakamazsın!");

        personel_maas_tarih.setDateFormatString("yyyy.MM.dd");
        personel_maas_tarih.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Maaşın Ödenme Tarihi:");

        jLabel90.setText("*");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kartö.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ogr_alan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ogr_posta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(Ogr_sicil_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel80)
                                    .addGap(324, 324, 324))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Ogr_ad_soyad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(Ogr_yas_txt)
                                        .addComponent(Ogr_tc_txt))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel79)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel78)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(personel_maas_tarih, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                        .addComponent(Ogr_ucret_txt))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel90)
                                                        .addComponent(jLabel83)))
                                                .addComponent(ogretmenUyari)
                                                .addComponent(jLabel20)))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(Ogr_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel81)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ogr_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel82))))))
                .addGap(267, 310, Short.MAX_VALUE)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(Ogr_alan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel77))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(Ogr_ad_soyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel78)
                                                .addComponent(jLabel4))
                                            .addComponent(personel_maas_tarih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel90)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ogr_yas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(ogretmenUyari))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ogr_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel79)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(Ogr_ucret_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ogr_sicil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ogr_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ogr_posta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ogr_ekle_btn)))
                    .addComponent(jLabel76))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yeni Öğretmen", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Kişisel Bilgiler");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Adı Soyadı:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Yaş:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Tc No:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Sicil No:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Tel:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("E-Posta:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Maaş Bilgileri");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Aylık Maaş:");

        Prs_ekle_btn.setText("Ekle");
        Prs_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prs_ekle_btnActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Ünvanı:");

        jLabel63.setText("*");

        jLabel69.setText("*");

        jLabel70.setText("*");

        jLabel71.setText("*");

        jLabel72.setText("*");

        jLabel73.setText("*");

        Prs_adres_txt.setColumns(20);
        Prs_adres_txt.setRows(5);
        jScrollPane3.setViewportView(Prs_adres_txt);

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Adres:");

        jLabel75.setText("*");

        personelUyari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        personelUyari.setText("Dikkat! :  *  ile belirtilen alanları boş bırakamazsın!");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Maaşın Ödenme Tarihi:");

        Personel_maas_tarih2.setDateFormatString("yyyy.MM.dd");
        Personel_maas_tarih2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel91.setText("*");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kartp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24)
                                .addComponent(jLabel33)
                                .addComponent(jLabel74)
                                .addComponent(jLabel36))
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Prs_ad_soyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prs_yas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prs_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prs_sicil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prs_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prs_posta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel70)
                                            .addComponent(jLabel71))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Personel_maas_tarih2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Prs_maas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel69))
                                            .addComponent(personelUyari)))
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel72)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75)
                                    .addComponent(Prs_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Prs_unvan_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(Prs_maas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prs_unvan_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(jLabel69)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Personel_maas_tarih2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(Prs_ad_soyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel70)
                                .addComponent(jLabel44)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Prs_yas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(personelUyari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Prs_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Prs_sicil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Prs_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Prs_posta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)))
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Prs_ekle_btn))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yeni Personel", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        mudur_kurs_listele.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kust Seciniz" }));
        mudur_kurs_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudur_kurs_listeleActionPerformed(evt);
            }
        });

        mudur_kurs_sec.setText("Sec");
        mudur_kurs_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudur_kurs_secActionPerformed(evt);
            }
        });

        Kursun_Adi.setText("-");

        jLabel50.setText("Kursun  Adı:");

        jLabel66.setText("Başlama Tarihi:");

        Kursun_Baslama_Tarihi.setText("-");

        jLabel92.setText("Süre:");

        Kursun_Suresi.setText("-");

        jLabel94.setText("Kursun Ücreti:");

        Kursun_Fiyati.setText("-");

        GelirGiderTabloGoster.setBackground(new java.awt.Color(217, 217, 217));
        GelirGiderTabloGoster.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GelirGiderTabloGoster.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(GelirGiderTabloGoster);

        jLabel68.setText("Toplam:");

        ToplamGelirler.setText("-");

        jButton8.setText("Aylık Öğrenci Gelirleri");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Aylık Öğretmen Giderleri");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Aylık Personel Giderleri");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(mudur_kurs_listele, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mudur_kurs_sec)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Kursun_Adi)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kursun_Baslama_Tarihi)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kursun_Suresi)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kursun_Fiyati)
                        .addGap(0, 551, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToplamGelirler))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mudur_kurs_listele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mudur_kurs_sec))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94)
                        .addComponent(Kursun_Fiyati))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel92)
                        .addComponent(Kursun_Suresi))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(Kursun_Baslama_Tarihi))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(Kursun_Adi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(ToplamGelirler))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gelir - Gider Sorgula", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        ComboDersProgramiKurs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kurs Seçiniz" }));

        dersProgramiKurslar_btn.setText("Seç");
        dersProgramiKurslar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersProgramiKurslar_btnActionPerformed(evt);
            }
        });

        dersProgrami_Tablo.setBackground(new java.awt.Color(204, 204, 204));
        dersProgrami_Tablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dersProgrami_Tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(dersProgrami_Tablo);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Kursun Öğretmeni:");

        DersProgramiOgretmen_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ComboOgretmen1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Öğretmen Seçiniz" }));

        jButton1.setText("Öğretmen Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Ders Programını Kaydet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        DersProgrami_id.setText("-");

        ComboOgretmenn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Öğretmen Seçiniz" }));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Toplam Ders Saati:");

        ders_saat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton12.setText("Güncelle");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Seç");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        OGRID.setText("-");

        saatlik_ucret.setText("-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ComboDersProgramiKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dersProgramiKurslar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DersProgrami_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(DersProgramiOgretmen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saatlik_ucret)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OGRID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboOgretmenn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ComboOgretmen1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ders_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboDersProgramiKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dersProgramiKurslar_btn)
                    .addComponent(jButton5)
                    .addComponent(DersProgrami_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OGRID)
                        .addComponent(saatlik_ucret))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(DersProgramiOgretmen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboOgretmenn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboOgretmen1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ders_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Ders Programı Sorgula", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Personel:");

        ComboBox_kadi.setToolTipText("");
        ComboBox_kadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_kadiActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("Mevcut Şifre:");

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

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Giriş Bilgileri Güncelle");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Yeni Şifre:");

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

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("Şifre Doğrula:");

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

        jButton4.setText("Şifreyi Güncelle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        sifreUyari1.setText(" ");

        sifreUyari2.setText(" ");

        txt_unvan.setText("-");

        txt_personelSifre.setText("-");

        personelLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        personelLabel.setText("Personelin Şifresi: ");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kullanıcılar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel60)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel59)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_unvan)
                                .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(personelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_personelSifre))
                    .addComponent(jLabel62)
                    .addComponent(sifreUyari1)
                    .addComponent(sifreUyari2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(personelLabel)
                            .addComponent(txt_personelSifre))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreUyari1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(sifreUyari2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_unvan)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı Bilgileri", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        ComboAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboAra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Öğrenci", "Öğretmen", "Personel" }));
        ComboAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAraActionPerformed(evt);
            }
        });

        ara_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_txtActionPerformed(evt);
            }
        });

        ara_btn.setText("Ara");
        ara_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_btnActionPerformed(evt);
            }
        });

        araTablo.setBackground(new java.awt.Color(217, 217, 217));
        araTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        araTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(araTablo);

        bilgiBuncelle_btn.setText("Bilgileri Güncelle");
        bilgiBuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgiBuncelle_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(ComboAra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bilgiBuncelle_btn)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ara_txt)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ara_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bilgiBuncelle_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ara", jPanel8);

        jPanel9.add(jTabbedPane1);
        jTabbedPane1.setBounds(60, 59, 1250, 530);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/backgroundb.png"))); // NOI18N
        jLabel101.setAutoscrolls(true);
        jLabel101.setName(""); // NOI18N
        jPanel9.add(jLabel101);
        jLabel101.setBounds(0, 0, 1555, 770);

        jScrollPane7.setViewportView(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Connection con;
    private Statement st;
    private ResultSet rs;
    Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    private void Ogr_ucret_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogr_ucret_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogr_ucret_txtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        baglanti = SqlServerBaglantisi.Baglan();
        ogr_kontencan.setText("-");
        ogr_ucret.setText("-");
        ogr_tarih.setText("-");
        kursAdi.setText("-");
        ogr_sure.setText("-");
        kursEkleSec();
        ogretmenSec();
        YeniOgrenciKursSec();;
        DersProgramiKursSec();
        ogretmenKursSec();
        kullanicileriGetir();
        sinifSec();
        ogrenciSinifSec();
        dersSaatOgrSec();
        MudurGelirListele();
        Ogrc_cins_txt.setVisible(false);
        DersProgrami_id.setVisible(false);
        txt_unvan.setVisible(false);
        sinifUyari.setVisible(false);
        sinifID.setVisible(false);
        ogretmenUyari.setVisible(false);
        personelUyari.setVisible(false);
        kursEkleUyari.setVisible(false);
        kursEkleDuzenleId.setVisible(false);
        kontencan_guncelle.setVisible(false);
        kursDuzenleKalanKontencan.setVisible(false);
        saatlik_ucret.setVisible(false);
        OGRID.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void Ogr_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogr_ekle_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        if(!Ogr_ad_soyad_txt.getText().isEmpty() && !Ogr_alan_txt.getText().isEmpty() && !Ogr_tc_txt.getText().isEmpty() && !Ogr_sicil_txt.getText().isEmpty() && !Ogr_tel_txt.getText().isEmpty() && !Ogr_ucret_txt.getText().isEmpty() && !Ogr_adres_txt.getText().isEmpty() && !personel_maas_tarih.getDate().toString().isEmpty()){
            ogretmenEkle();
            muhasebeOgretmenEkle();
            ogretmenSec();
            dersSaatOgrSec();
            ogretmenKursSec();
        }else{
            ogretmenUyari.setVisible(true);
        }
    }//GEN-LAST:event_Ogr_ekle_btnActionPerformed

    private void Prs_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prs_ekle_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        personelEkle();
    }//GEN-LAST:event_Prs_ekle_btnActionPerformed

    private void ogrenciKursSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciKursSecActionPerformed
        
    }//GEN-LAST:event_ogrenciKursSecActionPerformed

    private void ogrenciKursSiralaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciKursSiralaActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        ogrSecListele();
    }//GEN-LAST:event_ogrenciKursSiralaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Ogrc_cins_txt.setText("Kız");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Ogrc_cins_txt.setText("Erkek");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        ogrenciEkle();
        ogrSecListele();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ogrc_adSoyad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrc_adSoyad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogrc_adSoyad_txtActionPerformed

    private void Combo_SiniflarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_SiniflarActionPerformed
        
    }//GEN-LAST:event_Combo_SiniflarActionPerformed

    private void dersProgramiKurslar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersProgramiKurslar_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        tabloDoldur();
        ogretmenDoldur();
        ogretmenKursSec();
    }//GEN-LAST:event_dersProgramiKurslar_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        ogretmenGuncelle();
        ogretmenDoldur();
        ogretmenKursSec();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        dersProgramiGuncelle();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ComboBox_kadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_kadiActionPerformed
        txt_unvan.setText(ComboBox_kadi.getSelectedItem().toString());
        if(!ComboBox_kadi.getSelectedItem().toString().equals("Mudur")){
            try{
                personelLabel.setVisible(true);
                txt_personelSifre.setVisible(true);
                preparedStatement = baglanti.prepareStatement("Select * From kullaniciler where unvan = '"+ComboBox_kadi.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    txt_personelSifre.setText(resultSet.getString("sifre"));
                }
            }catch(Exception e){
                
            }
        }else{
           txt_personelSifre.setText("-");
           personelLabel.setVisible(false);
           txt_personelSifre.setVisible(false);
        }
    }//GEN-LAST:event_ComboBox_kadiActionPerformed

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void txt_sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sifreKeyPressed
        
    }//GEN-LAST:event_txt_sifreKeyPressed

    private void txt_yeniSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yeniSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifreActionPerformed

    private void txt_yeniSifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yeniSifreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifreKeyPressed

    private void txt_yeniSifre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yeniSifre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifre2ActionPerformed

    private void txt_yeniSifre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_yeniSifre2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yeniSifre2KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sifreGuncelle();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboSinifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSinifActionPerformed

        baglanti = SqlServerBaglantisi.Baglan();
        try{
            if(!ComboSinif.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                preparedStatement = baglanti.prepareStatement("Select * From siniflar where sinifAdi='"+ComboSinif.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    sinifID.setText(resultSet.getString("id"));
                }
            }else{
                sinifID.setText(resultSet.getString("-"));
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_ComboSinifActionPerformed

    private void sinifSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifSilActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifSil();
        ogrenciSinifSec();
    }//GEN-LAST:event_sinifSilActionPerformed

    private void YeniSinifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniSinifActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifEkle();
        ogrenciSinifSec();
    }//GEN-LAST:event_YeniSinifActionPerformed

    private void sinifAdi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifAdi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinifAdi_txtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        kursSil();
        kursEkleSec();
        YeniOgrenciKursSec();
        DersProgramiKursSec();
        MudurGelirListele();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void kursGuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursGuncelle_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        kursGuncelle();
    }//GEN-LAST:event_kursGuncelle_btnActionPerformed

    private void kursDuzenlebaslangicTarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursDuzenlebaslangicTarihiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursDuzenlebaslangicTarihiActionPerformed

    private void KursEkleSec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KursEkleSec_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        KursEkleDuzenleSec();
    }//GEN-LAST:event_KursEkleSec_btnActionPerformed

    private void Combo_KursSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_KursSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_KursSecActionPerformed

    private void YeniKurs_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniKurs_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        if(!kursAdi_txt.getText().isEmpty() && !kursFiyat_txt.getText().isEmpty() && !kursKontenjan_txt.getText().isEmpty() && !ComboOgretmen.getSelectedItem().toString().equals("Öğretmen Seçiniz") && !kursBaslamaTarih.getDate().toString().isEmpty()){
            tabloEkle();
            kursEkle();
            DersProgramiKursSec();
            YeniOgrenciKursSec();
            MudurGelirListele();
        }else{
            kursEkleUyari.setVisible(true);
        }
    }//GEN-LAST:event_YeniKurs_btnActionPerformed

    private void ComboKursSureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboKursSureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboKursSureActionPerformed

    private void kursFiyat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursFiyat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursFiyat_txtActionPerformed

    private void kursAdi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursAdi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kursAdi_txtActionPerformed

    private void ComboOgretmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboOgretmenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboOgretmenActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan(); 
        OgretmenSaatGuncelle();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(!ComboOgretmenn.getSelectedItem().toString().equals("Öğretmen Seçiniz")){
            try{
                preparedStatement = baglanti.prepareStatement("Select * From muhasebeogretmen where AdSoyad = '"+ComboOgretmenn.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    OGRID.setText(resultSet.getString("id"));
                    ders_saat.setText(resultSet.getString("DersSaati"));
                }
                preparedStatement = baglanti.prepareStatement("Select * From ogretmen where AdSoyad = '"+ComboOgretmenn.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    saatlik_ucret.setText(resultSet.getString("SaatlikUcret"));
                }
            }catch(Exception e){
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Öğretmen Seçiniz!");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void ara_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_btnActionPerformed
        if(ComboAra.getSelectedItem().toString().equals("Öğrenci")){
            OgrenciTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Öğretmen")){
            OgretmenTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Personel")){
            PersonelTabloDoldur();
        }
    }//GEN-LAST:event_ara_btnActionPerformed

    private void ComboAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAraActionPerformed
        if(ComboAra.getSelectedItem().toString().equals("Öğrenci")){
            OgrenciTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Öğretmen")){
            OgretmenTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Personel")){
            PersonelTabloDoldur();
        }   
    }//GEN-LAST:event_ComboAraActionPerformed

    private void ara_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_txtActionPerformed
        if(ComboAra.getSelectedItem().toString().equals("Öğrenci")){
            OgrenciTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Öğretmen")){
            OgretmenTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Personel")){
            PersonelTabloDoldur();
        }   
    }//GEN-LAST:event_ara_txtActionPerformed

    private void bilgiBuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgiBuncelle_btnActionPerformed
        BilgiGuncelle();
        if(ComboAra.getSelectedItem().toString().equals("Öğrenci")){
            OgrenciTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Öğretmen")){
            OgretmenTabloDoldur();
        }else if(ComboAra.getSelectedItem().toString().equals("Personel")){
            PersonelTabloDoldur();
        }
    }//GEN-LAST:event_bilgiBuncelle_btnActionPerformed

    private void mudur_kurs_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudur_kurs_listeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mudur_kurs_listeleActionPerformed

    private void mudur_kurs_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudur_kurs_secActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        Mudur_gelirKurs();
        KurslariListelemeGelirGider();
    }//GEN-LAST:event_mudur_kurs_secActionPerformed

    private void Ogrc_tc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrc_tc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogrc_tc_txtActionPerformed

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        this.dispose();
        new giris().setVisible(true);
    }//GEN-LAST:event_jLabel100MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        baglanti=SqlServerBaglantisi.Baglan();
        ogrenciGelirGider();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        baglanti=SqlServerBaglantisi.Baglan();
        ogretmenGelirGider();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        baglanti=SqlServerBaglantisi.Baglan();
        personelGelirGider();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Mudur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mudur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mudur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mudur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mudur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboAra;
    private javax.swing.JComboBox ComboBox_kadi;
    private javax.swing.JComboBox ComboDersProgramiKurs;
    private javax.swing.JComboBox ComboKursSure;
    private javax.swing.JComboBox ComboOgretmen;
    private javax.swing.JComboBox ComboOgretmen1;
    private javax.swing.JComboBox ComboOgretmenn;
    private javax.swing.JComboBox ComboSinif;
    private javax.swing.JComboBox Combo_KursSec;
    private javax.swing.JComboBox Combo_Siniflar;
    private javax.swing.JTextField DersProgramiOgretmen_txt;
    private javax.swing.JLabel DersProgrami_id;
    private javax.swing.JTable GelirGiderTabloGoster;
    private javax.swing.JButton KursEkleSec_btn;
    private javax.swing.JLabel Kursun_Adi;
    private javax.swing.JLabel Kursun_Baslama_Tarihi;
    private javax.swing.JLabel Kursun_Fiyati;
    private javax.swing.JLabel Kursun_Suresi;
    private javax.swing.JLabel OGRID;
    private javax.swing.JTextField Ogr_ad_soyad_txt;
    private javax.swing.JTextArea Ogr_adres_txt;
    private javax.swing.JTextField Ogr_alan_txt;
    private javax.swing.JButton Ogr_ekle_btn;
    private javax.swing.JTextField Ogr_posta_txt;
    private javax.swing.JTextField Ogr_sicil_txt;
    private javax.swing.JTextField Ogr_tc_txt;
    private javax.swing.JTextField Ogr_tel_txt;
    private javax.swing.JTextField Ogr_ucret_txt;
    private javax.swing.JTextField Ogr_yas_txt;
    private javax.swing.JTextField Ogrc_adSoyad_txt;
    private javax.swing.JTextArea Ogrc_adrs_txt;
    private javax.swing.JLabel Ogrc_cins_txt;
    private javax.swing.JTextField Ogrc_ePos_txt;
    private javax.swing.JTextField Ogrc_tc_txt;
    private javax.swing.JTextField Ogrc_tel_txt;
    private javax.swing.JTextField Ogrc_yas_txt;
    private com.toedter.calendar.JDateChooser Personel_maas_tarih2;
    private javax.swing.JTextField Prs_ad_soyad_txt;
    private javax.swing.JTextArea Prs_adres_txt;
    private javax.swing.JButton Prs_ekle_btn;
    private javax.swing.JTextField Prs_maas_txt;
    private javax.swing.JTextField Prs_posta_txt;
    private javax.swing.JTextField Prs_sicil_txt;
    private javax.swing.JTextField Prs_tc_txt;
    private javax.swing.JTextField Prs_tel_txt;
    private javax.swing.JTextField Prs_unvan_txt1;
    private javax.swing.JTextField Prs_yas_txt;
    private javax.swing.JLabel ToplamGelirler;
    private javax.swing.JButton YeniKurs_btn;
    private javax.swing.JButton YeniSinif;
    private javax.swing.JLabel adUyari;
    private javax.swing.JLabel adresUyari;
    private javax.swing.JTable araTablo;
    private javax.swing.JButton ara_btn;
    private javax.swing.JTextField ara_txt;
    private javax.swing.JButton bilgiBuncelle_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cinsUyari;
    private javax.swing.JComboBox combo_odemesekli;
    private javax.swing.JComboBox combo_taksit;
    private javax.swing.JButton dersProgramiKurslar_btn;
    private javax.swing.JTable dersProgrami_Tablo;
    private javax.swing.JTextField ders_saat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kontencan_guncelle;
    private javax.swing.JLabel kursAdi;
    private javax.swing.JTextField kursAdi_txt;
    private com.toedter.calendar.JDateChooser kursBaslamaTarih;
    private javax.swing.JTextField kursDuzenleFiyat;
    private javax.swing.JLabel kursDuzenleKalanKontencan;
    private javax.swing.JTextField kursDuzenleKontencan;
    private javax.swing.JTextField kursDuzenleSure;
    private javax.swing.JTextField kursDuzenlebaslangicTarihi;
    private javax.swing.JLabel kursEkleDuzenleId;
    private javax.swing.JLabel kursEkleUyari;
    private javax.swing.JTextField kursFiyat_txt;
    private javax.swing.JButton kursGuncelle_btn;
    private javax.swing.JTextField kursKontenjan_txt;
    private javax.swing.JComboBox mudur_kurs_listele;
    private javax.swing.JButton mudur_kurs_sec;
    private javax.swing.JLabel odemeTarihUyari;
    private com.toedter.calendar.JDateChooser odeme_tarihi;
    private javax.swing.JLabel ogr_kontencan;
    private javax.swing.JLabel ogr_sure;
    private javax.swing.JLabel ogr_tarih;
    private javax.swing.JLabel ogr_ucret;
    private javax.swing.JComboBox ogrenciKursSec;
    private javax.swing.JButton ogrenciKursSirala;
    private javax.swing.JLabel ogretmenUyari;
    private javax.swing.JLabel personelLabel;
    private javax.swing.JLabel personelUyari;
    private com.toedter.calendar.JDateChooser personel_maas_tarih;
    private javax.swing.JLabel saatlik_ucret;
    private javax.swing.JLabel sifreUyari1;
    private javax.swing.JLabel sifreUyari2;
    private javax.swing.JTextField sinifAdi_txt;
    private javax.swing.JLabel sinifID;
    private javax.swing.JButton sinifSil;
    private javax.swing.JLabel sinifUyari;
    private javax.swing.JLabel tcUyari;
    private javax.swing.JLabel telUyari;
    private javax.swing.JLabel txt_personelSifre;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JLabel txt_unvan;
    private javax.swing.JPasswordField txt_yeniSifre;
    private javax.swing.JPasswordField txt_yeniSifre2;
    // End of variables declaration//GEN-END:variables
    public void kursEkle(){
        try{String kursAdi = kursAdi_txt.getText();
            String kursFiyat = kursFiyat_txt.getText();
            Integer kursKontencan = Integer.parseInt(kursKontenjan_txt.getText());
            String kursSuresi = ComboKursSure.getSelectedItem().toString();
            String ogretmen = ComboOgretmen.getSelectedItem().toString();
            String ay = Integer.toString(kursBaslamaTarih.getCalendar().get(Calendar.MONTH));
            Integer ayy = Integer.parseInt(ay)+1;
            String tarih = kursBaslamaTarih.getCalendar().get(Calendar.YEAR)+"-"+ayy+"-"+kursBaslamaTarih.getCalendar().get(Calendar.DAY_OF_MONTH);
                preparedStatement = baglanti.prepareStatement("Select * From kurslar");
                resultSet = preparedStatement.executeQuery();
                resultSet.last();
                Integer kursId = kursId = Integer.parseInt(resultSet.getString("id"))+1;

            String sql = "insert into kurslar (id, KursAdi, Fiyat, Kontencan, KalanKontencan, BaslamaTarihi, Ogretmen, Sure) values ('"+kursId+"', '"+kursAdi+"', '"+kursFiyat+"', '"+kursKontencan+"', '"+kursKontencan+"', '"+tarih+"', '"+ogretmen+"', '"+kursSuresi+"')";
            Statement kaydet = baglanti.createStatement();
            kaydet.executeUpdate(sql);
            kursEkleSec();
            kursEkleUyari.setVisible(false);
            JOptionPane.showMessageDialog(null, "Kurs Eklendi!");
            kursAdi_txt.setText("");
            kursFiyat_txt.setText("");
            kursKontenjan_txt.setText("");

        }catch(Exception e){
            Integer kursId = 1;            
            try{
                String kursAdi = kursAdi_txt.getText();
                String kursFiyat = kursFiyat_txt.getText();
                Integer kursKontencan = Integer.parseInt(kursKontenjan_txt.getText());
                String kursSuresi = ComboKursSure.getSelectedItem().toString();
                String ogretmen = ComboOgretmen.getSelectedItem().toString();
                String ay = Integer.toString(kursBaslamaTarih.getCalendar().get(Calendar.MONTH));
                Integer ayy = Integer.parseInt(ay)+1;
                String tarih = kursBaslamaTarih.getCalendar().get(Calendar.YEAR)+"-"+ayy+"-"+kursBaslamaTarih.getCalendar().get(Calendar.DAY_OF_MONTH);

                String sql = "insert into kurslar (id, KursAdi, Fiyat, Kontencan, KalanKontencan, BaslamaTarihi, Ogretmen, Sure) values ('"+kursId+"', '"+kursAdi+"', '"+kursFiyat+"', '"+kursKontencan+"', '"+kursKontencan+"', '"+tarih+"', '"+ogretmen+"', '"+kursSuresi+"')";
                Statement kaydet = baglanti.createStatement();
                kaydet.executeUpdate(sql);
                kursEkleSec();
                kursEkleUyari.setVisible(false);
                JOptionPane.showMessageDialog(null, "Kurs Eklendi!");
                kursAdi_txt.setText("");
                kursFiyat_txt.setText("");
                kursKontenjan_txt.setText("");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Kurs Eklenemedi!");
            }
        }
    }
    public void tabloEkle(){       
        try{
            preparedStatement = baglanti.prepareStatement("Select * From kurslar");
            resultSet = preparedStatement.executeQuery();
            resultSet.last();
            Integer kursId = kursId = Integer.parseInt(resultSet.getString("id"))+1;
                
            String sql = "CREATE TABLE tablo"+kursId+" (id int auto_increment primary key, Saat varchar(200), Pazartesi varchar(200), Sali varchar(200), Carsamba varchar(200), Persembe varchar(200), Cuma varchar(200), Cumartesi varchar(200), Pazar varchar(200))";
            Statement kaydet = baglanti.createStatement();
            kaydet.executeUpdate(sql);

            for(int i=1; i<=15; i++){
                String sqll = "insert into tablo"+kursId+" (id, Saat, Pazartesi, Sali, Carsamba, Persembe, Cuma, Cumartesi, Pazar) values (null, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')";

                Statement kaydett = baglanti.createStatement();
                kaydett.executeUpdate(sqll);
            }        
        }catch(Exception e){
            Integer kursId = 1;            
            try{
                String sql = "CREATE TABLE tablo"+kursId+" (id int auto_increment primary key, Saat varchar(200), Pazartesi varchar(200), Sali varchar(200), Carsamba varchar(200), Persembe varchar(200), Cuma varchar(200), Cumartesi varchar(200), Pazar varchar(200))";
                Statement kaydet = baglanti.createStatement();
                kaydet.executeUpdate(sql);

                for(int i=1; i<=15; i++){
                    String sqll = "insert into tablo"+kursId+" (id, Saat, Pazartesi, Sali, Carsamba, Persembe, Cuma, Cumartesi, Pazar) values (null, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')";

                    Statement kaydett = baglanti.createStatement();
                    kaydett.executeUpdate(sqll);
                }  
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Tablo Kaydedilemedi!");
            }
        }
    }
    private void kursEkleSec(){
        try{
        preparedStatement = baglanti.prepareStatement("Select * From kurslar");
        resultSet = preparedStatement.executeQuery();
        
        Combo_KursSec.removeAllItems();
        Combo_KursSec.addItem("Kurs Seçiniz");
        while(resultSet.next()){
            String kullaniciAdiGelen = resultSet.getString("KursAdi");
            Combo_KursSec.addItem(kullaniciAdiGelen);
        }
        }catch(Exception e){
            
        }
    }
    private void ogretmenSec(){
        try{
        preparedStatement = baglanti.prepareStatement("Select * From ogretmen");
        resultSet = preparedStatement.executeQuery();
        
        ComboOgretmen.removeAllItems();
        ComboOgretmen.addItem("Öğretmen Seçiniz");
        while(resultSet.next()){
            String ogretmenAdiGelen = resultSet.getString("AdSoyad");
            ComboOgretmen.addItem(ogretmenAdiGelen);
        }
        }catch(Exception e){
            
        }
    }
    public void KursEkleDuzenleSec(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi = '"+Combo_KursSec.getSelectedItem().toString()+"'");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                    kursEkleDuzenleId.setText(resultSet.getString("id"));
                    kursDuzenleFiyat.setText(resultSet.getString("Fiyat"));
                    kursDuzenleKontencan.setText(resultSet.getString("Kontencan"));
                    kursDuzenleKalanKontencan.setText(resultSet.getString("KalanKontencan"));
                    kontencan_guncelle.setText(resultSet.getString("Kontencan"));
                    kursDuzenlebaslangicTarihi.setText(resultSet.getString("BaslamaTarihi"));
                    kursDuzenleSure.setText(resultSet.getString("Sure"));
            }
            if(Combo_KursSec.getSelectedItem().toString().equals("Kurs Seçiniz")){
                JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
            }
        }catch(Exception e){}
    }
    public void kursGuncelle(){
        try{
            if(!Combo_KursSec.getSelectedItem().toString().equals("Kurs Seçiniz")){
                Integer id = Integer.parseInt(kursEkleDuzenleId.getText());
                String value1 =kursDuzenleFiyat.getText();
                String value3 =kursDuzenlebaslangicTarihi.getText();
                String value4 =kursDuzenleSure.getText();
                String kontencan =kursDuzenleKontencan.getText();
                Integer k = Integer.parseInt(kontencan_guncelle.getText());
                Integer gK = Integer.parseInt(kontencan);
                Integer kK = Integer.parseInt(kursDuzenleKalanKontencan.getText());
                if(gK>=k){
                    kK += gK-k;
                    String sql = "update kurslar set Fiyat='"+value1+"',Kontencan='"+kontencan+"',KalanKontencan='"+kK+"',BaslamaTarihi='"+value3+"',Sure='"+value4+"' where id='"+id+"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                    JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!");
                    
                    kursEkleSec();
                    YeniOgrenciKursSec();
                    kursEkleDuzenleId.setText("");
                    kursDuzenleFiyat.setText("");
                    kursDuzenleSure.setText("");
                    kursDuzenlebaslangicTarihi.setText("");
                    kursDuzenleKontencan.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kontenjan değiştirilemiyor!");
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
            }
         }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!");
         }
    }
    public void kursSil(){
        try{
            if(!Combo_KursSec.getSelectedItem().toString().equals("Kurs Seçiniz")){
                Integer id = Integer.parseInt(kursEkleDuzenleId.getText());
                String sql = "delete from kurslar where id ='"+id+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                kursEkleSec();
                String sql2 = "DROP TABLE tablo"+id;
                preparedStatement = baglanti.prepareStatement(sql2);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Kurs Silindi!");

                kursEkleDuzenleId.setText("");
                kursDuzenleFiyat.setText("");
                kursDuzenleSure.setText("");
                kursDuzenlebaslangicTarihi.setText("");
                kursDuzenleKontencan.setText("");
            }else{
                 JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
            }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Silinemedi!");
       }
    }
    public void ogretmenEkle(){
    try{
        String adSoyad = Ogr_ad_soyad_txt.getText();
        String alani = Ogr_alan_txt.getText();
        String yas = Ogr_yas_txt.getText();
        String tc = Ogr_tc_txt.getText();
        String sicilno = Ogr_sicil_txt.getText();
        String telno = Ogr_tel_txt.getText();
        String ePosta = Ogr_posta_txt.getText();
        String ucret = Ogr_ucret_txt.getText();
        String adres = Ogr_adres_txt.getText();
            
            String sql = "INSERT INTO ogretmen (AdSoyad,Alani,Yas,Tc,SicilNo,Tel,ePosta,Adres,SaatlikUcret) VALUES ('"+adSoyad+"', '"+alani+"', '"+yas+"', '"+tc+"', '"+sicilno+"', '"+telno+"', '"+ePosta+"', '"+adres+"', '"+ucret+"')";
            Statement kaydet = baglanti.createStatement();
            kaydet.executeUpdate(sql);

            ogretmenUyari.setVisible(false);
            JOptionPane.showMessageDialog(null, "Öğretmen Kaydı Yapıldı!");
        
        }catch(NumberFormatException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
        }
    }
    public void personelEkle(){
    try{
        String adSoyad = Prs_ad_soyad_txt.getText();
        String unvan = Prs_unvan_txt1.getText();
        String yas = Prs_yas_txt.getText();
        String tc = Prs_tc_txt.getText();
        String sicilno = Prs_sicil_txt.getText();
        String telno = Prs_tel_txt.getText();
        String ePosta = Prs_posta_txt.getText();
        String ucret = Prs_maas_txt.getText();
        String adres = Prs_adres_txt.getText();
        if(!adSoyad.isEmpty() && !unvan.isEmpty() && !tc.isEmpty() && !sicilno.isEmpty() && !telno.isEmpty() && !ucret.isEmpty() && !adres.isEmpty() && !Personel_maas_tarih2.getDate().toString().isEmpty()){
            String sql = "INSERT INTO personel (AdSoyad,Unvan,Yas,Tc,SicilNo,Tel,ePosta,Adres,Maas) VALUES ('"+adSoyad+"', '"+unvan+"', '"+yas+"', '"+tc+"', '"+sicilno+"', '"+telno+"', '"+ePosta+"', '"+adres+"', '"+ucret+"')";
            Statement kaydet = baglanti.createStatement();
            kaydet.executeUpdate(sql);

            personelUyari.setVisible(false);
            JOptionPane.showMessageDialog(null, "Personel Kaydı Yapıldı!");
            muhasebe_personel_ekle();
            Prs_unvan_txt1.setText("");
            Prs_ad_soyad_txt.setText("");
            Prs_yas_txt.setText("");
            Prs_tc_txt.setText("");
            Prs_sicil_txt.setText("");
            Prs_tel_txt.setText("");
            Prs_posta_txt.setText("");
            Prs_maas_txt.setText("");
            Prs_adres_txt.setText("");
        }else{
            personelUyari.setVisible(true);
        }
    }catch(NumberFormatException | SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
    }
    }
     private void YeniOgrenciKursSec(){
            try{
            preparedStatement = baglanti.prepareStatement("Select * From kurslar");
            resultSet = preparedStatement.executeQuery();

            ogrenciKursSec.removeAllItems();
            ogrenciKursSec.addItem("Kurs Seçiniz");
            while(resultSet.next()){
                String kullaniciAdiGelen = resultSet.getString("KursAdi");
                ogrenciKursSec.addItem(kullaniciAdiGelen);
            }
            }catch(Exception e){

            }
        }
        public void ogrSecListele(){
            try{
                if(!ogrenciKursSec.getSelectedItem().toString().equals("Kurs Seçiniz")){
                    preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi = '"+ogrenciKursSec.getSelectedItem().toString()+"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        ogr_kontencan.setText(resultSet.getString("KalanKontencan"));
                        ogr_ucret.setText(resultSet.getString("Fiyat"));
                        ogr_tarih.setText(resultSet.getString("BaslamaTarihi"));
                        ogr_sure.setText(resultSet.getString("Sure"));
                        kursAdi.setText(resultSet.getString("KursAdi"));
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
                }
            }catch(Exception e){}
        }
        public void ogrenciEkle(){
        try{
            if(!ogr_ucret.getText().equals("-"))
            {
            Integer kontencan = Integer.parseInt(ogr_kontencan.getText());
                if(!kontencan.equals(0)){
                    if(!Ogrc_adSoyad_txt.getText().isEmpty())
                    {adUyari.setText("*");
                        if(!Ogrc_cins_txt.getText().equals("-"))
                        {cinsUyari.setText("*");
                            if(!Ogrc_tc_txt.getText().isEmpty())
                            {tcUyari.setText("*");
                                if(!Ogrc_tel_txt.getText().isEmpty())
                                {telUyari.setText("*");
                                    if(!Ogrc_adrs_txt.getText().isEmpty())
                                    {adresUyari.setText("*");
                                        if(!Combo_Siniflar.getSelectedItem().toString().equals("Sınıf Seçiniz"))
                                        {
                                            if(!odeme_tarihi.getDate().toString().isEmpty()){
                                                String kurs_Adi = kursAdi.getText();
                                                String adSoyad = Ogrc_adSoyad_txt.getText();
                                                String yas = Ogrc_yas_txt.getText();
                                                String cinsiyet = Ogrc_cins_txt.getText();
                                                String tc = Ogrc_tc_txt.getText();
                                                String telno = Ogrc_tel_txt.getText();
                                                String ePosta = Ogrc_ePos_txt.getText();
                                                String adres = Ogrc_adrs_txt.getText();
                                                String Sinif = Combo_Siniflar.getSelectedItem().toString();
                                                String OdemeSekli = combo_odemesekli.getSelectedItem().toString();
                                                String fiyat = ogr_ucret.getText();
                                                String ay2 = Integer.toString(odeme_tarihi.getCalendar().get(Calendar.MONTH));
                                                Integer ayy2 = Integer.parseInt(ay2)+1;
                                                String Tarih = odeme_tarihi.getCalendar().get(Calendar.YEAR)+"-"+ayy2+"-"+odeme_tarihi.getCalendar().get(Calendar.DAY_OF_MONTH);
                                                String Taksit = combo_taksit.getSelectedItem().toString();

                                                String sql = "INSERT INTO ogrenci (KursAdi,Sinif,AdSoyad,Yas,Cinsiyet,Tc,Tel,ePosta,Adres) VALUES ('"+kurs_Adi+"','"+Sinif+"','"+adSoyad+"','"+yas+"', '"+cinsiyet+"', '"+tc+"', '"+telno+"', '"+ePosta+"', '"+adres+"')";
                                                Statement kaydet = baglanti.createStatement();
                                                kaydet.executeUpdate(sql);
                                                JOptionPane.showMessageDialog(null, "Ögrenci Kaydınız Yapıldı!");

                                                if(OdemeSekli.equals("Nakit")){
                                                    String s1 = "INSERT INTO muhasebe (id, KursAdi, Tc, AdSoyad, Tel, Adres, Tarih, TaksitTarih, Taksit, OdenenTaksit, OdemeSekli, Fiyat, OdenecekFiyat, Durum) VALUES (NULL, '"+kurs_Adi+"', '"+tc+"', '"+adSoyad+"', '"+telno+"', '"+adres+"', '"+Tarih+"', '"+Tarih+"', '-', '-', '"+OdemeSekli+"', '"+fiyat+"', '"+fiyat+"', 'Odenmedi')";
                                                    Statement kayit1 = baglanti.createStatement();
                                                    kayit1.executeUpdate(s1);
                                                    JOptionPane.showMessageDialog(null, "Ödeme Seçenekleriniz Kaydedildi!");
                                                }
                                                else if(OdemeSekli.equals("Kredi Karti")){
                                                    String s = "INSERT INTO muhasebe (id, KursAdi, Tc, AdSoyad, Tel, Adres, Tarih, TaksitTarih, Taksit, OdenenTaksit, OdemeSekli, Fiyat, OdenecekFiyat, Durum) VALUES (NULL, '"+kurs_Adi+"', '"+tc+"', '"+adSoyad+"', '"+telno+"', '"+adres+"', '"+Tarih+"', '"+Tarih+"', '"+Taksit+"', '0', '"+OdemeSekli+"', '"+fiyat+"', '"+fiyat+"', 'Odenmedi')";
                                                    Statement kayit = baglanti.createStatement();
                                                    kayit.executeUpdate(s);
                                                    JOptionPane.showMessageDialog(null, "Ödeme Seçenekleriniz Kaydedildi!");
                                                }


                                                preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi = '"+kurs_Adi+"'");
                                                resultSet = preparedStatement.executeQuery();
                                                while(resultSet.next()){
                                                    Integer kalanKontencan = Integer.parseInt(resultSet.getString("KalanKontencan"))-1;
                                                    String sqll = "update kurslar set KalanKontencan='"+kalanKontencan+"' where KursAdi = '"+kurs_Adi+"'";
                                                    Statement kaydet1 = baglanti.createStatement();
                                                    kaydet1.executeUpdate(sqll);                
                                                }

                                                Ogrc_adSoyad_txt.setText("");
                                                Ogrc_yas_txt.setText("");
                                                Ogrc_tc_txt.setText("");
                                                Ogrc_tel_txt.setText("");
                                                Ogrc_ePos_txt.setText("");
                                                Ogrc_adrs_txt.setText("");
                                            }else{
                                                odemeTarihUyari.setText("Bu alan boş bırakılamaz!");
                                            }
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Sınıf Seçiniz!");
                                        }
                                    }else{
                                    adresUyari.setText("Bu alan boş bırakılamaz!");
                                    }
                                 }else{
                                telUyari.setText("Bu alan boş bırakılamaz!");
                                }
                             }else{
                            tcUyari.setText("Bu alan boş bırakılamaz!");
                            }
                         }else{
                        cinsUyari.setText("Bu alan boş bırakılamaz!");
                        }
                    }else{
                        adUyari.setText("Bu alan boş bırakılamaz!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seçtiğiniz kursun kontenjanı dolmuştur!");
                }
           }else{
              JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ödeme Tarihini Seçiniz!");
        }
    }
        private void DersProgramiKursSec(){
            try{
            preparedStatement = baglanti.prepareStatement("Select * From kurslar");
            resultSet = preparedStatement.executeQuery();

            ComboDersProgramiKurs.removeAllItems();
            ComboDersProgramiKurs.addItem("Kurs Seçiniz");
            while(resultSet.next()){
                String kullaniciAdiGelen = resultSet.getString("KursAdi");
                ComboDersProgramiKurs.addItem(kullaniciAdiGelen);
            }
            }catch(Exception e){

            }
        }
        public void tabloDoldur(){
        String baslik[] = new String[]{"Saat", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"}; 
        try{
            if(!ComboDersProgramiKurs.getSelectedItem().toString().equals("Kurs Seçiniz"))
            {
                preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi='"+ComboDersProgramiKurs.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    Integer kursID = Integer.parseInt(resultSet.getString("id"));
                    
                    DBBaglanti();
                    String sorgu = "select * from tablo"+kursID;

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();

                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        data[i] = new Object[]{
                            rs.getString("Saat"),
                            rs.getString("Pazartesi"),
                            rs.getString("Sali"),
                            rs.getString("Carsamba"),
                            rs.getString("Persembe"),
                            rs.getString("Cuma"),
                            rs.getString("Cumartesi"),
                            rs.getString("Pazar")
                        };
                        i++;
                    }
                    dersProgrami_Tablo.setModel(new DefaultTableModel(data, baslik));
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Kurs Seçiniz!");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
        }
        private void ogretmenKursSec(){
            try{
            preparedStatement = baglanti.prepareStatement("Select * From ogretmen");
            resultSet = preparedStatement.executeQuery();
        
        ComboOgretmen1.removeAllItems();
        ComboOgretmen1.addItem("Öğretmen Seçiniz");
        while(resultSet.next()){
            String ogretmenAdiGelen = resultSet.getString("AdSoyad");
            ComboOgretmen1.addItem(ogretmenAdiGelen);
        }
        }catch(Exception e){
            
        }
    }
    public void ogretmenDoldur(){
        try{
        
        preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi = '"+ComboDersProgramiKurs.getSelectedItem().toString()+"'");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            DersProgrami_id.setText(resultSet.getString("id"));
            DersProgramiOgretmen_txt.setText(resultSet.getString("Ogretmen"));
        }
        }catch(Exception e){}
    }
    public void ogretmenGuncelle(){
        try{
            String id = DersProgrami_id.getText();
            String ogretmen = ComboOgretmen1.getSelectedItem().toString();
            if(!ComboDersProgramiKurs.getSelectedItem().toString().equals("Kurs Seçiniz"))
            {
                if(!ogretmen.equals("Öğretmen Seçiniz")){
                    String sql = "update kurslar set Ogretmen='"+ogretmen+"' where id = '"+id+"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                    JOptionPane.showMessageDialog(null, "Öğretmen Güncellendi!");
                }else{
                    JOptionPane.showMessageDialog(null, "Öğretmen Seçiniz!");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!");
        }
    }
    public void dersProgramiGuncelle(){
        try{
            if(!ComboDersProgramiKurs.getSelectedItem().toString().equals("Kurs Seçiniz")){
                for(int i=0;i<=14;i++){
                    int tabloId = i+1;
                    Object saat = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 0);
                    Object pazartesi = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 1);
                    Object sali = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 2);
                    Object carsamba = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 3);
                    Object persembe = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 4);
                    Object cuma = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 5);
                    Object cumartesi = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 6);
                    Object pazar = (Object) dersProgrami_Tablo.getModel().getValueAt(i, 7);
                    
                    preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi='"+ComboDersProgramiKurs.getSelectedItem().toString()+"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        Integer kursID = Integer.parseInt(resultSet.getString("id"));
                        String sql = "update tablo"+kursID+" set Saat='"+saat.toString()+"', Pazartesi='"+pazartesi.toString()+"', Sali='"+sali.toString()+"', Carsamba='"+carsamba.toString()+"', Persembe='"+persembe.toString()+"', Cuma='"+cuma.toString()+"', Cumartesi='"+cumartesi.toString()+"', Pazar='"+pazar.toString()+"' where id = '"+tabloId+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                    }
                }
                JOptionPane.showMessageDialog(null, "Ders Programı Güncellendi!");
            }else{
                JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!");
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
                                txt_personelSifre.setVisible(false);
                                personelLabel.setVisible(false);
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
    public void sinifEkle(){
        try{
            if(!sinifAdi_txt.getText().isEmpty()){
                String sql = "INSERT INTO siniflar (sinifAdi) VALUES ('"+sinifAdi_txt.getText()+"')";
                Statement kaydet = baglanti.createStatement();
                kaydet.executeUpdate(sql);
                
                sinifUyari.setVisible(false);
                sinifAdi_txt.setText("");
                sinifSec();
                JOptionPane.showMessageDialog(null, "Sınıf Eklendi!");
            }else{
                sinifUyari.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!");
        }
    }
    private void sinifSec(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            ComboSinif.removeAllItems();
            ComboSinif.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("sinifAdi");
                ComboSinif.addItem(ogretmenAdiGelen);
            }
        }catch(Exception e){
            
        }
    }
    private void ogrenciSinifSec(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_Siniflar.removeAllItems();
            Combo_Siniflar.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("sinifAdi");
                Combo_Siniflar.addItem(ogretmenAdiGelen);
            }
        }catch(Exception e){
            
        }
    }
    private void sinifSil(){
        try{
            if(!ComboSinif.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                String sql = "delete from siniflar where id ='"+sinifID.getText()+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();

                sinifSec();
                JOptionPane.showMessageDialog(null, "Sınıf Silindi!");
            }else{
                JOptionPane.showMessageDialog(null, "Sınıf Seçiniz!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Silinemedi!");
        }
    }
    public void muhasebeOgretmenEkle(){
        try{
            String tc = Ogr_tc_txt.getText();
            String adSoyad = Ogr_ad_soyad_txt.getText();
            String telno = Ogr_tel_txt.getText();
            String ucret = Ogr_ucret_txt.getText();
            String adres = Ogr_adres_txt.getText();
            String ay = Integer.toString(personel_maas_tarih.getCalendar().get(Calendar.MONTH));
            Integer ayy = Integer.parseInt(ay)+1;
            String tarih = personel_maas_tarih.getCalendar().get(Calendar.YEAR)+"-"+ayy+"-"+personel_maas_tarih.getCalendar().get(Calendar.DAY_OF_MONTH);
            
                String sql = "insert into muhasebeogretmen (id, Tc, AdSoyad, Tel, Adres, odemeTarihi, SaatlikUcret, DersSaati, Fiyat, Durum) values (NULL, '"+tc+"', '"+adSoyad+"', '"+telno+"', '"+adres+"',  '"+tarih+"', '"+ucret+"',  '0' , '0', 'Odenmedi')";
                Statement kaydet = baglanti.createStatement();
                kaydet.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Öğretmenin Muhasebe Kaydı Yapıldı!");

                Ogr_alan_txt.setText("");
                Ogr_ad_soyad_txt.setText("");
                Ogr_yas_txt.setText("");
                Ogr_tc_txt.setText("");
                Ogr_sicil_txt.setText("");
                Ogr_tel_txt.setText("");
                Ogr_posta_txt.setText("");
                Ogr_ucret_txt.setText("");
                Ogr_adres_txt.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Kayıt yapılamadı");
        }
    }
    public void dersSaatOgrSec(){
        try{
            preparedStatement = baglanti.prepareStatement("SELECT * FROM ogretmen");
            resultSet = preparedStatement.executeQuery();

            ComboOgretmenn.removeAllItems();
            ComboOgretmenn.addItem("Öğretmen Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("AdSoyad");
                ComboOgretmenn.addItem(ogretmenAdiGelen);
            }
        }catch(Exception e){
            
        }
    }
    public void OgretmenSaatGuncelle(){
        try{
            if(!ComboOgretmenn.getSelectedItem().toString().equals("Öğretmen Seçiniz"))
            {
                String id = OGRID.getText();
                String dersSaati = ders_saat.getText();
                Integer fiyat = Integer.parseInt(dersSaati)*Integer.parseInt(saatlik_ucret.getText());
            
                String sql = "update muhasebeogretmen set DersSaati='"+dersSaati+"', Fiyat='"+fiyat.toString()+"' where id = '"+id+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                
                ders_saat.setText("");
                saatlik_ucret.setText("-");
                OGRID.setText("-");
                dersSaatOgrSec();
                JOptionPane.showMessageDialog(null, "Öğretmen Güncellendi!");
            }else{
                    JOptionPane.showMessageDialog(null, "Öğretmen Seçiniz!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!");
        }
    }
    public void muhasebe_personel_ekle(){
        try{
        String tc = Prs_tc_txt.getText();
        String adSoyad = Prs_ad_soyad_txt.getText();
        String telno = Prs_tel_txt.getText();
        String maas = Prs_maas_txt.getText();
        String adres = Prs_adres_txt.getText();
        
            String ay = Integer.toString(Personel_maas_tarih2.getCalendar().get(Calendar.MONTH));
            Integer ayy = Integer.parseInt(ay)+1;
            String tarih = Personel_maas_tarih2.getCalendar().get(Calendar.YEAR)+"-"+ayy+"-"+Personel_maas_tarih2.getCalendar().get(Calendar.DAY_OF_MONTH);
        
            String sql = "insert into muhasebepersonel (id, Tc, AdSoyad, Tel, Adres, odemeTarih, Maas, Durum) values (NULL,'"+tc+"', '"+adSoyad+"', '"+telno+"', '"+adres+"', '"+tarih+"', '"+maas+"', 'Odenmedi')";
            Statement kaydet = baglanti.createStatement();
            kaydet.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Personelin Muhasebe Kaydı Yapıldı!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Kayıt yapılamadı");
        }

    }
    public void OgrenciTabloDoldur(){
        String baslik[] = new String[]{"id", "Kimlik", "Kurs Adı", "Tc", "Ad Soyad", "Yaş", "Cinsiyet", "Tel", "E-Posta", "Adres"}; 
        try{                        
                    DBBaglanti();
                    String gelenArama = ara_txt.getText();
                    String sorgu = "Select * From ogrenci where AdSoyad like '"+gelenArama+"%' or Tc  like '"+gelenArama+"%'";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();

                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        data[i] = new Object[]{
                            rs.getString("id"),
                            "Öğrenci",
                            rs.getString("KursAdi"),
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("Yas"),
                            rs.getString("Cinsiyet"),
                            rs.getString("Tel"),
                            rs.getString("ePosta"),
                            rs.getString("Adres")
                        };
                        i++;
                    araTablo.setModel(new DefaultTableModel(data, baslik));
                    }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
        }
    public void OgretmenTabloDoldur(){
        String baslik[] = new String[]{"id", "Kimlik", "Tc", "Ad Soyad", "Alanı", "Yaş", "Sicil No", "Tel", "E-Posta", "Adres", "Saatlik Ücret"}; 
        try{                        
                    DBBaglanti();
                    String gelenArama = ara_txt.getText();
                    String sorgu = "Select * From ogretmen where AdSoyad like '"+gelenArama+"%' or Tc  like '"+gelenArama+"%'";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();

                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        data[i] = new Object[]{
                            rs.getString("id"),
                            "Öğretmen",
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("Alani"),
                            rs.getString("Yas"),
                            rs.getString("SicilNo"),
                            rs.getString("Tel"),
                            rs.getString("ePosta"),
                            rs.getString("Adres"),
                            rs.getString("SaatlikUcret")
                        };
                        i++;
                    araTablo.setModel(new DefaultTableModel(data, baslik));
                    }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
        }
    public void PersonelTabloDoldur(){
        String baslik[] = new String[]{"id", "Kimlik", "Tc", "Ad Soyad", "Ünvan", "Yaş", "Sicil No", "Tel", "E-Posta", "Adres", "Maaş"}; 
        try{                        
                    DBBaglanti();
                    String gelenArama = ara_txt.getText();
                    String sorgu = "Select * From personel where AdSoyad like '"+gelenArama+"%' or Tc  like '"+gelenArama+"%'";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();

                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        data[i] = new Object[]{
                            rs.getString("id"),
                            "Personel",
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("Unvan"),
                            rs.getString("Yas"),
                            rs.getString("SicilNo"),
                            rs.getString("Tel"),
                            rs.getString("ePosta"),
                            rs.getString("Adres"),
                            rs.getString("Maas")
                        };
                        i++;
                    araTablo.setModel(new DefaultTableModel(data, baslik));
                    }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
        }
public void BilgiGuncelle(){
        try{
            int selectedRowIndex = araTablo.getSelectedRow();
            Object kimlik = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 1);
            if(kimlik.toString().equals("Öğrenci")){
                Object id = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 0);
                Object tc = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 3);
                Object adSoyad = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 4);
                Object yas = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 5);
                Object cinsiyet = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 6);
                Object tel = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 7);
                Object ePosta = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 8);
                Object adres = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 9);

                String sql = "update ogrenci set AdSoyad='"+adSoyad+"', Yas='"+yas+"', Cinsiyet='"+cinsiyet+"', Tc='"+tc+"', Tel='"+tel+"', ePosta='"+ePosta+"',  Adres='"+adres+"' where id='"+id+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Seçili Kaydın Bilgileri Güncellendi!");
            }
            if(kimlik.toString().equals("Öğretmen")){
                Object id = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 0);
                Object tc = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 2);
                Object adSoyad = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 3);
                Object alani = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 4);
                Object yas = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 5);
                Object sicilNo = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 6);
                Object tel = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 7);
                Object ePosta = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 8);
                Object adres = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 9);
                Object sUcret = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 10);

                String sql = "update ogretmen set AdSoyad='"+adSoyad+"', Alani='"+alani+"', Yas='"+yas+"', Tc='"+tc+"', SicilNo='"+sicilNo+"', Tel='"+tel+"', ePosta='"+ePosta+"',  Adres='"+adres+"', SaatlikUcret='"+sUcret+"' where id='"+id+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Seçili Kaydın Bilgileri Güncellendi!");
            }
            if(kimlik.toString().equals("Personel")){
                Object id = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 0);
                Object tc = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 2);
                Object adSoyad = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 3);
                Object unvan = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 4);
                Object yas = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 5);
                Object sicilNo = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 6);
                Object tel = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 7);
                Object ePosta = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 8);
                Object adres = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 9);
                Object maas = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 10);

                String sql = "update personel set AdSoyad='"+adSoyad+"', Unvan='"+unvan+"', Yas='"+yas+"', Tc='"+tc+"', SicilNo='"+sicilNo+"', Tel='"+tel+"', ePosta='"+ePosta+"',  Adres='"+adres+"', Maas='"+maas+"' where id='"+id+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Seçili Kaydın Bilgileri Güncellendi!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Seçiniz!");
        }
    }
private void MudurGelirListele(){
            try{
            preparedStatement = baglanti.prepareStatement("Select * From kurslar");
            resultSet = preparedStatement.executeQuery();

            mudur_kurs_listele.removeAllItems();
            mudur_kurs_listele.addItem("Kurs Seçiniz");
            while(resultSet.next()){
                String kullaniciAdiGelen = resultSet.getString("KursAdi");
                mudur_kurs_listele.addItem(kullaniciAdiGelen);
            }
            }catch(Exception e){

            }
        }
public void Mudur_gelirKurs(){
            try{
                if(!mudur_kurs_listele.getSelectedItem().toString().equals("Kurs Seçiniz")){
                    preparedStatement = baglanti.prepareStatement("Select * From kurslar where KursAdi = '"+mudur_kurs_listele.getSelectedItem().toString()+"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        Kursun_Adi.setText(resultSet.getString("KursAdi"));
                        Kursun_Baslama_Tarihi.setText(resultSet.getString("BaslamaTarihi"));
                        Kursun_Suresi.setText(resultSet.getString("Sure"));
                        Kursun_Fiyati.setText(resultSet.getString("Fiyat"));
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Kurs Seçiniz!");
                }
            }catch(Exception e){}
        }
public void  KurslariListelemeGelirGider(){
        String baslik[] = new String[]{"Tc", "Ad Soyad", "Ödemeye Başlama Tarihi", "TaksitTarih", "Ödenen Taksit", "Taksit Sayısı","Ödeme Durumu", "Fiyat", "Ödenecek Fiyat", "Durum"}; 
        try{
            if(!Kursun_Adi.getText().equals("-"))
            {
                    DBBaglanti();
                    String sorgu = "Select * From muhasebe where KursAdi='"+Kursun_Adi.getText()+"'";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();
                    
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    Integer fiyatt =  0;
                    Integer aylik=0;
                    while(rs.next()){
                        if(rs.getString("OdemeSekli").equals("Nakit")){
                            fiyatt += Integer.parseInt(rs.getString("OdenecekFiyat").toString());
                        }
                         if(rs.getString("OdemeSekli").equals("Kredi Karti")){
                             if(!rs.getString("Taksit").equals(rs.getString("OdenenTaksit")))
                                aylik= Integer.parseInt(rs.getString("Fiyat").toString())/Integer.parseInt(rs.getString("Taksit").toString());
                                fiyatt += aylik;
                        }
                        data[i] = new Object[]{
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("Tarih"),
                            rs.getString("TaksitTarih"),
                            rs.getString("Taksit"),
                            rs.getString("OdenenTaksit"),
                            rs.getString("OdemeSekli"),
                            rs.getString("Fiyat"),
                            rs.getString("OdenecekFiyat"),
                            rs.getString("Durum")
                        };
                        i++;
                        ToplamGelirler.setText(fiyatt.toString()+" TL");
                    }
                    GelirGiderTabloGoster.setModel(new DefaultTableModel(data, baslik));
                }else{
                    JOptionPane.showMessageDialog(null,"Kurs Seçiniz!");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
     }
public void  ogrenciGelirGider(){
        String baslik[] = new String[]{"Tc", "Ad Soyad", "Ödemeye Başlama Tarihi", "TaksitTarih", "Ödenen Taksit", "Taksit Sayısı","Ödeme Durumu", "Fiyat", "Ödenecek Fiyat", "Durum"}; 
        try{
                    DBBaglanti();
                    String sorgu = "Select * From muhasebe";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();
                    
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    Integer fiyatt =  0;
                    Integer aylik=0;
                    while(rs.next()){
                        if(rs.getString("OdemeSekli").equals("Nakit")){
                            fiyatt += Integer.parseInt(rs.getString("OdenecekFiyat").toString());
                        }
                         if(rs.getString("OdemeSekli").equals("Kredi Karti")){
                             if(!rs.getString("Taksit").equals(rs.getString("OdenenTaksit")))
                                aylik= Integer.parseInt(rs.getString("Fiyat").toString())/Integer.parseInt(rs.getString("Taksit").toString());
                                fiyatt += aylik;
                        }
                        data[i] = new Object[]{
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("Tarih"),
                            rs.getString("TaksitTarih"),
                            rs.getString("Taksit"),
                            rs.getString("OdenenTaksit"),
                            rs.getString("OdemeSekli"),
                            rs.getString("Fiyat"),
                            rs.getString("OdenecekFiyat"),
                            rs.getString("Durum")
                        };
                        i++;
                        ToplamGelirler.setText(fiyatt.toString()+" TL");
                    }
                    GelirGiderTabloGoster.setModel(new DefaultTableModel(data, baslik));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
     }
public void  ogretmenGelirGider(){
        String baslik[] = new String[]{"Tc", "Ad Soyad", "Ödeme Tarihi", "Saatlik Ücret", "Ders Saati", "Maaş", "Durum"}; 
        try{
                    DBBaglanti();
                    String sorgu = "Select * From muhasebeogretmen";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();
                    
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    Integer fiyatt =  0;
                    Integer aylik=0;
                    while(rs.next()){
                        aylik= Integer.parseInt(rs.getString("Fiyat").toString());
                        fiyatt += aylik;
                        
                        data[i] = new Object[]{
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("odemeTarihi"),
                            rs.getString("SaatlikUcret"),
                            rs.getString("DersSaati"),
                            rs.getString("Fiyat"),
                            rs.getString("Durum")
                        };
                        i++;
                        ToplamGelirler.setText(fiyatt.toString()+" TL");
                    }
                    GelirGiderTabloGoster.setModel(new DefaultTableModel(data, baslik));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
     }
public void  personelGelirGider(){
        String baslik[] = new String[]{"Tc", "Ad Soyad", "Ödeme Tarihi", "Maaş", "Durum"}; 
        try{
                    DBBaglanti();
                    String sorgu = "Select * From muhasebepersonel";

                    st = con.createStatement();
                    rs = st.executeQuery(sorgu);

                    rs.last();
                    int kayitSayisi = rs.getRow();
                    rs.beforeFirst();
                    
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    Integer fiyatt =  0;
                    Integer aylik=0;
                    while(rs.next()){
                        aylik= Integer.parseInt(rs.getString("Maas").toString());
                        fiyatt += aylik;
                        
                        data[i] = new Object[]{
                            rs.getString("Tc"),
                            rs.getString("AdSoyad"),
                            rs.getString("odemeTarih"),
                            rs.getString("Maas"),
                            rs.getString("Durum")
                        };
                        i++;
                        ToplamGelirler.setText(fiyatt.toString()+" TL");
                    }
                    GelirGiderTabloGoster.setModel(new DefaultTableModel(data, baslik));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Işlem yapılamadı");
            }
     }
}
