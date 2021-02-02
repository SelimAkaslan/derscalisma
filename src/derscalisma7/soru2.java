package derscalisma7;

public class soru2 {
	public static boolean mukemmelSay(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (mukemmelSay(i)) {
                System.out.println("Mukemmel sayi : " + i);
            }
        }
    }

}
