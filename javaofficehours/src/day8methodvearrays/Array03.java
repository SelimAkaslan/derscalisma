package day8methodvearrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		//Array içerisindeki tek sayıları 1 artırıp çift sayıları 1 azaltan 
		//java methodu yazalım
		int[] a= {2,3,4,5,6,7};
		System.out.println(Arrays.toString(donusum(a)));

	}
	public static int[]donusum(int[] a){
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] -= 1;
			} else {
				a[i] += 1;
		}
	}
		return a;

}
}
