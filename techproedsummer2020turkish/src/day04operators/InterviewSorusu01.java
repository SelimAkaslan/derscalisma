package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		// Iki tane variable in değerini yer degiştiriniz
		// sayi1 = 12, sayi2 = 30 ==> sayş1 = 30, sayi2 = 12 ( bu işleme swap denir.)
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yerlerini değiştirmek için iki sayı giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		// 1. yol
		System.out.println("yer değiştirmeden önce:");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		double gecici = 0.0;
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("yer değiştirdikten sonra:");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		// 2. yol
		
		System.out.println("yer degiştirmek içimn iki sayı daha giriniz");
		
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		sayi3 = sayi3 +sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;
		
		System.out.println("yer değiştirdikten sonra");
		
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		scan.close();

	}

}
