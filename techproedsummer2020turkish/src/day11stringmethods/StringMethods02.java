package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring() methodu: Bir stringin belli bir bölümünü kesip almak için kullanılır.
		
		
		String str1 = "Java calisana kolaydır";
		
		// 1. YOL
		System.out.println(str1.substring(5)); // çalışana kolaydır. 5 indexi gösterir.
		System.out.println(str1.substring(8)); // isana kolaydır. index 8 dahildir(incusive)
		System.out.println(str1.substring(22)); // Ekranda bir şey çıkmaz. 
		//System.out.println(str1.substring(23)); // Hatalı istek.
		System.out.println(str1.substring(0)); // str1 olduğundan, substring(0) hiç kullanılmaz.
		
		// 2. Versiyon
		System.out.println(str1.substring(5, 13)); // calısana yazar 5 dahil 13 hariç.
		System.out.println(str1.substring(6, 12)); // alisan yazar
		System.out.println(str1.substring(6, 6)); // ekran boş çıkar. 
		//System.out.println(str1.substring(7, 6)); // her zaman ilk index küçük veya eşit olmalıdır.
		
	}

}
