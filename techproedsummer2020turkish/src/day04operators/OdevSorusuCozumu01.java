package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		// Kullanıcıdan integer aldıktan sonra String alamıyoruz.
		
		
		Scanner scan = new Scanner(System.in);
		
		// Java da nextInt() kullandıktan sonra nextLine() kullanırsak kod çalışmıyor. 
		// nextInt() yerine nextLine() kullan sonra sonra elde ettiğin String i 
		// Integer.parseInt() kullanarak integer a çevir.
		
		System.out.println("Yasinizi giriniz");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); // String i tamsayıya çevirme metodu
											// Integer.parseInt() sadece rakam içeren Stringler için çalışır.
		System.out.println(yeniYas+1); // 34 verecek

		
		System.out.println("Adınız ve soyadiniz giriniz");
		
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();	

	}

}
