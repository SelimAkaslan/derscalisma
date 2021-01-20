package day27constructorcagirma;



public class Mammal extends Animal{
public boolean dogum = true;
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);

	}
	public void feed() {
		System.out.println("Cocuklarını besler");
	}
		Mammal(){
		this(11);
		
		System.out.println("Mammal parametresiz constructor");
	}
		Mammal(int age){
			super();
			
			System.out.println("Mammal parametreli constructor");
	
}
}