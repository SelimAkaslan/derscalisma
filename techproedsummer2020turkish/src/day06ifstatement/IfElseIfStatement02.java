package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen sınav notunuzu tam sayı olarak giriniz");
		
		int not = scan.nextInt();
		
		if (not<0) {
			System.out.println("Negatif değer giremezsiniz");
			
		}else if (not<50){
			System.out.println("Kaldınız");	
			
		}else if(not<80) {
			System.out.println("Gectiniz");
		}else if (not<=100) {
			System.out.println("Tebrikler");
			
		} else {
			System.out.println("Yüzden büyük değer giremezsiniz");
		}
		
	}

}
