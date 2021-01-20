package javaofficehours01;

import java.util.Scanner;

public class Day1b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Liütfen iki sayı giriniz");
		double num1 =scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double toplama = num1+num2;
		System.out.println("Toplama: "+ toplama);
		
		double cıkarma = num1-num2;
		System.out.println("Cıkarma: "+ cıkarma);
		
		double carpma = num1*num2;
		System.out.println("Carpma: "+ carpma);
		
		double bölme = num1/num2;
		System.out.println("Bölme: "+ bölme);
		
	}

}
