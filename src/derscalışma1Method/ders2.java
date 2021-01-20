package derscalışma1Method;

import java.util.Scanner;

public class ders2 {

	public static void main(String[] args) {
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen adınızı ve soyadınız giriniz:");
		
		String adSoyad = scan.nextLine();
		System.out.println(adSoyad.length());
		
		//Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		
		System.out.println("Lütfen adınızı giriniz:");
	
		String ad = scan.nextLine();
        ad = ad.toUpperCase();
        int length1 = ad.length();
        System.out.println(ad.charAt(0));
        
        
        System.out.println("Lütfen soyadınız giriniz:");
        String soyad = scan.nextLine();
        soyad = soyad.toUpperCase();
        int length2 = soyad.length();
        
        System.out.println(soyad.charAt(0));
       
        
		
		

	}

}
