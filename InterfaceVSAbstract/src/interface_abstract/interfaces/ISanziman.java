/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract.interfaces;

/**
 *Şanzımanların genel özelliklerini barındırır.
 * @author Celal
 */
public interface ISanziman {
    
    /**
     * 
     * @return Şanzıman markasını geri dödürür
     */
    String getSanzimanMarka();
    
    /**
     * 
     * @return Şanzıman modelini geri döndürür
     */
    String getSanzimanModel();
    
    /**
     * 
     * @return Şanzıman türünü geri döndürür
     */
    String getSanzimanTuru();
    
    /**
     * 
     * @return Şanzımanın ileri vites sayısını geri döndürür
     */
    int getIleriVitesSayisi();
    
    /**
     * 
     * @return Şanzımanın geri vites sayısını geri döndürür
     */
    int getGeriVitesSayisi();
    
    
     
    /**
     * Şanzımanın özelliklerini belirlemeyi sağlar
     * @param Marka Şanzımanın markası
     * @param Model Şanzımanın modeli
     * @param Tur Şanzımanın türü
     * @param IleriVites Şanzımanın ileri vites sayısı
     * @param GeriVites Şanzımanın geri vites sayısı
     */
    void setSanziman(String Marka,String Model, String Tur, int IleriVites, int GeriVites);
}
