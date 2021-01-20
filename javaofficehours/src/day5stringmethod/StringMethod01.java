package day5stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
		
		// concat . stringleri birleştimreyi sağlar
		String str1= "ankara";
		String str2="van";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		
		//replace() Stringte ki istenilen karakterlerin başka karakterlerle değişmesini sağlar
		String str3= "karete";
		System.out.println(str3.replace("a", "o"));
		
		//valuOf()
		//1. Stringleri int dönüştürür
		
		String butce1 = "12000";
		String butce2 = "13000";
		System.out.println(Integer.valueOf(butce1)+Integer.valueOf(butce2));
		
		
		// 2. İnt içindeki karakterlere string özelliği katar.
		int yas1 =12;
		int yas2 = 15;
		System.out.println(yas1+yas2);
		System.out.println(String.valueOf(yas1)+String.valueOf(yas2));
		
	}

}
