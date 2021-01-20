package javapracticeday10_hamza;

import java.util.ArrayList;
import java.util.List;

public class VeriTabani implements IArabaIslemler{
	
	List<Araba> arabalar = new ArrayList<>();

	@Override
	public void arabaKayit(Araba araba) {
		arabalar.add(araba);
		
		
	}

	@Override
	public void arabaSatis(int id) {
		
		for (int i = 0; i < arabalar.size(); i++) {
			if(arabalar.get(i).getId()==id) {
				arabalar.remove(i);
				break;
				
			}
		}
		
	}

	@Override
	public void arabaGuncelleme(int id, Araba araba) {
		for (int i = 0; i < arabalar.size(); i++) {
			
			Araba suankiBakilanAraba = arabalar.get(i);
			
			if(araba.getId()==id) {
				arabalar.set(i,araba);
				break;
			}
		}
		
	}

	@Override
	public void arabaGoruntuleme() {
		for (Araba araba : arabalar) {
			System.out.println(araba.getId()+"-"+araba.getMarka()+"-"+araba.getMaxHiz()
			+"-"+araba.getRenk()+"-"+araba.getVites()+"-"+araba.getYil());
			
		}
		
	}
		// abstract class ve interface'in en büyük farkı
		// abstract class kullanılırsa sadece bir tane miras alınabilir (extends )
		// interface kullanılırsa birden fazla interface miras alınabilir (implements)
		// eğer abstract kullanırsak içerisinde tüm methodları (abstract + diğerleri) override yapmak zorunda değiliz.
		// eğer interface kullanırsak override yapmak zorundayız.

	
	

}
