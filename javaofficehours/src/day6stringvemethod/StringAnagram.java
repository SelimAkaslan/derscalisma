package day6stringvemethod;
import java.util.Arrays;
import java.util.Scanner;
public class StringAnagram {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  
        //Java kodunu yazınız.
        // rats star   listen slient
        
        Scanner sc=new Scanner ( System.in);
        System.out.println("Lüften kontrol edilecek 1. kelimeyi giriniz.");
        String str1 =sc.next();
        System.out.println("Lütfen kontrol edilecek 2. kelimeyi giriniz.");
        String str2 =sc.next();
        
//      char [] arr1 = str1.replace(" ","").toLowerCase().toCharArray();
//      char [] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
//      
//      Arrays.sort(arr1);
//      Arrays.sort(arr2);
//      
//      System.out.println(arr1);
//      System.out.println(arr2);
//    1. yol
//      String str3 = String.valueOf(arr1);
//      String str4 = String.valueOf(arr2);
//      System.out.println(str3.equals(str4));
//     2. Yol   
//      String str5 = Arrays.toString(arr1);
//      String str6 = Arrays.toString(arr2);
//      
//      System.out.println(str5.equals(str6));
//    3. yol    
        System.out.println(isAnagram (str1,str2));
    }
    
    public static boolean isAnagram (String str1, String str2) {    
//      
//      
        boolean isAnagram1 =false;
//      
        char [] arr1 = str1.replace(" ","").toLowerCase().toCharArray();
        char [] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i]) {
                return isAnagram1= false;
                
        }
        }
        return isAnagram1 = true;
            
        }
        
    }   
      