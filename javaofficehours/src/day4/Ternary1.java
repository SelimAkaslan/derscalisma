package day4;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {
		// Kullanıdan alınacak sayının negatif pozitif yada notr olup olmadığını kontrol eden 
				// ternary yazalım.
				
				Scanner sc =new Scanner(System.in);
				System.out.println("Lütfen bir sayı giriniz.");
				double num=sc.nextDouble();
				
				String result = num<0 ?"negatif" : num>0 ? "pozitif" : "notr";
				
				System.out.println(result);

	}

}
