package derscalısma1;

import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen cinsiyetinizi giriniz:");
		
		String cins = scan.next();
		
		
		System.out.println("Lütfen yaşınızı giriniz:");
		int yas = scan.nextInt();
			
			if (cins.equalsIgnoreCase("Erkek"))
			if (yas<18) {
			 System.out.println("Erkek çocuk");
			
		}else {
			System.out.println("Adam");
		}
		if (cins.equalsIgnoreCase("Kadın"))	{
			if(yas<18) {
				System.out.println("Kız çocuk");
			}else  {
				System.out.println("Kadın");
		}
			scan.close();
			
		}
		
		 }


	}


