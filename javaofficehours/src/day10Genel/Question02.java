package day10Genel;

import javax.swing.JOptionPane;

public class Question02 {

	public static void main(String[] args) {
		// Klavyeden girilecek plaka numarasından ili gösteren uygulamayı yazalım​
		        /*      "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
		                "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
		                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
		                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
		                "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
		                "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
		                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
		                "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
		                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
		                "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
		                "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
		​
		         */
		       // Scanner sc = new Scanner(System.in);
		       // System.out.println("Lütfen bir plaka numarası giriniz.");
		       // int plaka = sc.nextInt();	​
		        String Sehirler[] = {"","Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
		                "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
		                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
		                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
		                "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
		                "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
		                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
		                "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
		                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
		                "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
		                "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		       // System.out.println("Girilen Plaka numarası " + Sehirler[plaka] + " aittir");
		        int Plaka = Byte.valueOf(JOptionPane.showInputDialog("Lütfen bir plaka numarası giriniz."));
		        JOptionPane.showMessageDialog(null,Sehirler[Plaka]);


	}

}
