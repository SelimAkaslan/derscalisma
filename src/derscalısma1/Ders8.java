package derscalısma1;

import java.util.Scanner;

public class Ders8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir yıl giriniz");
		
		int yıl = scan.nextInt();
		
	if (yıl%1000==0) {
		System.out.println("Milenyum");
	}else if (yıl%100==0) {
		System.out.println("Yüzyıl");
	}else if (yıl%10==0) {
		System.out.println("Onyıl");
	} else {
		System.out.println("Hatalı veri girişi");
	}

	}

}
