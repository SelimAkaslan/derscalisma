package javapracticeinterview_hamza;

public class Question04 {
	/* Elimizdeki Array'in en büyük sayısını bulup, return yapan bir method yazınız.
	 * 
	 * getEnBuyukSayi(int[] array)
	 * */

	public static void main(String[] args) {
		
		int[] array = {12,56,788,4,1,0,38884};
		int enBuyukSayi = getEnBuyukSayi(array);
		System.out.println("En buyuk sayi : "+enBuyukSayi);
		

	}
	public static int getEnBuyukSayi(int []array) {
		int max =0;
		for(int i = 0 ; i < array.length ; i++) {  
			if(array[i] > max) {   //  12 > 0       56 > 12      788 > 56    4 > 788   1 > 788    0 > 788    999 > 788   4 > 999                   
				max = array[i];	   //  max = 12     max = 56    max  = 788   -------   -------    -------    max = 999   -------
				
			}
			
		}
		return max;
		
	}

}
