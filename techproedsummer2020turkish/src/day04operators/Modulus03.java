package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen üç rakamlı bir tam sayi giriniz");
		
		int s = scan.nextInt();
		
		int sonRakam = s %10;
		int ilkRakam = s / 100;
		
		int ortaV = s /10; // orta rakamı bulmak için sayıyı 10 bileriz, çıkanı da 10 ile modulus yaparız.
		int ortaRakam = ortaV % 10; 
		
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		
		
		System.out.println("Lütfen dört rakamlı bir tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		int birB = sayi % 10;
		
		int onB1 = sayi / 10;
		int onB = onB1 % 10;
		
		int yüzB1 = sayi /100;
		int yüzB = yüzB1 %10;
		
		int binB = sayi / 1000;
		
		System.out.println(birB + onB + yüzB + binB);
		
		
		
		scan.close();	

	}

}
