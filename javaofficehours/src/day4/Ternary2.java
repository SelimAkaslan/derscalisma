package day4;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf isteyelim ve bunun büyük harf küçük harf yada hatalı gişir.
				// olmadurumunu ternary ile kontrol edelim.
				
				Scanner sc =new Scanner (System.in);
				System.out.println("Lütfen bir karakter giriniz.");
				
				char ch =sc.next().charAt(0);
				
				String result = ch>='a' && ch<='z' ? "Küçük harf": ch >='A' && ch<='Z'? 
						"Büyük harf":"Hatalı giriş";
				System.out.println(result);
		

	}

}
