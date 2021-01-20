package javaofficehours01;

import java.util.Scanner;

public class Day1c {

	public static void main(String[] args) {
		// Kullanıcadan 5 basamaklı tam sayı alalım ve bu sayının baştan 2 ve sonda 2 rakamların
				// basamak değeri ile toplama sonucunu yazdıralım.  12345 => 12045
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Lütfen 5 basamaklı tam sayı giriniz.");
				
				int num = sc.nextInt();
				
				int ilkIki=num/1000;
				System.out.println(ilkIki);
				ilkIki=ilkIki*1000;
				
				
				int sonIki= num%100;
				System.out.println(sonIki);
				
				int sum = ilkIki + sonIki;
				
				System.out.println("Toplam:" +sum);

	}

}
