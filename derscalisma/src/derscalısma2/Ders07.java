package derscalısma2;

import java.util.Scanner;

public class Ders07 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük 
		//diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("İsim giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyad giriniz");
		String soyad = scan.nextLine();
		
		adSoyad(ad,soyad);
		scan.close();
	}
	public static void adSoyad(String ad,String soyad) {
		
		System.out.println(ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1));
		System.out.println(soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1));
		
	}
}
