package javapracticeokul_hamza;

public class Ogrenci {
	private String isim;
	private int no;
	
	
	public String getIsim() {
		return isim;
	}


	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", no=" + no + "]";
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public Ogrenci() {
		
	}

}
