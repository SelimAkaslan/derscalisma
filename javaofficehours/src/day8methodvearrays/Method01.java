package day8methodvearrays;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		//Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden 
				//oluştuğunu dönen java methodu yazınız.  
				Scanner sc = new Scanner(System.in);
				System.out.println("Lutfen bir String giriniz");
				String str = sc.nextLine();
				
				System.out.println(kelime (str));
				
				
			}
			public static int kelime(String str) {
				String [] str1 = str.split(" ");
				
				
				return str1.length;
			}
	}


