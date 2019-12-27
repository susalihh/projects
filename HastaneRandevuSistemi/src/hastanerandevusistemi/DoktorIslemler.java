
package hastanerandevusistemi;

import java.sql.ResultSet;

public class DoktorIslemler extends VeriTabaniIslemleri {
    public DoktorIslemler(){
    super();
    }
    public DoktorIslemler(int doktorId, String doktorAd,String doktorSoyad,String doktorBrans){
        super(doktorId, doktorAd, doktorSoyad, doktorBrans);
    }
    
    @Override
    public void doktorKayitEkle(){
        super.doktorKayitEkle();
    }
    
    @Override
    public void doktorKayitGuncelle(){
        super.doktorKayitGuncelle();
    }
    
    @Override
    public ResultSet doktorGetir(){
        super.doktorGetir();
        return super.rs;
    }
    
    @Override
    public void doktorKayitSil(){
          super.doktorKayitSil();
    }
     
    @Override
    public ResultSet doktorIdGetir(){
        super.doktorIdGetir();
       return super.rs;
    }
    
}
