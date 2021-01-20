package kullaniciolusturma;

import java.util.ArrayList;

public class VBKullanici implements IKullanici{
	
	ArrayList<Kullanici> kullanicilar = new ArrayList<Kullanici>();

	@Override
	public void kullaniciKaydet(Kullanici kullanici) {
		kullanicilar.add(kullanici);
		
		
		
	}

	@Override
	public void kullaniciSil(int id) {
		kullanicilar.remove(id);
		
	}

	@Override
	public void kullaniciGuncelleme(int id, Kullanici kullanici) {
		kullanicilar.set(id, kullanici);
		
		
	}

	@Override
	public void kullaniciGoruntuleme() {
		if(kullanicilar.isEmpty()) {
			System.out.println("Listede herhangi bir kayit bulunmamaktadir");
		}
		for (Kullanici kul : kullanicilar) {
			
			System.out.println("Kullanici Adi: " +kul.getKullaniciAdi() +"\nParola: " +kul.getParola() + "\nİsim:" +kul.getIsim()
			+ "Soyisim: " +kul.getSoyisim() + "\nMail Adresi: " + kul.getMail() + "\n_________________________");

			
		}
		
	}
	
	

}
