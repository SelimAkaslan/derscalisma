package derscalısma2;

import java.util.Scanner;

public class Ders03 {

	public static void main(String[] args) {
		// Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu  
		//tüm sayıların toplamını yazdırınız. 
		//Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın

		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int result=0;
		do {
			System.out.println("Sayi giriniz");
			num = scan.nextInt();
			result += num;
		

			}while(!(num==0));
				System.out.println("Toplam: " + result);
				
scan.close();
	}

}
