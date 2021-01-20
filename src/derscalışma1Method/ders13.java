package derscalışma1Method;

import java.util.Scanner;

public class ders13 {

	public static void main(String[] args) {
		//soru 6:  Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün indexini ekrana yazdırın. 
		//“a” harfi yoksa ekrana “a harfi yok” yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir özel isim giriniz ");
		
		String ch = scan.nextLine();
		if(ch.contains("a")) {
			System.out.println(ch.indexOf("a"));
			
		}else {
			System.out.println("a harfi yok");
		}
		
		
	}

}
