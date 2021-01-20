package derscalışma1Method;

import java.util.Scanner;

public class ders5 {

	public static void main(String[] args) {
		 
	

		Scanner scan = new Scanner(System.in);
		// soru 1: While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.
		
		
		int num=1;
		while (num<14) {
			if(num%2!=0) {
				System.out.println(num + " ");
			}
			num++;	
		}
		// soru 2 Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten
		//tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		System.out.println("Lütfen başlangıç değeri giriniz");
		int bas = scan.nextInt();
		System.out.println("Lütfen bitiş değeri giriniz");
		int bit = scan.nextInt();
		
			while (bas<=bit) {
				if(bas<=bit) {
				System.out.println(bas + " ");	
				}
			 bas++;
			 
		 }
			
			System.out.println();
			
			// soru 3  Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından   
			//başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları 
			//while loop kullanarak ekrana yazdırınız.
		
			System.out.println("Lütfen başlangıç değeri giriniz");
			int basla = scan.nextInt();
			System.out.println("Lütfen bitiş değeri giriniz");
			int bitis = scan.nextInt();
		
			while(basla<=bitis) {
				if (basla%2==0) {
					System.out.println(basla + " ");
				}
				basla++;	
				}
				
				
				
			}
			
		
	}

