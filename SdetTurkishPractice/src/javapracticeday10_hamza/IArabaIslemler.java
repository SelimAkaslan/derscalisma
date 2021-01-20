package javapracticeday10_hamza;

public interface IArabaIslemler {
	
		public void arabaKayit(Araba araba); // Araba classindan olusturulan nesneleri ekleyecegiz
		public void arabaSatis(int id);
		public void arabaGuncelleme(int id, Araba araba);
		public void arabaGoruntuleme();
		

}
