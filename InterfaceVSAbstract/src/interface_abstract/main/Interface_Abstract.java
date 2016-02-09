/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_abstract.main;

import interface_abstract.AraziAraciEx;
import interface_abstract.AraziAraciImp;
import interface_abstract.MotorEx;
import interface_abstract.OtomobilEx;
import interface_abstract.OtomobilImp;
import interface_abstract.abstracts.ATasit;
import interface_abstract.abstracts.Adeneme;
import interface_abstract.deneme;
import interface_abstract.interfaces.IDeneme;
import interface_abstract.interfaces.ITasit;

/**
 *
 * @author Celal
 */
public class Interface_Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
      // TODO code application logic here
      
      // OtomobilImp - Otomobil türünde araçlar için kullanılıyor. Sadece interface içerir.    
      // AraziAraciImp -  Arazi aracı türünde araçlar için kullanılıyor. Sadece interface içerir.         
      // MotorImp -  Motorsiklet türünde araçlar için kullanılıyor. Sadece interface içerir. 
            
      // OtomobilEx -  Otomobil türünde araçlar için kullanılıyor. Abstract ve interface içerir.
      // AraziAraciEx - Arazi aracı türünde araçlar için kullanılıyor. Abstract ve interface içerir.
      // MotorEx - Motorsiklet türünde araçlar için kullanılıyor. Abstract ve interface içerir.
      

      /*
        OtomobilImp ITasit ve ISanziman interface'lerinden implements edilmişti.
        OtomobilImp türünde oluşturulan nesne ITasit türüne cast edildiği için;
            ITasit interface'sinin tüm özelliklerini barındırırken, 
            ISanziman interface'sinin özelliklerini barındırmaz.
      */
      ITasit tasit= new OtomobilImp();
      
      
       
       /*
        deneme sınıfı ATasit abstract sınıfdan extends, ISanziman interface'sini implements etmiştir. 
        deneme türünde oluşturulan nesne Adeneme türüne cast edilmiştir.
        Oluşturualan nesne abstract sınıfın bütün özelliklerini taşırken,
        interface'nin özelliklerini taşımıyor.
      */
        Adeneme dene= new deneme();
        
        /*
        OtomobilEx ATasit abstract sınıfdan extends edilmiştir. 
        ATasit abstract sınıfı  ISanziman interface'sini implements etmiştir.
        OtomobilExp türünde oluşturulan nesne ATasit türüne cast edilmiştir.
        Oluşturualan nesne abstract sınıfın ve interface'nin bütün özelliklerini taşır
      */
        ATasit M1 =new OtomobilEx();
        
        
        
      
      /*
        OtomobilImp türünde oluşturulan nesne ITasit ve ISanziman interface'lerinin tüm özelliklerini barındırır.
      */
      OtomobilImp M3= new OtomobilImp();
      M3.setMarka("BMW");
      M3.setModel("M3");
      M3.setAgirlik(1400.00);
      M3.setMaxHiz("290");
      M3.setMotorGucu(340.00);
      M3.setUretimYili("2016");
      M3.setYakitKapasitesi(60.00);
      M3.setYakitTuru("Benzin");
      M3.setSanziman("CVT","PowerShift" , "Tam Otomatik", 6, 2);
      
      
      /*
        AraziAraciImp türünde oluşturulan nesne ITasit ve ISanziman interface'lerinin tüm özelliklerini barındırır.
      */
      AraziAraciImp X5= new AraziAraciImp();
      X5.setMarka("BMW");
      X5.setModel("X5");
      X5.setAgirlik(1400.00);
      X5.setMaxHiz("240");
      X5.setMotorGucu(340.00);
      X5.setUretimYili("2016");
      X5.setYakitKapasitesi(60.00);
      X5.setYakitTuru("Benzin");
      X5.setSanziman("DUALOGIC","PowerShift" , "Yarı Otomatik", 8, 4);
      
 
      
      /*
        OtomobilEx türünde oluşturulan nesne ATasit ve ISanziman interface'lerinin tüm özelliklerini barındırır.
      */
      OtomobilEx M7 = new OtomobilEx();
      M7.setMarka("BMW");
      M7.setModel("M7");
      M7.setAgirlik(1400.00);
      M7.setMaxHiz("290");
      M7.setMotorGucu(340.00);
      M7.setUretimYili("2016");
      M7.setYakitKapasitesi(60.00);
      M7.setYakitTuru("Benzin");
      M7.setSanziman("DSG","TR2" , "Manuel", 6, 2);
      
      
      
     
      // Abstract sınıfın new ile oluşturulması.
      // getYakitTüketimi() metodu ATasit içerisinde abstract metod olarak tanımlandığı için new ile oluşturulunca
         // bu metodun gövdesinin doldurulması istenmekte.
      ATasit t= new ATasit() {
          @Override
          public Double getYakitTuketimi() {
              return ((getAgirlik() * getMotorGucu())/(33333));
          }
      };
      t.setMarka("BMW");
      t.setModel("M5");
      t.setAgirlik(1500.00);
      t.setMaxHiz("260");
      t.setMotorGucu(370.00);
      t.setUretimYili("2016");
      t.setYakitKapasitesi(60.00);
      t.setYakitTuru("Benzin");
      t.setSanziman("DSG","TR2" , "Manuel", 6, 2);
      
      
      
      
      System.out.println(M3.getMarka()+" "+ M3.getModel()+" Max Hızı: "+M3.getMaxHiz()+ " Yakıt Tüketimi: "+ M3.getYakitTuketimi()
              + "  " + M3.getSanzimanTuru());
      System.out.println(X5.getMarka()+" "+ X5.getModel()+" Max Hızı: "+X5.getMaxHiz()+ " Yakıt Tüketimi: "+ X5.getYakitTuketimi()
              + "  " + X5.getSanzimanTuru());  
      System.out.println(M7.getMarka()+" "+ M7.getModel()+" Max Hızı: "+M7.getMaxHiz()+ " Yakıt Tüketimi: "+ M7.getYakitTuketimi()
              + "  " + M7.getSanzimanTuru());
      
      System.out.println(t.getMarka()+" "+ t.getModel()+" Max Hızı: "+ t.getMaxHiz()+ " Yakıt Tüketimi: "+ t.getYakitTuketimi()
              + "  " + t.getSanzimanTuru());
       
       
      
      // Interface'lerde new ile oluşturulabiliyor. Oluşturulunca içerisinde yer alan bütün metodların gövdelerin
        // doldurulması lazım.
       IDeneme d= new IDeneme() {
          @Override
          public void dene() {
              System.out.println("Denedim oldu.");
          }
      };
       
       d.dene();
       
       
       
        
    }  
}
