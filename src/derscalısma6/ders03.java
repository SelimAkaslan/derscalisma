package derscalısma6;


import java.util.Scanner;

public class ders03 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();
    String sesli="a,e,i,o,u";
    int sayac=0;
    for (int i = 0;i<=sesli.length()-1; i++) {
        for (int j = 0; j < str.length()-1; j++) {
            if(str.charAt(j)==sesli.charAt(i))
            {
                sayac++;
            }
        }
    }
System.out.println("Stringdeki sesli harf sayısı: "+ sayac);
          }
        }
