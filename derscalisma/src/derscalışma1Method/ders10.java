package derscalışma1Method;

import java.util.Scanner;

public class ders10 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int num = scan.nextInt();
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
			System.out.print(i+" ");

			}
			int s = 1;
			while(s>=num) {
				if(num%s==0) {
					System.out.println(s + " ");
					s++;
				}
			}
		}
	}

}
