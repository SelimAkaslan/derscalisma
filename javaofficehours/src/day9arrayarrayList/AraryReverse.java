package day9arrayarrayList;

import java.util.Arrays;
import java.util.List;

public class AraryReverse {

	public static void main(String[] args) {
		//Bir arrayi tersine çeviren java kodunu yazalım
		
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(reverse(arr)));

	}

	private static int[] reverse(int[] arr) {
		
		for(int i =0; i<arr.length/2;i++){
            int temp =arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
			
		
	}
			return arr;
	
		
	      
	
		
	}

}
