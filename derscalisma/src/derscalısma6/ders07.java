package derscalısma6;

import java.util.Scanner;

public class ders07 {

	public static void main(String[] args) {
	// if(){
//	int not= 40;
//	if(not<50) {
//		System.out.println("Başarısız");
//	}
//	
//	
//	
//	// if() else
//	int sayi=5;
//	if(sayi<7) {
//		System.out.println("doğru");
//	}else {
//		System.out.println("yanlış");
//	}
	
	
//	// Stringlerin if() else ile karşılaştırılması
	Scanner scan = new Scanner(System.in);
//    
//    System.out.println("Passwordunuzu giriniz");
//    String password = scan.next(); 
//    
//    //String'lerin esitligini kontrol ederken
//    //asla "==" sembolu kullanmayin. Onun yerine
//    //"equals()" kullanin
//    
//    //"==" String'in degerini ve adresini kontrol eder
//    //"equals()" ise sadece degerleri kontrol eder.
//    
//   if(password.equals("JavaIyidir")) {
//	   System.out.println("Password dogru");
//
//}else {
//	System.out.println("Tekrar deneyiniz");
//}
   
// Kullanıcıdan Yıllık gelirini alarak vergi durumunu hesaplayan bir java kod yazınız?
	// Gelir <= 15 000 ise vergi oranı %25
	// Gelir <= 30 000 ise vergi oranı %30
	// Gelir <= 60 000 ise vergi oranı %40
	// Gelir <= 100 000 ise vergi oranı %50
   
   	System.out.println("Lütfen yillik gelirinizi giriniz:");
   	double gelir = scan.nextDouble();
   	double OdVergi;
   	if(gelir<=15000) {
   		OdVergi= gelir*0.25;
   	}else if(gelir<=30000) {
   		OdVergi= gelir*0.30;
   		
   	}else if(gelir<=60000) {
   		OdVergi= gelir*0.40;
   	}else {
   		OdVergi= gelir*0.50;
   	}
   	System.out.println("Odeyeceginiz vergi: "+ OdVergi);
   	
    }
}

