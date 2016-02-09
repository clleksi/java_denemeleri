/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract.abstracts;

/**
 *
 * @author Celal
 */
public abstract class Adeneme {
    
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
    
    
    /**
     * 
     * @return Taşıtın markasını geri döndürü
     */
    public String getMarka() {
        return Marka;
    }

    /**
     * 
     * @return Taşıtın modelini geri döndürür
     */
    public String getModel() {
        return Model;
    }

    /**
     * 
     * @return  Taşıtın hangi yılda üretildiğini geri döndürür
     */    
    public String getUretimYili() {
        return UretimYili;
    }

     /**
     *
     * @return Taşıtın deposunun kaç litre yakıt aldığını geri döndürür
     */
    public Double getYakitKapasitesi() {
       return YakitKapasitesi;
    }

    /**
     *
     * @return Taşıtın kullandığı yakıt türünü geri döndürür
     */
    public String getYakitTuru() {
        return YakitTuru;
    }


    /**
     *
     * @return Taşıtın maksimum hızını geri döndürür
     */
    public String getMaxHiz() {
        return MaxHiz;
    }

    /**
     *
     * @return Taşıtın motor gücünü geri döndürür
     */
    public Double getMotorGucu() {
        return MotorGucu;
    }
    
    /**
     * 
     * @return Taşıtın ağırlığını geri döndürür
     */
    public Double getAgirlik() {
        return Agirlik;
    }
    
    /**
     *Taşıtın markasını belirler
     * @param Marka Taşıtın markası
     */
    public void setMarka(String Marka) {
        this.Marka=Marka;
    }

    /**
     *Taşıtın modelini belirler
     * @param Model Taşıtın modeli
     */
    public void setModel(String Model) {
        this.Model=Model;
    }

    /**
     *Taşıtın üretim yılını belirler
     * @param UretimYili Üretim yılı
     */
    public void setUretimYili(String UretimYili) {
        this.UretimYili=UretimYili;
    }

    /**
     *Taşıtın yakıt deposunun kapasitesini belirler
     * @param YakitKapasitesi Taşıtın yakıt deposunun kapasitesi
     */
    public void setYakitKapasitesi(Double YakitKapasitesi) {
       this.YakitKapasitesi=YakitKapasitesi;
    }

    /**
     *Taşıtın kullandığı yakıt türünü belirler
     * @param YakitTuru Taşıtın kullandığı yakıt türü
     */
    public void setYakitTuru(String YakitTuru) {
        this.YakitTuru=YakitTuru;
    }


    /**
     *Taşıtın maksimum hızını belirler
     * @param MaxHiz Taşıtın maksimum hızı
     */
    public void setMaxHiz(String MaxHiz) {
        this.MaxHiz=MaxHiz;
    }

    /**
     *Taşıtın motor gücünü belirler
     * @param MotorGücü Taşıtın motor gücü
     */
    public void setMotorGucu(Double MotorGücü) {
        this.MotorGucu=MotorGücü;
    }  

    /**
     *Taşıtın ağırlığını belirler
     * @param Agirlik Taşıtın ağırlığı
     */
    public void setAgirlik(Double Agirlik) {
        this.Agirlik=Agirlik;
    }

    /**
     * Taşıta Yakıt Doldurma işlemi
     */
    public void yakitDoldur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Taşıtı çalıştırma işlemi
     */
    public void calistir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Taşıtı sürme işlemi
     */
    public void sur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Taşıtı durdurma işlemi
     */
    public void dur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *Taşıtın Yakıt tüketimini hesaplar
     * @return Taşıtın 100 km'de ortalama ne kadar yakıt tüketdiğini geri döndürür
     */
    public abstract Double getYakitTuketimi();

  

    
}
