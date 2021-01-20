package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		// Kullanicidan bir tamsayi isteyin ve o tam sayinin mutlak degerini ekrana yazdirin
		// Mutlak deger bir sayinin kendi isareti ile carpimidir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tamsayı giriniz");
		
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println(num*(+1));
			
		}else {
			System.out.println(num*(-1));
			
		}
		
		
	}

}
