package derscalısma6;

import java.util.Scanner;

public class ders05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    String arr1[] =sentence.split(" ");
	       for (int i = arr1.length-1; i>=0; i--) {
			System.out.print(arr1[i]+" ");		
	    System.out.print(reversed);
	  }
	}
}

	


