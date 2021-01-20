package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvaltı();
		System.out.println("TV Ucretiniz: "+musteri3.tv("İnternational", 5));
		System.out.println("Wifi Ucretiniz: "+musteri3.wifi(4));

	}

	@Override
	public void kahvaltı() {
		System.out.println("Kahvaltınız teras kat Kral Restaurantadır");
	}
	public int tv(String İnternational, int saat) {
		if(İnternational.equals("İnternational")) {
			return saat*5;
		}else {
			return 0;
		}
	}

}
