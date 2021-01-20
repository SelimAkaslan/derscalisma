package derscalısma6;

public class ders01 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.
		//{ {1,2,3}, {4,5,6} }
		int arr[][] = {{1,2,3}, {4,5,6}};
		
		int carpma = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				carpma = carpma * arr[i][j];
			}

		}
		
		System.out.println(carpma);
		
		//  Aşağıdaki multi dimensional array’in iç array’lerindeki 
		// son elemanların çarpımını ekrana yazdıran bir program yazınız { {1,2,3}, {4,5}, {6} }
		
		int arr1[][] = { {1,2,3}, {4,5}, {6} };
		int sonCarp =1;
		for(int i=0; i<arr1.length; i++){
				sonCarp= sonCarp * arr1[i] [arr1[i].length-1];
	
	
		}
		System.out.println(sonCarp);
		
		//Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını 
		//ekrana yazdıran bir program yazınız
		//arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		
		int arr2[][] = { {1,2}, {3,4,5}, {6} };
		int arr3[][] = { {7,8,9}, {10,11}, {12} };
			
			int sum = 0;
			for(int i=0;i<arr2.length; i++) {	
			for(int j=0; j<arr2[i].length; j++) {
				for(int i1=0; i1<arr3.length; i1++)	{
				for(int j1=0; j1<arr3[i1].length; j1++)	{
					if(i==i1 && j==j1) {
						sum = sum+ arr2[i][j] + arr3[i1][j1];
					}			
				}			
				}
				}
			}
			System.out.println(sum);
		
		
	}
}


