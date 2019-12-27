/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import java.sql.ResultSet;

/**
 *
 * @author Buğra
 */
public class RandevuIslemler extends VeriTabaniIslemleri{
     public RandevuIslemler(){
        super();
    }
    public RandevuIslemler(int randevuDoktorId,int randevuHastaId,String tarih,String saat){
        super(randevuDoktorId,randevuHastaId , tarih, saat);
    }
    
     @Override
    public void randevuEkle(){
        super.randevuEkle();
    }
    
     @Override
    public ResultSet randevuGetir(){
        super.randevuGetir();
        return super.rs;
    }
    
}
