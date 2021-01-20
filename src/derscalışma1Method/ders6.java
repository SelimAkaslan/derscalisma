package derscalışma1Method;

import java.util.Scanner;

public class ders6 {

	public static void main(String[] args) {
		//5)Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten 
				//tüm tamsayıların çarpımını ekrana yazdırın.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen başlangıç değeri giriniz");
		int baslangıc = scan.nextInt();
		System.out.println("Lütfen bitiş değeri giriniz");
		int bitis = scan.nextInt();
	
		int product = 1;
		while (baslangıc<=bitis){
			product=product*baslangıc;
			baslangıc++;	
				
		}
		System.out.println("Toplam: " +product);
		
		//soru 6: )Kullanıcıdan başlangıç ve bitiş  harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde  biten 
		//tüm harfleri büyük harf olarak ekrana yazdırın. 
		//Kullanıcının hata yapmadığını farz edin.
		
		System.out.println("Lütfen başlangıç harfi giriniz");
		char ilkH = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen bitiş harfi giriniz");
		char sonH = scan.next().toUpperCase().charAt(0);
		
		char harf = ilkH;
			while (harf<=sonH) {
				System.out.print(harf+ " ");	
		}
			ilkH++;
			
		}
		
		
		
	}
		
	
		
			


