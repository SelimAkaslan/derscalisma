package day32abstraction;

public class TekKişilikOda extends Otel{

	public static void main(String[] args) {
		TekKişilikOda müsteri1 = new TekKişilikOda();
		müsteri1.kahvaltı();
		System.out.println("TV Ucret: "+ müsteri1.tv(5));
		System.out.println("Wifi Ucret: "+müsteri1.wifi(1));
		
		
		

	}

	@Override
	public void kahvaltı() {
		System.out.println("Kahvaltınız sandvictir");
		
	}
	public int tv(int saat) {
		return saat*2;
		
	}

}
