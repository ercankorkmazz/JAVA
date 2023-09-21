package personrecod;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main extends javax.swing.JFrame implements SerialPortEventListener {
    /* Arduino Kart Okuma Komutları Başlangıç */
        SerialPort serialPort;
    /* Arduino Kart Okuma Komutları Sonu */
        
    boolean control;
    public boolean sepetKartKontrol = false;
    public boolean uyelikKartKontrol = false;
    public boolean uyeGuncelleKartKontrol = false;
    public float sepetToplamTutar = (float) 0;
    public float faturaKartBakiyesi = (float) 0.0;
    public int sepetToplamKalori = 0;
    public String sepetKartID = null;
    public int toplam;
    
    Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    
    public Main() 
    {
        control=false;
        initComponents();
        
        sepetiTemizle();
        sepetBarkodNOTXT.setText("");
        Sepet_Tablosu.getColumnModel().getColumn(0).setPreferredWidth(40);
        Sepet_Tablosu.getColumnModel().getColumn(1).setPreferredWidth(290);
        Sepet_Tablosu.getColumnModel().getColumn(2).setPreferredWidth(1);
        Sepet_Tablosu.getColumnModel().getColumn(3).setPreferredWidth(20);
        Sepet_Tablosu.getColumnModel().getColumn(4).setPreferredWidth(40);
        Sepet_Tablosu.getColumnModel().getColumn(5).setPreferredWidth(40);
        Sepet_Tablosu.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
    private void sepetiTemizle()
    {
        DefaultTableModel dm = (DefaultTableModel)Sepet_Tablosu.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();
        Sepet_Tablosu.repaint();
        
        sepetKartID = null;
        KartIDTXT.setText("");
        sepetToplamTutar = (float) 0;
        sepetToplamKalori = 0;
        sepetToplamTutarTXT.setText(String.valueOf(sepetToplamTutar));
    }
    /* Arduino Kart Okuma Komutları Başlangıç */
        private static final String PORT_NAMES[] = {
            "/dev/tty.usbserial-A9007UX1", // Mac OS X
            "/dev/ttyUSB0", // Linux
            "COM3", // Windows // com portunu belirliyoruz arduinodan bakabiliriz . 
        };
        private BufferedReader input;
        private OutputStream output;
        private static final int TIME_OUT = 2000;
        private static final int DATA_RATE = 9600;
        
        public void initialize() {
            CommPortIdentifier portId = null;
            Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

            //First, Find an instance of serial port as set in PORT_NAMES.
            while (portEnum.hasMoreElements()) {
                CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
                for (String portName : PORT_NAMES) {
                    if (currPortId.getName().equals(portName)) {
                        portId = currPortId;
                        break;
                    }
                }
            }
            if (portId == null) {
                KartIDTXT.setText("Port bulunamadı.");
                return;
            }

            try {
                serialPort = (SerialPort) portId.open(this.getClass().getName(),
                        TIME_OUT);
                serialPort.setSerialPortParams(DATA_RATE,
                        SerialPort.DATABITS_8,
                        SerialPort.STOPBITS_1,
                        SerialPort.PARITY_NONE);


                input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
                output = serialPort.getOutputStream();

                serialPort.addEventListener((SerialPortEventListener) this);
                serialPort.notifyOnDataAvailable(true);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

        public void close() {
            if (serialPort != null) {
                serialPort.removeEventListener();
                serialPort.close();
            }
        }

        public void serialEvent(SerialPortEvent oEvent) {
            if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE && sepetKartKontrol == true) {
                try {
                    String inputLine = null;
                    if (input.ready()) {
                        inputLine = input.readLine();

                        KartIDTXT.setText(inputLine);

                        if(input.ready() == false)
                        { 
                            sepetKartID = inputLine.toString();
                            faturaGoruntule();
                            
                            sepetKartKontrol = false;
                            close();
                        }
                    }

                } catch (Exception e) {
                    KartIDTXT.setText(e.toString());
                }

            }
            else if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE && uyelikKartKontrol == true) {
                try {
                    String inputLine = null;
                    if (input.ready()) {
                        inputLine = input.readLine();

                        uyelikKartNoTXT.setText(inputLine);

                        if(input.ready() == false)
                        { 
                            uyelikKartKontrol = false;
                            close();
                        }
                    }

                } catch (Exception e) {
                    uyelikKartNoTXT.setText(e.toString());
                }

            }
            else if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE && uyeGuncelleKartKontrol == true) {
                try {
                    String inputLine = null;
                    if (input.ready()) {
                        inputLine = input.readLine();

                        uyeGuncelleKartNoTXT.setText(inputLine);
                        
                        if(input.ready() == false)
                        { 
                            try{
                                int sayac = 0;
                                preparedStatement = baglanti.prepareStatement("select * from uyeler where KartNO = '" +inputLine+ "'");
                                resultSet = preparedStatement.executeQuery();

                                while(resultSet.next())
                                {
                                    uyeGuncelleAdTXT.setText(resultSet.getString("Ad"));
                                    uyeGuncelleSoyadTXT.setText(resultSet.getString("Soyad"));
                                    uyeGuncelleAdresTXT.setText(resultSet.getString("Adres"));
                                    uyeGuncelleVeliAdiTXT.setText(resultSet.getString("VeliAdi"));
                                    uyeGuncelleVeliTelTXT.setText(resultSet.getString("VeliTel"));
                                    uyeGuncelleVeliEPostaTXT.setText(resultSet.getString("VeliEPosta"));
                                    uyeBakiyeTXT.setText(resultSet.getString("Bakiye") + " TL");
                                    sayac = 1;
                                }
                                if(sayac == 0)
                                {
                                    JOptionPane.showMessageDialog(null, inputLine + " Kart Numarasına tanımlı üye bulunamadı.");
                                    uyeGuncelleKartNoTXT.setText("");
                                    uyeGuncelleAdTXT.setText("");
                                    uyeGuncelleSoyadTXT.setText("");
                                    uyeGuncelleAdresTXT.setText("");
                                    uyeGuncelleVeliAdiTXT.setText("");
                                    uyeGuncelleVeliTelTXT.setText("");
                                    uyeGuncelleVeliEPostaTXT.setText("");
                                    uyeBakiyeTXT.setText("0 TL");
                                }
                            } 
                            catch (Exception e) 
                            {
                                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
                            }
                            
                            uyeGuncelleKartKontrol = false;
                            close();
                        }
                    }

                } catch (Exception e) {
                    uyeGuncelleKartNoTXT.setText(e.toString());
                }

            }
        /* Arduino Kart Okuma Komutları Son */
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCinsiyet = new javax.swing.ButtonGroup();
        Ana_Panel = new javax.swing.JDesktopPane();
        Kullanici_Giris_Paneli = new javax.swing.JInternalFrame();
        jPanel9 = new javax.swing.JPanel();
        KadiTXT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GirisBTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        SifreTXT = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Sepet = new javax.swing.JInternalFrame();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Sepet_Tablosu = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        sepetBarkodNOTXT = new javax.swing.JTextField();
        SatBTN = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        UrunuListeyeEkleBTN = new javax.swing.JButton();
        UrunuListedenCikartBTN = new javax.swing.JButton();
        KartIDTXT = new javax.swing.JLabel();
        UrunAdetiCOMBO = new javax.swing.JComboBox();
        sepetToplamTutarTXT = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        Uyelik = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanelKisiBilgileri = new javax.swing.JPanel();
        jLabelAd = new javax.swing.JLabel();
        jLabelSoyad = new javax.swing.JLabel();
        uyelikAdTXT = new javax.swing.JTextField();
        uyelikSoyadTXT = new javax.swing.JTextField();
        jLabeKartNo = new javax.swing.JLabel();
        uyelikKartNoTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        uyelikAdresTXT = new javax.swing.JTextArea();
        jLabelSoyad1 = new javax.swing.JLabel();
        uyelikVeliEPostaTXT = new javax.swing.JTextField();
        uyelikKadiTXT = new javax.swing.JTextField();
        uyeKaydetBTN = new javax.swing.JButton();
        uyelikKartNoSorgulaBTN = new javax.swing.JButton();
        uyelikVeliAdiTXT = new javax.swing.JTextField();
        uyelikSifreTXT = new javax.swing.JTextField();
        jLabelDogumTarihi = new javax.swing.JLabel();
        uyelikVeliTelTXT = new javax.swing.JTextField();
        jLabelDogumYeri = new javax.swing.JLabel();
        jLabelCinsiyet = new javax.swing.JLabel();
        jLabelSoyad2 = new javax.swing.JLabel();
        jLabelSoyad3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanelKisiBilgileri1 = new javax.swing.JPanel();
        jLabelAd1 = new javax.swing.JLabel();
        jLabelSoyad5 = new javax.swing.JLabel();
        jLabelDogumTarihi1 = new javax.swing.JLabel();
        jLabelCinsiyet2 = new javax.swing.JLabel();
        uyeGuncelleAdTXT = new javax.swing.JTextField();
        uyeGuncelleSoyadTXT = new javax.swing.JTextField();
        jLabelDogumYeri1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uyeGuncelleAdresTXT = new javax.swing.JTextArea();
        jLabelSoyad6 = new javax.swing.JLabel();
        uyeGuncelleVeliEPostaTXT = new javax.swing.JTextField();
        uyeGuncelle_GuncelleBTN = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        uyeGuncelleVeliTelTXT = new javax.swing.JTextField();
        uyeGuncelleVeliAdiTXT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        uyeBakiyeTXT = new javax.swing.JLabel();
        uyeGuncelleBakiyeTXT = new javax.swing.JTextField();
        uyeGuncelleBakiyeArttirBTN = new javax.swing.JButton();
        uyeGuncelleKartNoSorgulaBTN = new javax.swing.JButton();
        uyeGuncelleKartNoTXT = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        uyeSorgulaAdTXT = new javax.swing.JTextField();
        uyeSorgulaSorgulaBTN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        uyeSorgulaTABLO = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        uyeSorgulaSoyadTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Urunler = new javax.swing.JInternalFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        urunEkle = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanelKisiBilgileri2 = new javax.swing.JPanel();
        jLabelAd2 = new javax.swing.JLabel();
        jLabelSoyad4 = new javax.swing.JLabel();
        urunEkleUrunAdiTXT = new javax.swing.JTextField();
        urunEkleAdetTXT = new javax.swing.JTextField();
        jLabeKartNo1 = new javax.swing.JLabel();
        urunEkleBarkodNOTXT = new javax.swing.JTextField();
        urunEkleFiyatTXT = new javax.swing.JTextField();
        jLabelSoyad8 = new javax.swing.JLabel();
        urunEkleUrunEkleBTN = new javax.swing.JButton();
        urunEkleKaloriTXT = new javax.swing.JTextField();
        jLabelSoyad9 = new javax.swing.JLabel();
        urunGuncelle = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanelKisiBilgileri3 = new javax.swing.JPanel();
        jLabelAd3 = new javax.swing.JLabel();
        jLabelSoyad7 = new javax.swing.JLabel();
        urunGuncelleUrunAdiTXT = new javax.swing.JTextField();
        urunGuncelleAdetTXT = new javax.swing.JTextField();
        jLabeKartNo2 = new javax.swing.JLabel();
        urunGuncelleBarkodNOTXT = new javax.swing.JTextField();
        urunGuncelleFiyatTXT = new javax.swing.JTextField();
        jLabelSoyad10 = new javax.swing.JLabel();
        urunGuncelleBTN = new javax.swing.JButton();
        urunGuncelleKaloriTXT = new javax.swing.JTextField();
        jLabelSoyad11 = new javax.swing.JLabel();
        urunSilBTN = new javax.swing.JButton();
        urunGuncelleSorgulaBTN = new javax.swing.JButton();
        urunGuncelleUrunID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        urunSordula = new javax.swing.JPanel();
        urunSorgulaBarkodNOTXT = new javax.swing.JTextField();
        urunSorgulaBTN = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        urunSorgulaTABLO = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Fatura = new javax.swing.JInternalFrame();
        jPanelKayitBul = new javax.swing.JPanel();
        faturaUyeAdi = new javax.swing.JLabel();
        faturaBakiyeTXT = new javax.swing.JLabel();
        jLabelKayitBulAd1 = new javax.swing.JLabel();
        jLabelKayitBulAd2 = new javax.swing.JLabel();
        faturaToplamTutarTXT = new javax.swing.JLabel();
        jLabelKayitBulAd3 = new javax.swing.JLabel();
        faturaGunlukKaloriTXT = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelKayitBulAd4 = new javax.swing.JLabel();
        faturaKalanBakiyeTXT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelKayitBulAd5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        faturaYeniToplamKaloriTXT = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        faturaGunIciAlinanKaloriTXT = new javax.swing.JLabel();
        jLabelKayitBulAd6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        faturaTamamBTN = new javax.swing.JButton();
        faturaKapatBTN = new javax.swing.JButton();
        AnaMenu = new javax.swing.JMenuBar();
        SepetBTN = new javax.swing.JMenu();
        UrunlerBTN = new javax.swing.JMenu();
        UyelikBTN = new javax.swing.JMenu();
        CikisBTN = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 650));

        Ana_Panel.setBackground(new java.awt.Color(204, 204, 204));
        Ana_Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ana_Panel.setDoubleBuffered(true);

        Kullanici_Giris_Paneli.setBackground(new java.awt.Color(204, 204, 204));
        Kullanici_Giris_Paneli.setTitle("Kullanıcı Girişi");
        Kullanici_Giris_Paneli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Kullanici_Giris_Paneli.setDoubleBuffered(true);
        Kullanici_Giris_Paneli.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/icon.png"))); // NOI18N
        try {
            Kullanici_Giris_Paneli.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        Kullanici_Giris_Paneli.setVisible(true);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        KadiTXT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KadiTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kullanıcı Adı:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Şifre:");

        GirisBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/guncelleBTN.png"))); // NOI18N
        GirisBTN.setText("GİRİŞ");
        GirisBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisBTNActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/1322570359_Login Manager.png"))); // NOI18N

        SifreTXT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SifreTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SifreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KadiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(GirisBTN))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(KadiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(SifreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(GirisBTN)))
                .addGap(40, 40, 40))
        );

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("KANTİN OTOMASYONU");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout Kullanici_Giris_PaneliLayout = new javax.swing.GroupLayout(Kullanici_Giris_Paneli.getContentPane());
        Kullanici_Giris_Paneli.getContentPane().setLayout(Kullanici_Giris_PaneliLayout);
        Kullanici_Giris_PaneliLayout.setHorizontalGroup(
            Kullanici_Giris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Kullanici_Giris_PaneliLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Kullanici_Giris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Kullanici_Giris_PaneliLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Kullanici_Giris_PaneliLayout.setVerticalGroup(
            Kullanici_Giris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Kullanici_Giris_PaneliLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Kullanici_Giris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Ana_Panel.add(Kullanici_Giris_Paneli);
        Kullanici_Giris_Paneli.setBounds(10, 10, 450, 460);

        Sepet.setClosable(true);
        Sepet.setIconifiable(true);
        Sepet.setTitle("Sepet");
        Sepet.setDoubleBuffered(true);
        Sepet.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/icon.png"))); // NOI18N
        Sepet.setVisible(false);
        Sepet.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                SepetİnternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/sepet.png"))); // NOI18N

        Sepet_Tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Kodu", "Ürün", "Adet", "Toplam Kalori", "Birim Fiyatı (TL)", "Toplam Tutar (TL)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Sepet_Tablosu.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(Sepet_Tablosu);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("SEPET");

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/temizleBTN.png"))); // NOI18N
        jButton9.setText("Sepeti Temizle");
        jButton9.setActionCommand("SepetiTemizleBTN");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        sepetBarkodNOTXT.setToolTipText("");
        sepetBarkodNOTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SatBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/odeme.png"))); // NOI18N
        SatBTN.setText("Ödeme Yap");
        SatBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatBTNActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText(" Barkod NO");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText(" Adet");

        UrunuListeyeEkleBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/ekleBTN.png"))); // NOI18N
        UrunuListeyeEkleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunuListeyeEkleBTNActionPerformed(evt);
            }
        });

        UrunuListedenCikartBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/silBTN.png"))); // NOI18N
        UrunuListedenCikartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunuListedenCikartBTNActionPerformed(evt);
            }
        });

        KartIDTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        KartIDTXT.setToolTipText("");

        UrunAdetiCOMBO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        sepetToplamTutarTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sepetToplamTutarTXT.setText("0.0");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/tutarIMG.png"))); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(45, 35));

        javax.swing.GroupLayout SepetLayout = new javax.swing.GroupLayout(Sepet.getContentPane());
        Sepet.getContentPane().setLayout(SepetLayout);
        SepetLayout.setHorizontalGroup(
            SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SepetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SepetLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sepetBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SepetLayout.createSequentialGroup()
                                .addComponent(UrunAdetiCOMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrunuListeyeEkleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrunuListedenCikartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SepetLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SatBTN))
                    .addGroup(SepetLayout.createSequentialGroup()
                        .addComponent(KartIDTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sepetToplamTutarTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SepetLayout.setVerticalGroup(
            SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SepetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SepetLayout.createSequentialGroup()
                        .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UrunuListedenCikartBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(UrunuListeyeEkleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UrunAdetiCOMBO, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(sepetBarkodNOTXT)))
                    .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SepetLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KartIDTXT)
                            .addComponent(sepetToplamTutarTXT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SepetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SatBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sepetBarkodNOTXT.getAccessibleContext().setAccessibleName("");
        jLabel14.getAccessibleContext().setAccessibleName("Urun Kodu");
        UrunuListeyeEkleBTN.getAccessibleContext().setAccessibleName("EkleBTN");

        Ana_Panel.add(Sepet);
        Sepet.setBounds(10, 10, 900, 460);

        Uyelik.setClosable(true);
        Uyelik.setIconifiable(true);
        Uyelik.setTitle("Üyelik");
        Uyelik.setDoubleBuffered(true);
        Uyelik.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/icon.png"))); // NOI18N
        Uyelik.setVisible(false);
        Uyelik.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                UyelikİnternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                UyelikİnternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/ogrenciBG.png"))); // NOI18N

        jPanelKisiBilgileri.setToolTipText("");

        jLabelAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAd.setText("Ad:");

        jLabelSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad.setText("Soyad:");

        jLabeKartNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeKartNo.setText("Kart No:");

        uyelikKartNoTXT.setBackground(new java.awt.Color(240, 240, 240));
        uyelikKartNoTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uyelikKartNoTXT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        uyelikKartNoTXT.setEnabled(false);

        uyelikAdresTXT.setColumns(20);
        uyelikAdresTXT.setLineWrap(true);
        uyelikAdresTXT.setRows(5);
        jScrollPane1.setViewportView(uyelikAdresTXT);

        jLabelSoyad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad1.setText("Adres:");

        uyelikKadiTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        uyeKaydetBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/uyeEkleBTN.png"))); // NOI18N
        uyeKaydetBTN.setText(" Kaydet");
        uyeKaydetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeKaydetBTNActionPerformed(evt);
            }
        });

        uyelikKartNoSorgulaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/odeme.png"))); // NOI18N
        uyelikKartNoSorgulaBTN.setText("Kart No Sorgulat");
        uyelikKartNoSorgulaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyelikKartNoSorgulaBTNActionPerformed(evt);
            }
        });

        jLabelDogumTarihi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDogumTarihi.setText("Veli Adı:");

        jLabelDogumYeri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDogumYeri.setText("Veli TEL:");

        jLabelCinsiyet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCinsiyet.setText("Veli E-Posta:");

        jLabelSoyad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad2.setText("Kullanıcı Adı:");

        jLabelSoyad3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad3.setText("Şifre:");

        javax.swing.GroupLayout jPanelKisiBilgileriLayout = new javax.swing.GroupLayout(jPanelKisiBilgileri);
        jPanelKisiBilgileri.setLayout(jPanelKisiBilgileriLayout);
        jPanelKisiBilgileriLayout.setHorizontalGroup(
            jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabeKartNo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabelAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSoyad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(uyelikAdTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyelikSoyadTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyelikKartNoTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                        .addComponent(jLabelDogumYeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyelikVeliTelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uyeKaydetBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyelikKartNoSorgulaBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabelDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyelikVeliAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabelCinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyelikVeliEPostaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabelSoyad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyelikKadiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabelSoyad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyelikSifreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelKisiBilgileriLayout.setVerticalGroup(
            jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyelikKartNoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeKartNo)
                    .addComponent(uyelikVeliAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyelikAdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAd)
                    .addComponent(uyelikVeliTelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDogumYeri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyelikSoyadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad)
                    .addComponent(uyelikVeliEPostaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCinsiyet))
                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelKisiBilgileriLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelSoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelKisiBilgileriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelKisiBilgileriLayout.createSequentialGroup()
                                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uyelikKadiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSoyad2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelKisiBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uyelikSifreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSoyad3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyelikKartNoSorgulaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyeKaydetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanelKisiBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelKisiBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelKisiBilgileri.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yeni Üye", jPanel2);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/ogrenciBG.png"))); // NOI18N

        jPanelKisiBilgileri1.setToolTipText("");
        jPanelKisiBilgileri1.setName(""); // NOI18N

        jLabelAd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAd1.setText("Ad:");

        jLabelSoyad5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad5.setText("Soyad:");

        jLabelDogumTarihi1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDogumTarihi1.setText("Veli Adı:");

        jLabelCinsiyet2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCinsiyet2.setText("Veli E-Posta:");

        jLabelDogumYeri1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDogumYeri1.setText("Veli TEL:");

        uyeGuncelleAdresTXT.setColumns(20);
        uyeGuncelleAdresTXT.setLineWrap(true);
        uyeGuncelleAdresTXT.setRows(5);
        jScrollPane2.setViewportView(uyeGuncelleAdresTXT);

        jLabelSoyad6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad6.setText("Adres:");

        uyeGuncelle_GuncelleBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/guncelleBTN.png"))); // NOI18N
        uyeGuncelle_GuncelleBTN.setText("Güncelle");
        uyeGuncelle_GuncelleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGuncelle_GuncelleBTNActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/silBTN.png"))); // NOI18N
        jButton1.setText("Üye Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/bakiye.png"))); // NOI18N

        uyeBakiyeTXT.setFont(new java.awt.Font("Tahoma", 0, 42)); // NOI18N
        uyeBakiyeTXT.setForeground(new java.awt.Color(255, 150, 0));
        uyeBakiyeTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        uyeBakiyeTXT.setText("0 TL");

        uyeGuncelleBakiyeTXT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        uyeGuncelleBakiyeTXT.setForeground(new java.awt.Color(255, 150, 0));
        uyeGuncelleBakiyeTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        uyeGuncelleBakiyeArttirBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/bakiyeArttirBTN.png"))); // NOI18N
        uyeGuncelleBakiyeArttirBTN.setText("Bakiye Arttır");
        uyeGuncelleBakiyeArttirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGuncelleBakiyeArttirBTNActionPerformed(evt);
            }
        });

        uyeGuncelleKartNoSorgulaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/odeme.png"))); // NOI18N
        uyeGuncelleKartNoSorgulaBTN.setText("Kart No Sorgula");
        uyeGuncelleKartNoSorgulaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGuncelleKartNoSorgulaBTNActionPerformed(evt);
            }
        });

        uyeGuncelleKartNoTXT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uyeGuncelleKartNoTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uyeGuncelleKartNoTXT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        uyeGuncelleKartNoTXT.setEnabled(false);

        javax.swing.GroupLayout jPanelKisiBilgileri1Layout = new javax.swing.GroupLayout(jPanelKisiBilgileri1);
        jPanelKisiBilgileri1.setLayout(jPanelKisiBilgileri1Layout);
        jPanelKisiBilgileri1Layout.setHorizontalGroup(
            jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAd1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelSoyad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelSoyad6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(uyeGuncelleAdTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uyeGuncelleSoyadTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelle_GuncelleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(jLabelDogumTarihi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleVeliAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(jLabelDogumYeri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleVeliTelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(jLabelCinsiyet2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleVeliEPostaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(uyeBakiyeTXT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleBakiyeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleBakiyeArttirBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKisiBilgileri1Layout.createSequentialGroup()
                                        .addComponent(uyeGuncelleKartNoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uyeGuncelleKartNoSorgulaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanelKisiBilgileri1Layout.setVerticalGroup(
            jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(uyeBakiyeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(uyeGuncelleBakiyeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeGuncelleBakiyeArttirBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyeGuncelleKartNoSorgulaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeGuncelleKartNoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelleAdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelleSoyadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSoyad5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSoyad6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelKisiBilgileri1Layout.createSequentialGroup()
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelleVeliAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDogumTarihi1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelleVeliTelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDogumYeri1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelleVeliEPostaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCinsiyet2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiBilgileri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uyeGuncelle_GuncelleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelKisiBilgileri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelKisiBilgileri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelKisiBilgileri1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Üye Güncelle", jPanel7);

        uyeSorgulaSorgulaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/araBTN.png"))); // NOI18N
        uyeSorgulaSorgulaBTN.setText("Sorgula");
        uyeSorgulaSorgulaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeSorgulaSorgulaBTNActionPerformed(evt);
            }
        });

        uyeSorgulaTABLO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Adı", "Soyadı", "Veli Adı", "Veli Tel", "Veli E-Posta", "Adres", "Kullanıcı Adı", "Şifre", "Bakiye"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(uyeSorgulaTABLO);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Soyadı");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uyeSorgulaAdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(uyeSorgulaSoyadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uyeSorgulaSorgulaBTN))
                            .addComponent(jLabel2))
                        .addContainerGap(365, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyeSorgulaAdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeSorgulaSorgulaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uyeSorgulaSoyadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        jTabbedPane1.addTab("Üye Sorgula", jPanel10);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/1322642366_stock_save.png"))); // NOI18N
        jButton8.setText("KAYDET");

        javax.swing.GroupLayout UyelikLayout = new javax.swing.GroupLayout(Uyelik.getContentPane());
        Uyelik.getContentPane().setLayout(UyelikLayout);
        UyelikLayout.setHorizontalGroup(
            UyelikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UyelikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UyelikLayout.setVerticalGroup(
            UyelikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UyelikLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UyelikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(22, 22, 22))
        );

        Ana_Panel.add(Uyelik);
        Uyelik.setBounds(10, 10, 820, 410);

        Urunler.setClosable(true);
        Urunler.setIconifiable(true);
        Urunler.setTitle("Ürünler");
        Urunler.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Urunler.setDoubleBuffered(true);
        Urunler.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/icon.png"))); // NOI18N
        Urunler.setVisible(false);

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/Urunler.png"))); // NOI18N

        jPanelKisiBilgileri2.setToolTipText("");

        jLabelAd2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAd2.setText("Ürün Adı:");

        jLabelSoyad4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad4.setText("Stok Sayısı:");

        jLabeKartNo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeKartNo1.setText("Barkod No:");

        jLabelSoyad8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad8.setText("Kolorisi:");

        urunEkleUrunEkleBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/ekleBTN.png"))); // NOI18N
        urunEkleUrunEkleBTN.setText(" Kaydet");
        urunEkleUrunEkleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunEkleUrunEkleBTNActionPerformed(evt);
            }
        });

        jLabelSoyad9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad9.setText("Fiyatı (TL):");

        javax.swing.GroupLayout jPanelKisiBilgileri2Layout = new javax.swing.GroupLayout(jPanelKisiBilgileri2);
        jPanelKisiBilgileri2.setLayout(jPanelKisiBilgileri2Layout);
        jPanelKisiBilgileri2Layout.setHorizontalGroup(
            jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri2Layout.createSequentialGroup()
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabeKartNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSoyad4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSoyad8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri2Layout.createSequentialGroup()
                        .addComponent(urunEkleBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urunEkleUrunEkleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(jPanelKisiBilgileri2Layout.createSequentialGroup()
                        .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urunEkleKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunEkleAdetTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunEkleUrunAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunEkleFiyatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanelKisiBilgileri2Layout.setVerticalGroup(
            jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri2Layout.createSequentialGroup()
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunEkleBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeKartNo1)
                    .addComponent(urunEkleUrunEkleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunEkleUrunAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunEkleAdetTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunEkleKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunEkleFiyatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(32, 32, 32)
                .addComponent(jPanelKisiBilgileri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24)
            .addComponent(jPanelKisiBilgileri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout urunEkleLayout = new javax.swing.GroupLayout(urunEkle);
        urunEkle.setLayout(urunEkleLayout);
        urunEkleLayout.setHorizontalGroup(
            urunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        urunEkleLayout.setVerticalGroup(
            urunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunEkleLayout.createSequentialGroup()
                .addGroup(urunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urunEkleLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(urunEkleLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ürün Ekle", urunEkle);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/Urunler.png"))); // NOI18N

        jPanelKisiBilgileri3.setToolTipText("");

        jLabelAd3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAd3.setText("Ürün Adı:");

        jLabelSoyad7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad7.setText("Stok Sayısı:");

        jLabeKartNo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeKartNo2.setText("Barkod No:");

        urunGuncelleBarkodNOTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelSoyad10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad10.setText("Kolorisi:");

        urunGuncelleBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/guncelleBTN.png"))); // NOI18N
        urunGuncelleBTN.setText("Güncelle");
        urunGuncelleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunGuncelleBTNActionPerformed(evt);
            }
        });

        jLabelSoyad11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoyad11.setText("Fiyatı (TL):");

        urunSilBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/silBTN.png"))); // NOI18N
        urunSilBTN.setText("Sil");
        urunSilBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunSilBTNActionPerformed(evt);
            }
        });

        urunGuncelleSorgulaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/araBTN.png"))); // NOI18N
        urunGuncelleSorgulaBTN.setText("Ürün Sorgula");
        urunGuncelleSorgulaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunGuncelleSorgulaBTNActionPerformed(evt);
            }
        });

        urunGuncelleUrunID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        urunGuncelleUrunID.setForeground(new java.awt.Color(51, 51, 51));
        urunGuncelleUrunID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        urunGuncelleUrunID.setText("Ürün Sorgulatınız");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelKisiBilgileri3Layout = new javax.swing.GroupLayout(jPanelKisiBilgileri3);
        jPanelKisiBilgileri3.setLayout(jPanelKisiBilgileri3Layout);
        jPanelKisiBilgileri3Layout.setHorizontalGroup(
            jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabeKartNo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSoyad7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSoyad10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                        .addComponent(urunGuncelleBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urunGuncelleSorgulaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                        .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                                .addComponent(urunGuncelleKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(urunGuncelleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                                        .addComponent(urunGuncelleUrunAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urunGuncelleUrunID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                                        .addComponent(urunGuncelleAdetTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                                        .addComponent(urunGuncelleFiyatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urunSilBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelKisiBilgileri3Layout.setVerticalGroup(
            jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiBilgileri3Layout.createSequentialGroup()
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunGuncelleBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabeKartNo2)
                        .addComponent(urunGuncelleSorgulaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunGuncelleUrunAdiTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAd3)
                    .addComponent(urunGuncelleUrunID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urunGuncelleAdetTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSoyad7))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunGuncelleKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad10)
                    .addComponent(urunGuncelleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiBilgileri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunGuncelleFiyatTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urunSilBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(32, 32, 32)
                .addComponent(jPanelKisiBilgileri3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelKisiBilgileri3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout urunGuncelleLayout = new javax.swing.GroupLayout(urunGuncelle);
        urunGuncelle.setLayout(urunGuncelleLayout);
        urunGuncelleLayout.setHorizontalGroup(
            urunGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunGuncelleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        urunGuncelleLayout.setVerticalGroup(
            urunGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunGuncelleLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(urunGuncelleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Ürün Güncelle", urunGuncelle);

        urunSorgulaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/araBTN.png"))); // NOI18N
        urunSorgulaBTN.setText("Sorgula");
        urunSorgulaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunSorgulaBTNActionPerformed(evt);
            }
        });

        urunSorgulaTABLO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Barkod NO", "Ürün Adı", "Stok Sayısı", "Kalorisi", "Fiyatı (TL)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(urunSorgulaTABLO);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText(" Barkod No");

        javax.swing.GroupLayout urunSordulaLayout = new javax.swing.GroupLayout(urunSordula);
        urunSordula.setLayout(urunSordulaLayout);
        urunSordulaLayout.setHorizontalGroup(
            urunSordulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunSordulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(urunSordulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(urunSordulaLayout.createSequentialGroup()
                        .addGroup(urunSordulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(urunSordulaLayout.createSequentialGroup()
                                .addComponent(urunSorgulaBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(urunSorgulaBTN))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        urunSordulaLayout.setVerticalGroup(
            urunSordulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urunSordulaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(urunSordulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunSorgulaBarkodNOTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunSorgulaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );

        jTabbedPane2.addTab("Ürün Sorgula", urunSordula);

        javax.swing.GroupLayout UrunlerLayout = new javax.swing.GroupLayout(Urunler.getContentPane());
        Urunler.getContentPane().setLayout(UrunlerLayout);
        UrunlerLayout.setHorizontalGroup(
            UrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
            .addGroup(UrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UrunlerLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        UrunlerLayout.setVerticalGroup(
            UrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(UrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UrunlerLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        Ana_Panel.add(Urunler);
        Urunler.setBounds(10, 10, 690, 420);
        Urunler.getAccessibleContext().setAccessibleName("Ururunler");

        Fatura.setClosable(true);
        Fatura.setIconifiable(true);
        Fatura.setTitle("Fatura");
        Fatura.setDoubleBuffered(true);
        Fatura.setVisible(false);
        Fatura.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                FaturaİnternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        faturaUyeAdi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        faturaUyeAdi.setText("Ercan KORKMAZ");

        faturaBakiyeTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaBakiyeTXT.setText("0 TL");

        jLabelKayitBulAd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd1.setText("Bakiye                 ");

        jLabelKayitBulAd2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd2.setText("Toplam Tutar  ");

        faturaToplamTutarTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaToplamTutarTXT.setText("0 TL");

        jLabelKayitBulAd3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd3.setText("Günlük Kalori Kısıtlaması");

        faturaGunlukKaloriTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaGunlukKaloriTXT.setText("0");

        jLabelKayitBulAd4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd4.setText("Kalan Bakiye ");

        faturaKalanBakiyeTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaKalanBakiyeTXT.setText("0 TL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText(":");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText(":");

        jLabelKayitBulAd5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd5.setText("Yeni Kalori Toplamı");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText(":");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText(":");

        faturaYeniToplamKaloriTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaYeniToplamKaloriTXT.setText("0");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText(":");

        faturaGunIciAlinanKaloriTXT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faturaGunIciAlinanKaloriTXT.setText("0");

        jLabelKayitBulAd6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelKayitBulAd6.setText("Gün İçinde Alınan Kalori");

        faturaTamamBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        faturaTamamBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/guncelleBTN.png"))); // NOI18N
        faturaTamamBTN.setText("Tamam");
        faturaTamamBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturaTamamBTNActionPerformed(evt);
            }
        });

        faturaKapatBTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        faturaKapatBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/silBTN.png"))); // NOI18N
        faturaKapatBTN.setText("Ödemeyi İptal Et");
        faturaKapatBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturaKapatBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKayitBulLayout = new javax.swing.GroupLayout(jPanelKayitBul);
        jPanelKayitBul.setLayout(jPanelKayitBulLayout);
        jPanelKayitBulLayout.setHorizontalGroup(
            jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                        .addComponent(jLabelKayitBulAd4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faturaKalanBakiyeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelKayitBulAd5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faturaYeniToplamKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKayitBulLayout.createSequentialGroup()
                        .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                                .addComponent(jLabelKayitBulAd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faturaBakiyeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                                .addComponent(jLabelKayitBulAd2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faturaToplamTutarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKayitBulAd3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelKayitBulAd6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faturaGunlukKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faturaGunIciAlinanKaloriTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                        .addComponent(faturaUyeAdi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKayitBulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(faturaKapatBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faturaTamamBTN)))
                .addContainerGap())
        );
        jPanelKayitBulLayout.setVerticalGroup(
            jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKayitBulLayout.createSequentialGroup()
                .addComponent(faturaUyeAdi)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faturaBakiyeTXT)
                    .addComponent(jLabelKayitBulAd1)
                    .addComponent(jLabel9)
                    .addComponent(faturaGunlukKaloriTXT)
                    .addComponent(jLabelKayitBulAd3)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKayitBulAd2)
                    .addComponent(faturaToplamTutarTXT)
                    .addComponent(jLabel15)
                    .addComponent(jLabel30)
                    .addComponent(faturaGunIciAlinanKaloriTXT)
                    .addComponent(jLabelKayitBulAd6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKayitBulAd4)
                    .addComponent(faturaKalanBakiyeTXT)
                    .addComponent(jLabel16)
                    .addComponent(faturaYeniToplamKaloriTXT)
                    .addComponent(jLabelKayitBulAd5)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKayitBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(faturaTamamBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faturaKapatBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout FaturaLayout = new javax.swing.GroupLayout(Fatura.getContentPane());
        Fatura.getContentPane().setLayout(FaturaLayout);
        FaturaLayout.setHorizontalGroup(
            FaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelKayitBul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FaturaLayout.setVerticalGroup(
            FaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelKayitBul, javax.swing.GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE))
        );

        Ana_Panel.add(Fatura);
        Fatura.setBounds(10, 10, 700, 210);

        AnaMenu.setDoubleBuffered(true);

        SepetBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/sepet.png"))); // NOI18N
        SepetBTN.setText("Sepet");
        SepetBTN.setEnabled(false);
        SepetBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SepetMouseClicked(evt);
            }
        });
        AnaMenu.add(SepetBTN);

        UrunlerBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/urun_sorgula.png"))); // NOI18N
        UrunlerBTN.setText("Ürünler");
        UrunlerBTN.setEnabled(false);
        UrunlerBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UrunlerBTNMouseClicked(evt);
            }
        });
        AnaMenu.add(UrunlerBTN);

        UyelikBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/ogrenciBTN.png"))); // NOI18N
        UyelikBTN.setText("Üyelik");
        UyelikBTN.setEnabled(false);
        UyelikBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UyelikBTNMouseClicked(evt);
            }
        });
        AnaMenu.add(UyelikBTN);

        CikisBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personrecod/img/1322576434_logout.png"))); // NOI18N
        CikisBTN.setText("Çıkış");
        CikisBTN.setEnabled(false);
        CikisBTN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        CikisBTN.setVerifyInputWhenFocusTarget(false);
        CikisBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CikisBTNMouseClicked(evt);
            }
        });
        AnaMenu.add(CikisBTN);

        setJMenuBar(AnaMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ana_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ana_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciSorgula()
    {
        try{
            preparedStatement = baglanti.prepareStatement("select * from kullanici");
            resultSet = preparedStatement.executeQuery();
            
            int kontrol = 0;
            while(resultSet.next()){
                String Kadi = resultSet.getString("Kadi");
                String Sifre = resultSet.getString("Sifre");

                if(stringTemizle(KadiTXT.getText()).equals(Kadi) && stringTemizle(SifreTXT.getText()).equals(Sifre))
                {
                    control=true;
                    Kullanici_Giris_Paneli.setVisible(false);
                    Sepet.setVisible(true);
                    SepetBTN.setEnabled(true);
                    UrunlerBTN.setEnabled(true);
                    UyelikBTN.setEnabled(true);
                    CikisBTN.setEnabled(true);
                    kontrol++;
                }
            }
            if(kontrol == 0)
            {
                JOptionPane.showMessageDialog(null,"Kullanıcı adı ya da şifre hatalı!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Bir hata oluştu. Lütfen daha sonra tekrar deneyiniz.");
        }
    }
    private void uyeKaydet()
    {
        String KartNO = uyelikKartNoTXT.getText();
        String Kadi = stringTemizle(uyelikKadiTXT.getText());
        String Sifre = stringTemizle(uyelikSifreTXT.getText());
        String Ad = stringTemizle(uyelikAdTXT.getText());
        String Soyad = stringTemizle(uyelikSoyadTXT.getText());
        String Adres = stringTemizle(uyelikAdresTXT.getText());
        String VeliAdi = stringTemizle(uyelikVeliAdiTXT.getText());
        String VeliTel = stringTemizle(uyelikVeliTelTXT.getText());
        String VeliEPosta = stringTemizle(uyelikVeliEPostaTXT.getText());
        
        if(KartNO.equals("") || Kadi.equals("") || Sifre.equals("") || Ad.equals("") || Soyad.equals("") || Adres.equals("") || VeliAdi.equals("") || VeliTel.equals("") || VeliEPosta.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Tüm form elemanlarını doldurunuz.");
        }
        else
        {
            try
            {
                int KartNOKontrol = 0;
                preparedStatement = baglanti.prepareStatement("select * from uyeler where KartNO = '" + KartNO + "'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){KartNOKontrol++;}
                int KadiKontrol = 0;
                preparedStatement = baglanti.prepareStatement("select * from uyeler where Kadi = '" + Kadi + "'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){KadiKontrol++;}
                
                if(uyelikKartKontrol == false)
                {
                    if(KartNOKontrol == 0)
                    {
                        if(KadiKontrol == 0)
                        {
                            String sql = "insert into uyeler (KartNO,Kadi,Sifre,Ad,Soyad,Adres,VeliAdi,VeliTel,VeliEPosta,GunlukKalori,Bakiye,Kontrol) values "
                                    + "('"+KartNO+"', '"+Kadi+"', '"+Sifre+"', '"+Ad+"', '"+Soyad+"', '"+Adres+"', '"+VeliAdi+"', '"+VeliTel+"', '"+VeliEPosta+"', '0', '0', '0')";
                            Statement kaydet = baglanti.createStatement();
                            kaydet.executeUpdate(sql);

                            JOptionPane.showMessageDialog(null,"Kayıt Başarılı");
                            uyelikKartNoTXT.setText("");
                            uyelikKadiTXT.setText("");
                            uyelikSifreTXT.setText("");
                            uyelikAdTXT.setText("");
                            uyelikSoyadTXT.setText("");
                            uyelikAdresTXT.setText("");
                            uyelikVeliAdiTXT.setText("");
                            uyelikVeliTelTXT.setText("");
                            uyelikVeliEPostaTXT.setText("");
                        }
                        else
                            JOptionPane.showMessageDialog(null, "- " + Kadi + " - kullanıcı adına sahip bir kullanıcı zaten var. \n          Başka bir -Kullanıcı Adı- belirleyiniz.");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "- " + KartNO + " - kart numarasına sahip bir üye zaten mevcut.");
                }
                else
                    JOptionPane.showMessageDialog(null, "Kart Okutunuz");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void uyelikGuncelle()
    {
        if(uyeGuncelleKartNoTXT.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Kart NO Sorgulayınız");
        else
        {
            if(uyeGuncelleAdTXT.getText().equals("") || uyeGuncelleSoyadTXT.getText().equals("") || uyeGuncelleAdresTXT.getText().equals("") || uyeGuncelleVeliAdiTXT.getText().equals("") || uyeGuncelleVeliTelTXT.getText().equals("") || uyeGuncelleVeliEPostaTXT.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Tüm form elemanlarını doldurunuz.");
            else
            {
                try
                {
                    String sql = "update uyeler set Ad='"+ stringTemizle(uyeGuncelleAdTXT.getText()) +"', Soyad='"+ stringTemizle(uyeGuncelleSoyadTXT.getText()) +"', Adres='"+ stringTemizle(uyeGuncelleAdresTXT.getText()) +"', VeliAdi='"+ stringTemizle(uyeGuncelleVeliAdiTXT.getText()) +"', VeliTel='"+ stringTemizle(uyeGuncelleVeliTelTXT.getText()) +"', VeliEPosta='"+ stringTemizle(uyeGuncelleVeliEPostaTXT.getText()) +"' where KartNO = '"+ uyeGuncelleKartNoTXT.getText() +"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();

                    JOptionPane.showMessageDialog(null,"Güncelleme Yapıldı");
                    uyeGuncelleKartNoTXT.setText("");
                    uyeGuncelleAdTXT.setText("");
                    uyeGuncelleSoyadTXT.setText("");
                    uyeGuncelleAdresTXT.setText("");
                    uyeGuncelleVeliAdiTXT.setText("");
                    uyeGuncelleVeliTelTXT.setText("");
                    uyeGuncelleVeliEPostaTXT.setText("");
                    uyeGuncelleBakiyeTXT.setText("");
                    uyeGuncelleBakiyeTXT.setText("");
                    uyeBakiyeTXT.setText("0 TL");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
                }
            }
        }
    }
    private void uyelikSil()
    {
        if(uyeGuncelleKartNoTXT.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Kart NO Sorgulayınız");
        else
        {
            try
            {
                String sql = "delete from uyeler where KartNO ='"+uyeGuncelleKartNoTXT.getText()+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                
                JOptionPane.showMessageDialog(null,"Üye Silindi");
                uyeGuncelleKartNoTXT.setText("");
                uyeGuncelleAdTXT.setText("");
                uyeGuncelleSoyadTXT.setText("");
                uyeGuncelleAdresTXT.setText("");
                uyeGuncelleVeliAdiTXT.setText("");
                uyeGuncelleVeliTelTXT.setText("");
                uyeGuncelleVeliEPostaTXT.setText("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void uyeBakiyeArttir()
    {
        if(uyeGuncelleKartNoTXT.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Kart NO Sorgulayınız");
        else
        {
            if(uyeGuncelleBakiyeTXT.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Eklenecek miktarı giriniz.");
            else
            {
                try
                {
                    float mevcutBakiye = 0;
                    float yeniBakiye = 0;
                    float arttirilanMiktar = Float.valueOf(stringTemizle(uyeGuncelleBakiyeTXT.getText()));
                    if(arttirilanMiktar < 0)
                        arttirilanMiktar *= -1;
                    
                    preparedStatement = baglanti.prepareStatement("select Bakiye from uyeler where KartNO = '"+ uyeGuncelleKartNoTXT.getText() +"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){ mevcutBakiye = resultSet.getFloat("Bakiye"); }
                    
                    yeniBakiye += mevcutBakiye + arttirilanMiktar;
                    
                    String sql = "update uyeler set Bakiye='"+ yeniBakiye +"' where KartNO = '"+ uyeGuncelleKartNoTXT.getText() +"'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();
                            
                    JOptionPane.showMessageDialog(null,"Bakiye " + arttirilanMiktar + " TL Arttırıldı");
                    uyeBakiyeTXT.setText(String.format("%.2f", yeniBakiye).replace(",",".") + " TL");
                    uyeGuncelleBakiyeTXT.setText("");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
                    uyeGuncelleBakiyeTXT.setText("");
                }
            }
        }
    }
    private void uyelerTablosuDoldur(String ad, String soyad)
    {
        String baslik[] = new String[]{"Adı", "Soyadı", "Veli Adı", "Veli Tel", "Veli E-Posta", "Adres", "Kullanıcı Adı", "Şifre", "Bakiye"}; 
        try
        {
            String sql = null;
            if(ad.equals("") && soyad.equals(""))
                sql = "select * from uyeler";
            else if(soyad.equals(""))
                sql = "select * from uyeler where Ad like '%" +ad+ "%'";
            else if(ad.equals(""))
                sql = "select * from uyeler where Soyad like '%" +soyad+ "%'";
            else
                sql = "select * from uyeler where Ad like '%" +ad+ "%' and Soyad like '%" +soyad+ "%'";
            
            int sayac = 0;
            String sifre = null;
            preparedStatement = baglanti.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {sayac++;}
            
            preparedStatement = baglanti.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Object data[][] = new Object[sayac][];
            int i=0;
            while(resultSet.next())
            {
                if(resultSet.getInt("Kontrol") == 0)
                    sifre = resultSet.getString("Sifre");
                else
                    sifre = "Güncellendi";
                    
                data[i] = new Object[]{
                    resultSet.getString("Ad"),
                    resultSet.getString("Soyad"),
                    resultSet.getString("VeliAdi"),
                    resultSet.getString("VeliTel"),
                    resultSet.getString("VeliEPosta"),
                    resultSet.getString("Adres"),
                    resultSet.getString("Kadi"),
                    sifre,
                    String.format("%.2f", resultSet.getFloat("Bakiye")).replace(",",".") + " TL",
                };
                i++;
            }
            uyeSorgulaTABLO.setModel(new DefaultTableModel(data, baslik));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
        }
    }
    private void urunEkle()
    {
        String BarkodNO = stringTemizle(urunEkleBarkodNOTXT.getText());
        String Urun = stringTemizle(urunEkleUrunAdiTXT.getText());
        String Adet = stringTemizle(urunEkleAdetTXT.getText());
        String Kalori = stringTemizle(urunEkleKaloriTXT.getText());
        String Fiyat = stringTemizle(urunEkleFiyatTXT.getText());
        
        if(BarkodNO.equals("") || Urun.equals("") || Adet.equals("") || Kalori.equals("") || Fiyat.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Tüm form elemanlarını doldurunuz.");
        }
        else
        {
            try
            {
                int BarkotNOKontrol = 0;
                preparedStatement = baglanti.prepareStatement("select * from urunler where BarkodNO = '" + BarkodNO + "'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){BarkotNOKontrol++;}
                
                if(BarkotNOKontrol == 0)
                {
                    String sql = "insert into urunler (BarkodNO,Urun,Adet,Kalori,Fiyat) values "
                        + "('"+BarkodNO+"', '"+Urun+"', '"+Adet+"', '"+Kalori+"', '"+Fiyat+"')";
                    Statement kaydet = baglanti.createStatement();
                    kaydet.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null,"Kayıt Başarılı");
                    urunEkleBarkodNOTXT.setText("");
                    urunEkleUrunAdiTXT.setText("");
                    urunEkleAdetTXT.setText("");
                    urunEkleKaloriTXT.setText("");
                    urunEkleFiyatTXT.setText("");
                }
                else
                    JOptionPane.showMessageDialog(null, "- " + BarkodNO + " - barkod numarasına kayıtlı bir ürün zaten mevcut.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void urunIDSorgulat()
    {
        String BarkodNO = stringTemizle(urunGuncelleBarkodNOTXT.getText());
        
        if(BarkodNO.equals(""))
            JOptionPane.showMessageDialog(null,"Barkod numarası giriniz.");
        else
        {
            try
            {
                int urunGuncelleUrunIDKontrol = 0;
                preparedStatement = baglanti.prepareStatement("select * from urunler where BarkodNO = '"+ BarkodNO +"'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next())
                {
                    urunGuncelleUrunID.setText(resultSet.getString("id"));
                    urunGuncelleUrunAdiTXT.setText(resultSet.getString("Urun"));
                    urunGuncelleAdetTXT.setText(resultSet.getString("Adet"));
                    urunGuncelleKaloriTXT.setText(resultSet.getString("Kalori"));
                    urunGuncelleFiyatTXT.setText(resultSet.getString("Fiyat"));
                    urunGuncelleUrunIDKontrol = 1;
                }
                if(urunGuncelleUrunIDKontrol == 0)
                {
                    JOptionPane.showMessageDialog(null,"- " + BarkodNO + " - barkod numarasına kayıtlı ürün bulunamadı.");
                    urunGuncelleBarkodNOTXT.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void urunSil()
    {
        if(urunGuncelleUrunID.getText().equals("Ürün Sorgulatınız"))
            JOptionPane.showMessageDialog(null,"Barkod NO Sorgulayınız");
        else
        {
            try
            {
                String sql = "delete from urunler where BarkodNO ='"+urunGuncelleBarkodNOTXT.getText()+"'";
                preparedStatement = baglanti.prepareStatement(sql);
                preparedStatement.execute();
                
                JOptionPane.showMessageDialog(null,"Ürün Silindi");
                urunGuncelleBarkodNOTXT.setText("");
                urunGuncelleUrunAdiTXT.setText("");
                urunGuncelleAdetTXT.setText("");
                urunGuncelleKaloriTXT.setText("");
                urunGuncelleFiyatTXT.setText("");
                urunGuncelleUrunID.setText("Ürün Sorgulatınız");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void urunGuncelle()
    {
        if(urunGuncelleUrunID.getText().equals("Ürün Sorgulatınız"))
            JOptionPane.showMessageDialog(null,"Barkod NO Sorgulayınız");
        else
        {
            if(urunGuncelleBarkodNOTXT.getText().equals("") || urunGuncelleUrunAdiTXT.getText().equals("") || urunGuncelleAdetTXT.getText().equals("") || urunGuncelleKaloriTXT.getText().equals("") || urunGuncelleFiyatTXT.getText().equals(""))
                JOptionPane.showMessageDialog(null,"Tüm form elemanlarını doldurunuz.");
            else
            {
                try
                {
                    String sql = "update urunler set Urun='"+ stringTemizle(urunGuncelleUrunAdiTXT.getText()) +"', Adet='"+ stringTemizle(urunGuncelleAdetTXT.getText()) +"', Kalori='"+ stringTemizle(urunGuncelleKaloriTXT.getText()) +"', Fiyat='"+ stringTemizle(urunGuncelleFiyatTXT.getText()) +"' where id = '" +urunGuncelleUrunID.getText()+ "'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();

                    JOptionPane.showMessageDialog(null,"Güncelleme Yapıldı");
                    urunGuncelleBarkodNOTXT.setText("");
                    urunGuncelleUrunAdiTXT.setText("");
                    urunGuncelleAdetTXT.setText("");
                    urunGuncelleKaloriTXT.setText("");
                    urunGuncelleFiyatTXT.setText("");
                    urunGuncelleUrunID.setText("Ürün Sorgulatınız");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
                }
            }
        }
    }
    private void urunlerTablosuDoldur(String BarkodNo)
    {
        String baslik[] = new String[]{"Barkod NO", "Ürün Adı", "Stok Sayısı", "Kalorisi", "Fiyatı (TL)"}; 
        try
        {
            String sql = null;
            if(BarkodNo.equals(""))
                sql = "select * from urunler";
            else
                sql = "select * from urunler where BarkodNO like '%" +BarkodNo+ "%'";
            
            int sayac = 0;
            preparedStatement = baglanti.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {sayac++;}
            
            preparedStatement = baglanti.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Object data[][] = new Object[sayac][];
            int i=0;
            while(resultSet.next())
            {
                data[i] = new Object[]{
                    resultSet.getString("BarkodNO"),
                    resultSet.getString("Urun"),
                    resultSet.getString("Adet"),
                    resultSet.getString("Kalori"),
                    resultSet.getString("Fiyat") + " TL"
                };
                i++;
            }
            urunSorgulaTABLO.setModel(new DefaultTableModel(data, baslik));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
        }
    }
    private void urunuListeyeEkle()
    {
        String sepetBarkodNO = stringTemizle(sepetBarkodNOTXT.getText());
        if(sepetBarkodNO.equals(""))
            JOptionPane.showMessageDialog(null,"Barkod NO giriniz.");
        else
        {
            String sepetUrunAdi = null;
            int sepetUrunKalorisi = 0;
            float sepetUrunBirimFiyati = 0;
            float sepetUrunToplamTutari = 0;

            try
            {
                preparedStatement = baglanti.prepareStatement("select * from urunler where BarkodNO = '" +sepetBarkodNO+ "'");
                resultSet = preparedStatement.executeQuery();
                int  kontrol = 0;
                while(resultSet.next())
                {
                    sepetUrunAdi = resultSet.getString("Urun");
                    sepetUrunKalorisi = Integer.parseInt((String) UrunAdetiCOMBO.getSelectedItem()) * Integer.parseInt(resultSet.getString("Kalori"));
                    sepetToplamKalori += sepetUrunKalorisi;
                    sepetUrunBirimFiyati = Float.valueOf(resultSet.getFloat("Fiyat"));
                    sepetUrunToplamTutari = Float.valueOf((String) UrunAdetiCOMBO.getSelectedItem()) * Float.valueOf(resultSet.getFloat("Fiyat"));
                    sepetToplamTutar += sepetUrunToplamTutari;
                    
                    sepetToplamTutarTXT.setText(String.format("%.2f", sepetToplamTutar).replace(",","."));
                    kontrol = 1;
                }
                if(kontrol == 1)
                {
                    DefaultTableModel model = (DefaultTableModel) Sepet_Tablosu.getModel();
                    model.addRow(new Object[]{sepetBarkodNO, sepetUrunAdi, UrunAdetiCOMBO.getSelectedItem(), sepetUrunKalorisi, String.format("%.2f", sepetUrunBirimFiyati).replace(",","."), String.format("%.2f", sepetUrunToplamTutari).replace(",",".")});
                    sepetBarkodNOTXT.setText("");
                    UrunAdetiCOMBO.setSelectedIndex(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"- " + sepetBarkodNO + " - barkod numarasına kayıtlı ürün bulunamadı.");
                    sepetBarkodNOTXT.setText("");
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
            }
        }
    }
    private void urunuListedenKaldir()
    {
        try 
        {
            int selectedRowIndex = Sepet_Tablosu.getSelectedRow();
            Object cikarilacakFiyat = Sepet_Tablosu.getModel().getValueAt(selectedRowIndex, 5);
            Object cikarilacakKalori = Sepet_Tablosu.getModel().getValueAt(selectedRowIndex, 3);
            
            sepetToplamTutar -= Float.valueOf(cikarilacakFiyat.toString());
            sepetToplamTutarTXT.setText(String.format("%.2f", sepetToplamTutar).replace(",","."));
            
            sepetToplamKalori -= Integer.parseInt(cikarilacakKalori.toString());
            
            DefaultTableModel model = (DefaultTableModel) Sepet_Tablosu.getModel();
            model.removeRow(Sepet_Tablosu.getSelectedRow());
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Ürün Seçiniz");
        }
    }
    private void sepetKartNOSorgula()
    {
        if(sepetToplamTutar > 0.0)
        {
            sepetKartKontrol = true;
            initialize();
        }
        else
            JOptionPane.showMessageDialog(null,"Ürün Ekleyiniz");
    }
    private void faturaGoruntule()
    {
        int gunlukKalori = 0;
        try
        {
            int kontrol = 0;
            preparedStatement = baglanti.prepareStatement("select * from uyeler where KartNO = '" +sepetKartID+ "'");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                faturaKartBakiyesi = Float.valueOf(resultSet.getFloat("Bakiye"));
                gunlukKalori = resultSet.getInt("GunlukKalori");
                faturaUyeAdi.setText(resultSet.getString("Ad") + " " + resultSet.getString("Soyad"));
                
                Date bugun = new Date();
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                String Tarih = String.valueOf(df.format(bugun));

                int FaturaGuIciToplamKalori = 0;
                preparedStatement = baglanti.prepareStatement("select * from odemeler where Tarih = '" +Tarih+ "' and KartNO='" +sepetKartID+ "'");
                resultSet = preparedStatement.executeQuery();
                while(resultSet.next())
                {
                    FaturaGuIciToplamKalori += resultSet.getInt("Kalori");
                }

                faturaGunIciAlinanKaloriTXT.setText(String.valueOf(FaturaGuIciToplamKalori));
                faturaBakiyeTXT.setText(String.format("%.2f", faturaKartBakiyesi).replace(",",".") + " TL");
                faturaToplamTutarTXT.setText(String.format("%.2f", sepetToplamTutar).replace(",",".") + " TL");
                faturaKalanBakiyeTXT.setText(String.format("%.2f", (faturaKartBakiyesi - sepetToplamTutar)).replace(",",".") + " TL");
                faturaGunlukKaloriTXT.setText(String.valueOf(gunlukKalori));
                faturaYeniToplamKaloriTXT.setText(String.valueOf(sepetToplamKalori));
                kontrol = 1;
            }
            if(kontrol == 1)
            {
                Ana_Panel.remove(Fatura);
                Ana_Panel.add(Fatura);
                Fatura.isSelected();
                Fatura.setVisible(true);
                Fatura.moveToFront();
            }
            else
                JOptionPane.showMessageDialog(null,"Kart sisteme kayıtlı değil.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
        }
    }
    private void odemeYap()
    {
        float odenecekTutar = (faturaKartBakiyesi - sepetToplamTutar);
        int kaloriKisitlamasi = Integer.parseInt(faturaGunlukKaloriTXT.getText());
        int gunIciAlinmisKalori = Integer.parseInt(faturaGunIciAlinanKaloriTXT.getText());
        int yeniToplamKalori = Integer.parseInt(faturaYeniToplamKaloriTXT.getText());
        
        Date bugun = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String Tarih = String.valueOf(df.format(bugun));
        
        if(faturaKartBakiyesi < sepetToplamTutar)
            JOptionPane.showMessageDialog(null,"Bakiye Yetersiz");
        else
        {
            if((gunIciAlinmisKalori + yeniToplamKalori) > kaloriKisitlamasi)
                JOptionPane.showMessageDialog(null,"Günlük kalori sınırı aşıldı. Birkaç ürün çıkartınız.");
            else
            {
                try
                {
                    String sql = "update uyeler set Bakiye='"+ (faturaKartBakiyesi - sepetToplamTutar) +"' where KartNO = '" +sepetKartID+ "'";
                    preparedStatement = baglanti.prepareStatement(sql);
                    preparedStatement.execute();

                    sql = "insert into odemeler (KartNO,Kalori,OdenenTutar,Tarih) values "
                        + "('"+String.valueOf(sepetKartID)+"', '"+faturaYeniToplamKaloriTXT.getText()+"', '"+String.valueOf(sepetToplamTutar)+"', '"+Tarih+"')";
                    Statement kaydet = baglanti.createStatement();
                    kaydet.executeUpdate(sql);
                    
                    int FaturaID = 0;
                    preparedStatement = baglanti.prepareStatement("select id from odemeler ORDER BY id DESC LIMIT 1");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next())
                    {
                        FaturaID = resultSet.getInt("id");
                    }
                    
                    for(int i = 0; i<= Sepet_Tablosu.getRowCount()-1; i++)
                    {
                        Object BarkodNO = Sepet_Tablosu.getModel().getValueAt(i, 0);
                        Object Urun = Sepet_Tablosu.getModel().getValueAt(i, 1);
                        Object Adet = Sepet_Tablosu.getModel().getValueAt(i, 2);
                        Object ToplamKalori = Sepet_Tablosu.getModel().getValueAt(i, 3);
                        Object BirimFiyati = Sepet_Tablosu.getModel().getValueAt(i, 4);
                        Object ToplamTutar = Sepet_Tablosu.getModel().getValueAt(i, 5);
                        
                        sql = "insert into faturaicerigi (FaturaID,BarkodNO,Urun,Adet,ToplamKalori,BirimFiyati,ToplamTutar) values "
                            + "('"+String.valueOf(FaturaID)+"', '"+BarkodNO.toString()+"', '"+Urun.toString()+"', '"+Adet.toString()+"', '"+ToplamKalori.toString()+"', '"+BirimFiyati.toString() + " TL"+"', '"+ToplamTutar.toString() + " TL"+"')";
                        
                        Statement faturaIcerigiKaydet = baglanti.createStatement();
                        faturaIcerigiKaydet.executeUpdate(sql);
                    }
                    
                    Fatura.setVisible(false);
                    JOptionPane.showMessageDialog(null,"Ödeme Yapıldı");
                    sepetiTemizle();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Bir hata oluştu. Daha sonra tekrar deneyiniz.");
                }
            }
        }
    }
    private String stringTemizle(String metin)
    {
        metin = metin.replace("*","");
        metin = metin.replace("<","");
        metin = metin.replace(">","");
        metin = metin.replace(";","");
        metin = metin.replace("=","");
        metin = metin.replace("'","");
        metin = metin.replace("+","");
        metin = metin.replace("?","");
        metin = metin.replace("/","");
        metin = metin.replace("%","");
        metin = metin.replace("&","");
        metin = metin.replace("|","");
        metin = metin.replace("!","");
        metin = metin.replace("insert","");
        metin = metin.replace("delete","");
        metin = metin.replace("select","");
        metin = metin.replace("update","");
        metin = metin.replace("print","");
        metin = metin.replace("table","");
        metin = metin.replace("from","");
        metin = metin.replace("where","");
        
        return metin;
    }
    private void UyelikBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UyelikBTNMouseClicked

        if(control==true ){        
              Ana_Panel.remove(Uyelik);
              Ana_Panel.add(Uyelik);
              Uyelik.isSelected();
              Uyelik.setVisible(true);
              Uyelik.moveToFront();
        }
    
    }//GEN-LAST:event_UyelikBTNMouseClicked

    private void UrunlerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrunlerBTNMouseClicked
        
        if(control==true ){   
        Ana_Panel.remove(Urunler);
        Ana_Panel.add(Urunler);
        Urunler.isSelected();
        Urunler.setVisible(true);
       
        Urunler.moveToFront();
        }
      
    }//GEN-LAST:event_UrunlerBTNMouseClicked

    private void CikisBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CikisBTNMouseClicked
      if(control==true ){   
      dispose();
      }
        
    }//GEN-LAST:event_CikisBTNMouseClicked

    private void SepetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SepetMouseClicked

        if(control==true )
        {   
            Ana_Panel.remove(Sepet);
            Ana_Panel.add(Sepet);
            Sepet.isSelected();
            Sepet.setVisible(true);

            Sepet.moveToFront();
        }
        
    }//GEN-LAST:event_SepetMouseClicked

    private void FaturaİnternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_FaturaİnternalFrameClosing
        Fatura.setVisible(true);
    }//GEN-LAST:event_FaturaİnternalFrameClosing
  
    private void UyelikİnternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_UyelikİnternalFrameClosing
        Uyelik.setVisible(false);
    }//GEN-LAST:event_UyelikİnternalFrameClosing

    private void UyelikİnternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_UyelikİnternalFrameClosed
        Uyelik.setVisible(false);
    }//GEN-LAST:event_UyelikİnternalFrameClosed

    private void SepetİnternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_SepetİnternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_SepetİnternalFrameClosing

    private void UrunuListedenCikartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunuListedenCikartBTNActionPerformed
        urunuListedenKaldir();
    }//GEN-LAST:event_UrunuListedenCikartBTNActionPerformed

    private void UrunuListeyeEkleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunuListeyeEkleBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunuListeyeEkle();
    }//GEN-LAST:event_UrunuListeyeEkleBTNActionPerformed

    private void SatBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        sepetKartNOSorgula();
    }//GEN-LAST:event_SatBTNActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        sepetiTemizle();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void uyeKaydetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeKaydetBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyeKaydet();
    }//GEN-LAST:event_uyeKaydetBTNActionPerformed

    private void GirisBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        kullaniciSorgula();
    }//GEN-LAST:event_GirisBTNActionPerformed

    private void uyelikKartNoSorgulaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyelikKartNoSorgulaBTNActionPerformed
        uyelikKartKontrol = true;
        initialize();
    }//GEN-LAST:event_uyelikKartNoSorgulaBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyelikSil();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uyeGuncelleKartNoSorgulaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGuncelleKartNoSorgulaBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyeGuncelleKartKontrol = true;
        initialize();
    }//GEN-LAST:event_uyeGuncelleKartNoSorgulaBTNActionPerformed

    private void uyeGuncelle_GuncelleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGuncelle_GuncelleBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyelikGuncelle();
    }//GEN-LAST:event_uyeGuncelle_GuncelleBTNActionPerformed

    private void uyeGuncelleBakiyeArttirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGuncelleBakiyeArttirBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyeBakiyeArttir();
    }//GEN-LAST:event_uyeGuncelleBakiyeArttirBTNActionPerformed

    private void uyeSorgulaSorgulaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeSorgulaSorgulaBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        uyelerTablosuDoldur(stringTemizle(uyeSorgulaAdTXT.getText()), stringTemizle(uyeSorgulaSoyadTXT.getText()));
    }//GEN-LAST:event_uyeSorgulaSorgulaBTNActionPerformed

    private void urunSorgulaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunSorgulaBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunlerTablosuDoldur(stringTemizle(urunSorgulaBarkodNOTXT.getText()));
    }//GEN-LAST:event_urunSorgulaBTNActionPerformed

    private void urunEkleUrunEkleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunEkleUrunEkleBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunEkle();
    }//GEN-LAST:event_urunEkleUrunEkleBTNActionPerformed

    private void urunGuncelleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunGuncelleBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunGuncelle();
    }//GEN-LAST:event_urunGuncelleBTNActionPerformed

    private void urunGuncelleSorgulaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunGuncelleSorgulaBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunIDSorgulat();
    }//GEN-LAST:event_urunGuncelleSorgulaBTNActionPerformed

    private void urunSilBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunSilBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        urunSil();
    }//GEN-LAST:event_urunSilBTNActionPerformed

    private void faturaTamamBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturaTamamBTNActionPerformed
        baglanti = SqlServerBaglantisi.Baglan();
        odemeYap();
    }//GEN-LAST:event_faturaTamamBTNActionPerformed

    private void faturaKapatBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturaKapatBTNActionPerformed
        Fatura.setVisible(false);
    }//GEN-LAST:event_faturaKapatBTNActionPerformed
 
     
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar AnaMenu;
    private javax.swing.JDesktopPane Ana_Panel;
    private javax.swing.JMenu CikisBTN;
    private javax.swing.JInternalFrame Fatura;
    private javax.swing.JButton GirisBTN;
    private javax.swing.JTextField KadiTXT;
    private javax.swing.JLabel KartIDTXT;
    private javax.swing.JInternalFrame Kullanici_Giris_Paneli;
    private javax.swing.JButton SatBTN;
    private javax.swing.JInternalFrame Sepet;
    private javax.swing.JMenu SepetBTN;
    private javax.swing.JTable Sepet_Tablosu;
    private javax.swing.JPasswordField SifreTXT;
    private javax.swing.JComboBox UrunAdetiCOMBO;
    private javax.swing.JInternalFrame Urunler;
    private javax.swing.JMenu UrunlerBTN;
    private javax.swing.JButton UrunuListedenCikartBTN;
    private javax.swing.JButton UrunuListeyeEkleBTN;
    private javax.swing.JInternalFrame Uyelik;
    private javax.swing.JMenu UyelikBTN;
    private javax.swing.ButtonGroup buttonGroupCinsiyet;
    private javax.swing.JLabel faturaBakiyeTXT;
    private javax.swing.JLabel faturaGunIciAlinanKaloriTXT;
    private javax.swing.JLabel faturaGunlukKaloriTXT;
    private javax.swing.JLabel faturaKalanBakiyeTXT;
    private javax.swing.JButton faturaKapatBTN;
    private javax.swing.JButton faturaTamamBTN;
    private javax.swing.JLabel faturaToplamTutarTXT;
    private javax.swing.JLabel faturaUyeAdi;
    private javax.swing.JLabel faturaYeniToplamKaloriTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabeKartNo;
    private javax.swing.JLabel jLabeKartNo1;
    private javax.swing.JLabel jLabeKartNo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAd;
    private javax.swing.JLabel jLabelAd1;
    private javax.swing.JLabel jLabelAd2;
    private javax.swing.JLabel jLabelAd3;
    private javax.swing.JLabel jLabelCinsiyet;
    private javax.swing.JLabel jLabelCinsiyet2;
    private javax.swing.JLabel jLabelDogumTarihi;
    private javax.swing.JLabel jLabelDogumTarihi1;
    private javax.swing.JLabel jLabelDogumYeri;
    private javax.swing.JLabel jLabelDogumYeri1;
    private javax.swing.JLabel jLabelKayitBulAd1;
    private javax.swing.JLabel jLabelKayitBulAd2;
    private javax.swing.JLabel jLabelKayitBulAd3;
    private javax.swing.JLabel jLabelKayitBulAd4;
    private javax.swing.JLabel jLabelKayitBulAd5;
    private javax.swing.JLabel jLabelKayitBulAd6;
    private javax.swing.JLabel jLabelSoyad;
    private javax.swing.JLabel jLabelSoyad1;
    private javax.swing.JLabel jLabelSoyad10;
    private javax.swing.JLabel jLabelSoyad11;
    private javax.swing.JLabel jLabelSoyad2;
    private javax.swing.JLabel jLabelSoyad3;
    private javax.swing.JLabel jLabelSoyad4;
    private javax.swing.JLabel jLabelSoyad5;
    private javax.swing.JLabel jLabelSoyad6;
    private javax.swing.JLabel jLabelSoyad7;
    private javax.swing.JLabel jLabelSoyad8;
    private javax.swing.JLabel jLabelSoyad9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelKayitBul;
    private javax.swing.JPanel jPanelKisiBilgileri;
    private javax.swing.JPanel jPanelKisiBilgileri1;
    private javax.swing.JPanel jPanelKisiBilgileri2;
    private javax.swing.JPanel jPanelKisiBilgileri3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField sepetBarkodNOTXT;
    private javax.swing.JLabel sepetToplamTutarTXT;
    private javax.swing.JPanel urunEkle;
    private javax.swing.JTextField urunEkleAdetTXT;
    private javax.swing.JTextField urunEkleBarkodNOTXT;
    private javax.swing.JTextField urunEkleFiyatTXT;
    private javax.swing.JTextField urunEkleKaloriTXT;
    private javax.swing.JTextField urunEkleUrunAdiTXT;
    private javax.swing.JButton urunEkleUrunEkleBTN;
    private javax.swing.JPanel urunGuncelle;
    private javax.swing.JTextField urunGuncelleAdetTXT;
    private javax.swing.JButton urunGuncelleBTN;
    private javax.swing.JTextField urunGuncelleBarkodNOTXT;
    private javax.swing.JTextField urunGuncelleFiyatTXT;
    private javax.swing.JTextField urunGuncelleKaloriTXT;
    private javax.swing.JButton urunGuncelleSorgulaBTN;
    private javax.swing.JTextField urunGuncelleUrunAdiTXT;
    private javax.swing.JLabel urunGuncelleUrunID;
    private javax.swing.JButton urunSilBTN;
    private javax.swing.JPanel urunSordula;
    private javax.swing.JButton urunSorgulaBTN;
    private javax.swing.JTextField urunSorgulaBarkodNOTXT;
    private javax.swing.JTable urunSorgulaTABLO;
    private javax.swing.JLabel uyeBakiyeTXT;
    private javax.swing.JTextField uyeGuncelleAdTXT;
    private javax.swing.JTextArea uyeGuncelleAdresTXT;
    private javax.swing.JButton uyeGuncelleBakiyeArttirBTN;
    private javax.swing.JTextField uyeGuncelleBakiyeTXT;
    private javax.swing.JButton uyeGuncelleKartNoSorgulaBTN;
    private javax.swing.JTextField uyeGuncelleKartNoTXT;
    private javax.swing.JTextField uyeGuncelleSoyadTXT;
    private javax.swing.JTextField uyeGuncelleVeliAdiTXT;
    private javax.swing.JTextField uyeGuncelleVeliEPostaTXT;
    private javax.swing.JTextField uyeGuncelleVeliTelTXT;
    private javax.swing.JButton uyeGuncelle_GuncelleBTN;
    private javax.swing.JButton uyeKaydetBTN;
    private javax.swing.JTextField uyeSorgulaAdTXT;
    private javax.swing.JButton uyeSorgulaSorgulaBTN;
    private javax.swing.JTextField uyeSorgulaSoyadTXT;
    private javax.swing.JTable uyeSorgulaTABLO;
    private javax.swing.JTextField uyelikAdTXT;
    private javax.swing.JTextArea uyelikAdresTXT;
    private javax.swing.JTextField uyelikKadiTXT;
    private javax.swing.JButton uyelikKartNoSorgulaBTN;
    private javax.swing.JTextField uyelikKartNoTXT;
    private javax.swing.JTextField uyelikSifreTXT;
    private javax.swing.JTextField uyelikSoyadTXT;
    private javax.swing.JTextField uyelikVeliAdiTXT;
    private javax.swing.JTextField uyelikVeliEPostaTXT;
    private javax.swing.JTextField uyelikVeliTelTXT;
    // End of variables declaration//GEN-END:variables
}
