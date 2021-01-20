package day32abstraction;

public class AileOdasi extends Otel{

	public static void main(String[] args) {
		AileOdasi musteri2 = new AileOdasi();
		musteri2.kahvaltı();
		System.out.println("Wifi Ucretiniz: "+musteri2.wifi(6));
		

	}

	@Override
	public void kahvaltı() {
		System.out.println("Kahvaltınız cafeterida olacak");
		
	}
	

}
