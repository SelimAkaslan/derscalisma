package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		// Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen dört rakamlı bir sayi giriniz");
		
		int s = scan.nextInt(); // bir tam sayının 1 ler basmağını bulmak için 10 a böleriz.
		int sonRakam = s % 10;
		int ilkRakam = s / 1000; // ilk basamağını bulmak için 1000 e böleriz.
		
		System.out.println(sonRakam + ilkRakam );
		
		
		scan.close();

	}

}
