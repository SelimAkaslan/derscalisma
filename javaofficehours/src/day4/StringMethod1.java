package day4;

import java.util.Scanner;

public class StringMethod1 {

	public static void main(String[] args) {
		// IndexOf Karakterin yerini belirler. Karakter sayımı 0 dan başlar.
				// istanbul kelimesindeki u harfini indexi nedir.
				
//				String str ="Istanbul";
//				System.out.println(str.indexOf('u'));
				
				//last IndexOf methodu aradığımız karakterin string içindeki son görünümğnğn indexini  verir.
				
				String srt1= "sarikayalar";
				System.out.println(srt1.lastIndexOf('a'));
				
				// lenght () String uzunluğunu verir. Saymaya 1 den başlar.
				
				// Kullanıcıdan kelime alalım  son harflerini yazdıralım.
				
//				Scanner sc= new Scanner (System.in);
//				System.out.println("Lütfen bir kelime giriniz.");
//				
//				String str = sc.next();
//				System.out.println(str.charAt(str.length()-1));
				
				//contains() string de aranan karakter var ise True yok ise false döner.
				
				String soz ="Java öğrenmek bizim işimiz.";
				System.out.println(soz.contains("biz"));
				System.out.println(soz.contains("son"));
				
				//isEmpty stringde karakter var ise false yok ise true,
				
				String se =" " ;
				System.out.println(se.isEmpty());
				
				// trim() methodu Stringin baş ve sonundaki boşlukları alıyor.
				
				String str3= " ankara ";
				
				System.out.println(str3.trim());
				
				// starsWith () istenen harf ile başlayıp başlamadığın kontrol eder.
				// true yada false döner.
				
				String srt4= "Can Ali";
				System.out.println(srt4.startsWith("A"));
				System.out.println(srt4.startsWith("C"));
				
				// substring methodu stringin belli bir bölümünü kesip almamıza yarar.
				
				String str4 = "istanbullular";
				
				System.out.println(str4.substring(4));
				System.out.println(str4.substring(4, 7)); //[4,7)
				//kullanıcısan tek kelime alalım ve ilk harfi ile son harfini yerdeğiştirelim.
				
				Scanner sc = new Scanner(System.in);
				 System.out.println("Lütfen tek  kelime giriniz.");
				 String str5=sc.next();
				 
				 char ilk =str5.charAt(0);
				 char son =str5.charAt(str5.length()-1);
				 
				 System.out.println(son+str5.substring(1,str5.length()-1)+ilk);
				 
	

	}

}
