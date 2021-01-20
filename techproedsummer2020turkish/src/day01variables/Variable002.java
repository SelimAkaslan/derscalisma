package day01variables;

public class Variable002 {

	public static void main(String[] args) {
		
		char harf1 = 'a'; // a nın değeri 97
		char harf2 = 'b'; // b nin değeri 98
		// syso=control+space => System.out.println();
		System.out.println(harf1+harf2);   // ab arasına + konursa toplama işlemi yapar
		
		System.out.println(harf1);
		System.out.println(harf2);
		
		System.out.print(harf1);
		System.out.println(harf2);
		
		// Bir char ın sayı değeri ASCII tablosu kullanılmadan nasıl bulunur?
		// data type int olan bir variable oluştur ve char ı bu variable ata
		int aCharDeger = 'a';
		System.out.println(aCharDeger); //97
		
		int ünlCharDeger = '!';
		System.out.println(ünlCharDeger);
		
		int yuzCharDeger = '%';
		System.out.println(yuzCharDeger);
		
		int yilCharDeger = '*';
		System.out.println(yilCharDeger);
		
		
int numA = 2;
int numB = 3;

String str1 = "Study";
String str2 = "Hard";

System.out.println((numA*numB) + "" + (numB-numA) + " " + str1 + (numA-numB));

	
	
	}
}