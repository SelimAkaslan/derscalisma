package day02wrapperclasses;

import java.util.Scanner;

public class Scenner07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen ücgenin cevre uzunluklarını yazınız");
		
		byte uzunluk1 = scan.nextByte();
		byte uzunluk2 = scan.nextByte();
		byte uzunluk3 = scan.nextByte();
		
		System.out.println(uzunluk1 + uzunluk2 + uzunluk3);
		
		
		scan.close();
	}

}
