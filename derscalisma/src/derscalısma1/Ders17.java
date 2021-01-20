package derscalısma1;

import java.util.Scanner;

public class Ders17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Diktörtgenin en ve boyunu giriniz:");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		String result = (en==boy) ? "Kare" : "Diktörtgen";
		
		System.out.println(result);
		
		
		scan.close();
	}

}
