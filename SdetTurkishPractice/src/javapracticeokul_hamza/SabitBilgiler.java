package javapracticeokul_hamza;
public class SabitBilgiler {
	/* Programda heryerden erişmek istediğimiz ve değiştirilmesini istemediğimiz değişkenler için
	 * static final kelimelerini kullanırız. 
	 * 
	 * Adlandırma yaparken, mümkünse tum karakterleri büyük harf yapar, kelimelerin arasına da
	 * "_" (alt tire) ekleriz.
	 * 
	 * Bu değişkenlere herhangi bir nesne üretmeden ya da extend yapmadan direk erişebiliyoruz.
	 * 
	 * */
	public static final String OKUL_ISIM = "Techproed";
	public static final String MUDUR = "Mesut Bey";
	public static final long TELEFON_NO = 03122222222l;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi Bey";
	public static final String ADRES = "Güneş Doğacak Sokak, 2020  / 7";
	/* Eğer bir class'tan nesne üretilmesini istemiyorsak,
	 * constructor'ı private yaparız (Singleton Class)
	 * */
	public SabitBilgiler() {
	}
}
