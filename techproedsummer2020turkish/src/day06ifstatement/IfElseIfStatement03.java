package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		//Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir 
        //jackpot oyunu icin program yaziniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen altı basamaklı bir sayı girin");
		
		int num = scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazandınız");
			
		}else if (num<500000) {
			System.out.println("Amorti");
			
		}else {
			System.out.println("Kaybettiniz");
			
		}
				

	}

}
