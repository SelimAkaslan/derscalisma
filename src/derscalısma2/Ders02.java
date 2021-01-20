package derscalısma2;

import java.util.Scanner;

public class Ders02 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten 
		//4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Başlangıç değeri giriniz");
		int ilk = scan.nextInt();
		System.out.println("Bitiş değeri giriniz");
		int son = scan.nextInt();
		
		if(ilk<son) {
			do {
			if(ilk%4==0 && ilk%6==0) {
				System.out.println(ilk + " ");
				
			}
			ilk++;
		}while (ilk<son);
			
		
		scan.close();
		}	
	}

}
