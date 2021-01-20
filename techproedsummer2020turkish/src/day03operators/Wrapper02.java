package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ilk adınızı giriniz");
		String ad = scan.nextLine();
		
		System.out.println("Lutfen soyadınızı giriniz");
		String soyad = scan.nextLine();
		
		System.out.println(ad);
		System.out.println(soyad);
		
	
		
		scan.close();	

	}

}
