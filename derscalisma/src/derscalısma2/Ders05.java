package derscalısma2;

import java.util.Scanner;

public class Ders05 {

	public static void main(String[] args) {
		// Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi aynı ise ekrana  “Simetrik” yazdırın. 
		//Aynı değilse tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);
		
		String str= "";
			
		do {
			System.out.println("Bir esya adı giriniz");
			str = scan.nextLine();
	
			
		}while(str.charAt(0) != str.charAt(str.length()-1));
			System.out.println("Simetrik");
		
			scan.close();
	}

}
