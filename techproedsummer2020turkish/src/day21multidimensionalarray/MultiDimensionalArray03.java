package day21multidimensionalarray;

public class MultiDimensionalArray03 {

	public static void main(String[] args) {

		int arr1[][] = { {1, 2}, {3,4,5}, { 6} };
		int arr2[][] = { {7,8,9}, {10,11}, {12}};
		
		int sum1=0;
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[i].length; j++ ) {
				sum1 = sum1 + arr1[i][j];

					}
					
				}
		System.out.println(sum1); // 21 verecek
		
					int sum2=0;
				
				for(int k=0; k<arr2.length; k++) {
					
					for(int m=0; m<arr2[k].length; m++ ) {
						sum2 = sum2 + arr2[k][m];
			}
			
		}
				System.out.println(sum2); //57 verecek
			System.out.println("Toplam: " + (sum1 + sum2));			
	}
		}
	
	
		


