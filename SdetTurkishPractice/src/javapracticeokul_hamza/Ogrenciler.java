package javapracticeokul_hamza;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {

	
		private List<Ogrenci> ogrenciler = new ArrayList<>();
		


		public Ogrenciler() {
			
		}
		public void ogrenciEkle(Ogrenci ogrenci) {
			
			ogrenciler.add(ogrenci);
			
			
		}
		public int ogrenciSayisi() {
			return ogrenciler.size();
			
		}
		@Override
		public String toString() {
			return "Ogrenciler [ogrenciler=" + ogrenciler + "]";
		}

	}

