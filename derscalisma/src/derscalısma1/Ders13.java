package derscalısma1;

import java.util.Scanner;

public class Ders13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Lütfen password giriniz:");
		int password = scan.nextInt();
		
		if (password%5==0) {
			if(password%10==0) {
			System.out.println("5'e bölünen çift sayı");	
			} else {
				System.out.println("5'e bölünen tek sayı");
					
				}
				}else {
					
				System.out.println("Tekrar deneyin");
			}
			
		}
	}

