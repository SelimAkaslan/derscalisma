package derscalısma1;

import java.util.Scanner;

public class Ders4 {

	public static void main(String[] args) {
		
		// kullanıcıdan bir tam sayı alınız
		// bu sayının 3 e bölünüp bölünmediğini bulunuz
		// akrana yazdırınız
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tam sayı griniz");
		
		int sayi= scan.nextInt();
		int kat= sayi%3;
		if (kat==0) {
			System.out.println("3 ün katıdır.");
		} else {
			System.out.println("3 ün katı değildir.");
			
		}
		
		
		
	}
	

}
