package day8methodvearrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i*-1;
			
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
