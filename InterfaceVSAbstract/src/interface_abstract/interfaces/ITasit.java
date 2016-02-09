/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract.interfaces;

/**
 *Taşıtların genel özelliklerini barındırır.
 * @author Celal
 */
public interface ITasit { 
    
    
    /**
     * 
     * @return Taşıtın markasını geri döndürü
     */
    String getMarka();
    
     
    /**
     * 
     * @return Taşıtın modelini geri döndürür
     */
    String getModel();
    
    /**
     * 
     * @return  Taşıtın hangi yılda üretildiğini geri döndürür
     */
    String getUretimYili();
    
    /**
     * 
     * @return Taşıtın ağırlığını geri döndürür
     */
    Double getAgirlik();
    
    /**
     *Taşıtın Yakıt tüketimini hesaplar
     * @return Taşıtın 100 km'de ortalama ne kadar yakıt tüketdiğini geri döndürür
     */
    Double getYakitTuketimi();

    /**
     *
     * @return Taşıtın deposunun kaç litre yakıt aldığını geri döndürür
     */
    Double getYakitKapasitesi();

    /**
     *
     * @return Taşıtın kullandığı yakıt türünü geri döndürür
     */
    String getYakitTuru();

    /**
     *
     * @return Taşıtın maksimum hızını geri döndürür
     */
    String getMaxHiz();

    /**
     *
     * @return Taşıtın motor gücünü geri döndürür
     */
    Double getMotorGucu();

    /**
     *Taşıtın markasını belirler
     * @param Marka Taşıtın markası
     */
    void setMarka(String Marka);

    /**
     *Taşıtın modelini belirler
     * @param Model Taşıtın modeli
     */
    void setModel(String Model);

    /**
     *Taşıtın üretim yılını belirler
     * @param UretimYili Üretim yılı
     */
    void setUretimYili(String UretimYili);

    /**
     *Taşıtın ağırlığını belirler
     * @param Agirlik Taşıtın ağırlığı
     */
    void setAgirlik(Double Agirlik);
   
    /**
     *Taşıtın yakıt deposunun kapasitesini belirler
     * @param YakitKapasitesi Taşıtın yakıt deposunun kapasitesi
     */
    void setYakitKapasitesi(Double YakitKapasitesi);

    /**
     *Taşıtın kullandığı yakıt türünü belirler
     * @param YakitTuru Taşıtın kullandığı yakıt türü
     */
    void setYakitTuru(String YakitTuru);

    /**
     *Taşıtın maksimum hızını belirler
     * @param MaxHiz Taşıtın maksimum hızı
     */
    void setMaxHiz(String MaxHiz);

    /**
     *Taşıtın motor gücünü belirler
     * @param MotorGücü Taşıtın motor gücü
     */
    void setMotorGucu(Double MotorGücü);
    
    /**
     * Taşıta Yakıt Doldurma işlemi
     */
    void yakitDoldur();
    
     /**
     * Taşıtı çalıştırma işlemi
     */
    void calistir();
    
     /**
     * Taşıtı sürme işlemi
     */
    void sur();
    
     /**
     * Taşıtı durdurma işlemi
     */
    void dur();
}
