package javapracticeday10_hamza;

import java.util.Scanner;

public class AnaEkran {
	
	// Galeri uygulamasi
	// 1. arabakayit();
	//2 arabaSatis();
	// 3. arabaGuncelleme();
	// 4. arabaGoruntuleme();
	// 5. arabaRezerve();

	public static void main(String[] args) {
		VeriTabani veriTabani= new VeriTabani();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Araba Kayit");
			System.out.println("2. Araba Satis");
			System.out.println("3. Araba Guncelleme");
			System.out.println("4. Tum Arabalari Goruntuleme");
			System.out.println("5. Cikis Yap");
			
			System.out.println("Lutfen secim yapiniz.");
			
			int secim = input.nextInt(); // Kulllanicdan secim yapmasini istedik
			
			if(secim==5) {
				System.out.println("Sistemden Basariyla Ciktiniz");
				break;
			}else if(secim==1) {
				System.out.println("Aracin Id'sini giriniz");
				int id = input.nextInt();
				
				System.out.println("MaxHiz giriniz");
				int maxHiz = input.nextInt();
				
				System.out.println("Yil giriniz");
				int yil = input.nextInt();
				
				System.out.println("Marka giriniz");
				String marka = input.next();
				
				System.out.println("Renk giriniz");
				String renk = input.next();
				
				System.out.println("Vites giriniz");
				String vites = input.next();
				
				Araba araba = new Araba(id,maxHiz,yil,marka,renk,vites);
				
				veriTabani.arabaKayit(araba);
			}else if(secim==2) {
				System.out.println("Lutfen satilan aracin id'sini giriniz.");
				int id = input.nextInt();
				veriTabani.arabaSatis(id);
			}else if(secim==3) {
				System.out.println("Lutfen guncellemek istediginiz aracin id'sini giriniz.");
				int id = input.nextInt();
				System.out.println("MaxHiz giriniz");
				int maxHiz = input.nextInt();
				
				System.out.println("Yil giriniz");
				int yil = input.nextInt();
				
				System.out.println("Marka giriniz");
				String marka = input.next();
				
				System.out.println("Renk giriniz");
				String renk = input.next();
				
				System.out.println("Vites giriniz");
				String vites = input.next();
				
				Araba araba = new Araba(id,maxHiz,yil,marka,renk,vites);
				veriTabani.arabaGuncelleme(id, araba);
			}else if(secim==4){
				veriTabani.arabaGoruntuleme();
				
			}
			
			
			
			
			
		}

	}

}
