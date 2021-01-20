package javapracticeday09_kisasorular_hamza;
public class Question02 {
	/* Elimizdeki Array'in içerisindeki sayıların ortalamasını alan bir method yazınız.
	 * Array'imizin içerisindeki sayılar double.
	 * return double olarak bir return.
	 * 
	 * getOrtalama(double[] array)
	 *  return double
	 * 
	 * */
	public static void main(String[] args) {
		double[] sayilar = {5.5, 6.3, 5.2, 6.987, 5.122, 10.0};
		System.out.println(getOrtalama(sayilar));
	}
	private static double getOrtalama(double[] sayilar) {
		// bir sayı topluluğunun ortalaması alınırken, tüm sayılar toplanır
		// ve o topluluğun eleman sayısına bölünerek, ortalama bulunur.
		double toplam = 0.0;
		for(double sayi : sayilar) {
			toplam += sayi;
		}
		System.out.println("Toplam : " + toplam);
		double ortalama = toplam / sayilar.length;
		return ortalama;
	}
}