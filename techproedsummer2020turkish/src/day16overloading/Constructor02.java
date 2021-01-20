package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		Constructor01 hondaAraba = new Constructor01();
		System.out.println("Zamli Fiyat: " + (hondaAraba.price + 1000));
		System.out.println("Year: " + (hondaAraba.year-1));
		System.out.println("Make: " + (hondaAraba.make.replace("Honda", "Toyota")));
		System.out.println("Type: " + (hondaAraba.type.replace("Civic", "Camry")));
	}

}
