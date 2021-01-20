package derscalısma1;

import java.util.Scanner;

public class Ders19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir yıl girin");
		
		int yil = scan.nextInt();
		
		String result= ((yil%100==0 && yil%400==0) ?  "Artık Yil" : (yil%100!=0 && yil%4== 0)? "Artık Yil": "Artik Yil Degil");
		
		System.out.println(result);
		
		scan.close();
	}

}
