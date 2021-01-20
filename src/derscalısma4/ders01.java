package derscalısma4;
import java.util.Arrays;
import java.util.Scanner;

public class ders01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan kaç elemanlı bir array girmesini  isteyin. 
        Bu array’i olusturup tum elemanlarını ekrana yazdırın.
        Bu array'ın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
        Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdırın.
		*/

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Array saysını giriniz");
			int length = scan.nextInt();
			
			int arr[] = new int[length];
			System.out.println("Array elamanlarını giriniz");
			
			for (int i=0; i<length; i++) {
				arr[i] = scan.nextInt();
				
			}
			System.out.println(Arrays.toString(arr));
			int arrSon[] = new int [length];
				for(int i=0; i<length; i++) {
					arrSon[i-1] = arr[i];
					
				}
				arrSon[length-1] = arr[0];
				System.out.println(Arrays.toString(arrSon));
				
	}

}
