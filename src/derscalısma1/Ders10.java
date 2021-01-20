package derscalısma1;

import java.util.Scanner;

public class Ders10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz");
		
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("Negatif");
		}else if (num==0) {
			System.out.println("Notr");
		}else {
			System.out.println("Pozitif");
		}
		
	}

}
