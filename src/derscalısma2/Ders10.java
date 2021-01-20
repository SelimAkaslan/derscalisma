package derscalısma2;

import java.util.Scanner;

public class Ders10 {

	public static void main(String[] args) {
		// Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.  
		//Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("paralelkenar, dikdörtgen kelimelerinden birini seciniz");
		String cokgen = scan.nextLine().toLowerCase();
		System.out.println("1. sayiyi giriniz");
		System.out.println("2. sayiyi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		hesaplama(cokgen,num1,num2);
		scan.close();
	}
	public static void hesaplama(String cokgen, int num1, int num2) {
		switch(cokgen) {
		case "paralelkenar":
			System.out.println("Alani=" + (num1*num2));
			System.out.println("çevresi= " + (2*num1+2*num2));
			break;
		case 	"dikdörtgen":
			System.out.println("Alani=" + (num1*num2));
			System.out.println("çevresi= " + (2*(num1+num2)));
			break;
		default:
			System.out.println("Lütfen belirtilen şekilleri giriniz");
			
		}
	}

}
