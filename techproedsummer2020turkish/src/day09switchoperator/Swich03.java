package day09switchoperator;

import java.util.Scanner;

public class Swich03 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Ay ismi giriniz:");
        // Kullanici ay ismini girsin
        // Program kacinci ay oldugunu ekrana yazsin
        // Buyuk harf kucuk harf hepsi icin calissin
        // Yanlis ay ismi girerse ekrana "Gecerli ay ismi giriniz" yazsin
        
        
        System.out.println("Ay ismini giriniz");
        String ay = scan.next();
        ay= ay.toLowerCase();// toLowerCase() ==> Bu method String'leri kucuk harfe cevirmek icin kullanilir
                             // toUpperCase() ==> Bu method String'leri buyuk harfe cevirmek icin kullanilir
		switch(ay) {
			case "ocak" :
				System.out.println("1");
				break;
			case "subat" :
				System.out.println("2");
				break;
			case "mart" :
				System.out.println("3");
				break;
			case "nisan" :
				System.out.println("4");
				break;
			case "mayıs" :
				System.out.println("5");
				break;
			case "haziran" :
				System.out.println("6");
				break;
			case "temmuz" :
				System.out.println("7");
				break;
			case "agustos" :
				System.out.println("8");
				break;
			case "eylül" :
				System.out.println("9");
				break;
			case "ekim" :
				System.out.println("10");
				break;
			case "kasım" :
				System.out.println("11");
				break;
			case "aralık" :
				System.out.println("12");
				break;
				default:
					System.out.println("Geçerli ay  ismi giriniz");
			scan.close();
	}

}
}
