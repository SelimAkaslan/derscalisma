package derscalısma1;

import java.util.Scanner;

public class Ders18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tamsayı giriniz:");
		
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000) ? "3 Basamaklı" :(num%2==0) ? "3 Basamaklı olmayan cift sayi" : 
			"3 Basamaklı olmayan tek sayi";
		
			System.out.println(result);
			
			scan.close();
	}

}
