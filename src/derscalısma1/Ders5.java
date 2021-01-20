package derscalısma1;

import java.util.Scanner;

public class Ders5 {

	public static void main(String[] args) {
		// Öğrencilerin vize ve final notlarına göre geçip geçmediğini hesaplama
		// öğrencilerden Not bilgilerini isteyiniz
		// ekrana ortalamalarını ve geçip geçmediklerini yazınız
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen vize notunuzu giriniz");
		int vizeNot = scan.nextInt();
		
		System.out.println("Lütfen final notunuzu giriniz");
		int finalNot = scan.nextInt();
		
		double ortalama = vizeNot*0.4 + finalNot*0.6;
		
		System.out.println(ortalama);
		
				
		if (ortalama>=50 && finalNot>=50) {
			System.out.println("Dersi Geçtiniz");
			
		}else {
			System.out.println("Dersten Kaldınız");
			
		}
		System.out.println("Ders Ortalamanız:" + ortalama);
	
	
	}

}
