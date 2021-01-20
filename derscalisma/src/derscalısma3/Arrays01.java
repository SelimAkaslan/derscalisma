package derscalısma3;

public class Arrays01 {

	public static void main(String[] args) {
		// Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol  eden bir program yazınız.
		//Aynı eleman varsa “Aynı eleman var” yoksa  “Aynı eleman yok” yazdırınız.
	
			int arr1[] = {1,2,3,4,5,23,1,11};
			int arr2[] = new int[arr1.length];
			int count = 0;
			for (int i=0; i<arr1.length; i++) {
			for (int m=i+1; m<arr1.length; m++) {
				if(arr1[i]==arr1[m]) {
					arr2[count]=arr1[i];
					count++;
			}	
					
				}
			}
			if(count>0) {
                	System.out.println("Aynı Eleman Var");
                    
			}else {
				System.out.println("Aynı eleman Yok");
			}
	}

}
