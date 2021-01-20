package derscalışma1Method;

import java.util.Scanner;

public class ders12 {

	public static void main(String[] args) {
		// soru 5: Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek  ekrana yazdırın. 
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir isim giriniz ");
		String ch = scan.nextLine();
		char harf1 = ch.charAt(0);
		char harf2 = ch.charAt(ch.length()-1);
		String kalan = ch.substring(1, ch.length()-1);
		System.out.println(harf2 + kalan + harf1);
		
		
		
		
		
		
		
	}

}
