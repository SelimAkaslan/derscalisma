package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(Lutfen boy ve eni içeren sayı giriniz");
		
		int boy = scan.nextInt();
		int en = scan.nextInt();
		
		System.out.println(boy * en);
		
		System.out.println(2 * (boy + en));
		
		scan.close();
	}

}
