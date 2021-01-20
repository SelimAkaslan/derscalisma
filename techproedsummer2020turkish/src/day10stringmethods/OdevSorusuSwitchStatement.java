package day10stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
		//Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
		//Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
		//Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
		//Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ay ismi giriniz:");
		
		String ay = scan.next();
		ay = ay.toLowerCase();
		
		
		switch(ay) {
		case "ocak":
			System.out.println("Bu ay 31 gündür");
			break;
		case "subat":
			System.out.println("Bu ay 28 veya 29 gündür");
			break;
		case "mart":
			System.out.println("Bu ay 31 gündür");
			break;
		case "nisan":
			System.out.println("Bu ay 30 gündür");
			break;
		case "mayıs":
			System.out.println("Bu ay 31 gündür");
			break;
		case "haziran":
			System.out.println("Bu ay 30 gündür");
			break;
		case "temmuz":
			System.out.println("Bu ay 31 gündür");
			break;
		case "agustos":
			System.out.println("Bu ay 31 gündür");
			break;
		case "eylül":
			System.out.println("Bu ay 30 gündür");
			break;
		case "ekim":
			System.out.println("Bu ay 31 gündür");
			break;
		case "kasım":
			System.out.println("Bu ay 30 gündür");
			break;
		case "aralık":
			System.out.println("Bu ay 31 gündür");
			break;
			default :
				System.out.println("Böyle bir ay yok");
			
		}
		scan.close();
	}

}
