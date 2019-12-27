
package hastanerandevusistemi;

import java.sql.ResultSet;


public class HastaIslemler extends VeriTabaniIslemleri {
    public HastaIslemler(){
        super();
    }
    public HastaIslemler(int hastaId, int hastaTc,String hastaAd,String hastaSoyad,String hastaSifre,String hastaTelefon,String hastaCinsiyet){
        super(hastaId, hastaTc, hastaAd, hastaSoyad, hastaSifre, hastaTelefon, hastaCinsiyet);
    }
    @Override
    public void hastaKayitEkle(){
        super.hastaKayitEkle();
    }
    
    @Override
    public void hastaKayitGuncelle(){
        super.hastaKayitGuncelle();
    }
    
    @Override
    public void hastaKayitSil(){
        super.hastaKayitSil();
    }
    
    @Override
    public ResultSet hastaKayitlariGetir(){
        super.hastaKayitlariGetir();
        return super.rs;
    }
    
    @Override
    public int hastaGiris(){
        super.hastaGiris();
        return super.hastaId;
    }
    
}
