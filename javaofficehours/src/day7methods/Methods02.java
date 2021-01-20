package day7methods;

public class Methods02 {

	public static void main(String[] args) {
//	 iki sayının eşitlik durumunu kontrol ediniz
		System.out.println(esitMi(2,5));
	}
	
	public static boolean esitMi(int num1, int num2) {
		if(num1==num2) {
			return true;
			
		}
		return false;
		
	}

}
