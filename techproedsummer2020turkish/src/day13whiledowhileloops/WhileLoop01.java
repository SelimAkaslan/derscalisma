package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
	
		 //while loop kullanarak ilk 5 sayma sayisinin toplamini ekrana
		   //yazdiran programi yaziniz.
		   
		   int sum=0;
		   int num=1;
		   
		   while(num<6) {
			   sum=sum+num;
			   num++;
		   }
		   System.out.println(sum);//1+2+3+4+5=15
		   //En son toplami gormek icin System.out.println(sum); ifadesini loop disina yazin
		   //Her adimdaki toplami gormek icin System.out.println(sum); ifadesini loop'un icine yazin
		   
		   int sum1 = 0;
			int num1 = 1;
			for(int i=1; i<6; i++) {
				sum1= sum1+i;
						
			}
			System.out.println(sum1);
	   }
		
	}
	







