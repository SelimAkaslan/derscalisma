package day7methods;

import java.util.Scanner;

public class Methods01 {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı girmesini ve ardından işlem seçmesi istenecek.
        //Tüm işlemler methodlarda yapılacak.
        //toplama , çıkartma, çarpma  ve bölme
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz.");
        double num1 = sc.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz.");
        double num2 = sc.nextDouble();
        System.out.println("Dört işlemden birini giriniz. toplama,cikartma," +
                "carpma ve bolme");
        String islem =sc.next().toLowerCase();
        islem(islem,num1,num2);

        sc.close();

    }
    public static void islem(String islem, double num1,double num2){

        switch (islem){
            case "toplama":
                toplama(num1,num2);
                break;
            case "cikartma":
                cikartma(num1,num2);
                break;
            case "carpma":
                carpma(num1,num2);
                break;
            case "bolme":
                bolme(num1,num2);
                break;
            default:
                System.out.println("Yanlış işlem yaptınız!");

        }

    }

    public static void toplama (double num1, double num2){
        System.out.println(num1+num2);
    }
    public static void cikartma (double num1, double num2){
        System.out.println(num1-num2);
    }
    public static void carpma (double num1, double num2){
        System.out.println(num1*num2);
    }
    public static void bolme (double num1, double num2){
        System.out.println(num1/num2);
    }
}