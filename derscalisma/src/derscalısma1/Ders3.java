package derscalısma1;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		 // Bir char variable olusturun ve bir buyuk harf deger atayin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
        // ekrana "Boyle bir gun yok" yazdirin.
        // Pazar, Pazartesi, Persembe <-> Sali <-> Carsamba, Cuma, Cumartesi
		
		Scanner scan = new Scanner(System.in);
		
		char gun = 'P';
		if (gun == 'P') {
			System.out.println("Pazartesi, Perşembe, Pazar");
		}
		if (gun=='C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		if (gun=='S') {
			System.out.println("Salı");
			
		}
		if (gun!='P' && gun!='S' && gun!='C') {
			System.out.println("Böyle bir gün yok");
			
		}
		

	}

}
