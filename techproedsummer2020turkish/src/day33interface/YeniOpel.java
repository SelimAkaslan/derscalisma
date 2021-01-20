package day33interface;

public class YeniOpel extends Araba implements IcAraba,DisAraba{

	public static void main(String[] args) {
		YeniOpel opel = new YeniOpel();
		opel.diesel();
		opel.direksiyon();
		opel.kapi();
		opel.klima();
		opel.move();
		opel.koltuk();
				

	}

	@Override
	public void kapi() {
		System.out.println("5 kapılıdır");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Ayarlanabilir ve ısıtmalı direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Istmalı ve katlanabilir kotluklar");
		
	}

	@Override
	public void klima() {
		System.out.println("Cift bölgeli dijitalm klima");
		
	}

	@Override
	public void move() {
		System.out.println("6 sn 100 km hıza ulaşır");
		
	}

}
