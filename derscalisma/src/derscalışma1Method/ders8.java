package derscalışma1Method;

import java.util.Scanner;

public class ders8 {

	public static void main(String[] args) {
		
		// Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz.

		Scanner sacn = new Scanner(System.in);
		
		
		//soru 1 : 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		for (int i= 8; i<=180; i++) {
			if(i%5==0) {
				System.out.print(i + "-");
			}
			int num = 8;
			while(num<=180) {
				if(num%5==0) 
				System.out.println(" " + num);
				num++;
			}   
		
		}
	}

	}