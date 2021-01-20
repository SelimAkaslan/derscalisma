package derscalısma1;

import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
		
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		if (k1==k2 && k1==k3 && k2!=k3) {
			System.out.println("İkiz kenar ücgen");
	}else if(k1==k2 || k1==k3 || k2==k3) {
		System.out.println("Eşkenar Ücgen");
	}else {
		System.out.println("Çeşit kenar ücgen");
	}
	}
		

}
