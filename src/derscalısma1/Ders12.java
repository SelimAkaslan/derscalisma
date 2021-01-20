package derscalısma1;

import java.util.Scanner;

public class Ders12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir harf girin:");
		char harf = scan.next().charAt(0);
		
		if ( harf=='a') {
			System.out.println("İlk küçük harf");
			
		}else {
			System.out.println("İlk küçük harf değil");
		}
		if ( harf == 'Z') {
			System.out.println("Son büyük harf");
		}else {
			System.out.println("Son büyük harf değil");
		}
		scan.close();
	}

}
