package kutuphaneyonetimsistemi;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Personel extends javax.swing.JFrame {
    public void DBBaglanti() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane_yonetim?useUnicode=true&characterEncoding=latin5","root",""); // veritabanına bağlatı kodu
    }
    public Personel() {
        initComponents();
    }
    private SqlServerBaglantisi TR;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        Ders = new javax.swing.JTabbedPane();
        yoklama = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        yoklamaSecilenGelisOgrID = new javax.swing.JLabel();
        yoklamaSecilenGelisNumara = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Combo_yoklamaGirisSinif = new javax.swing.JComboBox();
        yoklamaGelisOgrAra_txt = new javax.swing.JTextField();
        yoklamaOgrAra_btn4 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        yoklamaGelisOgrAraTablo = new javax.swing.JTable();
        yoklamaOgrSec_Btn1 = new javax.swing.JButton();
        yoklamaSecilenGelisAdSoyad = new javax.swing.JLabel();
        yoklamaGelisSaat_txt = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        yoklamaGelisDakika_txt = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        yoklamaSecilenGelisSinif = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        yoklamaGelisTarih_txt = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Combo_Yoklama = new javax.swing.JComboBox();
        OgrCikisKaydi = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        yoklamaCikisKaydi_btn = new javax.swing.JButton();
        yoklamaSecilenCikisOgrID = new javax.swing.JLabel();
        yoklamaSecilenNumara = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        yoklamaGirisKayitlariniAra_btn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        yoklamaOgrCikisTablo = new javax.swing.JTable();
        yoklamaOgrSec_Btn = new javax.swing.JButton();
        yoklamaSecilenAdSoyad = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        yoklamaCikisSaat_txt = new javax.swing.JSpinner();
        yoklamaCikisDakika_txt = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        yoklamaSecilenSinif = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        yoklamaTarih_txt = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        yoklamaKonu_txt = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        yoklamaSoruSayisi_txt = new javax.swing.JSpinner();
        yoklamaGirilenKitap_txt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        yoklamaArananKitapTablo = new javax.swing.JTable();
        yoklamaArananKitap_txt = new javax.swing.JTextField();
        yoklamaKitapAra_btn = new javax.swing.JButton();
        yoklamaKitapSecEkle_btn = new javax.swing.JButton();
        yoklamaKitapGirisEkle_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yoklamaOkunanKitap_list = new javax.swing.JList();
        yoklamaGelisSaati_txt = new javax.swing.JLabel();
        yoklamaCikis_tarihi = new com.toedter.calendar.JDateChooser();
        yoklamaCikisKaydi_btn1 = new javax.swing.JButton();
        yoklamaCikisKaydi_btn2 = new javax.swing.JButton();
        YoklamaSorgula = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        yoklamaSorgula_Tablo = new javax.swing.JTable();
        yoklamaSorgulaBaslangic_tarihi = new com.toedter.calendar.JDateChooser();
        yoklamaTumOgrenciSorgula_btn = new javax.swing.JButton();
        yoklamaSorgulaBitis_tarihi = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        yoklamaArananOgr_txt = new javax.swing.JTextField();
        yoklamaSeciliOgrenciyiSorgula_btn = new javax.swing.JButton();
        yoklamaOgrAra_btn = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        yoklamaArananOgrTablo = new javax.swing.JTable();
        yoklamaOgrAra_btn1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        yoklamaOgrAdSoyad_txt = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        yoklamaOgrSinif_txt = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        yoklamaOgrNumara_txt = new javax.swing.JLabel();
        yoklamaOgrID_txt = new javax.swing.JLabel();
        yoklamaYazdir_btn = new javax.swing.JButton();
        OgrenciKaydi = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        Ogrc_adSoyad_txt = new javax.swing.JTextField();
        Ogrc_numara_txt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Ogrc_tel_txt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ogrc_adrs_txt = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        Combo_Siniflar = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        adUyari = new javax.swing.JLabel();
        numaraUyari = new javax.swing.JLabel();
        telUyari = new javax.swing.JLabel();
        adresUyari = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        sinifiUyari = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Ogrc_tc_txt = new javax.swing.JTextField();
        tcUyari = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Combo_OdemeSekli = new javax.swing.JComboBox();
        Combo_UcretDurumu = new javax.swing.JComboBox();
        tcUyari1 = new javax.swing.JLabel();
        tcUyari2 = new javax.swing.JLabel();
        tcUyari3 = new javax.swing.JLabel();
        Ucret_Spinner = new javax.swing.JSpinner();
        tcUyari4 = new javax.swing.JLabel();
        OgrenciSorgula = new javax.swing.JPanel();
        ara_txt = new javax.swing.JTextField();
        Combo_Sinif_Sorgula = new javax.swing.JComboBox();
        ara_btn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        araTablo = new javax.swing.JTable();
        bilgiBuncelle_btn = new javax.swing.JButton();
        ogrSil_btn = new javax.swing.JButton();
        ogrYazdir_btn = new javax.swing.JButton();
        OgrenciKaydi1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        yeniKitapAdi_txt = new javax.swing.JTextField();
        yeniKitapYazarAdi_txt = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yeniKitapKaydet_btn = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        yeniKitapNumara_Spinner = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        kitaplarAra_TXT = new javax.swing.JTextField();
        kitaplarSorgula_btn = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        kitaplarGuncelle_Tablo = new javax.swing.JTable();
        kitapSil_btn = new javax.swing.JButton();
        kitapGuncelle_btn = new javax.swing.JButton();
        kitapVerOgrAra_btn = new javax.swing.JTextField();
        yoklamaOgrAra_btn5 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        kitapVerOgrTablo = new javax.swing.JTable();
        yoklamaOgrAra_btn6 = new javax.swing.JButton();
        kitapTeslimAl_btn = new javax.swing.JButton();
        ogrKitapSorgula_btn = new javax.swing.JButton();
        kitapVerisTarihi = new com.toedter.calendar.JDateChooser();
        kitapYazdir_btn = new javax.swing.JButton();
        Sinif_Islemleri = new javax.swing.JPanel();
        sinifID = new javax.swing.JLabel();
        sinifDuzenleId = new javax.swing.JLabel();
        Combo_Sinif_Guncelle = new javax.swing.JComboBox();
        sinifGuncelleSec_btn = new javax.swing.JButton();
        sinifGuncelle_txt = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        sinifGuncelle_btn = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        sinifAdi_txt = new javax.swing.JTextField();
        sinifEkle_btn = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        sinifSil_btn = new javax.swing.JButton();
        Combo_Sinif_Sil = new javax.swing.JComboBox();
        Kullanici_Bilgileri = new javax.swing.JPanel();
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
        jLabel99 = new javax.swing.JLabel();
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

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/sekreterdos.png"))); // NOI18N
        jPanel9.add(jLabel95);
        jLabel95.setBounds(1020, 10, 120, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/yaziKoyu.png"))); // NOI18N
        jPanel9.add(jLabel1);
        jLabel1.setBounds(200, 20, 320, 90);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/amblem.png"))); // NOI18N
        jLabel55.setText(" ");
        jPanel9.add(jLabel55);
        jLabel55.setBounds(60, 20, 127, 90);
        jLabel55.getAccessibleContext().setAccessibleName("LOGO");

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/KapatT.png"))); // NOI18N
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel100);
        jLabel100.setBounds(1160, 50, 150, 40);

        Ders.setBackground(new java.awt.Color(255, 255, 255));

        yoklama.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Adı Soyadı:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Numara:");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("KAYDET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        yoklamaSecilenGelisOgrID.setText("-");

        yoklamaSecilenGelisNumara.setText("-");
        yoklamaSecilenGelisNumara.setToolTipText("");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kart.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Giriş Saati");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel44.setName(""); // NOI18N

        Combo_yoklamaGirisSinif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Combo_yoklamaGirisSinif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sınıf Seçiniz", "Sınıf 1", "Sınıf 2", "Sınıf 3", "Sınıf 4", "Sınıf 5", "Sınıf 6", "Sınıf 7", "Sınıf 8", "Sınıf 9", "Sınıf 10" }));
        Combo_yoklamaGirisSinif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_yoklamaGirisSinifActionPerformed(evt);
            }
        });

        yoklamaGelisOgrAra_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaGelisOgrAra_txtActionPerformed(evt);
            }
        });

        yoklamaOgrAra_btn4.setText("Öğrenci Sorgula");
        yoklamaOgrAra_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrAra_btn4ActionPerformed(evt);
            }
        });

        yoklamaGelisOgrAraTablo.setBackground(new java.awt.Color(217, 217, 217));
        yoklamaGelisOgrAraTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoklamaGelisOgrAraTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        yoklamaGelisOgrAraTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaGelisOgrAraTablo.setRowHeight(22);
        yoklamaGelisOgrAraTablo.setShowVerticalLines(false);
        jScrollPane10.setViewportView(yoklamaGelisOgrAraTablo);

        yoklamaOgrSec_Btn1.setText("Öğrenci Seç");
        yoklamaOgrSec_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrSec_Btn1ActionPerformed(evt);
            }
        });

        yoklamaSecilenGelisAdSoyad.setText("-");

        yoklamaGelisSaat_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        yoklamaGelisDakika_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Sınıf:");

        yoklamaSecilenGelisSinif.setText("-");
        yoklamaSecilenGelisSinif.setToolTipText("");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Tarih");
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel47.setName(""); // NOI18N

        yoklamaGelisTarih_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yoklamaGelisTarih_txt.setText("-");
        yoklamaGelisTarih_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaGelisTarih_txt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yoklamaGelisTarih_txt.setName(""); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Yoklama");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel52.setName(""); // NOI18N

        Combo_Yoklama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geldi", "Gelmedi" }));

        javax.swing.GroupLayout yoklamaLayout = new javax.swing.GroupLayout(yoklama);
        yoklama.setLayout(yoklamaLayout);
        yoklamaLayout.setHorizontalGroup(
            yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yoklamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yoklamaLayout.createSequentialGroup()
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(yoklamaLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaSecilenGelisAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaSecilenGelisSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaSecilenGelisNumara, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(yoklamaLayout.createSequentialGroup()
                                .addComponent(Combo_yoklamaGirisSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaGelisOgrAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaOgrAra_btn4)
                                .addGap(5, 5, 5)
                                .addComponent(yoklamaSecilenGelisOgrID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(yoklamaLayout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaOgrSec_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(yoklamaLayout.createSequentialGroup()
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(yoklamaLayout.createSequentialGroup()
                                .addComponent(yoklamaGelisSaat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaGelisDakika_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(yoklamaGelisTarih_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_Yoklama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        yoklamaLayout.setVerticalGroup(
            yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yoklamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yoklamaLayout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 456, Short.MAX_VALUE))
                    .addGroup(yoklamaLayout.createSequentialGroup()
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoklamaOgrAra_btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Combo_yoklamaGirisSinif)
                                .addComponent(yoklamaGelisOgrAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yoklamaSecilenGelisOgrID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoklamaOgrSec_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(yoklamaSecilenGelisAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaSecilenGelisSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaSecilenGelisNumara, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(yoklamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoklamaGelisDakika_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(yoklamaGelisSaat_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(Combo_Yoklama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yoklamaGelisTarih_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(239, 239, 239))))
        );

        Ders.addTab("Öğrenci Giriş Kaydı", yoklama);

        OgrCikisKaydi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Adı Soyadı:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Numara:");

        yoklamaCikisKaydi_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yoklamaCikisKaydi_btn.setText("Kaydet");
        yoklamaCikisKaydi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaCikisKaydi_btnActionPerformed(evt);
            }
        });

        yoklamaSecilenCikisOgrID.setText("-");

        yoklamaSecilenNumara.setText("-");
        yoklamaSecilenNumara.setToolTipText("");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Giriş Saati");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setName(""); // NOI18N

        yoklamaGirisKayitlariniAra_btn.setText("Sorgula");
        yoklamaGirisKayitlariniAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaGirisKayitlariniAra_btnActionPerformed(evt);
            }
        });

        yoklamaOgrCikisTablo.setBackground(new java.awt.Color(217, 217, 217));
        yoklamaOgrCikisTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoklamaOgrCikisTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        yoklamaOgrCikisTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaOgrCikisTablo.setRowHeight(22);
        yoklamaOgrCikisTablo.setShowVerticalLines(false);
        jScrollPane8.setViewportView(yoklamaOgrCikisTablo);

        yoklamaOgrSec_Btn.setText("Öğrenci Seç");
        yoklamaOgrSec_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrSec_BtnActionPerformed(evt);
            }
        });

        yoklamaSecilenAdSoyad.setText("-");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Çıkış Saati");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setName(""); // NOI18N

        yoklamaCikisSaat_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        yoklamaCikisDakika_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Sınıf:");

        yoklamaSecilenSinif.setText("-");
        yoklamaSecilenSinif.setToolTipText("");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Tarih");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setName(""); // NOI18N

        yoklamaTarih_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yoklamaTarih_txt.setText("-");
        yoklamaTarih_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaTarih_txt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yoklamaTarih_txt.setName(""); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Çalıştığı Konu:");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setName(""); // NOI18N

        yoklamaKonu_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaKonu_txtActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Soru Sayısı:");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setName(""); // NOI18N

        yoklamaSoruSayisi_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        yoklamaGirilenKitap_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaGirilenKitap_txtActionPerformed(evt);
            }
        });

        yoklamaArananKitapTablo.setBackground(new java.awt.Color(217, 217, 217));
        yoklamaArananKitapTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoklamaArananKitapTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        yoklamaArananKitapTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaArananKitapTablo.setRowHeight(17);
        yoklamaArananKitapTablo.setShowVerticalLines(false);
        jScrollPane9.setViewportView(yoklamaArananKitapTablo);

        yoklamaArananKitap_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaArananKitap_txtActionPerformed(evt);
            }
        });

        yoklamaKitapAra_btn.setText("Kitap Ara");
        yoklamaKitapAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaKitapAra_btnActionPerformed(evt);
            }
        });

        yoklamaKitapSecEkle_btn.setText("Listeye Ekle");
        yoklamaKitapSecEkle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaKitapSecEkle_btnActionPerformed(evt);
            }
        });

        yoklamaKitapGirisEkle_btn.setText("Listeye Ekle");
        yoklamaKitapGirisEkle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaKitapGirisEkle_btnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(yoklamaOkunanKitap_list);

        yoklamaGelisSaati_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yoklamaGelisSaati_txt.setText("-");
        yoklamaGelisSaati_txt.setOpaque(true);

        yoklamaCikis_tarihi.setDateFormatString("yyyy.MM.dd");

        yoklamaCikisKaydi_btn1.setText("Seçimi Çıkart");
        yoklamaCikisKaydi_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaCikisKaydi_btn1ActionPerformed(evt);
            }
        });

        yoklamaCikisKaydi_btn2.setText("Temizle");
        yoklamaCikisKaydi_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaCikisKaydi_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OgrCikisKaydiLayout = new javax.swing.GroupLayout(OgrCikisKaydi);
        OgrCikisKaydi.setLayout(OgrCikisKaydiLayout);
        OgrCikisKaydiLayout.setHorizontalGroup(
            OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                        .addComponent(yoklamaCikis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yoklamaGirisKayitlariniAra_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yoklamaSecilenAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yoklamaSecilenSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yoklamaSecilenNumara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yoklamaSecilenCikisOgrID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrCikisKaydiLayout.createSequentialGroup()
                                .addComponent(yoklamaGelisSaati_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                .addComponent(yoklamaCikisSaat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaCikisDakika_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(yoklamaTarih_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrCikisKaydiLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                .addComponent(yoklamaOgrSec_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrCikisKaydiLayout.createSequentialGroup()
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yoklamaSoruSayisi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(yoklamaKonu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(yoklamaGirilenKitap_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(yoklamaArananKitap_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yoklamaKitapSecEkle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yoklamaKitapAra_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yoklamaKitapGirisEkle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yoklamaCikisKaydi_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yoklamaCikisKaydi_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(yoklamaCikisKaydi_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(16, 16, 16))))))
        );
        OgrCikisKaydiLayout.setVerticalGroup(
            OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yoklamaGelisSaati_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaCikisSaat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaCikisDakika_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaTarih_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoklamaCikis_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yoklamaSecilenSinif, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yoklamaSecilenNumara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yoklamaSecilenCikisOgrID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yoklamaSecilenAdSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yoklamaGirisKayitlariniAra_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                .addComponent(yoklamaOgrSec_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yoklamaKonu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yoklamaSoruSayisi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yoklamaKitapAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yoklamaArananKitap_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yoklamaKitapSecEkle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yoklamaGirilenKitap_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yoklamaKitapGirisEkle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(OgrCikisKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(OgrCikisKaydiLayout.createSequentialGroup()
                                        .addComponent(yoklamaCikisKaydi_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yoklamaCikisKaydi_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yoklamaCikisKaydi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        Ders.addTab("Öğrenci Çıkış Kaydı", OgrCikisKaydi);

        YoklamaSorgula.setBackground(new java.awt.Color(255, 255, 255));

        yoklamaSorgula_Tablo.setBackground(new java.awt.Color(204, 204, 204));
        yoklamaSorgula_Tablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoklamaSorgula_Tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        yoklamaSorgula_Tablo.setShowVerticalLines(false);
        jScrollPane4.setViewportView(yoklamaSorgula_Tablo);

        yoklamaSorgulaBaslangic_tarihi.setDateFormatString("yyyy.MM.dd");

        yoklamaTumOgrenciSorgula_btn.setText("Tüm Öğrencileri Sorgula");
        yoklamaTumOgrenciSorgula_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaTumOgrenciSorgula_btnActionPerformed(evt);
            }
        });

        yoklamaSorgulaBitis_tarihi.setDateFormatString("yyyy.MM.dd");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("-");

        yoklamaArananOgr_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaArananOgr_txtActionPerformed(evt);
            }
        });

        yoklamaSeciliOgrenciyiSorgula_btn.setText("Seçili Öğrenciyi Sorgula");
        yoklamaSeciliOgrenciyiSorgula_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaSeciliOgrenciyiSorgula_btnActionPerformed(evt);
            }
        });

        yoklamaOgrAra_btn.setText("Öğrenci Sorgula");
        yoklamaOgrAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrAra_btnActionPerformed(evt);
            }
        });

        yoklamaArananOgrTablo.setBackground(new java.awt.Color(217, 217, 217));
        yoklamaArananOgrTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoklamaArananOgrTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        yoklamaArananOgrTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yoklamaArananOgrTablo.setRowHeight(19);
        yoklamaArananOgrTablo.setShowVerticalLines(false);
        jScrollPane13.setViewportView(yoklamaArananOgrTablo);

        yoklamaOgrAra_btn1.setText("Öğrenciyi Seç");
        yoklamaOgrAra_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrAra_btn1ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Adı Soyadı:");

        yoklamaOgrAdSoyad_txt.setText("-");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Sınıf:");

        yoklamaOgrSinif_txt.setText("-");
        yoklamaOgrSinif_txt.setToolTipText("");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Numara:");

        yoklamaOgrNumara_txt.setText("-");
        yoklamaOgrNumara_txt.setToolTipText("");

        yoklamaOgrID_txt.setText("-");

        yoklamaYazdir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/printer.png"))); // NOI18N
        yoklamaYazdir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaYazdir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout YoklamaSorgulaLayout = new javax.swing.GroupLayout(YoklamaSorgula);
        YoklamaSorgula.setLayout(YoklamaSorgulaLayout);
        YoklamaSorgulaLayout.setHorizontalGroup(
            YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                                .addComponent(yoklamaOgrAdSoyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yoklamaOgrID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(yoklamaOgrSinif_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yoklamaOgrAra_btn1))
                                    .addComponent(yoklamaOgrNumara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addComponent(yoklamaSorgulaBaslangic_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaSorgulaBitis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaTumOgrenciSorgula_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaSeciliOgrenciyiSorgula_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaYazdir_btn)
                                .addGap(0, 99, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoklamaOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaArananOgr_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        YoklamaSorgulaLayout.setVerticalGroup(
            YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoklamaOgrAdSoyad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoklamaOgrID_txt)
                            .addComponent(yoklamaOgrAra_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yoklamaOgrSinif_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(yoklamaOgrNumara_txt))
                        .addGap(18, 18, 18)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yoklamaSorgulaBitis_tarihi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(yoklamaTumOgrenciSorgula_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yoklamaSeciliOgrenciyiSorgula_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yoklamaYazdir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(yoklamaSorgulaBaslangic_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addComponent(yoklamaArananOgr_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(yoklamaOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Ders.addTab("Yoklama Sorgula", YoklamaSorgula);

        OgrenciKaydi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Adı Soyadı:");

        Ogrc_adSoyad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrc_adSoyad_txtActionPerformed(evt);
            }
        });

        Ogrc_numara_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrc_numara_txtActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Numara:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Telefon No:");

        Ogrc_adrs_txt.setColumns(20);
        Ogrc_adrs_txt.setLineWrap(true);
        Ogrc_adrs_txt.setRows(5);
        Ogrc_adrs_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        jLabel5.setText("Sınıfı:");
        jLabel5.setToolTipText("");

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adUyari.setText("*");

        numaraUyari.setText("*");

        telUyari.setText("*");

        adresUyari.setText("*");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kart.png"))); // NOI18N

        sinifiUyari.setText("*");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("TC Kimlik No:");

        Ogrc_tc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrc_tc_txtActionPerformed(evt);
            }
        });

        tcUyari.setText("*");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("ÖĞRENCİ KAYIT EKRANI");

        Combo_OdemeSekli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ücretsiz", "Nakit", "Kredi Kartına Tek Çekim", "2 Taksit", "3 Taksit", "4 Taksit", "5 Taksit", "6 Taksit", "7 Taksit", "8 Taksit", "9 Taksit", "10 Taksit", "11 Taksit", "12 Taksit", "13 Taksit", "14 Taksit", "15 Taksit", "16 Taksit", "17 Taksit", "18 Taksit", "19 Taksit", "20 Taksit", "21 Taksit", "22 Taksit", "23 Taksit", "24 Taksit" }));

        Combo_UcretDurumu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ücretsiz", "Ücretli" }));

        tcUyari1.setText("Ödeme Şekli");

        tcUyari2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari2.setText("Ücret:");

        tcUyari3.setText("Kayıt Tipi");

        Ucret_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tcUyari4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari4.setText("TL");

        javax.swing.GroupLayout OgrenciKaydiLayout = new javax.swing.GroupLayout(OgrenciKaydi);
        OgrenciKaydi.setLayout(OgrenciKaydiLayout);
        OgrenciKaydiLayout.setHorizontalGroup(
            OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                        .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Combo_Siniflar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ogrc_adSoyad_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sinifiUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addComponent(Ogrc_numara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numaraUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addComponent(Ogrc_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addComponent(Ogrc_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel49))
                .addGap(38, 38, 38)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                        .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Combo_UcretDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcUyari3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcUyari2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcUyari1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combo_OdemeSekli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addComponent(Ucret_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcUyari4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresUyari)
                .addGap(206, 206, 206)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        OgrenciKaydiLayout.setVerticalGroup(
            OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel49)
                        .addGap(36, 36, 36)
                        .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Ogrc_adSoyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Combo_Siniflar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinifiUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ogrc_numara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numaraUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ogrc_tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ogrc_tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel29)
                            .addGroup(OgrenciKaydiLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tcUyari1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcUyari3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Combo_UcretDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Combo_OdemeSekli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(OgrenciKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Ucret_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tcUyari4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tcUyari2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(adresUyari))))
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Ders.addTab("Yeni Öğrenci", OgrenciKaydi);

        OgrenciSorgula.setBackground(new java.awt.Color(255, 255, 255));

        ara_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_txtActionPerformed(evt);
            }
        });

        Combo_Sinif_Sorgula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Combo_Sinif_Sorgula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sınıf Seçiniz", "Sınıf 1", "Sınıf 2", "Sınıf 3", "Sınıf 4", "Sınıf 5", "Sınıf 6", "Sınıf 7", "Sınıf 8", "Sınıf 9", "Sınıf 10" }));
        Combo_Sinif_Sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_Sinif_SorgulaActionPerformed(evt);
            }
        });

        ara_btn.setText("Sorgula");
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
        araTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        araTablo.setName(""); // NOI18N
        araTablo.setRowHeight(40);
        araTablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        araTablo.setShowVerticalLines(false);
        jScrollPane6.setViewportView(araTablo);

        bilgiBuncelle_btn.setText("Bilgileri Güncelle");
        bilgiBuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgiBuncelle_btnActionPerformed(evt);
            }
        });

        ogrSil_btn.setText("Öğrenci Sil");
        ogrSil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrSil_btnActionPerformed(evt);
            }
        });

        ogrYazdir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/printer.png"))); // NOI18N
        ogrYazdir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrYazdir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OgrenciSorgulaLayout = new javax.swing.GroupLayout(OgrenciSorgula);
        OgrenciSorgula.setLayout(OgrenciSorgulaLayout);
        OgrenciSorgulaLayout.setHorizontalGroup(
            OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addGroup(OgrenciSorgulaLayout.createSequentialGroup()
                        .addComponent(Combo_Sinif_Sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ogrYazdir_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrSil_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bilgiBuncelle_btn)))
                .addContainerGap())
        );
        OgrenciSorgulaLayout.setVerticalGroup(
            OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrenciSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrenciSorgulaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Combo_Sinif_Sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ara_txt)
                    .addComponent(ara_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OgrenciSorgulaLayout.createSequentialGroup()
                        .addGroup(OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ogrYazdir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrSil_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bilgiBuncelle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        Ders.addTab("Öğrenci Sorgula", OgrenciSorgula);

        OgrenciKaydi1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Kitap Adı:");

        yeniKitapAdi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKitapAdi_txtActionPerformed(evt);
            }
        });

        yeniKitapYazarAdi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKitapYazarAdi_txtActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Numara:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Yazarı:");
        jLabel6.setToolTipText("");

        yeniKitapKaydet_btn.setText("Kaydet");
        yeniKitapKaydet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKitapKaydet_btnActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setText("YENİ KİTAP KAYDI");

        yeniKitapNumara_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Kitap Güncelle");

        kitaplarAra_TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitaplarAra_TXTActionPerformed(evt);
            }
        });

        kitaplarSorgula_btn.setText("Kitap Sorgula");
        kitaplarSorgula_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitaplarSorgula_btnActionPerformed(evt);
            }
        });

        kitaplarGuncelle_Tablo.setBackground(new java.awt.Color(217, 217, 217));
        kitaplarGuncelle_Tablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kitaplarGuncelle_Tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        kitaplarGuncelle_Tablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kitaplarGuncelle_Tablo.setName(""); // NOI18N
        kitaplarGuncelle_Tablo.setRowHeight(40);
        kitaplarGuncelle_Tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kitaplarGuncelle_Tablo.setShowVerticalLines(false);
        jScrollPane11.setViewportView(kitaplarGuncelle_Tablo);

        kitapSil_btn.setText("Kitap Sil");
        kitapSil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapSil_btnActionPerformed(evt);
            }
        });

        kitapGuncelle_btn.setText("Kitap Güncelle");
        kitapGuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapGuncelle_btnActionPerformed(evt);
            }
        });

        kitapVerOgrAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapVerOgrAra_btnActionPerformed(evt);
            }
        });

        yoklamaOgrAra_btn5.setText("Öğrenci Sorgula");
        yoklamaOgrAra_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrAra_btn5ActionPerformed(evt);
            }
        });

        kitapVerOgrTablo.setBackground(new java.awt.Color(217, 217, 217));
        kitapVerOgrTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kitapVerOgrTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        kitapVerOgrTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kitapVerOgrTablo.setRowHeight(17);
        kitapVerOgrTablo.setShowVerticalLines(false);
        jScrollPane12.setViewportView(kitapVerOgrTablo);

        yoklamaOgrAra_btn6.setText("Kitap Ver");
        yoklamaOgrAra_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaOgrAra_btn6ActionPerformed(evt);
            }
        });

        kitapTeslimAl_btn.setText("Kitabı Teslim Al");
        kitapTeslimAl_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapTeslimAl_btnActionPerformed(evt);
            }
        });

        ogrKitapSorgula_btn.setText("Kitap Sorgula");
        ogrKitapSorgula_btn.setToolTipText("");
        ogrKitapSorgula_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrKitapSorgula_btnActionPerformed(evt);
            }
        });

        kitapVerisTarihi.setDateFormatString("yyyy.MM.dd");

        kitapYazdir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/printer.png"))); // NOI18N
        kitapYazdir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapYazdir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OgrenciKaydi1Layout = new javax.swing.GroupLayout(OgrenciKaydi1);
        OgrenciKaydi1.setLayout(OgrenciKaydi1Layout);
        OgrenciKaydi1Layout.setHorizontalGroup(
            OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel45))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yeniKitapNumara_Spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(yeniKitapAdi_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(yeniKitapYazarAdi_txt)
                                    .addComponent(yeniKitapKaydet_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel53))
                        .addGap(62, 62, 62))
                    .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kitapVerOgrAra_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yoklamaOgrAra_btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoklamaOgrAra_btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ogrKitapSorgula_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kitapVerisTarihi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                        .addComponent(kitaplarAra_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitaplarSorgula_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(kitapYazdir_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitapSil_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitapTeslimAl_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitapGuncelle_btn)))
                .addContainerGap())
        );
        OgrenciKaydi1Layout.setVerticalGroup(
            OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yeniKitapAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitaplarAra_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitaplarSorgula_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapGuncelle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapTeslimAl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(kitapYazdir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniKitapYazarAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniKitapNumara_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yeniKitapKaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yoklamaOgrAra_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapVerOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(OgrenciKaydi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OgrenciKaydi1Layout.createSequentialGroup()
                                .addComponent(kitapVerisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yoklamaOgrAra_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ogrKitapSorgula_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        Ders.addTab("Kitap İşlemleri", OgrenciKaydi1);

        Sinif_Islemleri.setBackground(new java.awt.Color(255, 255, 255));

        sinifID.setText("-");

        sinifDuzenleId.setText("-");

        Combo_Sinif_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_Sinif_GuncelleActionPerformed(evt);
            }
        });

        sinifGuncelleSec_btn.setText("Seç");
        sinifGuncelleSec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifGuncelleSec_btnActionPerformed(evt);
            }
        });

        sinifGuncelle_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Sınıf Adı:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("SINIF GÜNCELLE");

        sinifGuncelle_btn.setText("Güncelle");
        sinifGuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifGuncelle_btnActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setText("YENİ SINIF EKLE");

        sinifAdi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifAdi_txtActionPerformed(evt);
            }
        });

        sinifEkle_btn.setText("Ekle");
        sinifEkle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifEkle_btnActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel67.setText("SINIF SİL");

        sinifSil_btn.setText("Sil");
        sinifSil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinifSil_btnActionPerformed(evt);
            }
        });

        Combo_Sinif_Sil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sınıf Seçiniz" }));
        Combo_Sinif_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_Sinif_SilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sinif_IslemleriLayout = new javax.swing.GroupLayout(Sinif_Islemleri);
        Sinif_Islemleri.setLayout(Sinif_IslemleriLayout);
        Sinif_IslemleriLayout.setHorizontalGroup(
            Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sinifID)
                .addGap(119, 119, 119))
            .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sinifGuncelleSec_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Combo_Sinif_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sinifGuncelle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addGap(106, 106, 106))
                                .addComponent(sinifGuncelle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136)
                        .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                                .addComponent(Combo_Sinif_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sinifSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                                .addComponent(sinifAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sinifEkle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel65)
                            .addComponent(jLabel67)))
                    .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(sinifDuzenleId)))
                .addContainerGap(661, Short.MAX_VALUE))
        );
        Sinif_IslemleriLayout.setVerticalGroup(
            Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel65))
                .addGap(18, 18, 18)
                .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_Sinif_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinifAdi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinifEkle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sinif_IslemleriLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(sinifID)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sinifGuncelleSec_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinifGuncelle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinifGuncelle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(Sinif_IslemleriLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Sinif_IslemleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_Sinif_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinifSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sinifDuzenleId)
                        .addGap(130, 130, 130))))
        );

        Ders.addTab("Sınıf İşlemleri", Sinif_Islemleri);

        Kullanici_Bilgileri.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel59.setText("GİRİŞ BİLGİLERİ GÜNCELLE");

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

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kullanıcılar.png"))); // NOI18N

        javax.swing.GroupLayout Kullanici_BilgileriLayout = new javax.swing.GroupLayout(Kullanici_Bilgileri);
        Kullanici_Bilgileri.setLayout(Kullanici_BilgileriLayout);
        Kullanici_BilgileriLayout.setHorizontalGroup(
            Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Kullanici_BilgileriLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel60)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel59)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Kullanici_BilgileriLayout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(sifreUyari1)
                    .addComponent(sifreUyari2)
                    .addComponent(txt_unvan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        Kullanici_BilgileriLayout.setVerticalGroup(
            Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Kullanici_BilgileriLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel59)
                        .addGap(28, 28, 28)
                        .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_kadi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addGap(12, 12, 12)
                        .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreUyari1))
                        .addGap(42, 42, 42)
                        .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(sifreUyari2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yeniSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Kullanici_BilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(txt_unvan))))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        Ders.addTab("Kullanıcı Bilgileri", Kullanici_Bilgileri);

        jPanel9.add(Ders);
        Ders.setBounds(60, 130, 1250, 510);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Connection con;
    private Statement st;
    private ResultSet rs;
    Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        baglanti = SqlServerBaglantisi.Baglan();
        ComboSinifListele();
        kullanicileriGetir();
        txt_unvan.setVisible(false);
        sinifID.setVisible(false);
        sinifDuzenleId.setVisible(false);
        yoklamaSecilenGelisOgrID.setVisible(false);
        yoklamaSecilenCikisOgrID.setVisible(false);
        yoklamaOgrID_txt.setVisible(false);
        bugununTarihiniGetir();
    }//GEN-LAST:event_formWindowOpened

    private void ComboBox_kadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_kadiActionPerformed
        txt_unvan.setText(ComboBox_kadi.getSelectedItem().toString());
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

    private void Combo_Sinif_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_Sinif_SilActionPerformed

        baglanti = SqlServerBaglantisi.Baglan();
        try{
            if(!Combo_Sinif_Sil.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                preparedStatement = baglanti.prepareStatement("Select * From siniflar where sinifAdi='"+Combo_Sinif_Sil.getSelectedItem().toString()+"'");
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    sinifID.setText(resultSet.getString("id"));
                }
            }else{
                sinifID.setText(resultSet.getString("-"));
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_Combo_Sinif_SilActionPerformed

    private void sinifSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifSil_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifSil();
        ComboSinifListele();
    }//GEN-LAST:event_sinifSil_btnActionPerformed

    private void sinifEkle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifEkle_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifEkle();
        ComboSinifListele();
    }//GEN-LAST:event_sinifEkle_btnActionPerformed

    private void sinifAdi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifAdi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinifAdi_txtActionPerformed

    private void sinifGuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifGuncelle_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifGuncelle();
        ComboSinifListele();
    }//GEN-LAST:event_sinifGuncelle_btnActionPerformed

    private void sinifGuncelleSec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinifGuncelleSec_btnActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sinifDuzenleSec();
    }//GEN-LAST:event_sinifGuncelleSec_btnActionPerformed

    private void Combo_Sinif_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_Sinif_GuncelleActionPerformed
        
    }//GEN-LAST:event_Combo_Sinif_GuncelleActionPerformed

    private void ara_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_btnActionPerformed
        OgrenciTabloDoldur();
    }//GEN-LAST:event_ara_btnActionPerformed

    private void ara_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_txtActionPerformed
        OgrenciTabloDoldur();
    }//GEN-LAST:event_ara_txtActionPerformed

    private void bilgiBuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgiBuncelle_btnActionPerformed
        ogrBilgiGuncelle();
        OgrenciTabloDoldur();
    }//GEN-LAST:event_bilgiBuncelle_btnActionPerformed

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        this.dispose();
        new giris().setVisible(true);
    }//GEN-LAST:event_jLabel100MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        ogrenciEkle();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Ogrc_numara_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrc_numara_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogrc_numara_txtActionPerformed

    private void Ogrc_adSoyad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrc_adSoyad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogrc_adSoyad_txtActionPerformed

    private void Combo_SiniflarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_SiniflarActionPerformed

    }//GEN-LAST:event_Combo_SiniflarActionPerformed

    private void Ogrc_tc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrc_tc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ogrc_tc_txtActionPerformed

    private void Combo_Sinif_SorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_Sinif_SorgulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_Sinif_SorgulaActionPerformed

    private void yoklamaKonu_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaKonu_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoklamaKonu_txtActionPerformed

    private void yoklamaOgrSec_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrSec_BtnActionPerformed
        yoklamaCikisKaydiOgrSec();
    }//GEN-LAST:event_yoklamaOgrSec_BtnActionPerformed

    private void yoklamaGirisKayitlariniAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaGirisKayitlariniAra_btnActionPerformed
        yoklamaOgrenciSecCikisTabloDoldur();
    }//GEN-LAST:event_yoklamaGirisKayitlariniAra_btnActionPerformed

    private void yoklamaCikisKaydi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaCikisKaydi_btnActionPerformed
        yoklamaCikisKaydi();
        yoklamaOgrenciSecCikisTabloDoldur();
    }//GEN-LAST:event_yoklamaCikisKaydi_btnActionPerformed

    private void yoklamaGirilenKitap_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaGirilenKitap_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoklamaGirilenKitap_txtActionPerformed

    private void yoklamaArananKitap_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaArananKitap_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoklamaArananKitap_txtActionPerformed

    private void yoklamaKitapAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaKitapAra_btnActionPerformed
        yoklamaKitapListeleTabloDoldur();
    }//GEN-LAST:event_yoklamaKitapAra_btnActionPerformed
    DefaultListModel DLM = new DefaultListModel();
    private void yoklamaKitapSecEkle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaKitapSecEkle_btnActionPerformed
        try{
            int selectedRowIndex = yoklamaArananKitapTablo.getSelectedRow();
            if(selectedRowIndex != -1)
            {
                Object yoklamaSecilenKitapAdi = (Object) yoklamaArananKitapTablo.getModel().getValueAt(selectedRowIndex, 0);
                DLM.addElement(yoklamaSecilenKitapAdi.toString());
                yoklamaOkunanKitap_list.setModel(DLM);
            }else{
                JOptionPane.showMessageDialog(null, "Kitap seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "İşlem başarısız!","Kütüphane Yönetim Sistemi",0);
        }
    }//GEN-LAST:event_yoklamaKitapSecEkle_btnActionPerformed

    private void yoklamaKitapGirisEkle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaKitapGirisEkle_btnActionPerformed
        String yoklamaGirilenKitapAdi = yoklamaGirilenKitap_txt.getText();
        if(!yoklamaGirilenKitapAdi.isEmpty())
        {
            DLM.addElement(yoklamaGirilenKitapAdi);
            yoklamaOkunanKitap_list.setModel(DLM);
            yoklamaGirilenKitap_txt.setText("");
        }
        else
            JOptionPane.showMessageDialog(null, "Kitap adı yazınız.","Kütüphane Yönetim Sistemi",2);
    }//GEN-LAST:event_yoklamaKitapGirisEkle_btnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        yoklamaGelisKaydi();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Combo_yoklamaGirisSinifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_yoklamaGirisSinifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_yoklamaGirisSinifActionPerformed

    private void yoklamaGelisOgrAra_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaGelisOgrAra_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoklamaGelisOgrAra_txtActionPerformed

    private void yoklamaOgrAra_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrAra_btn4ActionPerformed
        yoklamaOgrenciSecGelisTabloDoldur();
    }//GEN-LAST:event_yoklamaOgrAra_btn4ActionPerformed

    private void yoklamaOgrSec_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrSec_Btn1ActionPerformed
        yoklamaGelisOgrSec();
    }//GEN-LAST:event_yoklamaOgrSec_Btn1ActionPerformed

    private void ogrSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrSil_btnActionPerformed
        ogrenciSil();
        OgrenciTabloDoldur();
    }//GEN-LAST:event_ogrSil_btnActionPerformed

    private void yeniKitapAdi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKitapAdi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeniKitapAdi_txtActionPerformed

    private void yeniKitapYazarAdi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKitapYazarAdi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeniKitapYazarAdi_txtActionPerformed

    private void yeniKitapKaydet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKitapKaydet_btnActionPerformed
        kitapEkle();
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_yeniKitapKaydet_btnActionPerformed

    private void kitaplarAra_TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitaplarAra_TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitaplarAra_TXTActionPerformed

    private void kitaplarSorgula_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitaplarSorgula_btnActionPerformed
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_kitaplarSorgula_btnActionPerformed

    private void kitapSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapSil_btnActionPerformed
        kitapSil();
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_kitapSil_btnActionPerformed

    private void kitapGuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapGuncelle_btnActionPerformed
        kitapGuncelle();
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_kitapGuncelle_btnActionPerformed

    private void kitapVerOgrAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapVerOgrAra_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitapVerOgrAra_btnActionPerformed

    private void yoklamaOgrAra_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrAra_btn5ActionPerformed
        kitapVerOgrTabloDoldur();
    }//GEN-LAST:event_yoklamaOgrAra_btn5ActionPerformed

    private void yoklamaOgrAra_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrAra_btn6ActionPerformed
        kitapVer();
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_yoklamaOgrAra_btn6ActionPerformed

    private void kitapTeslimAl_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapTeslimAl_btnActionPerformed
        kitapTeslimAl();
        kitapGuncelleTabloDoldur();
    }//GEN-LAST:event_kitapTeslimAl_btnActionPerformed

    private void ogrKitapSorgula_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrKitapSorgula_btnActionPerformed
        ogrKitapSorgulaTabloDoldur();
    }//GEN-LAST:event_ogrKitapSorgula_btnActionPerformed

    private void yoklamaCikisKaydi_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaCikisKaydi_btn1ActionPerformed
        Integer index = yoklamaOkunanKitap_list.getSelectedIndex();
        if(!index.toString().equals("-1"))
            DLM.removeElementAt(index);
        else
            JOptionPane.showMessageDialog(null, "Kitap seçiniz!","Kütüphane Yönetim Sistemi",2);
    }//GEN-LAST:event_yoklamaCikisKaydi_btn1ActionPerformed

    private void yoklamaCikisKaydi_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaCikisKaydi_btn2ActionPerformed
        DLM.clear();
    }//GEN-LAST:event_yoklamaCikisKaydi_btn2ActionPerformed

    private void yoklamaOgrAra_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrAra_btn1ActionPerformed
        yoklamaOgrSec();
    }//GEN-LAST:event_yoklamaOgrAra_btn1ActionPerformed

    private void yoklamaOgrAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaOgrAra_btnActionPerformed
        yoklamaOgrSorgulaTabloDoldur();
    }//GEN-LAST:event_yoklamaOgrAra_btnActionPerformed

    private void yoklamaSeciliOgrenciyiSorgula_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaSeciliOgrenciyiSorgula_btnActionPerformed
        yoklamaSorgulaSeciliOgrTabloDoldur();
    }//GEN-LAST:event_yoklamaSeciliOgrenciyiSorgula_btnActionPerformed

    private void yoklamaArananOgr_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaArananOgr_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoklamaArananOgr_txtActionPerformed

    private void yoklamaTumOgrenciSorgula_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaTumOgrenciSorgula_btnActionPerformed
        yoklamaSorgulaTabloDoldur();
    }//GEN-LAST:event_yoklamaTumOgrenciSorgula_btnActionPerformed

    private void yoklamaYazdir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaYazdir_btnActionPerformed
        yazdir("yoklama");
    }//GEN-LAST:event_yoklamaYazdir_btnActionPerformed

    private void ogrYazdir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrYazdir_btnActionPerformed
        yazdir("ogrenci");
    }//GEN-LAST:event_ogrYazdir_btnActionPerformed

    private void kitapYazdir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapYazdir_btnActionPerformed
        yazdir("kitap");
    }//GEN-LAST:event_kitapYazdir_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_kadi;
    private javax.swing.JComboBox Combo_OdemeSekli;
    private javax.swing.JComboBox Combo_Sinif_Guncelle;
    private javax.swing.JComboBox Combo_Sinif_Sil;
    private javax.swing.JComboBox Combo_Sinif_Sorgula;
    private javax.swing.JComboBox Combo_Siniflar;
    private javax.swing.JComboBox Combo_UcretDurumu;
    private javax.swing.JComboBox Combo_Yoklama;
    private javax.swing.JComboBox Combo_yoklamaGirisSinif;
    private javax.swing.JTabbedPane Ders;
    private javax.swing.JPanel Kullanici_Bilgileri;
    private javax.swing.JPanel OgrCikisKaydi;
    private javax.swing.JTextField Ogrc_adSoyad_txt;
    private javax.swing.JTextArea Ogrc_adrs_txt;
    private javax.swing.JTextField Ogrc_numara_txt;
    private javax.swing.JTextField Ogrc_tc_txt;
    private javax.swing.JTextField Ogrc_tel_txt;
    private javax.swing.JPanel OgrenciKaydi;
    private javax.swing.JPanel OgrenciKaydi1;
    private javax.swing.JPanel OgrenciSorgula;
    private javax.swing.JPanel Sinif_Islemleri;
    private javax.swing.JSpinner Ucret_Spinner;
    private javax.swing.JPanel YoklamaSorgula;
    private javax.swing.JLabel adUyari;
    private javax.swing.JLabel adresUyari;
    private javax.swing.JTable araTablo;
    private javax.swing.JButton ara_btn;
    private javax.swing.JTextField ara_txt;
    private javax.swing.JButton bilgiBuncelle_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton kitapGuncelle_btn;
    private javax.swing.JButton kitapSil_btn;
    private javax.swing.JButton kitapTeslimAl_btn;
    private javax.swing.JTextField kitapVerOgrAra_btn;
    private javax.swing.JTable kitapVerOgrTablo;
    private com.toedter.calendar.JDateChooser kitapVerisTarihi;
    private javax.swing.JButton kitapYazdir_btn;
    private javax.swing.JTextField kitaplarAra_TXT;
    private javax.swing.JTable kitaplarGuncelle_Tablo;
    private javax.swing.JButton kitaplarSorgula_btn;
    private javax.swing.JLabel numaraUyari;
    private javax.swing.JButton ogrKitapSorgula_btn;
    private javax.swing.JButton ogrSil_btn;
    private javax.swing.JButton ogrYazdir_btn;
    private javax.swing.JLabel sifreUyari1;
    private javax.swing.JLabel sifreUyari2;
    private javax.swing.JTextField sinifAdi_txt;
    private javax.swing.JLabel sinifDuzenleId;
    private javax.swing.JButton sinifEkle_btn;
    private javax.swing.JButton sinifGuncelleSec_btn;
    private javax.swing.JButton sinifGuncelle_btn;
    private javax.swing.JTextField sinifGuncelle_txt;
    private javax.swing.JLabel sinifID;
    private javax.swing.JButton sinifSil_btn;
    private javax.swing.JLabel sinifiUyari;
    private javax.swing.JLabel tcUyari;
    private javax.swing.JLabel tcUyari1;
    private javax.swing.JLabel tcUyari2;
    private javax.swing.JLabel tcUyari3;
    private javax.swing.JLabel tcUyari4;
    private javax.swing.JLabel telUyari;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JLabel txt_unvan;
    private javax.swing.JPasswordField txt_yeniSifre;
    private javax.swing.JPasswordField txt_yeniSifre2;
    private javax.swing.JTextField yeniKitapAdi_txt;
    private javax.swing.JButton yeniKitapKaydet_btn;
    private javax.swing.JSpinner yeniKitapNumara_Spinner;
    private javax.swing.JTextField yeniKitapYazarAdi_txt;
    private javax.swing.JPanel yoklama;
    private javax.swing.JTable yoklamaArananKitapTablo;
    private javax.swing.JTextField yoklamaArananKitap_txt;
    private javax.swing.JTable yoklamaArananOgrTablo;
    private javax.swing.JTextField yoklamaArananOgr_txt;
    private javax.swing.JSpinner yoklamaCikisDakika_txt;
    private javax.swing.JButton yoklamaCikisKaydi_btn;
    private javax.swing.JButton yoklamaCikisKaydi_btn1;
    private javax.swing.JButton yoklamaCikisKaydi_btn2;
    private javax.swing.JSpinner yoklamaCikisSaat_txt;
    private com.toedter.calendar.JDateChooser yoklamaCikis_tarihi;
    private javax.swing.JSpinner yoklamaGelisDakika_txt;
    private javax.swing.JTable yoklamaGelisOgrAraTablo;
    private javax.swing.JTextField yoklamaGelisOgrAra_txt;
    private javax.swing.JSpinner yoklamaGelisSaat_txt;
    private javax.swing.JLabel yoklamaGelisSaati_txt;
    private javax.swing.JLabel yoklamaGelisTarih_txt;
    private javax.swing.JTextField yoklamaGirilenKitap_txt;
    private javax.swing.JButton yoklamaGirisKayitlariniAra_btn;
    private javax.swing.JButton yoklamaKitapAra_btn;
    private javax.swing.JButton yoklamaKitapGirisEkle_btn;
    private javax.swing.JButton yoklamaKitapSecEkle_btn;
    private javax.swing.JTextField yoklamaKonu_txt;
    private javax.swing.JLabel yoklamaOgrAdSoyad_txt;
    private javax.swing.JButton yoklamaOgrAra_btn;
    private javax.swing.JButton yoklamaOgrAra_btn1;
    private javax.swing.JButton yoklamaOgrAra_btn4;
    private javax.swing.JButton yoklamaOgrAra_btn5;
    private javax.swing.JButton yoklamaOgrAra_btn6;
    private javax.swing.JTable yoklamaOgrCikisTablo;
    private javax.swing.JLabel yoklamaOgrID_txt;
    private javax.swing.JLabel yoklamaOgrNumara_txt;
    private javax.swing.JButton yoklamaOgrSec_Btn;
    private javax.swing.JButton yoklamaOgrSec_Btn1;
    private javax.swing.JLabel yoklamaOgrSinif_txt;
    private javax.swing.JList yoklamaOkunanKitap_list;
    private javax.swing.JLabel yoklamaSecilenAdSoyad;
    private javax.swing.JLabel yoklamaSecilenCikisOgrID;
    private javax.swing.JLabel yoklamaSecilenGelisAdSoyad;
    private javax.swing.JLabel yoklamaSecilenGelisNumara;
    private javax.swing.JLabel yoklamaSecilenGelisOgrID;
    private javax.swing.JLabel yoklamaSecilenGelisSinif;
    private javax.swing.JLabel yoklamaSecilenNumara;
    private javax.swing.JLabel yoklamaSecilenSinif;
    private javax.swing.JButton yoklamaSeciliOgrenciyiSorgula_btn;
    private com.toedter.calendar.JDateChooser yoklamaSorgulaBaslangic_tarihi;
    private com.toedter.calendar.JDateChooser yoklamaSorgulaBitis_tarihi;
    private javax.swing.JTable yoklamaSorgula_Tablo;
    private javax.swing.JSpinner yoklamaSoruSayisi_txt;
    private javax.swing.JLabel yoklamaTarih_txt;
    private javax.swing.JButton yoklamaTumOgrenciSorgula_btn;
    private javax.swing.JButton yoklamaYazdir_btn;
    // End of variables declaration//GEN-END:variables
    public void yoklamaGelisOgrSec(){
        try{
            SimpleDateFormat tarihBicim = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat saatBicim = new SimpleDateFormat("H");
            SimpleDateFormat dakikaBicim = new SimpleDateFormat("m");
            Date tarih = new Date();

            /*
            import java.text.SimpleDateFormat;
            import java.util.Calendar;
            import java.util.Date;
            import java.util.GregorianCalendar;

            SimpleDateFormat bicim = new SimpleDateFormat("dd/M/yyyy");

            y 	Yıl 	1996; 96
            M 	Yıl içinde ay 	July; Jul; 07
            w 	Yıl içinde hafta 	27
            W 	Ay içinde hafta 	2
            D 	Yıl içinde gün 	189
            d 	Ay içinde gün 	10
            F 	Ay içinde haftanın günü 	2
            E 	Haftanın günü 	Tuesday; Tue
            a 	Sabah/akşam 	PM
            H 	Gün içinde saat (0-23) 	0
            k 	Gün içinde saat (1-24) 	24
            K 	Sabah/akşam için saat (0-11) 	0
            h 	Sabah/akşam için saat (1-12) 	12
            m 	Saat içinde dakika 	30
            s 	Dakika içinde saniye 	55
            S 	Milisaniye 	978

            Date tarih = new Date();
            System.out.println(bicim.format(tarih)); // 24/8/2014

            String aylar[]={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
            Calendar simdi=Calendar.getInstance();
            System.out.println(aylar[simdi.get(Calendar.MONTH)]); // Ağustos
            System.out.println(simdi.get(Calendar.DATE));         // 24
            System.out.println(simdi.get(Calendar.YEAR));         // 2014
            System.out.println(simdi.get(Calendar.HOUR));         // 2
            System.out.println(simdi.get(Calendar.MINUTE));       // 12
            System.out.println(simdi.get(Calendar.SECOND));       // 51

            SimpleDateFormat bicim3=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            GregorianCalendar gcalender=new GregorianCalendar();
            System.out.println(bicim3.format(gcalender.getTime())); // 24-8-2014 02:20:10
            */

            int selectedRowIndex = yoklamaGelisOgrAraTablo.getSelectedRow();
            Object yoklamaSecimID = (Object) yoklamaGelisOgrAraTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object yoklamaSecimAdSoyad = (Object) yoklamaGelisOgrAraTablo.getModel().getValueAt(selectedRowIndex, 1);
            Object yoklamaSecimSinif = (Object) yoklamaGelisOgrAraTablo.getModel().getValueAt(selectedRowIndex, 2);
            Object yoklamaSecimNumara = (Object) yoklamaGelisOgrAraTablo.getModel().getValueAt(selectedRowIndex, 3);

            if(!yoklamaSecimID.toString().equals(""))
            {
                yoklamaSecilenGelisOgrID.setText(yoklamaSecimID.toString());
                yoklamaSecilenGelisNumara.setText(yoklamaSecimNumara.toString());
                yoklamaSecilenGelisAdSoyad.setText(yoklamaSecimAdSoyad.toString());
                yoklamaSecilenGelisSinif.setText(yoklamaSecimSinif.toString());
                yoklamaGelisSaat_txt.setValue(Integer.parseInt(saatBicim.format(tarih)));
                yoklamaGelisDakika_txt.setValue(Integer.parseInt(dakikaBicim.format(tarih)));
                yoklamaGelisTarih_txt.setText(tarihBicim.format(tarih));
            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }
    }
    public void yoklamaGelisKaydi(){
        try{
            if(!yoklamaSecilenGelisOgrID.getText().equals("-")){
                DBBaglanti();
                String sorgu = "Select * From yoklama where ogrID = '"+yoklamaSecilenGelisOgrID.getText()+"' and tarih = '"+yoklamaGelisTarih_txt.getText()+"'";
                st = con.createStatement();
                rs = st.executeQuery(sorgu);

                rs.last();
                int kayitSayisi = rs.getRow();
                rs.beforeFirst();
                
                if(kayitSayisi == 0)
                {
                    Integer yoklamaKontrol;
                    if(Combo_Yoklama.getSelectedItem().toString().equals("Geldi"))
                        yoklamaKontrol = 1;
                    else
                        yoklamaKontrol = 0;
                    String sql = "INSERT INTO yoklama (id, ogrID, tarih, girisSaati, cikisSaati, konu, soruSayisi, okuduguKitap, yoklama, kontrol) VALUES (NULL, '"+Integer.parseInt(yoklamaSecilenGelisOgrID.getText())+"', '"+yoklamaGelisTarih_txt.getText()+"', '"+yoklamaGelisSaat_txt.getValue()+"."+yoklamaGelisDakika_txt.getValue()+"', '', '', '', '', '"+Combo_Yoklama.getSelectedItem().toString()+"', '"+yoklamaKontrol+"')";
                    Statement kaydet = baglanti.createStatement();
                    kaydet.executeUpdate(sql);

                    yoklamaSecilenGelisOgrID.setText("-");
                    yoklamaSecilenGelisAdSoyad.setText("-");
                    yoklamaSecilenGelisSinif.setText("-");
                    yoklamaSecilenGelisNumara.setText("-");
                    yoklamaGelisSaat_txt.setValue(0);
                    yoklamaGelisDakika_txt.setValue(0);
                    yoklamaGelisTarih_txt.setText("-");

                    JOptionPane.showMessageDialog(null, "Yoklama kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);
                }else{
                    JOptionPane.showMessageDialog(null, "Öğrenci giriş kaydı daha önce yapıldı!","Kütüphane Yönetim Sistemi",0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void ComboSinifListele(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_Sinif_Sil.removeAllItems();
            Combo_Sinif_Sil.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("sinifAdi");
                Combo_Sinif_Sil.addItem(ogretmenAdiGelen);
            }
            
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_Siniflar.removeAllItems();
            Combo_Siniflar.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("sinifAdi");
                Combo_Siniflar.addItem(ogretmenAdiGelen);
            }
            
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_yoklamaGirisSinif.removeAllItems();
            Combo_yoklamaGirisSinif.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String ogretmenAdiGelen = resultSet.getString("sinifAdi");
                Combo_yoklamaGirisSinif.addItem(ogretmenAdiGelen);
            }
            
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_Sinif_Sorgula.removeAllItems();
            Combo_Sinif_Sorgula.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String sinifAdiGelen = resultSet.getString("sinifAdi");
                Combo_Sinif_Sorgula.addItem(sinifAdiGelen);
            }
        
            preparedStatement = baglanti.prepareStatement("Select * From siniflar");
            resultSet = preparedStatement.executeQuery();

            Combo_Sinif_Guncelle.removeAllItems();
            Combo_Sinif_Guncelle.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String sinifAdiGelen = resultSet.getString("sinifAdi");
                Combo_Sinif_Guncelle.addItem(sinifAdiGelen);
            }
        }catch(Exception e){
            
        }
    }
    public void sinifEkle(){
        try{
            if(!sinifAdi_txt.getText().isEmpty()){
                String sql = "INSERT INTO siniflar (sinifAdi) VALUES ('"+sinifAdi_txt.getText()+"')";
                Statement kaydet = baglanti.createStatement();
                kaydet.executeUpdate(sql);
                
                sinifAdi_txt.setText("");
                ComboSinifListele();
                JOptionPane.showMessageDialog(null, "Sınıf Eklendi!","Kütüphane Yönetim Sistemi",1);
            }else{
                JOptionPane.showMessageDialog(null, "Sınıf Adı yazınız.","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void sinifSil(){
        try{
            if(!Combo_Sinif_Sil.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                String sql = "delete from siniflar where id ='"+sinifID.getText()+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();

                ComboSinifListele();
                JOptionPane.showMessageDialog(null, "Sınıf Silindi!","Kütüphane Yönetim Sistemi",1);
            }else{
                JOptionPane.showMessageDialog(null, "Sınıf Seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Silinemedi!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void sinifDuzenleSec(){
        try{
            preparedStatement = baglanti.prepareStatement("Select * From siniflar where sinifAdi = '"+Combo_Sinif_Guncelle.getSelectedItem().toString()+"'");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                sinifDuzenleId.setText(resultSet.getString("id"));
                sinifGuncelle_txt.setText(resultSet.getString("sinifAdi"));
            }
            if(Combo_Sinif_Guncelle.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                JOptionPane.showMessageDialog(null, "Sınıf Seçiniz!","Kütüphane Yönetim Sistemi",2);
                sinifDuzenleId.setText("-");
            }
        }catch(Exception e){}
    }
    public void sinifGuncelle(){
        try{
            if(!Combo_Sinif_Guncelle.getSelectedItem().toString().equals("Sınıf Seçiniz")){
                if(!sinifGuncelle_txt.getText().isEmpty()){
                    if(!sinifDuzenleId.getText().toString().equals("-")){
                        Integer id = Integer.parseInt(sinifDuzenleId.getText());
                        String valueSinif =sinifGuncelle_txt.getText();
                    
                        String sql = "update siniflar set sinifAdi='"+valueSinif+"' where id='"+id+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                        JOptionPane.showMessageDialog(null, "Güncelleme Yapıldı!","Kütüphane Yönetim Sistemi",1);

                        sinifDuzenleId.setText("-");
                        sinifGuncelle_txt.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Sınıf seçiniz.","Kütüphane Yönetim Sistemi",2);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Sınıf Adı yazınız.","Kütüphane Yönetim Sistemi",2);
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Sınıf Seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
         }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Yapılamadı!","Kütüphane Yönetim Sistemi",0);
         }
    }
    public void kitapEkle(){
        try{
            if(!yeniKitapAdi_txt.getText().isEmpty())
            {
                if(!yeniKitapYazarAdi_txt.getText().isEmpty())
                {
                    if(!yeniKitapNumara_Spinner.getValue().equals(0))
                    {
                        String kitapAdi = yeniKitapAdi_txt.getText();
                        String yazarAdi = yeniKitapYazarAdi_txt.getText();
                        String kitapNumara = yeniKitapNumara_Spinner.getValue().toString();
                        
                        String sql = "INSERT INTO kitaplar (id, kitapAdi, yazarAdi, numara, ogrID, alisTarihi, verisTarihi, kontrol) VALUES (NULL, '"+kitapAdi+"', '"+yazarAdi+"', '"+kitapNumara+"', '', '', '', '0')";
                        Statement kaydet = baglanti.createStatement();
                        kaydet.executeUpdate(sql);
                        
                        JOptionPane.showMessageDialog(null, "Kitap kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);
                                            
                        yeniKitapAdi_txt.setText("");
                        yeniKitapYazarAdi_txt.setText("");
                        yeniKitapNumara_Spinner.setValue(0);
                    }else{
                        JOptionPane.showMessageDialog(null, "Kitap Numarası yazınız.","Kütüphane Yönetim Sistemi",2);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Yazar Adı yazınız.","Kütüphane Yönetim Sistemi",2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Kitap Adı yazınız.","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "İşlem yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void kitapSil(){
        try{
            int selectedRowIndex = kitaplarGuncelle_Tablo.getSelectedRow();
            
            if(selectedRowIndex != -1)
            {
                Object kitapID = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 0);
                String sql = "delete from kitaplar where id='"+kitapID.toString()+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Kitap silindi.","Kütüphane Yönetim Sistemi",1);
            }else{
                JOptionPane.showMessageDialog(null, "Kitap seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt silinemedi!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void kitapTeslimAl(){
        try{
            int selectedRowIndex = kitaplarGuncelle_Tablo.getSelectedRow();
            
            if(selectedRowIndex != -1)
            {
                Object kitapID = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 0);
                String sql = "update kitaplar set ogrID='', alisTarihi='', verisTarihi='', kontrol='0' where id='"+kitapID+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Kitap rafa kaldırıldı.","Kütüphane Yönetim Sistemi",1);
            }else{
                JOptionPane.showMessageDialog(null, "Kitap seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "İşlem yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void kitapGuncelle(){
        try{
            int selectedRowIndex = kitaplarGuncelle_Tablo.getSelectedRow();
            
            Object id = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 0);
            Object kitapAdi = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 1);
            Object yazarAdi = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 2);
            Object kitapNumara = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(selectedRowIndex, 3);

            String sql = "update kitaplar set kitapAdi='"+kitapAdi+"', yazarAdi='"+yazarAdi+"', numara='"+kitapNumara+"' where id='"+id+"'";
            preparedStatement = baglanti.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Seçili kitap güncellendi.","Kütüphane Yönetim Sistemi",1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncellenecek kitabı seçiniz!","Kütüphane Yönetim Sistemi",2);
        }
    }
    public void kitapGuncelleTabloDoldur(){
        String baslik[] = new String[]{"ID", "Kitap Adı", "Yazar Adı", "Numara", "Öğrenci Adı", "Alış Tarihi", "Vereceği Tarih", "Durumu"}; 
        try{                        
            DBBaglanti();
            String gelenArama = kitaplarAra_TXT.getText();
            String sorgu = "Select * From kitaplar where kitapAdi like '%"+gelenArama+"%' or yazarAdi like '%"+gelenArama+"%' or numara like '"+gelenArama+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    String kitapDurumu;
                    String sorguOgr;
                    
                    if(rs.getString("kontrol").equals("0"))
                        kitapDurumu = "Rafta";
                    else
                        kitapDurumu = "Öğrencide";
                    
                    if(!rs.getString("ogrID").toString().isEmpty())
                    {
                        sorguOgr = "Select * From ogrenci where id='"+rs.getString("ogrID")+"'";
                        preparedStatement = baglanti.prepareStatement(sorguOgr);
                        resultSet = preparedStatement.executeQuery();

                        while(resultSet.next()){
                            data[i] = new Object[]{
                                rs.getString("id"),
                                rs.getString("kitapAdi"),
                                rs.getString("yazarAdi"),
                                rs.getString("numara"),
                                resultSet.getString("AdSoyad"),
                                rs.getString("alisTarihi"),
                                rs.getString("verisTarihi"),
                                kitapDurumu
                            };
                        }
                    }else{
                        data[i] = new Object[]{
                            rs.getString("id"),
                            rs.getString("kitapAdi"),
                            rs.getString("yazarAdi"),
                            rs.getString("numara"),
                            "",
                            "",
                            "",
                            kitapDurumu
                        };
                    }
                    i++;
                    kitaplarGuncelle_Tablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","","","","","",""};
                kitaplarGuncelle_Tablo.setModel(new DefaultTableModel(data, baslik));
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void kitapVerOgrTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Numara"}; 
        try{                        
            DBBaglanti();
            String gelenArama = kitapVerOgrAra_btn.getText();
            String sorgu = "Select * From ogrenci where AdSoyad like '%"+gelenArama+"%' or Numara like '"+gelenArama+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){                    
                    data[i] = new Object[]{
                        rs.getString("id"),
                        rs.getString("AdSoyad"),
                        rs.getString("Numara")
                    };
                    i++;
                    kitapVerOgrTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","",""};
                kitapVerOgrTablo.setModel(new DefaultTableModel(data, baslik));
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void kitapVer(){
        try{
            int kitaplarTabloSelectedRowIndex = kitaplarGuncelle_Tablo.getSelectedRow();
            int kitapVerOgrTabloSelectedRowIndex = kitapVerOgrTablo.getSelectedRow();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String verisTarihi = sdf.format(kitapVerisTarihi.getDate());
            
            SimpleDateFormat tarihBicim = new SimpleDateFormat("yyyy-MM-dd");
            Date bugunTarihi = new Date();
            String alisTarihi = tarihBicim.format(bugunTarihi);
            
            if(kitaplarTabloSelectedRowIndex != -1)
            {
                if(kitapVerOgrTabloSelectedRowIndex != -1)
                {
                    Object kitapID = (Object) kitaplarGuncelle_Tablo.getModel().getValueAt(kitaplarTabloSelectedRowIndex, 0);
                    Object ogrID = (Object) kitapVerOgrTablo.getModel().getValueAt(kitapVerOgrTabloSelectedRowIndex, 0);
                    
                    String sql = "update kitaplar set ogrID='"+ogrID+"', alisTarihi='"+alisTarihi+"', verisTarihi='"+verisTarihi+"', kontrol='1' where id='"+kitapID+"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                    JOptionPane.showMessageDialog(null, "Kitap öğrenciye verildi.","Kütüphane Yönetim Sistemi",1);
                }else{
                    JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Kitap seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "işlem hatası!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void ogrKitapSorgulaTabloDoldur(){
        String baslik[] = new String[]{"ID", "Kitap Adı", "Yazar Adı", "Numara", "Öğrenci Adı", "Alış Tarihi", "Vereceği Tarih", "Durumu"}; 
        try{                        
            DBBaglanti();
            int kitapVerOgrTabloSelectedRowIndex = kitapVerOgrTablo.getSelectedRow();
            
            if(kitapVerOgrTabloSelectedRowIndex != -1)
            {
                Object ogrID = (Object) kitapVerOgrTablo.getModel().getValueAt(kitapVerOgrTabloSelectedRowIndex, 0);
                Object ogrAdSoyad = (Object) kitapVerOgrTablo.getModel().getValueAt(kitapVerOgrTabloSelectedRowIndex, 1);
                String sorgu = "Select * From kitaplar where ogrID='"+ogrID.toString()+"'";
                
                st = con.createStatement();
                rs = st.executeQuery(sorgu);

                rs.last();
                Integer kayitSayisi = rs.getRow();
                rs.beforeFirst();

                if(!kayitSayisi.toString().equals("0"))
                {
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        String kitapDurumu;

                        if(rs.getString("kontrol").equals("0"))
                            kitapDurumu = "Rafta";
                        else
                            kitapDurumu = "Öğrencide";

                        if(!rs.getString("ogrID").toString().isEmpty())
                        {
                            data[i] = new Object[]{
                                rs.getString("id"),
                                rs.getString("kitapAdi"),
                                rs.getString("yazarAdi"),
                                rs.getString("numara"),
                                ogrAdSoyad,
                                rs.getString("alisTarihi"),
                                rs.getString("verisTarihi"),
                                kitapDurumu
                            };
                        }
                        i++;
                        kitaplarGuncelle_Tablo.setModel(new DefaultTableModel(data, baslik));
                    }
                }else{
                    Object data[][] = new Object[1][];
                    data[0] = new Object[]{"","","","","","","",""};
                    kitaplarGuncelle_Tablo.setModel(new DefaultTableModel(data, baslik));
                    JOptionPane.showMessageDialog(null, "Öğrencide kitap yok.","Kütüphane Yönetim Sistemi",1);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void ogrenciEkle(){
        try{
                if(!Ogrc_adSoyad_txt.getText().isEmpty())
                {
                    if(!Combo_Siniflar.getSelectedItem().toString().equals("Sınıf Seçiniz"))
                    {
                        if(!Ogrc_numara_txt.getText().isEmpty())
                        {
                            if(!Ogrc_tc_txt.getText().isEmpty())
                            {
                                if(!Ogrc_tel_txt.getText().isEmpty())
                                {
                                    if(!Ogrc_adrs_txt.getText().isEmpty())
                                    {
                                        String adSoyad = Ogrc_adSoyad_txt.getText();
                                        String Sinif = Combo_Siniflar.getSelectedItem().toString();
                                        String numara = Ogrc_numara_txt.getText();
                                        String tc = Ogrc_tc_txt.getText();
                                        String telno = Ogrc_tel_txt.getText();
                                        String adres = Ogrc_adrs_txt.getText();
                                        
                                        if(Combo_UcretDurumu.getSelectedItem().toString().equals("Ücretsiz") && Combo_OdemeSekli.getSelectedItem().toString().equals("Ücretsiz"))
                                        {
                                            String sql = "INSERT INTO ogrenci (AdSoyad,Sinif,Numara,Tc,Tel,Adres,UcretDurumu,UcretTipi,UcretTutari,KalanUcret,UcretKontrol) VALUES ('"+adSoyad+"','"+Sinif+"','"+numara+"','"+tc+"','"+telno+"','"+adres+"','Ücretsiz','Ücretsiz','0','0','1')";
                                            Statement kaydet = baglanti.createStatement();
                                            kaydet.executeUpdate(sql);
                                            JOptionPane.showMessageDialog(null, "Ögrenci kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);
                                            
                                            Ogrc_adSoyad_txt.setText("");
                                            Combo_Siniflar.setSelectedIndex(0);
                                            Ogrc_numara_txt.setText("");
                                            Ogrc_tc_txt.setText("");
                                            Ogrc_tel_txt.setText("");
                                            Ogrc_adrs_txt.setText("");
                                            Combo_UcretDurumu.setSelectedIndex(0);
                                            Combo_OdemeSekli.setSelectedIndex(0);
                                            Ucret_Spinner.setValue(0);
                                        }
                                        else if(Combo_UcretDurumu.getSelectedItem().toString().equals("Ücretli") && !Combo_OdemeSekli.getSelectedItem().toString().equals("Ücretsiz"))
                                        {
                                            if(!Ucret_Spinner.getValue().equals(0))
                                            {
                                                    String UcretDurumu = Combo_UcretDurumu.getSelectedItem().toString();
                                                    String OdemeSekli = Combo_OdemeSekli.getSelectedItem().toString();
                                                    String Ucret = Ucret_Spinner.getValue().toString();
                                                    
                                                    String sql = "INSERT INTO ogrenci (AdSoyad,Sinif,Numara,Tc,Tel,Adres,UcretDurumu,UcretTipi,UcretTutari,KalanUcret,UcretKontrol) VALUES ('"+adSoyad+"','"+Sinif+"','"+numara+"','"+tc+"','"+telno+"','"+adres+"','"+UcretDurumu+"','"+OdemeSekli+"','"+Ucret+"','"+Ucret+"','0')";
                                                    Statement kaydet = baglanti.createStatement();
                                                    kaydet.executeUpdate(sql);
                                                    JOptionPane.showMessageDialog(null, "Ögrenci kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);
                                            
                                                    Ogrc_adSoyad_txt.setText("");
                                                    Combo_Siniflar.setSelectedIndex(0);
                                                    Ogrc_numara_txt.setText("");
                                                    Ogrc_tc_txt.setText("");
                                                    Ogrc_tel_txt.setText("");
                                                    Ogrc_adrs_txt.setText("");
                                                    Combo_UcretDurumu.setSelectedIndex(0);
                                                    Combo_OdemeSekli.setSelectedIndex(0);
                                                    Ucret_Spinner.setValue(0);
                                            }
                                            else
                                                JOptionPane.showMessageDialog(null, "Ücret yazınız.","Kütüphane Yönetim Sistemi",2);
                                        }
                                        else
                                            JOptionPane.showMessageDialog(null, "Ödeme bilgilerini kontrol ediniz!","Kütüphane Yönetim Sistemi",2);
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Öğrenci Adres bilgisini yazınız.","Kütüphane Yönetim Sistemi",2);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null, "Telefon numarası yazınız.","Kütüphane Yönetim Sistemi",2);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Öğrenci TC Numarasını yazınız.","Kütüphane Yönetim Sistemi",2);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Öğrenci Numarası giriniz.","Kütüphane Yönetim Sistemi",2);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Sınıf seçiniz!","Kütüphane Yönetim Sistemi",2);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ad Soyad yazınız.","Kütüphane Yönetim Sistemi",2);
                }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "İşlem yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void ogrenciSil(){
        try{
            int selectedRowIndex = araTablo.getSelectedRow();
            String sorguOgr;
            String sql;
            String odemeKontrolBilgisi = "";
            String kitapKontrolBilgisi = "";
            Integer odemeKontrol = 0;
            Integer kitapKontrol = 0;
            
            if(selectedRowIndex != -1)
            {
                Integer kontrol1;
                kontrol1 = JOptionPane.showConfirmDialog(null, "Öğrenciye ait muhasebe kayıtları dahil tüm veriler silinecek. Öğrenci kaydı silinsin mi? ","Kütüphane Yönetim Sistemi",JOptionPane.YES_NO_OPTION);
                if(kontrol1.equals(0))
                {
                    Object ogrID = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 0);
                    
                    sorguOgr = "Select * From ogrenci where id='"+ogrID.toString()+"'";
                    preparedStatement = baglanti.prepareStatement(sorguOgr);
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        if(resultSet.getString("UcretKontrol").toString().equals("0"))
                        {
                            odemeKontrolBilgisi = "Öğrencinin "+resultSet.getString("KalanUcret").toString()+" TL borcu var. Borç kaydı silinecek.";
                            odemeKontrol = 1;
                        }
                    }
                    
                    sorguOgr = "Select * From kitaplar where ogrID='"+ogrID.toString()+"'";
                    preparedStatement = baglanti.prepareStatement(sorguOgr);
                    resultSet = preparedStatement.executeQuery();
                    resultSet.last();
                    Integer kitapSayisi = resultSet.getRow();
                    resultSet.beforeFirst();
                    
                    if(!kitapSayisi.toString().equals("0"))
                    {
                        kitapKontrolBilgisi = "Öğrencide "+kitapSayisi+" adet kitap var. Kitaplar rafa kaldırılacak.";
                        kitapKontrol = 1;
                    }
                    
                    if(odemeKontrol.equals(1) || kitapKontrol.equals(1))
                    {
                        String bilgi = "";
                        if(odemeKontrol.equals(1) && kitapKontrol.equals(1))
                            bilgi = odemeKontrolBilgisi+"\n"+kitapKontrolBilgisi;
                        else if(odemeKontrol.equals(1) && kitapKontrol.equals(0))
                            bilgi = odemeKontrolBilgisi;
                        else if(odemeKontrol.equals(0) && kitapKontrol.equals(1))
                            bilgi = kitapKontrolBilgisi;
                        
                        Integer kontrol2;
                        kontrol2 = JOptionPane.showConfirmDialog(null, bilgi,"Kütüphane Yönetim Sistemi",JOptionPane.YES_NO_OPTION);
                        if(kontrol2.equals(0))
                        {
                            sorguOgr = "Select * From kitaplar where ogrID='"+ogrID.toString()+"'";
                            preparedStatement = baglanti.prepareStatement(sorguOgr);
                            resultSet = preparedStatement.executeQuery();
                            while(resultSet.next()){
                                sql = "update kitaplar set ogrID='', kontrol='0' where id='"+resultSet.getString("id")+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                preparedStatement.execute();
                            }
                            
                            sql = "delete from yoklama where ogrID='"+ogrID.toString()+"'";
                            preparedStatement = baglanti.prepareStatement(sql);
                            preparedStatement.execute();
                            
                            sql = "delete from muhasebe where ogrID='"+ogrID.toString()+"'";
                            preparedStatement = baglanti.prepareStatement(sql);
                            preparedStatement.execute();
                            
                            sql = "delete from ogrenci where id='"+ogrID.toString()+"'";
                            preparedStatement = baglanti.prepareStatement(sql);
                            preparedStatement.execute();
                            JOptionPane.showMessageDialog(null, "Öğrenci kaydı silindi.","Kütüphane Yönetim Sistemi",1);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "İşlem iptal edildi.","Kütüphane Yönetim Sistemi",0); 
                    }
                    else
                    {
                        sql = "delete from yoklama where ogrID='"+ogrID.toString()+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                            
                        sql = "delete from muhasebe where ogrID='"+ogrID.toString()+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                            
                        sql = "delete from ogrenci where id='"+ogrID.toString()+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                        JOptionPane.showMessageDialog(null, "Öğrenci kaydı silindi.","Kütüphane Yönetim Sistemi",1);
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "İşlem iptal edildi.","Kütüphane Yönetim Sistemi",0); 
                    //0 Kırmızı Çarpı, 1 (i) Harfi Bilgi, 2 Ünlem Uyarı, 3 Soru İşareti
            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt silinemedi!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void ogrBilgiGuncelle(){
        try{
            int selectedRowIndex = araTablo.getSelectedRow();
            
            Object id = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object adSoyad = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 1);
            Object sinif = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 2);
            Object numara = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 3);
            Object tc = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 4);
            Object telefon = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 5);
            Object adres = (Object) araTablo.getModel().getValueAt(selectedRowIndex, 6);

            String sql = "update ogrenci set AdSoyad='"+adSoyad+"', Sinif='"+sinif+"', Numara='"+numara+"', Tc='"+tc+"', Tel='"+telefon+"', Adres='"+adres+"' where id='"+id+"'";
            preparedStatement = baglanti.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Seçili öğrencinin bilgileri güncellendi.","Kütüphane Yönetim Sistemi",1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt Seçiniz!","Kütüphane Yönetim Sistemi",2);
        }
    }
    public void OgrenciTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Sınıf", "Numara", "TC Kimlik No", "Telefon", "Adres"}; 
        try{                        
            DBBaglanti();
            String gelenArama = ara_txt.getText();
            String sorgu;
            if(!Combo_Sinif_Sorgula.getSelectedItem().toString().equals("Sınıf Seçiniz"))
                sorgu = "Select * From ogrenci where Sinif='"+Combo_Sinif_Sorgula.getSelectedItem().toString()+"' and (AdSoyad like '"+gelenArama+"%' or Numara like '"+gelenArama+"%' or Tc like '"+gelenArama+"%')";
            else
                sorgu = "Select * From ogrenci where AdSoyad like '"+gelenArama+"%' or Numara like '"+gelenArama+"%' or Tc like '"+gelenArama+"%'";

            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    data[i] = new Object[]{
                    rs.getString("id"),
                    rs.getString("AdSoyad"),
                    rs.getString("Sinif"),
                    rs.getString("Numara"),
                    rs.getString("Tc"),
                    rs.getString("Tel"),
                    rs.getString("Adres")
                    };
                    i++;
                    araTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","","","","",""};
                araTablo.setModel(new DefaultTableModel(data, baslik));
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yoklamaOgrenciSecGelisTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Sınıf", "Numara", "TC Kimlik No"}; 
        try{                        
            DBBaglanti();
            String gelenArama = yoklamaGelisOgrAra_txt.getText();
            String sorgu;
            if(!Combo_yoklamaGirisSinif.getSelectedItem().toString().equals("Sınıf Seçiniz"))
                sorgu = "Select * From ogrenci where Sinif='"+Combo_yoklamaGirisSinif.getSelectedItem().toString()+"' and (AdSoyad like '"+gelenArama+"%' or Numara like '"+gelenArama+"%' or Tc like '"+gelenArama+"%')";
            else
                sorgu = "Select * From ogrenci where AdSoyad like '"+gelenArama+"%' or Numara like '"+gelenArama+"%' or Tc like '"+gelenArama+"%'";

            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    data[i] = new Object[]{
                    rs.getString("id"),
                    rs.getString("AdSoyad"),
                    rs.getString("Sinif"),
                    rs.getString("Numara"),
                    rs.getString("Tc")
                    };
                    i++;
                    yoklamaGelisOgrAraTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","","","","",""};
                yoklamaGelisOgrAraTablo.setModel(new DefaultTableModel(data, baslik));
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yoklamaOgrenciSecCikisTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Sınıf", "Numara", "Tarih", "Yoklama", "Durum"}; 
        try{                        
            DBBaglanti();
            String sorgu;
            String sorguOgr;
            String tarih;
            String durum;
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tarih = sdf.format(yoklamaCikis_tarihi.getDate());
                
            sorgu = "Select * From yoklama where tarih='"+tarih+"'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    sorguOgr = "Select * From ogrenci where id='"+rs.getString("ogrID")+"'";
                    preparedStatement = baglanti.prepareStatement(sorguOgr);
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        if(rs.getString("yoklama").equals("Gelmedi"))
                            durum = "Gelmedi";
                        else if(rs.getString("cikisSaati").isEmpty())
                            durum = "Kütüphanede";
                        else
                            durum = "Çıktı";
                        
                        data[i] = new Object[]{
                            rs.getString("id"),
                            resultSet.getString("AdSoyad"),
                            resultSet.getString("Sinif"),
                            resultSet.getString("Numara"),
                            rs.getString("tarih"),
                            rs.getString("yoklama"),
                            durum
                        };
                    }
                    i++;
                    yoklamaOgrCikisTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","","","","",""};
                yoklamaOgrCikisTablo.setModel(new DefaultTableModel(data, baslik));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yoklamaKitapListeleTabloDoldur(){
        String baslik[] = new String[]{"Kitap Adı", "Yazar Adı", "Numara"}; 
        try{                        
            DBBaglanti();
            String gelenArama = yoklamaArananKitap_txt.getText();
            
            String sorgu = "Select * From kitaplar where kitapAdi like '%"+gelenArama+"%' or yazarAdi like '%"+gelenArama+"%' or numara like '"+gelenArama+"%'";
                
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();

            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    data[i] = new Object[]{
                        rs.getString("kitapAdi"),
                        rs.getString("yazarAdi"),
                        rs.getString("numara")
                    };
                    i++;
                    yoklamaArananKitapTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","",""};
                yoklamaArananKitapTablo.setModel(new DefaultTableModel(data, baslik));
            }  
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void yoklamaCikisKaydiOgrSec(){
        try{
            SimpleDateFormat saatBicim = new SimpleDateFormat("H");
            SimpleDateFormat dakikaBicim = new SimpleDateFormat("m");
            Date tarih = new Date();
            
            int selectedRowIndex = yoklamaOgrCikisTablo.getSelectedRow();
            Object yoklamaSecimID = (Object) yoklamaOgrCikisTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object yoklamaSecimAdSoyad = (Object) yoklamaOgrCikisTablo.getModel().getValueAt(selectedRowIndex, 1);
            Object yoklamaSecimSinif = (Object) yoklamaOgrCikisTablo.getModel().getValueAt(selectedRowIndex, 2);
            Object yoklamaSecimNumara = (Object) yoklamaOgrCikisTablo.getModel().getValueAt(selectedRowIndex, 3);
            
            String sorguOgr = "Select * From yoklama where id='"+yoklamaSecimID.toString()+"'";
            
            preparedStatement = baglanti.prepareStatement(sorguOgr);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                if(!yoklamaSecimID.toString().equals(""))
                {
                    if(!resultSet.getString("yoklama").equals("Gelmedi"))
                    {
                        if(resultSet.getString("cikisSaati").isEmpty())
                        {
                            yoklamaSecilenCikisOgrID.setText(yoklamaSecimID.toString());
                            yoklamaSecilenAdSoyad.setText(yoklamaSecimAdSoyad.toString());
                            yoklamaSecilenSinif.setText(yoklamaSecimSinif.toString());
                            yoklamaSecilenNumara.setText(yoklamaSecimNumara.toString());

                            yoklamaGelisSaati_txt.setText(resultSet.getString("girisSaati"));
                            yoklamaCikisSaat_txt.setValue(Integer.parseInt(saatBicim.format(tarih)));
                            yoklamaCikisDakika_txt.setValue(Integer.parseInt(dakikaBicim.format(tarih)));
                            yoklamaTarih_txt.setText(resultSet.getString("tarih"));

                        }else{
                            JOptionPane.showMessageDialog(null, "Öğrenci çıkış yapmıştır.","Kütüphane Yönetim Sistemi",2);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Öğrenci gelmedi.","Kütüphane Yönetim Sistemi",2);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }
    }
    private void yoklamaCikisKaydi(){
        try{
            Integer kitapSayisi = yoklamaOkunanKitap_list.getModel().getSize();
            String okunanaKitaplar = "";
            String virgul = ", ";
            for(int i = 0; i<=kitapSayisi-1; i++)
            {
                if(i==kitapSayisi-1)
                    virgul = "";                    
                okunanaKitaplar += DLM.getElementAt(i).toString()+virgul;
            }
            if(!yoklamaSecilenCikisOgrID.getText().equals("-"))
            {
                if(!yoklamaCikisSaat_txt.getValue().equals(0))
                {
                    if(!yoklamaKonu_txt.getText().isEmpty())
                    {
                        String yoklamaID = yoklamaSecilenCikisOgrID.getText();
                        String cikisSaati = yoklamaCikisSaat_txt.getValue().toString()+"."+yoklamaCikisDakika_txt.getValue().toString();
                        String konu = yoklamaKonu_txt.getText();
                        String soruSayisi = yoklamaSoruSayisi_txt.getValue().toString();

                        String sql = "update yoklama set cikisSaati='"+cikisSaati+"', konu='"+konu+"', soruSayisi='"+soruSayisi+"', okuduguKitap='"+okunanaKitaplar+"' where id='"+yoklamaID+"'";
                        preparedStatement = baglanti.prepareStatement(sql);
                        preparedStatement.execute();
                        JOptionPane.showMessageDialog(null, "Yoklama çıkış kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);

                        yoklamaSecilenCikisOgrID.setText("-");
                        yoklamaGelisSaati_txt.setText("-");
                        yoklamaCikisSaat_txt.setValue(0);
                        yoklamaCikisDakika_txt.setValue(0);
                        yoklamaTarih_txt.setText("-");
                        yoklamaKonu_txt.setText("");
                        yoklamaSoruSayisi_txt.setValue(0);
                        DLM.clear();
                    }else{
                        JOptionPane.showMessageDialog(null, "Konu yazınız.","Kütüphane Yönetim Sistemi",2);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Çıkış saati giriniz.","Kütüphane Yönetim Sistemi",2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt güncellenemedi!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yoklamaOgrSorgulaTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Sınıf", "Numara"}; 
        try{                        
            DBBaglanti();
            String gelenArama = yoklamaArananOgr_txt.getText();
            String sorgu;
            sorgu = "Select * From ogrenci where AdSoyad like '"+gelenArama+"%' or Sinif like '"+gelenArama+"%' or Numara like '"+gelenArama+"%'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    data[i] = new Object[]{
                        rs.getString("id"),
                        rs.getString("AdSoyad"),
                        rs.getString("Sinif"),
                        rs.getString("Numara")
                    };
                    i++;
                    yoklamaArananOgrTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","",""};
                yoklamaArananOgrTablo.setModel(new DefaultTableModel(data, baslik));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void yoklamaOgrSec(){
        try{
            int selectedRowIndex = yoklamaArananOgrTablo.getSelectedRow();
            Object yoklamaOgrID = (Object) yoklamaArananOgrTablo.getModel().getValueAt(selectedRowIndex, 0);
            Object yoklamaOgrAdSoyad = (Object) yoklamaArananOgrTablo.getModel().getValueAt(selectedRowIndex, 1);
            Object yoklamaOgrSinif = (Object) yoklamaArananOgrTablo.getModel().getValueAt(selectedRowIndex, 2);
            Object yoklamaOgrNumara = (Object) yoklamaArananOgrTablo.getModel().getValueAt(selectedRowIndex, 3);
            
            if(!yoklamaOgrID.toString().isEmpty())
            {
                yoklamaOgrID_txt.setText(yoklamaOgrID.toString());
                yoklamaOgrAdSoyad_txt.setText(yoklamaOgrAdSoyad.toString());
                yoklamaOgrSinif_txt.setText(yoklamaOgrSinif.toString());
                yoklamaOgrNumara_txt.setText(yoklamaOgrNumara.toString());

            }else{
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }
    }
    public void yoklamaSorgulaTabloDoldur(){
        String baslik[] = new String[]{"Ad Soyad", "Numara", "Çalıştığı Konu", "Soru Sayısı", "Okuduğu Kitaplar", "Tarih", "Giriş Saati", "Çıkış Saati", "Yoklama"}; 
        try{                        
            DBBaglanti();
            String sorgu;
            String sorguOgr;
            String baslangicTarihi;
            String bitisTarihi;
            String soruSayisi;
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            baslangicTarihi = sdf.format(yoklamaSorgulaBaslangic_tarihi.getDate());
            bitisTarihi = sdf.format(yoklamaSorgulaBitis_tarihi.getDate());
                
            sorgu = "Select * From yoklama where tarih BETWEEN '"+baslangicTarihi+"' and '"+bitisTarihi+"'";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu);

            rs.last();
            Integer kayitSayisi = rs.getRow();
            rs.beforeFirst();
            
            if(!kayitSayisi.toString().equals("0"))
            {
                Object data[][] = new Object[kayitSayisi][];
                int i=0;
                while(rs.next()){
                    sorguOgr = "Select * From ogrenci where id='"+rs.getString("ogrID")+"'";
                    preparedStatement = baglanti.prepareStatement(sorguOgr);
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        if(rs.getString("soruSayisi").equals("0"))
                            soruSayisi = "Soru Çözmedi";
                        else if(!rs.getString("soruSayisi").isEmpty())
                            soruSayisi = rs.getString("soruSayisi")+" Adet";
                        else
                            soruSayisi = "";
                        
                        data[i] = new Object[]{
                            resultSet.getString("AdSoyad"),
                            resultSet.getString("Numara"),
                            rs.getString("konu"),
                            soruSayisi,
                            rs.getString("okuduguKitap"),
                            rs.getString("tarih"),
                            rs.getString("girisSaati"),
                            rs.getString("cikisSaati"),
                            rs.getString("yoklama")
                        };
                    }
                    i++;
                    yoklamaSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","","","","","","","",""};
                yoklamaSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yoklamaSorgulaSeciliOgrTabloDoldur(){
        String baslik[] = new String[]{"Ad Soyad", "Numara", "Çalıştığı Konu", "Soru Sayısı", "Okuduğu Kitaplar", "Tarih", "Giriş Saati", "Çıkış Saati", "Yoklama"}; 
        try{                        
            DBBaglanti();
            String ogrID = yoklamaOgrID_txt.getText();
            String sorgu;
            String sorguOgr;
            String baslangicTarihi;
            String bitisTarihi;
            String soruSayisi;
            
            if(!ogrID.equals("-"))
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                baslangicTarihi = sdf.format(yoklamaSorgulaBaslangic_tarihi.getDate());
                bitisTarihi = sdf.format(yoklamaSorgulaBitis_tarihi.getDate());

                sorgu = "Select * From yoklama where ogrID = '"+ogrID+"' and (tarih BETWEEN '"+baslangicTarihi+"' and '"+bitisTarihi+"')";

                st = con.createStatement();
                rs = st.executeQuery(sorgu);

                rs.last();
                Integer kayitSayisi = rs.getRow();
                rs.beforeFirst();

                if(!kayitSayisi.toString().equals("0"))
                {
                    Object data[][] = new Object[kayitSayisi][];
                    int i=0;
                    while(rs.next()){
                        sorguOgr = "Select * From ogrenci where id='"+rs.getString("ogrID")+"'";
                        preparedStatement = baglanti.prepareStatement(sorguOgr);
                        resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            if(rs.getString("soruSayisi").equals("0"))
                                soruSayisi = "Soru Çözmedi";
                            else if(!rs.getString("soruSayisi").isEmpty())
                                soruSayisi = rs.getString("soruSayisi")+" Adet";
                            else
                                soruSayisi = "";

                            data[i] = new Object[]{
                                resultSet.getString("AdSoyad"),
                                resultSet.getString("Numara"),
                                rs.getString("konu"),
                                soruSayisi,
                                rs.getString("okuduguKitap"),
                                rs.getString("tarih"),
                                rs.getString("girisSaati"),
                                rs.getString("cikisSaati"),
                                rs.getString("yoklama")
                            };
                        }
                        i++;
                        yoklamaSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
                    }
                }else{
                    Object data[][] = new Object[1][];
                    data[0] = new Object[]{"","","","","","","","","",""};
                    yoklamaSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else
                JOptionPane.showMessageDialog(null,"Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
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
                                JOptionPane.showMessageDialog(null,"Şifreniz Güncellendi!","Kütüphane Yönetim Sistemi",1);
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
            JOptionPane.showMessageDialog(null, "Güncellene Yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void bugununTarihiniGetir(){
        try{
            SimpleDateFormat tarihBicim = new SimpleDateFormat("dd/MM/yyyy");
            Date bugunTarihi = new Date();
            String tarih = tarihBicim.format(bugunTarihi);

            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(tarih.toString());
            yoklamaCikis_tarihi.setDate(date);
            yoklamaSorgulaBaslangic_tarihi.setDate(date);
            yoklamaSorgulaBitis_tarihi.setDate(date);
            kitapVerisTarihi.setDate(date);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Güncellene Yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void yazdir(String gelenTablo){
        try{
            MessageFormat footer = new MessageFormat("ÖZEL DEK KURSLARI - Bizim için her öğrenci özeldir.");
            if(gelenTablo.equals("yoklama"))
            {
                MessageFormat header = new MessageFormat("Yoklama Kayıtları");
                yoklamaSorgula_Tablo.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }else if(gelenTablo.equals("ogrenci"))
            {
                MessageFormat header = new MessageFormat("Öğrenci Kayıtları");
                araTablo.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }else if(gelenTablo.equals("kitap"))
            {
                MessageFormat header = new MessageFormat("Kitap Kayıtları");
                kitaplarGuncelle_Tablo.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }else if(gelenTablo.equals(""))
            {
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "İşlem hatası!","Kütüphane Yönetim Sistemi",0);
        }
    }
}
