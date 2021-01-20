package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		// kullanıcıdan alınan bir sayının küpünü hesaplama
		
		System.out.println("Lutfen bir sayı giriniz");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1 * sayi1 * sayi1);
		
		
		
		scan.close();

	}

}
