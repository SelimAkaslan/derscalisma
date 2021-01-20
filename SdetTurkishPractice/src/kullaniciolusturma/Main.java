package kullaniciolusturma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VBKullanici vbkullanici = new VBKullanici();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Hangi islemi gerceklestirmek istersiniz?\n1-) Kullanici Ekle\n2-) Kullanici Sil\n3-) Kullanici Guncelle\n4-) Tum Kullanicilar\n5-) Cikis");
			int islem = input.nextInt();
			input.nextLine();
			
			
			if( islem==1) {
				System.out.println("Kullanici Adi Giriniz: "); 
				String kulAdi = input.next();
				System.out.println("Kullanici Parola Giriniz: ");
				String parola = input.next();
				input.nextLine();
				System.out.println("Kullanici Ismi Giriniz: ");
				String isim = input.nextLine();
				System.out.println("Kullanici Soyadi Giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Mail Giriniz: ");
				String mail = input.next();
				
				Kullanici kullanici = new Kullanici(kulAdi,parola,isim,soyisim,mail);
				
				vbkullanici.kullaniciKaydet(kullanici);
				
			}
			else if( islem==2) {
				System.out.println("Silmek istediginiz kullanci index'ini gririniz: ");
				int id = input.nextInt();
				vbkullanici.kullaniciSil(id);
			}
			else if( islem==3) {
				System.out.println("Guncellemek istediginiz kullanici index'ini griniz: ");
				int id = input.nextInt();
				
				System.out.println("Kullanici Adi Giriniz: "); 
				String kulAdi = input.next();
				System.out.println("Kullanici Parola Giriniz: ");
				String parola = input.next();
				input.nextLine();
				System.out.println("Kullanici Ismi Giriniz: ");
				String isim = input.nextLine();
				System.out.println("Kullanici Soyadi Giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Mail Giriniz: ");
				String mail = input.next();
				
			
				
				Kullanici kullanici = new Kullanici(kulAdi,parola,isim,soyisim,mail);
				vbkullanici.kullaniciGuncelleme(id, kullanici);
				
			}
			else if(islem==4) {
				vbkullanici.kullaniciGoruntuleme();
				
			}
			else if(islem==5) {
				System.out.println("Program sonlandirildi");
				break;
				
			}
		}
		

	}

}
