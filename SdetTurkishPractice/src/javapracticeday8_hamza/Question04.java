package javapracticeday8_hamza;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayıyı String'e çevirin.
		 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println(" Lütfen sayi giriniz:");
		int sayi = sc.nextInt();
		System.out.println();
		System.out.println("Sayının değerleri toplamı: "+getRakamlarToplami(sayi));
		
		System.out.println("While ile toplam: "+getRakamlarToplamıWhileDongusu(sayi));

	}
	        public static int getRakamlarToplami(int sayi) {
	        	
	        	String sayininStringi = String.valueOf(sayi);
	        	 int toplam = 0;
	 
	        for(int i = 0; i <sayininStringi.length(); i++) {
	        	int sayiyaCevir =  Integer.parseInt(sayininStringi.substring(i,i+1));
	        	toplam +=sayiyaCevir;
	        }
	        	
	        
	           return toplam;

}
	        public static int getRakamlarToplamıWhileDongusu(int sayi) {
	        	int toplam=0;
	        	while (sayi>0) {
	        		int sonHane = sayi%10;
	        		toplam+=sonHane;
	        		sayi=sayi/10;
	        		
	        	}
				return toplam;
	        }
}
