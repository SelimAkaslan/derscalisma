package konuanlatımı;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Passwordunuzu giriniz");
        String password = scan.next(); 
        
        //String'lerin esitligini kontrol ederken
        //asla "==" sembolu kullanmayin. Onun yerine
        //"equals()" kullanin
        
        //"==" String'in degerini ve adresini kontrol eder
        //"equals()" ise sadece degerleri kontrol eder.
        
       if(password.equals("JavaIyidir")) {
    	   System.out.println("Pasword dogru");

	}else {
		System.out.println("Tekrar deneyiniz");
	}

}
}

