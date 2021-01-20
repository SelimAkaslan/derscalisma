package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Lütfen diktörtgenin en,boy ve yüksekligini yazınız");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		int yükseklik = scan.nextInt();
		
		System.out.println(en * boy * yükseklik);
		
			
		scan.close();		
		

	}

}
