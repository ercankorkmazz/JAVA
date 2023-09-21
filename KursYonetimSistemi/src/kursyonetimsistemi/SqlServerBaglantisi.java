package kursyonetimsistemi;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class SqlServerBaglantisi {
    private static Connection baglanti = null;
    ResultSet resultSet =  null;
    PreparedStatement preparedStatement = null;
    public static Connection Baglan(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/kurs_yonetim?useUnicode=true&characterEncoding=latin5","root",""); // veritabanına bağlatı kodu
            return baglanti;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Hata: "+e,"Mesaj",JOptionPane.ERROR_MESSAGE);
        return null;
        }
    }
    public void TrKarakter(){
        try{
            Baglan();
            String sql = "set charset latin5";
            preparedStatement = baglanti.prepareStatement(sql);
            preparedStatement.execute();
        }catch(Exception e){

        }
    }
}
