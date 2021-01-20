package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen çevirmek istediginiz Mil'i yazınız");
		
		double mil = scan.nextDouble();
		
		System.out.println(mil * 1.6);
		
		scan.close();
	}

}
