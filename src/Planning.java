package sali;

public class Planning {

	/*
	 1)urunler(String) ve urun fiyatlari(double) icin ayri ayri list olsturulmali.
	 *listler class level de olmali cunku : main method harici diger methodlarda kullanilacak
	 Listelenen urunleri bir method() ile kullaniciya gosterilmeli 	yazdiran bir method olmali	
	 bu method bir cikti vermeyecegi ve sadece println calisacagi icin return type void olmali ve parametresiz olmali
	 method ==> public static void urunListele(){for ,println(i+urun+fiyat)};
	 
	  2) 
    scanner class'indan obj creat edilmeli. urunListele() method call edilerek kullanıcı ekranına 
    urun listesi gösterilmeli.kullanıcıdan urun kodu ve urun miktari istenmeli(println)
    int urunNo= kullanicinin girdigi urun kodu atanmali 
    double kg= kullanicinin girdigi urun miktari kg atanmali 
    
    3)musteri için alisveris sepeti olusturulmali. sepetUrunler list(String) sepetKg list(double)
    sepetFiyat list(double) 
    public static void sepeteEkle(int urunKodu, double kg){sepetFiyat=urunFiyati*kg__list(double)}
    
    her sepet alisverisinden sonra olusan sepet fiyatini toplLAYAN BİR PRİMİTİVE (double) toplamFiyat olusturlmali
  toplamFiyat+=sepetFiyati  
  
  4) sepete eklenen urunler miktari toplamFiyati vs sepetin son durumunu hesaplatip yazdirilimali ki 
  kullanıcı devem etmeyeceiğni sorabilelim.
   public static double(toplamFiyat) sepetYazdir(){println(urunler+ fiyat+kg)}
   
   5) kullanıcıya alisverise devam edip etmecegi sorulmali.kullanici cevabi:boolean(true/false) String(e/h) int (1/0)) 
   cevap verisine gore islem akisi icin  if kontrolu olmali--> cevap vet ise tum ıslemler bastan tekrar edilmeli
   do-While(cevap)--cevap evet ise "do" hayırsa alisveris bitirilmeli odeme talep edilmeli.
   
   6) public static void odeme(println(double toplamFiyat){println()}
	 
	 
	 */
}
