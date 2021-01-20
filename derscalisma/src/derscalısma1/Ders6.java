package derscalısma1;

import java.util.Scanner;

public class Ders6 {

	public static void main(String[] args) {
		//Kullanıcıdan ders notlarını alınız 
        //1. 45 den az - başarısız. 46(dahil) ile 69 arası - geçer. z
		// 69(dahil) ile 84 arası - İyi. 85(dahil) ile 100- Pekiyi yazını
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen ders notunuzu giriniz:");
		
		int not = scan.nextInt();
		
		if (not<0 || not>100) {
			System.out.println("Geçersiz not");
		} else if (not<=45) {
			System.out.println("Başarısız");
			
		} else if (not<=69) {
			System.out.println("Geçer");
		} else if (not<=84) {
			System.out.println("İyi");
		}else if (not<=100) {
			System.out.println("Pekiyi");
			
		}
	}
		
	

}
