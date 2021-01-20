package derscalısma1;

import java.util.Scanner;

public class Ders16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi giriniz");
		
        int num = scan.nextInt();
       
        int result= num>0 ? num*+1 : num*-1;
        
        System.out.println(result);
        
        
       
        scan.close();
		

	}

}
