package konuanlatımı;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		// Yıllık gelirinize göre vergi durumunu hesaplayan bir java kod yazınız?
		// Gelir ≤ 15 000 ise vergi oranı %25
		// Gelir ≤ 30 000 ise vergi oranı %30
		// Gelir ≤ 60 000 ise vergi oranı %40
		
	        Scanner scan = new Scanner(System.in);
	        

	        System.out.println("Gelir miktarınızı giriniz: ");
	        double gelir = scan.nextDouble();
	        double OdVergi;
	        double vergi1 = 15000 * 0.25;
	        double vergi2 = 30000 * 0.30;
	        double vergi3 = 60000 * 0.40;

	        if (gelir <= 15000) {
	        	OdVergi = gelir * 0.25;
	        }else if (gelir <= 30000) {
	        	OdVergi = vergi1 + (gelir - 15000) * 0.3;
	        }else if (gelir <= 60000) {
	        	OdVergi= vergi1 + vergi2 + (gelir - 30000) * 0.40;
	        } else {
	        	OdVergi = vergi1 + vergi2 + vergi3 + (gelir - 60000) * 0.5;
       
	}
	        System.out.println("Odemeniz gereken vergi: " + OdVergi );

}
}

