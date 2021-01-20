package konuanlatımı;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		// Birbirini takip eden koşulların kontrolu için kullanılan bir yapıdır.
		// if ing koşul anlamına gelir.
		// Nasıl çalışır?
//		int sayi =0;
//		
//		
//		if(sayi>0) {
//			System.out.println("Pozitif sayi");
//		}else if(sayi<0) {
//			System.out.println("Negaif sayi");
//		}else {
//			System.out.println("Notr sayi");
//		}
		//String'lerin esitligini kontrol ederken
        //asla "==" sembolu kullanmayin. Onun yerine
        //"equals()" kullanin
        
        //"==" String'in degerini ve adresini kontrol eder
        //"equals()" ise sadece degerleri kontrol eder.
		
//		Scanner scan = new Scanner(System.in);  
//        System.out.println("Passwordunuzu giriniz");
//        String password = scan.next(); 
//
//       if(password.equals("JavaIyidir")) {
//    	   System.out.println("Pasword dogru");
//
//	}else {
//		System.out.println("Tekrar deneyiniz");
//	}
    // Kullanıcıdan Yıllık gelirini alarak vergi durumunu hesaplayan bir java kod yazınız?
		// Gelir <= 15 000 ise vergi oranı %20
		// Gelir <= 30 000 ise vergi oranı %25
		// Gelir <= 60 000 ise vergi oranı %30
       	// Gelir <= 100 000 ise vergi oranı %40
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yillık gelirinizi giriniz:");
		double gelir= scan.nextDouble();
		double OdVergi;
		double vergi1 = 15000 * 0.20;
		double vergi2 = 30000 * 0.25;
		double vergi3 = 60000 * 0.30;
		double vergi4 = 100000 * 0.40;
		
		if(gelir<=15000) {
			OdVergi= gelir * 0.20;
			
		}else if(gelir<=30000) {
			OdVergi= vergi1+ (gelir-15000) * 0.25;
			
		}else if(gelir<=60000) {
			OdVergi= vergi1+vergi2+(gelir-30000)*0.30;
	
		}else {
			OdVergi= vergi1+vergi2+vergi3+(gelir-60000)*0.40;
		}
		System.out.println("Odemeniz gereken vergi: "+OdVergi);
   
	}

}
