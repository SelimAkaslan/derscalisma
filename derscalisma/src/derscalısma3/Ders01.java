package derscalısma3;

public class Ders01 {
	
		int fiyat = 1500;
		String marka = "Mac";
		String model = "MacBook";
		int yıl = 2015;
		

	
		Ders01(){
			
		int fiyat = 2000;
		int yıl = 2018;
	}
		Ders01(String marka, String model,int fiyat){
			
		this.marka = "hp";
		this.model  = "ultrabook";
		this.fiyat  = 2500;
		this.yıl = 2018;
		
	}
	public static void main(String[] args) {
		Ders01 Bilgisayar = new Ders01("hp", "ultrabook", 2018);
		System.out.println(Bilgisayar.marka);
		System.out.println(Bilgisayar.fiyat);
		System.out.println(Bilgisayar.yıl);
		
		
		
	}
		
		
		
			
}



