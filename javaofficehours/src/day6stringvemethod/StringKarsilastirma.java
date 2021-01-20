package day6stringvemethod;

import java.util.Scanner;

public class StringKarsilastirma {

	public static void main(String[] args) {
	//Girilen iki String veriyi karşılaştıran Java kodu yazınız. 
	//	aynıise True farklı ise false return etsin.
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Lütfen 1 kelime giriniz.");
		
		String str1 =sc.nextLine();
		System.out.println("Lütfen 1 kelime giriniz.");
		String str2 = sc.nextLine();
		
		System.out.println(str1.equals(str2));
		
		

	}

}