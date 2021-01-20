package day6stringvemethod;
public class Method01 {
    public static void main(String[] args) {
        // saat ve dakika girildiğinde bize saniye retur eden methodu yarazalım.
        
        System.out.println("saniye sonucu: " +saniyeDonusturucu (3, 20));
    }
    public static int saniyeDonusturucu (int hours, int minutes) {
        
        
        int seconds = (hours*3600) + (minutes*60);
        
        return seconds;
        
    }
}