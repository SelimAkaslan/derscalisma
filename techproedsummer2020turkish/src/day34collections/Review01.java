
         package day34collections;
         import java.util.Arrays;
         import java.util.Scanner;
         public class Review01 {
             public static void main(String[] args) {
                 // Kullanicidan adini ve soyadini aliniz
                 Scanner scan = new Scanner(System.in);
                 System.out.println("Ilk adinizi giriniz");
                 String ilkAd = scan.next();
                 System.out.println("Soyadinizi giriniz");
                 String soyAd = scan.next();
                 
                 // 1)Ad ve soyadini console'a yazdirin
                 System.out.println("Tam Ad: " + ilkAd + " " + soyAd);
                 
                 // 2)Sadece adini console'a yazdirin
                 System.out.println("Ilk ad: " + ilkAd);
                     
                 // 3)Ad ve soyadinin ilk harflerini console'a yazdirin
                 System.out.println("Ilk adin ilk harfi: " + ilkAd.charAt(0));
                 System.out.println("Soyadin ilk harfi: " + soyAd.charAt(0));
                 
                 // 4)Ad ve soyadini console'a tersten yazdirin
               // 1. yol 
                 StringBuilder strB = new StringBuilder(ilkAd + " " + soyAd);
                 System.out.println("Tam isim tersten yazildi: " + strB.reverse());
                 
              // 2. yol
        		 int length1 = ilkAd.length();
        		 int length2 = soyAd.length();
                 for (int i = length1-1; i>=0; i-- ) {
                 System.out.print(ilkAd.charAt(i));
                 }
                 System.out.println();
                 for (int i = length2-1; i>=0; i-- ) {
                     System.out.print(soyAd.charAt(i));
                     }
                 System.out.println();
                 
                 // 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
                 //   console'a yazdirin.
                 String tamAd = ilkAd + soyAd;
                 String harfArr[] = tamAd.split(""); 
                 Arrays.sort(harfArr);
                 System.out.println("Harfler alfabetik sirada: " + Arrays.toString(harfArr));
             }
         }
	


