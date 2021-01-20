package day10Genel;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// Kullanıcı 0 sayısı girene kadar girilen
        // sayıları toplayan java kosu yazalım

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");


        int toplam=0;
        int num =sc.nextInt();

        do {

            System.out.println("Tekrar sayı giriniz: ");

            toplam+= num;
            num = sc.nextInt();

         //  System.out.println("Girilen Sayılatın toplamı: " + toplam);

        }while ( num !=0);


        System.out.println("Genel Toplam: " + toplam);



	}

}
