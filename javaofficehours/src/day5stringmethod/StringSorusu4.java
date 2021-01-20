package day5stringmethod;

import java.util.Scanner;

public class StringSorusu4 {

	public static void main(String[] args) {
		  	Scanner sc=new Scanner(System.in);
		  	System.out.println("Lütfen bir şehir giriniz");
	       String str=sc.nextLine();
	       System.out.println(str.substring(0, str.length()-1));
	        
sc.close();
	}

}
