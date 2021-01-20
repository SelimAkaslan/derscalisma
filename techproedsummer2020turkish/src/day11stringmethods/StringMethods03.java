package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" ").concat(str2));
		
		// replace() bir karakterin yerine başka karakter yazmaya yarar.
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));
		System.out.println(str3.replace("a", "o"));
		System.out.println(str3.replace("x", "y"));
		System.out.println(str3.replace("", "y"));
		System.out.println(str3.replace("", "/"));
		System.out.println(str3.replace("t", ""));
		System.out.println(str3.replace("at", "Mustaf"));
		
		// replaceFirst() 
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K"));
		System.out.println(str4.replaceFirst("a", "e"));
		System.out.println(str4.replaceFirst("ka", "A"));
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));
		
	}

}
