package javapracticeday10_hamza;

public class Araba {
	// Araba nesnesinin icerisinde yer almasini istedigimiz bilgileri tutacak degiskenler olusturalim
	
	
	private int id, yil, maxHiz;
	private String marka, renk, vites;
	
	public Araba(int id, int maxHiz, int yil, String marka, String renk, String vites) {
		
		this.id = id;
		this.yil = yil;
		this.maxHiz = maxHiz;
		this.marka = marka;
		this.renk = renk;
		this.vites = vites;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public int getMaxHiz() {
		return maxHiz;
	}
	public void setMaxHiz(int maxHiz) {
		this.maxHiz = maxHiz;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getVites() {
		return vites;
	}
	public void setVites(String vites) {
		this.vites = vites;
	}
	
	
	
	

}
