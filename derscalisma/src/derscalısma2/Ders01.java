package derscalısma2;

import java.util.Scanner;

public class Ders01 {

	public static void main(String[] args) {
		// 9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		int num = 9;
		
		do {
			if(num%7==0) {
				System.out.println(num + " ");
			}
			num++;
		}while (num<190);
		
		scan.close();
		}

	}


