package derscalışma1Method;

import java.util.Scanner;

public class ders9 {

	public static void main(String[] args) {
		// soru 2 : Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten 
		//3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Başlangıç değeri giriniz");
		int basS = scan.nextInt();
		System.out.println("Lütfen Bitiş değeri giriniz");
		
		int bitS = scan.nextInt();
		
		for(int bas=0; basS<=bitS; basS++) {
			if(basS%3==0 && basS%5==0) {
				System.out.println(basS+ " ");
				basS++;
				
				
			}
			
			System.out.println("Lütfen Başlangıç değeri giriniz");
			int ilkS = scan.nextInt();
			System.out.println("Lütfen Bitiş değeri giriniz");
			int sonS = scan.nextInt();
			while(ilkS<sonS) {
				if(ilkS%3==0 && ilkS%5==0) {
					System.out.print(ilkS + "-");
					ilkS++;
				}
			}
		}
		
		

	}

}
