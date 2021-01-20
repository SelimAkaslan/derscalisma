package day03operators;

import java.util.Scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
	
		byte by1 = 101;
		
		int sayi1 = by1; // küçük data tipini büyük data tipine çevirmek için ekstra bir kod yazmaya gerek yok. 
						// Java bunu otomatik yapıyor. (Auto  Widening)
		
		System.out.println(sayi1);
		
		int sayi2 = 53;
		byte by2 = (byte)sayi2; // büyük data tipini küçük data tipine çevirmek Java tarafından yapılmaz.
								// örnekteki gibi sağ tarafa dönüştürmek istediğimiz data tipini uyazmalıyız.
		
		System.out.println(by2);
		
		double sayi3 =23.5;
		int by3 = (int)sayi3;
		
		System.out.println(by3);
		
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		
		double sonuc1 = sayi5 / sayi6;
		System.out.println(sonuc1);
		
		int sonuc2 = (int) (sayi5 / sayi6);
		System.out.println(sonuc2);
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7 /sayi8;
		System.out.println(sonuc3);
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		
		System.out.println(by5); // noralde byte ( -128...0..127) 256 sayı var. 255 bir tane eksik bu yüzden -1 yazılır.
		
		
		
			
		
		

	}
	
}
