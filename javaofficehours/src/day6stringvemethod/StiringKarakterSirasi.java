package day6stringvemethod;

import java.util.Scanner;

public class StiringKarakterSirasi {

	public static void main(String[] args) {
		// Girilen String değer içinde istenen indexteki karakteri bulan 
		//Java kodunu yazınız. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen bir kelime giriniz");
		String str = sc.nextLine();
		System.out.println("Lütfen index numarasını giriniz.");
		int i = sc.nextInt();
		
		int index = str.charAt(i);
		System.out.println(i + "." + "index karekteri: " + (char)index );
		
		

	}

}