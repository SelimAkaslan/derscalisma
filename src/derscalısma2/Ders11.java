package derscalısma2;

import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {
		// Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran  Program yazınız.  
		//Ornegin; CAN ==> 	C                                                              
				//			A                                                              
				//			N
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.nextLine();
		int length = isim.length();
		
		alfabetikIsim(isim,length);
		
		scan.close();

	}
	public static void alfabetikIsim(String isim, int length) {
		int harf= 0;
		do {
			System.out.println(isim.charAt(harf));
		harf++;
		}while (harf<length);
		
		
	}

}
