package derscalısma2;

import java.util.Scanner;

public class Ders09 {

	public static void main(String[] args) {
		// Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını 
		//ekrana  yazdıran bir program yazın.
		Scanner scan = new Scanner(System.in);
		System.out.println("En az iki basamaklı bir sayı giriniz");
		int num = scan.nextInt();
		
		int sum= 0;
		toplama(sum,num);
	}
	public static void toplama(int sum, int num) {
		do {
				sum=sum+(num%10);
				num=num/10;
				
		}while (num>0);
			System.out.println("Rakamlar Toplamı: "+ sum);
		
	}
}
