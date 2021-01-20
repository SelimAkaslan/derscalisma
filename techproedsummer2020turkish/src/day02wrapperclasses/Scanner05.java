package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(Lutfen dairenin yaricapini giriniz");
		
		double yaricap = scan.nextDouble(); // data tipi int ise nextInt kullanılır
											// data tipi double ise nextDouble kullanlır vs
		
		System.out.println(3.14159 * yaricap * yaricap);
		
		 System.out.println(2 * 3.14159 * yaricap);
		 
		 
		 scan.close();	

	}

}
