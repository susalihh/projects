package hastanerandevusistemi;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VeriTabaniIslemleri implements Baglanti {
     static String kullanici_adi="root";
     static String parola="";
     static String db_ismi="hastane";
     static String host="localhost";
     static int port=3306;
     static String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
      
    static Connection con;
    ResultSet rs;
    ResultSet rs2;
    
     @Override
    public Connection baglantiAc(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,kullanici_adi,parola);
        }catch(Exception e){
            e.printStackTrace( );
        }
        return con;
    } 
    
     @Override
    public void baglantiKapat(){
        try{
            con.close();
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
    
     int hastaId;
     String hastaSifre;
     String hastaAd;
     String hastaSoyad;
     int hastaTc;
     String hastaTelefon;
     String hastaCinsiyet;
    
     int doktorId;
     String doktorAd;
     String doktorSoyad;
     String doktorBrans;
    
     int randevuId;
     int randevuHastaId;
     int randevuDoktorId;
     String tarih;
     String saat;
    
   public VeriTabaniIslemleri(){}
      
   public VeriTabaniIslemleri(int hastaId,int hastaTc,String hastaAd,String hastaSoyad,String hastaSifre,String hastaTelefon,String hastaCinsiyet){
        this.hastaId=hastaId;
        this.hastaSifre = hastaSifre;
        this.hastaAd= hastaAd;
        this.hastaSoyad = hastaSoyad;
        this.hastaTc= hastaTc;
        this.hastaTelefon=hastaTelefon;
        this.hastaCinsiyet=hastaCinsiyet;
   }
   
   public VeriTabaniIslemleri(int id,String doktorAd,String doktorSoyad,String doktorBrans){
       this.doktorId = id; 
       this.doktorAd = doktorAd;
       this.doktorSoyad= doktorSoyad;
       this.doktorBrans= doktorBrans;
   }     
    
    public VeriTabaniIslemleri(int randevuDoktorId,int randevuHastaId,String tarih,String saat){
       this.randevuDoktorId = randevuDoktorId; 
       this.randevuHastaId = randevuHastaId;
       this.tarih= tarih;
       this.saat= saat;
   }  
    
    public void hastaKayitEkle(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("insert into hastalar (hastaSifre,hastaAd,hastaSoyad,hastaTc,hastaTel,hastaCins) values('%s', '%s','%s',%d,'%s','%s')",hastaSifre, hastaAd,hastaSoyad,hastaTc,hastaTelefon,hastaCinsiyet);
            st.executeUpdate(sorgu);
            baglantiKapat();
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
    public void hastaKayitGuncelle(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("update hastalar set hastaTc="+hastaTc+",hastaAd='"+hastaAd+"',hastaSoyad='"+hastaSoyad
            +"',hastaSifre='"+hastaSifre+"',hastaTel='"+hastaTelefon+"',hastaCins='"+hastaCinsiyet+"' where hastaId="+hastaId);
            st.executeUpdate(sorgu);
            baglantiKapat();
        }catch(Exception e){
            e.printStackTrace();
        }  
    }
    
    public void hastaKayitSil(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("DELETE FROM hastalar WHERE hastaId="+hastaId);
            st.executeUpdate(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet hastaKayitlariGetir(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("select * from hastalar");
            rs = st.executeQuery(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public int hastaGiris(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("SELECT COUNT(hastaId) AS giris FROM hastalar WHERE hastaTc='"+hastaTc+"' AND hastaSifre='"+hastaSifre+"'");
            rs = st.executeQuery(sorgu);
            Statement st2 = con.createStatement();
            String sorgu2 = String.format("select hastaId from hastalar where hastaTc='"+hastaTc+"'");
            rs2 = st2.executeQuery(sorgu2);
            while(rs2.next()){
                hastaId = rs2.getInt("hastaId");
            }
             while(rs.next()){
                if(rs.getInt("giris")!=1){   
                    JOptionPane.showMessageDialog(null, "T.C. kimlik no yada Şifre yanlış!");
                    hastaId=0;
                }
             }
            baglantiKapat();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return hastaId;
    }
    
    public void doktorKayitEkle(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("insert into doktorlar (doktorAd,doktorSoyad,doktorBrans) values('%s', '%s','%s')",doktorAd,doktorSoyad,doktorBrans);
            st.executeUpdate(sorgu);
            baglantiKapat();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void doktorKayitGuncelle(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("update doktorlar set doktorAd='"+doktorAd+"',doktorSoyad='"+doktorSoyad
            +"',doktorBrans='"+doktorBrans+"' where doktorId="+doktorId);
            st.executeUpdate(sorgu);
            baglantiKapat();
        }catch(Exception e){
            e.printStackTrace();
        }  
    }
      
    public ResultSet doktorGetir(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("select * from doktorlar");
            rs = st.executeQuery(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet doktorBransGetir(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("select doktorAd,doktorSoyad from doktorlar where doktorBrans='"+doktorBrans+"'");
            rs = st.executeQuery(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
            
    public void doktorKayitSil(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("DELETE FROM doktorlar WHERE doktorId="+doktorId);
            st.executeUpdate(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet doktorIdGetir(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("select doktorId from doktorlar where doktorAd='"+doktorAd+"' and doktorSoyad='"+doktorSoyad+"'");
            rs = st.executeQuery(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }    
    
    public void randevuEkle(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("insert into randevu (randevuHastaId,randevuDoktorId,randevuTarih,randevuSaat) values(%d, %d,'%s','%s')",randevuHastaId, randevuDoktorId,tarih,saat);
            st.executeUpdate(sorgu);
            baglantiKapat();
        }catch(Exception e){
            e.printStackTrace();
        } 
    }     
    
    public ResultSet randevuGetir(){
        try{
            baglantiAc();
            Statement st = con.createStatement();
            String sorgu = String.format("SELECT hastalar.hastaAd,hastalar.hastaSoyad,doktorlar.doktorAd,doktorlar.doktorSoyad,doktorlar.doktorBrans,randevu.randevuTarih,randevu.randevuSaat FROM randevu "
                    + "INNER JOIN hastalar ON randevu.randevuHastaId = hastalar.hastaId "
                    + "INNER JOIN doktorlar ON randevu.randevuDoktorId = doktorlar.doktorId ");
            rs = st.executeQuery(sorgu);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
