package day9arrayarrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryToplama {

	public static void main(String[] args) {
		// Kullanıcısan 2 binary sayı alalım ve
        // 2 binary sayıyı toplayan kabu yazalın
        // 111
        // 111
        //+-----
        // 1110
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen iki tane binary sayi giriniz");
		long binary1 = sc.nextLong();
		long binary2 = sc.nextLong();
		int elde=0;
		List<Integer> sum = new ArrayList<>();
		
		while (binary1 != 0 || binary2 != 0) {
			sum.add((int)((binary1%10 + binary2%10 + elde)%2));
			elde = (int)((binary1%10 + binary2%10)/2);
			binary1 = binary1/10;
			binary2 = binary2/10;
			
		}
		if(elde !=0) {
			sum.add(elde);
			
		}
		System.out.println(sum);
		for(int i = sum.size()-1;i>=0;i--) {
			System.out.print(sum.get(i));
	
		}
		
		
	
		

	}

}
