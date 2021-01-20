package konuanlatımı;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		// Kullanıcıdan Yıllık gelirini alarak vergi durumunu hesaplayan bir java kod yazınız?
				// Gelir <= 15 000 ise vergi oranı %25
				// Gelir <= 30 000 ise vergi oranı %30
				// Gelir <= 60 000 ise vergi oranı %40
				// Gelir <= 100 000 ise vergi oranı %50
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yıllık gelirinizi giriniz:");
		double gelir= scan.nextDouble();
		double OdVergi;
		
		
	if(gelir<=15000) {
			OdVergi= gelir*0.25;
	}else if(gelir<=30000) {
			OdVergi = gelir*0.30;	
	}else if(gelir<=60000) {
		OdVergi = gelir*0.40;
	}else {
		OdVergi= gelir*0.50;
	}
		System.out.println("Odeyeceğiniz vergi: "+OdVergi);
	}
}
