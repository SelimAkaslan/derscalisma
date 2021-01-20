package derscalışma1Method;

import java.util.Scanner;

public class ders1 {

	public static void main(String[] args) {
		// Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu  rakamlarını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kredi kartı numaranızı giriniz:");
		
		String kartNo = scan.next();
		
	
		 System.out.println(kartNo.charAt(3));
		 System.out.println(kartNo.charAt(4));
		 
		 int length = kartNo.length();
		 System.out.println(kartNo.charAt(length-1));
		 
		 scan.close();
	}

}
