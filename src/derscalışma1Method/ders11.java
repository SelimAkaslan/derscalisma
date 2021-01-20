package derscalışma1Method;

import java.util.Scanner;

public class ders11 {

	public static void main(String[] args) {
		
		// soru 4: Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın. 
		//Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Harf sayısı çift olan bir şehir giriniz ");
			
			String str = scan.nextLine();
			int yarı = str.length()/2;
			System.out.println(str.substring(0,yarı));
			
			
			
			
			
			
			
			
			
	}

}
