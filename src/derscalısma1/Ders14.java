package derscalısma1;

import java.util.Scanner;

public class Ders14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();
      String result =  (num%2==0) ? "Cift" : "Tek";
        System.out.println(result);
        
        scan.close();
	}

}
