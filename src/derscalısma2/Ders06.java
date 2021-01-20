package derscalısma2;

import java.util.Scanner;

public class Ders06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.  
		//“a” harfi yoksa tekrar bir String girmesini isteyin.
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		do {
			System.out.println("Lütfen şehir isimi giriniz");
			str=scan.nextLine();
			
		}while (!(str.contains("a")));
		System.out.println("a harfi var");
		
		
scan.close();
	}

}
