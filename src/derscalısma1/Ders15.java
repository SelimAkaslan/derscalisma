package derscalısma1;

import java.util.Scanner;

public class Ders15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lütfen iki tamsayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
       int result = (num1>num2) ? num1 : num2;
       System.out.println(result);
       
       scan.close();
	}

}
