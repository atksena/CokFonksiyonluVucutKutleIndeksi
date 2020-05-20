
package cokfonkvucutkutleindeksi;
import java.util.Scanner;

 class Olcum {  

    int yas;
    int kilo;
    int boy;
    String cinsiyet;
    String istek;
    private int belcevresi;
    private int kalcacevresi;
    private int boyuncevresi;  
    
    public void CokFonkVucutKutleİndeksi(String cinsiyet,String istek){        
       cinsiyet = "Kadın";
        istek = "Zayıflamak";
    }
       
    public void Vucut(int kilo, int boy){
        
       int vucut = boy*boy/10/kilo;
       if(19>vucut){
           System.out.println("Kişi Zayıf");
       }
       else if(19<= vucut && vucut<25){
           System.out.println("Kişi Normal");
       }
       else if(25<=vucut && vucut<30){
           System.out.println("Kişi Fazla Kilolu");
       }
       else{
           System.out.println("Kişi Obez");
    }     
    }
    
    public void Vucut (int kilo, int boy, int yas){
        
        double hesapla = (655.1+(9.56*kilo)+(1.85*boy)-(4.68*yas));       
        System.out.println("Bazal Metabolizma Hızı : "+hesapla);
        
    }
       
    private static void  YagOrani(int belcevresi, int kalcacevresi, int boyuncevresi, int boy ){
        
        double hesapla = 163.205* Math.log(belcevresi+kalcacevresi-boyuncevresi)-(97.685*Math.log(boy)-104.910) ;       
        System.out.println("Vücut Yağ Oranınız : %"+hesapla);
    }  
}

public class CokFonkVucutKutleİndeksi extends Olcum{   
    String cinsiyet;
    String istek;
     
    private void secenek(String cinsiyet,String istek){       
       cinsiyet = "Erkek";
        istek = "Zayıflamak";
    }
    
   public void erkVucut (int kilo, int boy, int yas){
        
        double hesapla = (66.5+(13.75*kilo)+(5.03*boy)-(6.75*yas));   
        System.out.println("Bazal Metabolizma Hızı : "+hesapla);       
    }
     
    public static void main (String[] args) {
        Olcum olc = new Olcum();
        CokFonkVucutKutleİndeksi erk = new CokFonkVucutKutleİndeksi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Kilonuzu Giriniz : ");
        int kilo = scan.nextInt();
        System.out.println("Boyunuzu Giriniz : ");
        int boy = scan.nextInt();
         System.out.println("Bel Çevrenizi Ölçüp Giriniz : ");
        int belcevresi = scan.nextInt();
         System.out.println("Kalça Çevrenizi Ölçüp Giriniz : ");
        int kalcacevresi = scan.nextInt();
        System.out.println("Boynunuzun Çevrenizi Ölçüp Giriniz : ");
        int boyuncevresi = scan.nextInt();
        System.out.println("Kadınlar için : ");
       olc.Vucut(kilo, boy);
       olc.Vucut(kilo, boy, yas);
     
        System.out.println("Erkekler için : ");
        olc.Vucut(kilo, boy);
        erk.erkVucut(kilo, boy, yas);
    }
}