package derscalışma1Method;

import java.util.Scanner;

public class ders4 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, 
		// Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen yaşadığınız ülkeyi giriniz");
		
		String ülke = scan.next();

		
		switch(ülke) {
		
		case "Amerika":
			System.out.println("USA");
			break;
		case "Ingiltere":
			System.out.println("UK");
			break;
		case "Almanya":
			System.out.println("DE");
			break;
		default :
			System.out.println("NA");
			
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın. 
			
			Scanner scan2 = new Scanner(System.in);
			
			System.out.println("Lütfen yaşadığınız ülkeyi giriniz");
			String ülke1 = scan.nextLine();
			
			
			int length = ülke1.length();
			
			System.out.print(ülke.charAt(length));
			System.out.println(ülke.charAt(length+1));
			
			
			
			

	}
	}

}
