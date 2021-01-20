package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin 
		// Bu sayilar biribirne esit ise toplamlarini ekrana yazdirin
		// Birbirinden farkli ise carpimlarini ekrana yazdirin
		
		Scanner scan = new Scanner(System.in);
				
				System.out.println("Lütfen bir sayı girin");
		
		 double num1 = scan.nextDouble();
		 
		 System.out.println("Lütfen bir sayı daha girin");
		 double num2 = scan.nextDouble();
		 
		 double sonuc = num1==num2 ? num1+num2 : num1*num2;
		 
		 System.out.println(sonuc);
		 
		 scan.close();
		
	}
	

}
