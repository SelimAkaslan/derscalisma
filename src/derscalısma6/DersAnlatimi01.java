package derscalısma6;

import java.util.Scanner;

public class DersAnlatimi01 {

	public static void main(String[] args) {
		// if(){
		// int not = 40;
		// if(not<50) {
		// 	System.out.println("Basarisiz");
		// 	}
		
		
		
	
	
	
		
		// if() else
		//int sayi = 5;
		//if(sayi>8) {
		//	System.out.println("yanlis");
			//}else {
		//	System.out.println("dogru");
		//}
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Lutfen passwordunuzu giriniz");
		//String password = scan.next();
		//if(password.equals("2021guzelolacak")) {
		//	System.out.println("password dogru");
		//}else {
		//	System.out.println("Tekrar deneyiniz");
		//}
		
		
	

	
	
	
	
	
	//if-else if()
		 
	// Kullanıcıdan Yıllık gelirini alarak vergi durumunu hesaplayan bir java kod yazınız?
		// Gelir <= 15 000 ise vergi oranı %25
		// Gelir <= 30 000 ise vergi oranı %30
		// Gelir <= 60 000 ise vergi oranı %40
		// Gelir <= 100 000 ise vergi oranı %50
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yillik gelirinizi giriniz");
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