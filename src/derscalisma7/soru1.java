package derscalisma7;

public class soru1 {

	/* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
	 * bir method yazınız.
	 * 
	 *  getAsalMi(int sayi)
	 *  	return true/false
	 *  
	 * */
	 public static void main(String[] args) {
		 int num = 754645601;
		
	        System.out.println("Bu sayi asal mi? "+getAsalmi(num));
	    }
	    private static boolean getAsalmi(int n) {
	        
	        for (int i = 2; i <= n/2; i++) {
	            if(n%i==0) {
	                return false;
	            }
	        }
	        return true;    
	    }

}
