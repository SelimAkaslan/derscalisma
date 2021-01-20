package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi giriniz");
		String Ad = scan.nextLine();
		
		System.out.println("Lutfen Soyadinizi giriniz");
		String Soyad = scan.nextLine();
		
		System.out.println("Lutfen Adresinizi giriniz");
		String Adres = scan.nextLine();
		
		System.out.println("Yaşınızı giriniz.");
		int yas = scan.nextInt();
		
		
		System.out.println("Türkiyede yaşıyorum. true/falce");
		boolean blTr = scan.nextBoolean();
		System.out.println(blTr);
		
	
		
		scan.close();	

	}

}
