package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// kullanıcının girdiği bir sayı için çarpım taplosu oluşturun.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int num = scan.nextInt();
		
		for(int i=1; i<11; i++) {
			System.out.println(num + "x" + i + "=" +(num*i));
			
		}
		int num1 =1;
		while(num1<11) {
			System.out.println(num + "x" + num1 + "=" +(num*num1));
			num1++;
			
		}
scan.close();
	}

}
