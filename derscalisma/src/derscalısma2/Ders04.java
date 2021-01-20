package derscalısma2;

import java.util.Scanner;

public class Ders04 {

	public static void main(String[] args) {
		// Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın. 
		// Eşit değilse tekrar iki sayı girmesini söyleyin.

		Scanner scan = new Scanner(System.in);
			
			int num1 = 0;
			int num2 = 0; 
			
		do {
			System.out.println("1. Sayiyi giriniz");
			num1 = scan.nextInt();
			System.out.println("2. Sayiyi giriniz");
			num2 = scan.nextInt();
			
			if(num1==num2) {
				System.out.println("Kare olusturdunuz");
			}
				
			}while(!(num1==num2));
				
		scan.close();
		
	}

}
