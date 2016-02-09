/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract;

import interface_abstract.interfaces.ISanziman;
import interface_abstract.interfaces.ITasit;

/**
 * Otomobil sınıfındaki araçların özelliklerini barındırır.
 * ITasit ve ISanziman arayüzlerinin özelliklerini taşır.
 * 
 * @see ITasit
 * @see ISanziman
 * @author Celal
 */

public class OtomobilImp implements ITasit,ISanziman{
    private String Marka;
    private String Model;
    private String Tur;
    private String UretimYili;
    private Double Agirlik;
    private Double YakitTuketimi;
    private Double YakitKapasitesi;
    private String YakitTuru;
    private String VitesTuru;
    private String MaxHiz;
    private Double MotorGucu;
    
    private String SanzimanMarka;
    private String SanzimanModel;
    private String SanzimanTuru;
    private int IleriVitesSayisi;
    private int GeriVitesSayisi;
    
    
    @Override
    public String getMarka() {
        return Marka;
    }
    
    
    @Override
    public String getModel() {
        return Model;
    }

    
    @Override
    public String getUretimYili() {
        return UretimYili;
    }
    
    
    @Override
    public Double getYakitTuketimi() {
        return ((Agirlik * MotorGucu)/(33333));
    }
    
    
    @Override
    public Double getYakitKapasitesi() {
       return YakitKapasitesi;
    }

    
    @Override
    public String getYakitTuru() {
        return YakitTuru;
    }

    
    @Override
    public String getMaxHiz() {
        return MaxHiz;
    }


    @Override
    public Double getMotorGucu() {
        return MotorGucu;
    }
    
   
    @Override
    public Double getAgirlik() {
        return Agirlik;
    }
    
    

    @Override
    public void setMarka(String Marka) {
        this.Marka=Marka;
    }
    
 
    @Override
    public void setModel(String Model) {
        this.Model=Model;
    }


    @Override
    public void setUretimYili(String UretimYili) {
        this.UretimYili=UretimYili;
    }

    

    @Override
    public void setYakitKapasitesi(Double YakitKapasitesi) {
       this.YakitKapasitesi=YakitKapasitesi;
    }

    @Override
    public void setYakitTuru(String YakitTuru) {
        this.YakitTuru=YakitTuru;
    }

   

    @Override
    public void setMaxHiz(String MaxHiz) {
        this.MaxHiz=MaxHiz;
    }

    @Override
    public void setMotorGucu(Double MotorGücü) {
        this.MotorGucu=MotorGücü;
    }  

    @Override
    public void setAgirlik(Double Agirlik) {
        this.Agirlik=Agirlik;
    }

    ////////*************************************************\\\\\\\\\\\
    @Override
    public void yakitDoldur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calistir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSanzimanMarka() {
        return SanzimanMarka;
    }

    @Override
    public String getSanzimanModel() {
        return SanzimanModel;
    }

    @Override
    public String getSanzimanTuru() {
        return SanzimanTuru;
    }

    @Override
    public int getIleriVitesSayisi() {
        return IleriVitesSayisi;
    }

    @Override
    public int getGeriVitesSayisi() {
        return GeriVitesSayisi;
    }

   
    @Override
    public void setSanziman(String Marka, String Model, String Tur, int IleriVites, int GeriVites) {
        this.SanzimanMarka = Marka;
        this.SanzimanModel= Model;
        this.SanzimanTuru=Tur;
        this.IleriVitesSayisi=IleriVites;
        this.GeriVitesSayisi=GeriVites;
    }
    
}
