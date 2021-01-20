package day5stringmethod;

import java.util.Scanner;

public class StringSoru1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("Lütfen kelime giriniz");
		String str = sc.nextLine();
		
		int countStr= str.length();
		
		while(countStr>0) {
			System.out.print(str.charAt(countStr-1));
			
			countStr--;
			
		}
		System.out.println();
		
		 for (int i = str.length()-1; i>=0; i--) {
	            System.out.print(str.charAt(i));
				
		 }
sc.close();
	}

}
