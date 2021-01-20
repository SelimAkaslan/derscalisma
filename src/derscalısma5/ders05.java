package derscalısma5;

import java.util.Arrays;
import java.util.Scanner;

public class ders05 {

	public static void main(String[] args) {
//		Kullanıcıya kaç elemanlı bir array gireceğini sorun.  
//		Kullanıcıdan array’in elemanlarını girmesini isteyin. 
//		a)Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin. 
//		b)Bu arayın tum elemanlarını tersten yazdırın.       
//		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç elemanlı bir Array istiyorsunuz?");
		int length = scan.nextInt();
		int arr[] = new int[length];
		System.out.println("Array elemanlarını giriniz");
		for(int i=0; i<length; i++) {
			arr[i] = scan.nextInt();
			
		}
		System.out.println("Array elemanlarınız: " + Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("Array sıra numarası: " + Arrays.binarySearch(arr, 2));
			
			
			int arrTers[] = new int[length];
			for (int i = length-1; i >= 0; i--) {
				arrTers[i] = arr[(length-1) - i];

				
			}
		System.out.println("Arrayınız tersi: " + Arrays.toString(arrTers));	
	scan.close();
	}

}
