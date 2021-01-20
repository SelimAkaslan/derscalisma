package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {

		String  day = "pazar";
		
		
		
		if (day.equals("pazartesi")|| day.equals("sali") || day.equals("çarşamba") || day.equals("persembe") || day.equals("cuma")) {		
		}
		System.out.println("Hafta ici");
		
		
		if (day.equals("pazar") || day.equals("cumartesi")) {
			System.out.println("hafta sonu");
		}
	}

}
