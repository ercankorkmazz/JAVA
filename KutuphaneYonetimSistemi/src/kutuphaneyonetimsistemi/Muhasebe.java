package kutuphaneyonetimsistemi;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Muhasebe extends javax.swing.JFrame {
    public void DBBaglanti() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane_yonetim?useUnicode=true&characterEncoding=latin5","root",""); // veritabanına bağlatı kodu
    }
    public Muhasebe() {
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
        TahsilatKaydi = new javax.swing.JPanel();
        tahsilatKaydiOgrSec_btn = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tahsilatKaydiOgrTablo = new javax.swing.JTable();
        tahsilatKaydiOgrAra_btn = new javax.swing.JButton();
        tahsilahKaydiOgrAra_txt = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tahsilatKaydiYap_btn = new javax.swing.JButton();
        tahsilatKaydiAdSoyad_txt = new javax.swing.JLabel();
        tahsilatKaydiTelefon_txt = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        tahsilatKaydiTC_txt = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Combo_tahsilatKaydiOdemeSekli = new javax.swing.JComboBox();
        tcUyari6 = new javax.swing.JLabel();
        tcUyari7 = new javax.swing.JLabel();
        tcUyari8 = new javax.swing.JLabel();
        tahsilEdilenTutar_Spinner = new javax.swing.JSpinner();
        tcUyari9 = new javax.swing.JLabel();
        tahsilatKaydiOgrID_txt = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        tcUyari10 = new javax.swing.JLabel();
        tahsilatKaydiToplamBorc_Spinner = new javax.swing.JSpinner();
        tahsilatKaydiKalanBorc_Spinner = new javax.swing.JSpinner();
        tcUyari11 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        tahsilatKaydiOdemeSekli_txt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tahsilatKaydiAciklama = new javax.swing.JTextArea();
        YoklamaSorgula = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tahsilatSorgula_Tablo = new javax.swing.JTable();
        tahsilatSorguArananOgr_txt = new javax.swing.JTextField();
        tahsilatSorguOgrAra_btn = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tahsilatSorguArananOgrTablo = new javax.swing.JTable();
        tahsilatSorguOgrSec_btn = new javax.swing.JButton();
        tahsilatSorguOgrID_txt = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        tahsilatSorguOgrAdSoyad_txt = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        tahsilatSorguOgrSinif_txt = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        tahsilatSorguToplamBorc_Spinner = new javax.swing.JSpinner();
        jLabel67 = new javax.swing.JLabel();
        tahsilatSorguKalanBorc_Spinner = new javax.swing.JSpinner();
        tcUyari12 = new javax.swing.JLabel();
        tcUyari13 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        tahsilatSorguOgrNumara_txt = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        tahsilatSorguKayitTipi_txt = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        tahsilatSorguOdemeSekli_txt = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        tahsilatSorguToplam_Spinner = new javax.swing.JSpinner();
        tcUyari14 = new javax.swing.JLabel();
        tahsilatSorguOdemeSil_btn = new javax.swing.JButton();
        ogrYazdir_btn1 = new javax.swing.JButton();
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

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/hesap.png"))); // NOI18N
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
                    .addComponent(ara_txt)
                    .addComponent(ara_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OgrenciSorgulaLayout.createSequentialGroup()
                        .addGroup(OgrenciSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ogrYazdir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ogrSil_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bilgiBuncelle_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Combo_Sinif_Sorgula, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        Ders.addTab("Öğrenci Sorgula", OgrenciSorgula);

        TahsilatKaydi.setBackground(new java.awt.Color(255, 255, 255));

        tahsilatKaydiOgrSec_btn.setText("Öğrenci Seç");
        tahsilatKaydiOgrSec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatKaydiOgrSec_btnActionPerformed(evt);
            }
        });

        tahsilatKaydiOgrTablo.setBackground(new java.awt.Color(217, 217, 217));
        tahsilatKaydiOgrTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tahsilatKaydiOgrTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        tahsilatKaydiOgrTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tahsilatKaydiOgrTablo.setRowHeight(17);
        tahsilatKaydiOgrTablo.setShowVerticalLines(false);
        jScrollPane12.setViewportView(tahsilatKaydiOgrTablo);

        tahsilatKaydiOgrAra_btn.setText("Öğrenci Sorgula");
        tahsilatKaydiOgrAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatKaydiOgrAra_btnActionPerformed(evt);
            }
        });

        tahsilahKaydiOgrAra_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilahKaydiOgrAra_txtActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Adı Soyadı:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Telefon No:");

        tahsilatKaydiYap_btn.setText("Kaydet");
        tahsilatKaydiYap_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatKaydiYap_btnActionPerformed(evt);
            }
        });

        tahsilatKaydiAdSoyad_txt.setText("-");

        tahsilatKaydiTelefon_txt.setText("-");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setText("TC Kimlik No:");

        tahsilatKaydiTC_txt.setText("-");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setText("TAHSİLAT KAYIT EKRANI");

        Combo_tahsilatKaydiOdemeSekli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nakit", "Kredi Kartına Tek Çekim", "1. Taksit", "2. Taksit", "3. Taksit", "4. Taksit", "5. Taksit", "6. Taksit", "7. Taksit", "8. Taksit", "9. Taksit", "10. Taksit", "11. Taksit", "12. Taksit", "13. Taksit", "14. Taksit", "15. Taksit", "16. Taksit", "17. Taksit", "18. Taksit", "19. Taksit", "20. Taksit", "21. Taksit", "22. Taksit", "23. Taksit", "24. Taksit" }));

        tcUyari6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari6.setText("Ödeme Şekli:");

        tcUyari7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari7.setText("Tahsil Edilen Tutar:");

        tcUyari8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari8.setText("Açıklama:");

        tahsilEdilenTutar_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tcUyari9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari9.setText("TL");

        tahsilatKaydiOgrID_txt.setText("-");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("Toplam Borç:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Kalan Borç:");

        tcUyari10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari10.setText("TL");

        tahsilatKaydiToplamBorc_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tahsilatKaydiKalanBorc_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tcUyari11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari11.setText("TL");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Ödeme Şekli:");

        tahsilatKaydiOdemeSekli_txt.setText("-");

        tahsilatKaydiAciklama.setColumns(20);
        tahsilatKaydiAciklama.setLineWrap(true);
        tahsilatKaydiAciklama.setRows(5);
        tahsilatKaydiAciklama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(tahsilatKaydiAciklama);

        javax.swing.GroupLayout TahsilatKaydiLayout = new javax.swing.GroupLayout(TahsilatKaydi);
        TahsilatKaydi.setLayout(TahsilatKaydiLayout);
        TahsilatKaydiLayout.setHorizontalGroup(
            TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                .addComponent(tahsilahKaydiOgrAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahsilatKaydiOgrAra_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahsilatKaydiOgrSec_btn)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TahsilatKaydiLayout.createSequentialGroup()
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                                .addGap(322, 322, 322)
                                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel65)
                                                    .addComponent(jLabel66)))
                                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tahsilatKaydiAdSoyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel70)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tahsilatKaydiToplamBorc_Spinner)
                                                    .addComponent(tahsilatKaydiKalanBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tcUyari10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tcUyari11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tahsilatKaydiOdemeSekli_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TahsilatKaydiLayout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel68)
                                            .addComponent(jLabel64))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tahsilatKaydiTC_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tahsilatKaydiTelefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TahsilatKaydiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tcUyari6)
                                    .addComponent(tcUyari7)
                                    .addComponent(tcUyari8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Combo_tahsilatKaydiOdemeSekli, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                        .addComponent(tahsilEdilenTutar_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tcUyari9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tahsilatKaydiYap_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(117, 117, 117))))
                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(36, 36, 36)
                        .addComponent(tahsilatKaydiOgrID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        TahsilatKaydiLayout.setVerticalGroup(
            TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(tahsilatKaydiOgrID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahsilahKaydiOgrAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahsilatKaydiOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                        .addComponent(tahsilatKaydiOgrSec_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiToplamBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tcUyari11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiAdSoyad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiKalanBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tcUyari10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiOdemeSekli_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(TahsilatKaydiLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiTC_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tahsilatKaydiTelefon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tcUyari6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Combo_tahsilatKaydiOdemeSekli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tcUyari7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tahsilEdilenTutar_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcUyari9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TahsilatKaydiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcUyari8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahsilatKaydiYap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );

        Ders.addTab("Tahsilat Kaydi", TahsilatKaydi);

        YoklamaSorgula.setBackground(new java.awt.Color(255, 255, 255));

        tahsilatSorgula_Tablo.setBackground(new java.awt.Color(204, 204, 204));
        tahsilatSorgula_Tablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tahsilatSorgula_Tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        tahsilatSorgula_Tablo.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tahsilatSorgula_Tablo);

        tahsilatSorguArananOgr_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatSorguArananOgr_txtActionPerformed(evt);
            }
        });

        tahsilatSorguOgrAra_btn.setText("Öğrenci Sorgula");
        tahsilatSorguOgrAra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatSorguOgrAra_btnActionPerformed(evt);
            }
        });

        tahsilatSorguArananOgrTablo.setBackground(new java.awt.Color(217, 217, 217));
        tahsilatSorguArananOgrTablo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tahsilatSorguArananOgrTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        tahsilatSorguArananOgrTablo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tahsilatSorguArananOgrTablo.setRowHeight(19);
        tahsilatSorguArananOgrTablo.setShowVerticalLines(false);
        jScrollPane13.setViewportView(tahsilatSorguArananOgrTablo);

        tahsilatSorguOgrSec_btn.setText("Öğrenciyi Seç");
        tahsilatSorguOgrSec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatSorguOgrSec_btnActionPerformed(evt);
            }
        });

        tahsilatSorguOgrID_txt.setText("-");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Adı Soyadı:");

        tahsilatSorguOgrAdSoyad_txt.setText("-");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("Sınıf:");

        tahsilatSorguOgrSinif_txt.setText("-");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("Toplam Borç:");

        tahsilatSorguToplamBorc_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setText("Kalan Borç:");

        tahsilatSorguKalanBorc_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tcUyari12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari12.setText("TL");

        tcUyari13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari13.setText("TL");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("Numara:");

        tahsilatSorguOgrNumara_txt.setText("-");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setText("Kayıt Tipi:");

        tahsilatSorguKayitTipi_txt.setText("-");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setText("Ödeme Şekli:");

        tahsilatSorguOdemeSekli_txt.setText("-");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setText("Ödeme Kayıtları");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setText("Toplam:");

        tahsilatSorguToplam_Spinner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tcUyari14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tcUyari14.setText("TL");

        tahsilatSorguOdemeSil_btn.setText("Ödeme Kaydı Sil");
        tahsilatSorguOdemeSil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahsilatSorguOdemeSil_btnActionPerformed(evt);
            }
        });

        ogrYazdir_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/printer.png"))); // NOI18N

        javax.swing.GroupLayout YoklamaSorgulaLayout = new javax.swing.GroupLayout(YoklamaSorgula);
        YoklamaSorgula.setLayout(YoklamaSorgulaLayout);
        YoklamaSorgulaLayout.setHorizontalGroup(
            YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YoklamaSorgulaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tahsilatSorguOgrNumara_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(329, 329, 329))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tahsilatSorguOgrAdSoyad_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(tahsilatSorguOgrSinif_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addComponent(tahsilatSorguArananOgr_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahsilatSorguOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane13)
                            .addComponent(tahsilatSorguOgrID_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahsilatSorguOgrSec_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addComponent(tahsilatSorguKayitTipi_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addComponent(tahsilatSorguOdemeSekli_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tahsilatSorguToplamBorc_Spinner)
                            .addComponent(tahsilatSorguKalanBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcUyari12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcUyari13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addComponent(tahsilatSorguOdemeSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrYazdir_btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahsilatSorguToplam_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcUyari14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        YoklamaSorgulaLayout.setVerticalGroup(
            YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tahsilatSorguToplamBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcUyari13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tahsilatSorguKalanBorc_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcUyari12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel74)
                                    .addComponent(tahsilatSorguKayitTipi_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel75)
                                    .addComponent(tahsilatSorguOdemeSekli_txt))))
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tahsilatSorguOgrID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YoklamaSorgulaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel76))))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(tahsilatSorguOgrAdSoyad_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(tahsilatSorguOgrSinif_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tahsilatSorguOgrNumara_txt)
                            .addComponent(jLabel73))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tahsilatSorguArananOgr_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahsilatSorguOgrAra_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                                .addComponent(tahsilatSorguOgrSec_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(YoklamaSorgulaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(YoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahsilatSorguToplam_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcUyari14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahsilatSorguOdemeSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrYazdir_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        Ders.addTab("Tahsilat Sorgula", YoklamaSorgula);

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
                    .addComponent(txt_unvan))
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
        tahsilatSorguOgrID_txt.setVisible(false);
        tahsilatKaydiOgrID_txt.setVisible(false);
        //bugununTarihiniGetir();
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
    DefaultListModel DLM = new DefaultListModel();
    private void ogrSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrSil_btnActionPerformed
        ogrenciSil();
        OgrenciTabloDoldur();
        tahsilatKaydiOgrTabloDoldur();
    }//GEN-LAST:event_ogrSil_btnActionPerformed

    private void tahsilahKaydiOgrAra_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilahKaydiOgrAra_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahsilahKaydiOgrAra_txtActionPerformed

    private void tahsilatKaydiOgrAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatKaydiOgrAra_btnActionPerformed
        tahsilatKaydiOgrTabloDoldur();
    }//GEN-LAST:event_tahsilatKaydiOgrAra_btnActionPerformed

    private void tahsilatKaydiOgrSec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatKaydiOgrSec_btnActionPerformed
        tahsilatKaydiOgrSec();
    }//GEN-LAST:event_tahsilatKaydiOgrSec_btnActionPerformed

    private void tahsilatSorguOgrSec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatSorguOgrSec_btnActionPerformed
        tahsilatSorguOgrSec();
        tahsilatSorgulaTabloDoldur();
    }//GEN-LAST:event_tahsilatSorguOgrSec_btnActionPerformed

    private void tahsilatSorguOgrAra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatSorguOgrAra_btnActionPerformed
        tahsilatSorguOgrSorgulaTabloDoldur();
    }//GEN-LAST:event_tahsilatSorguOgrAra_btnActionPerformed

    private void tahsilatSorguArananOgr_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatSorguArananOgr_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahsilatSorguArananOgr_txtActionPerformed

    private void tahsilatKaydiYap_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatKaydiYap_btnActionPerformed
        tahsilatKaydiYap();
    }//GEN-LAST:event_tahsilatKaydiYap_btnActionPerformed

    private void tahsilatSorguOdemeSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahsilatSorguOdemeSil_btnActionPerformed
        tahsilatKaydiOdemeSil();
        tahsilatSorgulaTabloDoldur();
    }//GEN-LAST:event_tahsilatSorguOdemeSil_btnActionPerformed

    private void ogrYazdir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrYazdir_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrYazdir_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muhasebe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muhasebe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_kadi;
    private javax.swing.JComboBox Combo_OdemeSekli;
    private javax.swing.JComboBox Combo_Sinif_Sorgula;
    private javax.swing.JComboBox Combo_Siniflar;
    private javax.swing.JComboBox Combo_UcretDurumu;
    private javax.swing.JComboBox Combo_tahsilatKaydiOdemeSekli;
    private javax.swing.JTabbedPane Ders;
    private javax.swing.JPanel Kullanici_Bilgileri;
    private javax.swing.JTextField Ogrc_adSoyad_txt;
    private javax.swing.JTextArea Ogrc_adrs_txt;
    private javax.swing.JTextField Ogrc_numara_txt;
    private javax.swing.JTextField Ogrc_tc_txt;
    private javax.swing.JTextField Ogrc_tel_txt;
    private javax.swing.JPanel OgrenciKaydi;
    private javax.swing.JPanel OgrenciSorgula;
    private javax.swing.JPanel TahsilatKaydi;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel numaraUyari;
    private javax.swing.JButton ogrSil_btn;
    private javax.swing.JButton ogrYazdir_btn;
    private javax.swing.JButton ogrYazdir_btn1;
    private javax.swing.JLabel sifreUyari1;
    private javax.swing.JLabel sifreUyari2;
    private javax.swing.JLabel sinifiUyari;
    private javax.swing.JSpinner tahsilEdilenTutar_Spinner;
    private javax.swing.JTextField tahsilahKaydiOgrAra_txt;
    private javax.swing.JTextArea tahsilatKaydiAciklama;
    private javax.swing.JLabel tahsilatKaydiAdSoyad_txt;
    private javax.swing.JSpinner tahsilatKaydiKalanBorc_Spinner;
    private javax.swing.JLabel tahsilatKaydiOdemeSekli_txt;
    private javax.swing.JButton tahsilatKaydiOgrAra_btn;
    private javax.swing.JLabel tahsilatKaydiOgrID_txt;
    private javax.swing.JButton tahsilatKaydiOgrSec_btn;
    private javax.swing.JTable tahsilatKaydiOgrTablo;
    private javax.swing.JLabel tahsilatKaydiTC_txt;
    private javax.swing.JLabel tahsilatKaydiTelefon_txt;
    private javax.swing.JSpinner tahsilatKaydiToplamBorc_Spinner;
    private javax.swing.JButton tahsilatKaydiYap_btn;
    private javax.swing.JTable tahsilatSorguArananOgrTablo;
    private javax.swing.JTextField tahsilatSorguArananOgr_txt;
    private javax.swing.JSpinner tahsilatSorguKalanBorc_Spinner;
    private javax.swing.JLabel tahsilatSorguKayitTipi_txt;
    private javax.swing.JLabel tahsilatSorguOdemeSekli_txt;
    private javax.swing.JButton tahsilatSorguOdemeSil_btn;
    private javax.swing.JLabel tahsilatSorguOgrAdSoyad_txt;
    private javax.swing.JButton tahsilatSorguOgrAra_btn;
    private javax.swing.JLabel tahsilatSorguOgrID_txt;
    private javax.swing.JLabel tahsilatSorguOgrNumara_txt;
    private javax.swing.JButton tahsilatSorguOgrSec_btn;
    private javax.swing.JLabel tahsilatSorguOgrSinif_txt;
    private javax.swing.JSpinner tahsilatSorguToplamBorc_Spinner;
    private javax.swing.JSpinner tahsilatSorguToplam_Spinner;
    private javax.swing.JTable tahsilatSorgula_Tablo;
    private javax.swing.JLabel tcUyari;
    private javax.swing.JLabel tcUyari1;
    private javax.swing.JLabel tcUyari10;
    private javax.swing.JLabel tcUyari11;
    private javax.swing.JLabel tcUyari12;
    private javax.swing.JLabel tcUyari13;
    private javax.swing.JLabel tcUyari14;
    private javax.swing.JLabel tcUyari2;
    private javax.swing.JLabel tcUyari3;
    private javax.swing.JLabel tcUyari4;
    private javax.swing.JLabel tcUyari6;
    private javax.swing.JLabel tcUyari7;
    private javax.swing.JLabel tcUyari8;
    private javax.swing.JLabel tcUyari9;
    private javax.swing.JLabel telUyari;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JLabel txt_unvan;
    private javax.swing.JPasswordField txt_yeniSifre;
    private javax.swing.JPasswordField txt_yeniSifre2;
    // End of variables declaration//GEN-END:variables

    private void ComboSinifListele(){
        try{
            
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

            Combo_Sinif_Sorgula.removeAllItems();
            Combo_Sinif_Sorgula.addItem("Sınıf Seçiniz");
            while(resultSet.next()){
                String sinifAdiGelen = resultSet.getString("sinifAdi");
                Combo_Sinif_Sorgula.addItem(sinifAdiGelen);
            }
        }catch(Exception e){
            
        }
    }
    public void tahsilatKaydiOgrTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Numara","Kayıt Tipi"}; 
        try{                        
            DBBaglanti();
            String gelenArama = tahsilahKaydiOgrAra_txt.getText();
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
                        rs.getString("Numara"),
                        rs.getString("UcretDurumu")
                    };
                    i++;
                    tahsilatKaydiOgrTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","",""};
                tahsilatKaydiOgrTablo.setModel(new DefaultTableModel(data, baslik));
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void tahsilatKaydiOgrSec(){
        try{
            int tahsilatKaydiOgrTabloSelectedRowIndex = tahsilatKaydiOgrTablo.getSelectedRow();
            
                if(tahsilatKaydiOgrTabloSelectedRowIndex != -1)
                {
                    Object ogrID = (Object) tahsilatKaydiOgrTablo.getModel().getValueAt(tahsilatKaydiOgrTabloSelectedRowIndex, 0);
                    Object kayitTipi = (Object) tahsilatKaydiOgrTablo.getModel().getValueAt(tahsilatKaydiOgrTabloSelectedRowIndex, 3);
                    if(!kayitTipi.toString().equals("Ücretsiz"))
                    {                    
                        preparedStatement = baglanti.prepareStatement("Select * From ogrenci where id='"+ogrID.toString()+"'");
                        resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            tahsilatKaydiOgrID_txt.setText(resultSet.getString("id"));
                            tahsilatKaydiAdSoyad_txt.setText(resultSet.getString("AdSoyad"));
                            tahsilatKaydiTC_txt.setText(resultSet.getString("Tc"));
                            tahsilatKaydiTelefon_txt.setText(resultSet.getString("Tel"));
                            tahsilatKaydiToplamBorc_Spinner.setValue(Integer.parseInt(resultSet.getString("UcretTutari")));
                            tahsilatKaydiKalanBorc_Spinner.setValue(Integer.parseInt(resultSet.getString("KalanUcret")));
                            tahsilatKaydiOdemeSekli_txt.setText(resultSet.getString("UcretTipi"));
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "Öğrenci ücretsiz kayıt olmuştur.","Kütüphane Yönetim Sistemi",0);
                }else
                    JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "işlem hatası!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void tahsilatKaydiYap(){
        try{
            SimpleDateFormat tarihBicim = new SimpleDateFormat("yyyy-MM-dd");
            Date bugunTarihi = new Date();
            String tarih = tarihBicim.format(bugunTarihi);
            
            String ogrID = tahsilatKaydiOgrID_txt.getText();
            String sql;
            
            if(!ogrID.equals("-"))
            {
                if(!tahsilEdilenTutar_Spinner.getValue().equals(0))
                {
                    String odemeSekli = Combo_tahsilatKaydiOdemeSekli.getSelectedItem().toString();
                    String tahsilEdilenMiktar = tahsilEdilenTutar_Spinner.getValue().toString();
                    String aciklama = tahsilatKaydiAciklama.getText();
                    Integer kalanTutar = 0;
                    
                    preparedStatement = baglanti.prepareStatement("Select * From ogrenci where id='"+ogrID+"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next())
                    {
                        kalanTutar = Integer.parseInt(resultSet.getString("KalanUcret"))-Integer.parseInt(tahsilEdilenMiktar);
                        if(kalanTutar>-1)
                        {
                            if(kalanTutar==0)
                            {
                                sql = "update ogrenci set KalanUcret='"+kalanTutar+"', UcretKontrol='1' where id='"+ogrID+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                preparedStatement.execute();
                                JOptionPane.showMessageDialog(null, "Tüm borç ödendi.","Kütüphane Yönetim Sistemi",1);
                            }else{
                                sql = "update ogrenci set KalanUcret='"+kalanTutar+"' where id='"+ogrID+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                preparedStatement.execute();
                            }
                            
                            sql = "INSERT INTO muhasebe (ogrID,tarih,tutar,odemeTuru,aciklama) VALUES ('"+ogrID+"','"+tarih+"','"+tahsilEdilenMiktar+"','"+odemeSekli+"','"+aciklama+"')";
                            Statement kaydet = baglanti.createStatement();
                            kaydet.executeUpdate(sql);

                            preparedStatement = baglanti.prepareStatement("Select * From ogrenci where id='"+ogrID+"'");
                            resultSet = preparedStatement.executeQuery();
                            while(resultSet.next())
                            {
                                tahsilatKaydiKalanBorc_Spinner.setValue(Integer.parseInt(resultSet.getString("KalanUcret")));
                            }
                            JOptionPane.showMessageDialog(null, "Tahsilat kaydı yapıldı.","Kütüphane Yönetim Sistemi",1);
                            
                            Combo_tahsilatKaydiOdemeSekli.setSelectedIndex(0);   
                            tahsilEdilenTutar_Spinner.setValue(0);
                            tahsilatKaydiAciklama.setText("");
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Tahsilat kaydı yapılamadı. Tahsil edilen tutat kalan borçtan fazla.","Kütüphane Yönetim Sistemi",0);
                    }
                                       
                }else
                    JOptionPane.showMessageDialog(null, "Tahsil edilen tutarı giriniz.","Kütüphane Yönetim Sistemi",2);
            }else
                JOptionPane.showMessageDialog(null, "Öğrenci seçiniz.","Kütüphane Yönetim Sistemi",2);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "İşlem yapılamadı!","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void tahsilatKaydiOdemeSil(){
        try{
            int selectedRowIndex = tahsilatSorgula_Tablo.getSelectedRow();
            Integer toplamOdeme = 0;
            String sorgu;
            String sql;
            
            if(selectedRowIndex != -1)
            {
                Integer kontrol1;
                kontrol1 = JOptionPane.showConfirmDialog(null, "Öğrenciye ait ödeme kaydı silinecek. Silinsin mi? ","Kütüphane Yönetim Sistemi",JOptionPane.YES_NO_OPTION);
                if(kontrol1.equals(0))
                {
                    Integer kalanTutar = 0;
                    String ogrID = tahsilatSorguOgrID_txt.getText();
                    Object id = (Object) tahsilatSorgula_Tablo.getModel().getValueAt(selectedRowIndex, 0);
                    Object silinenMiktar = (Object) tahsilatSorgula_Tablo.getModel().getValueAt(selectedRowIndex, 2);
                    
                    if(!ogrID.equals("-"))
                    {
                        DBBaglanti();
                        sorgu = "Select * From ogrenci where id='"+ogrID+"'";
                        st = con.createStatement();
                        rs = st.executeQuery(sorgu);
                        while(rs.next())
                        {
                            kalanTutar = Integer.parseInt(rs.getString("KalanUcret"))+Integer.parseInt(silinenMiktar.toString());
                            if(kalanTutar>0)
                            {
                                sql = "update ogrenci set KalanUcret='"+kalanTutar+"', UcretKontrol='0' where id='"+ogrID+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                preparedStatement.execute();
                                tahsilatSorguKalanBorc_Spinner.setValue(kalanTutar);

                                sql = "delete from muhasebe where id='"+id.toString()+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                preparedStatement.execute();
                                JOptionPane.showMessageDialog(null, "Ödeme kaydı silindi.","Kütüphane Yönetim Sistemi",1);

                                sql = "Select * From muhasebe where ogrID='"+ogrID+"'";
                                preparedStatement = baglanti.prepareStatement(sql);
                                resultSet = preparedStatement.executeQuery();
                                while(resultSet.next())
                                {
                                    toplamOdeme += Integer.parseInt(resultSet.getString("tutar")); 
                                }
                                tahsilatSorguToplam_Spinner.setValue(toplamOdeme);
                            }else
                                JOptionPane.showMessageDialog(null, "işlem hatası!","Kütüphane Yönetim Sistemi",0);
                        }
                    }else
                       JOptionPane.showMessageDialog(null, "Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2); 
                }else 
                    JOptionPane.showMessageDialog(null, "İşlem iptal edildi.","Kütüphane Yönetim Sistemi",0); 
            }else
                JOptionPane.showMessageDialog(null, "Ödeme kaydı seçiniz!","Kütüphane Yönetim Sistemi",2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kayıt silinemedi!","Kütüphane Yönetim Sistemi",0);
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
                    tahsilatKaydiOgrID_txt.setText("-");
                    tahsilatKaydiAdSoyad_txt.setText("-");
                    tahsilatKaydiTC_txt.setText("-");
                    tahsilatKaydiTelefon_txt.setText("-");
                    tahsilatKaydiToplamBorc_Spinner.setValue(0);
                    tahsilatKaydiKalanBorc_Spinner.setValue(0);
                    tahsilatKaydiOdemeSekli_txt.setText("-");
                    Combo_tahsilatKaydiOdemeSekli.setSelectedIndex(0);   
                    tahsilEdilenTutar_Spinner.setValue(0);
                    tahsilatKaydiAciklama.setText("");
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
    public void tahsilatSorguOgrSorgulaTabloDoldur(){
        String baslik[] = new String[]{"ID", "Ad Soyad", "Sınıf", "Numara"}; 
        try{                        
            DBBaglanti();
            String gelenArama = tahsilatSorguArananOgr_txt.getText();
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
                    tahsilatSorguArananOgrTablo.setModel(new DefaultTableModel(data, baslik));
                }
            }else{
                Object data[][] = new Object[1][];
                data[0] = new Object[]{"","","",""};
                tahsilatSorguArananOgrTablo.setModel(new DefaultTableModel(data, baslik));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı.","Kütüphane Yönetim Sistemi",0);
        }
    }
    private void tahsilatSorguOgrSec(){
        try{
            int selectedRowIndex = tahsilatSorguArananOgrTablo.getSelectedRow();
            String sorguOgr;
            
            if(selectedRowIndex != -1)
            {
                Object ogrID = (Object) tahsilatSorguArananOgrTablo.getModel().getValueAt(selectedRowIndex, 0);
                sorguOgr = "Select * From ogrenci where id='"+ogrID.toString()+"'";
                preparedStatement = baglanti.prepareStatement(sorguOgr);
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next())
                {
                    tahsilatSorguOgrID_txt.setText(resultSet.getString("id"));
                    tahsilatSorguOgrAdSoyad_txt.setText(resultSet.getString("AdSoyad"));
                    tahsilatSorguOgrSinif_txt.setText(resultSet.getString("Sinif"));
                    tahsilatSorguOgrNumara_txt.setText(resultSet.getString("Numara"));
                    tahsilatSorguKayitTipi_txt.setText(resultSet.getString("UcretDurumu"));
                    tahsilatSorguOdemeSekli_txt.setText(resultSet.getString("UcretTipi"));
                    tahsilatSorguToplamBorc_Spinner.setValue(Integer.parseInt(resultSet.getString("UcretTutari")));
                    tahsilatSorguKalanBorc_Spinner.setValue(Integer.parseInt(resultSet.getString("KalanUcret")));
                }
            }else
                JOptionPane.showMessageDialog(null,"Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"İşlem yapılamadı. Öğrenci seçiniz!","Kütüphane Yönetim Sistemi",0);
        }
    }
    public void tahsilatSorgulaTabloDoldur(){
        String baslik[] = new String[]{"ID", "Tarih", "Ödenen Tutar", "Ödeme Şekli", "Açıklama"}; 
        try{                        
            DBBaglanti();
            String sorgu;
            Integer toplamOdeme = 0;
            
            if(!tahsilatSorguOgrID_txt.getText().equals("-"))
            {    
                sorgu = "Select * From muhasebe where ogrID='"+tahsilatSorguOgrID_txt.getText()+"'";

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
                            rs.getString("tarih"),
                            rs.getString("tutar"),
                            rs.getString("odemeTuru"),
                            rs.getString("aciklama")
                            };
                        toplamOdeme += Integer.parseInt(rs.getString("tutar").toString());
                        i++;
                        tahsilatSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
                        tahsilatSorguToplam_Spinner.setValue(toplamOdeme);
                    }
                }else{
                    Object data[][] = new Object[1][];
                    data[0] = new Object[]{"","","","",""};
                    tahsilatSorgula_Tablo.setModel(new DefaultTableModel(data, baslik));
                    tahsilatSorguToplam_Spinner.setValue(0);
                }
            }
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
}
