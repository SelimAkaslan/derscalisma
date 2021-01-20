package javaofficehours01;

import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		// Kullacıdan yaşını ve kilosunu alalın. 
				//18 yaşından küçük ise kan bağıyapamasın.
				//18 yaşından büyük ve 50 kilodan zayıf ise kan bağışı yapamasın
				// 18 yaşından büyük ve 50 kilo da fazla ise kan bağışı yapabilsin.
				
				Scanner sc =new Scanner(System.in);
				System.out.println("Lütfrn yaşınızı giriniz");
				int yas=sc.nextInt();
				
				
				if(yas>=18) {
					System.out.println("Lütfen kilonuzu giriniz.");
					int kilo =sc.nextInt();
					if(kilo>=50) {
						System.out.println("Kan verebilirsiniz.");
						
					}else {
						System.out.println("50 kilodan zayıflar kan veremez.");
					}
					
				}else {
					System.out.println("18 yaşından küçükler kan veremez.");
				}
				int kilo=50;
				String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zayıflar kan veremez." :"18 yaşından küçükler kan veremez.");
				System.out.println(result);
		}
	}


