package derscalısma1;

import java.util.Scanner;

public class Ders2 {

	public static void main(String[] args) {
		//Kullanicidan yasini alin
        //Yas 13 den az ise ekrana "Calisamaz" yazdirin
        //Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
        //Yas 65 den buyuk ise ekrana "Emekli" yazdirin
        //Negatif sayi girerse "Yas negatif olamaz"
		
	
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Lütfen yaşınızı giriniz");
		 
		 int yas = scan.nextInt();
		 if (yas<0) {
			 System.out.println("Geçersiz bilgi");
		 }else if (yas<13){
		   System.out.println("Calışamaz");
		 }else if (yas<65) {
			 System.out.println("Calışabilir");
			 
		 }else {
			 System.out.println("Emekli");
			 
		 }
		 
		 

	}

}
