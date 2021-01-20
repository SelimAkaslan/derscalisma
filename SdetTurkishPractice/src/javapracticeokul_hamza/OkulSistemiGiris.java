package javapracticeokul_hamza;

public class OkulSistemiGiris {
	/*
	 * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	 * 
	 * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	 * 			 Buradaki verileri public static final olarak tutalım.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adım : Ogretmen adlı bir class oluşturalım.
	 * 			 Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	 * 
	 * 3. Adım : Ogrenci adlı bir class oluşturalım.
	 * 			 Bu classta pgrencinin adı, okulnumarası bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	 * 
	 * 4. Adım : Ogretmenler adlı class oluşturalım.
	 * 			 Bu classta tüm öğretmenleri tutualım.
	 * 			 İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	 * 
	 * 5. Adım : Ogrenciler adlı class oluşturalım.
	 * 			 Bu classta tüm öğrenciler tutualım.
	 * 			 İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	 * 	 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("****OKUL SISYEMINE HOSGELDINIZ****");
		/* Eğer nesne üreterek başka bir class'tan  bilgi almak istiyorsak ya da methodlara, değişkenlere
		 * erişmek istiyorsak, verilerimizi private yapabilir, onlara public methodlardan erişebiliriz.
		 * buna Encapsolution deniliyor. (getter ve setter methodları)
		 * */
		
		SabitBilgiler sabitbilgiler = new SabitBilgiler();
		System.out.println("Okul ismi : "+SabitBilgiler.OKUL_ISIM);
		System.out.println("Mudur Bey : "+ SabitBilgiler.MUDUR);
		System.out.println("Telefon No : "+ SabitBilgiler.TELEFON_NO);
		System.out.println("Website : "+ SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek : "+ SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : "+ SabitBilgiler.ADRES);
		
		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Suleyman Alptekin");
		ogretmenSuleymanBey.setBrans("Java");
		ogretmenSuleymanBey.setTelefon("05399999999");
		
		System.out.println("\nIsim : "+ogretmenSuleymanBey.getIsim());
		System.out.println("Brans : "+ogretmenSuleymanBey.getBrans());
		System.out.println("Telefon : "+ogretmenSuleymanBey.getTelefon());
		
		
		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yilmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("05366666666");
		
		//System.out.println("Hamza : "+ogretmenHamza.toString());
		
		
		System.out.println("\nIsim : "+ ogretmenHamza.getIsim());
		System.out.println("Brans : "+ ogretmenHamza.getBrans());
		System.out.println("Telefon : "+ ogretmenHamza.getTelefon());
		
		Ogretmen1 ogretmenAyseHanim = new Ogretmen1("Ayse Hanim","Selenium","05300000000");
		System.out.println("\nIsim : "+ ogretmenAyseHanim.getIsim());
		System.out.println("Brans : "+ ogretmenAyseHanim.getBrans());
		System.out.println("Telefon : "+ ogretmenAyseHanim.getTelefon());
		
		System.out.println("\n     OGRENCI OLUSTURALIM     ");
			Ogrenci ogrenci1 = new Ogrenci() ;
			ogrenci1.setIsim("Adil Yesilmen");
			ogrenci1.setNo(1);
			System.out.println(ogrenci1.toString());
			
			Ogrenci ogrenci2 = new Ogrenci() ;
			ogrenci2.setIsim("Ahmet Yanik");
			ogrenci2.setNo(2);
			System.out.println(ogrenci2.toString());
			
			Ogrenci ogrenci3 = new Ogrenci() ;
			ogrenci3.setIsim("Ersin Kara");
			ogrenci3.setNo(2);
			System.out.println(ogrenci3.toString());
			
			System.out.println("\n     OGRETMENLER CLASS     \n");
			Ogretmenler ogretmenler = new Ogretmenler();
			ogretmenler.ogretmenEkle(ogretmenSuleymanBey);
			ogretmenler.ogretmenEkle(ogretmenHamza);
			
			System.out.println(ogretmenler.ogretmenSayisi());
			
			System.out.println(ogretmenler.toString());
			
			
			System.out.println("\n      OGRENCILER CLASS      \n");
			Ogrenciler ogrenciler = new Ogrenciler();
			ogrenciler.ogrenciEkle(ogrenci1);
			ogrenciler.ogrenciEkle(ogrenci2);
			ogrenciler.ogrenciEkle(ogrenci3);
			
			System.out.println(ogrenciler.ogrenciSayisi());
			
			System.out.println(ogrenciler.toString());
			
		}
	}


