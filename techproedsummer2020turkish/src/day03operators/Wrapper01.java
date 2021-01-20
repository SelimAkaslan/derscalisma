package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// kullanıcıdan ad ve soyad alıp ekrana yazdıran bir program yazınız
		// (String kullanınız)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adınızı ve soyadınız giriniz");
		
		String isim = scan.nextLine(); // String almak için ya next() yada nextLine() kullanılır.
										// next tek kelimelik stringler için, 
										// nextLine girilen tüm stringi almak için kullanılır.
		System.out.println(isim);
		
		
		scan.close();
	}

}
