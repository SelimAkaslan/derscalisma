package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// kullanıcı iki tamsayı versin
		// program bu tam sayıalrın toplamını ve çarpımı ekrana yazdırsın
		
		Scanner scan = new Scanner(System.in); // Scanner class ını import ettik
		
		System.out.println("lütfen iki tamsayı girin.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		
scan.close();
	}

}
