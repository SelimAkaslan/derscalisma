package day7methods;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		//Girilen bir sayının  ugly number olup olmadığını 
		// kontrol etmek için bir Java programı yazın.
		//Sayı sisteminde,  ugly number  sadece asal faktörleri
		// 2, 3 veya 5 olan pozitif sayılardır. 
		//İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. 
		// Kural olarak, 1 dahil.
		Scanner sc=new Scanner(System.in);
	    System.out.println("Lütfen bir sayi giriniz");
	    int num = sc.nextInt();
			int kalan = 0;
	        while (num != 1) {
	            if (num % 5 == 0) {
	                num /= 5;
	            } else if (num % 3 == 0) {
	                num /= 3;
	            } else if (num % 2 == 0) {
	                num /= 2;
	            } else {
	                System.out.print("ugly number  degildir");
					kalan = 1;
					break;
	            }
	            
	        }
	        if (kalan==0)
			System.out.print("ugly number ");
	    
	

	}

}
