package derscalışma1Method;

import java.util.Scanner;

public class ders3 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin 
		// bastan ikinci harfi ile sondan ikinci harfini  büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen yaşadığınız ülkeyi giriniz");
		
		String ülke = scan.next();
		
		ülke=ülke.trim();
		ülke = ülke.toLowerCase();
		int length = ülke.length();
		
		System.out.println(ülke.charAt(0)+ülke.substring(1,2).toUpperCase() + 
				ülke.substring(2,length-2)+ülke.substring(length-2,length-1).toUpperCase()+ülke.charAt(length-1));
		

	}

}
