package javaofficehours01;

public class Day1d {

	public static void main(String[] args) {
		// 1 den 100 e kadar olan sayıların 3'e, 5'e ve 15'e bölünen sayıları yazdıralım.
		
				System.out.print("3 e bölünen sayılar: ");
				for (int i =1; i<100; i++) {
					if(i%3==0) {
						System.out.print(i + " " );
					}
				}
				System.out.println();
				System.out.print("5 e bölünen sayılar: ");
				
				for (int i = 0; i <= 100; i++) {
					if(i%5==0) {
						System.out.print(i + " ");
					}
					
				}
				System.out.println();
				System.out.print("15 e bölünen sayılar: ");
				for (int i = 0; i <= 100; i++) {
					
					if (i%15==0 )
						System.out.print(i + " ");
					
				}

				
			}
				
	}


