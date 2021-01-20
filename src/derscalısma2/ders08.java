package derscalısma2;

import java.util.Scanner;

public class ders08 {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana “Birinci sayı büyük”, 
		//ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz");
		int num1 = scan.nextInt();
		System.out.println("2.sayıyı giriniz");
		int num2 = scan.nextInt();
		
		islem(num1,num2);
		scan.close();
	}
	public static void islem(int num1,int num2) {
		if (num1==num2) {
			System.out.println("Eşit");
		}else if(num1>num2) {
			System.out.println("Birinci sayi büyük");
		}else
			System.out.println("ikinci sayi büyük");
	}
		
	} 


