package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda4_String {
    public static void main(String[] args) {
        List<String> menü = new ArrayList<>(Arrays.asList("Küsleme", "Adana", "Trilece", "HavucDilim", "Büryan", "Yaglama", "Kokorec", "Arabasi", "Güvec"));

        alfabetikBüyükHarfTekrarsiz(menü);
        System.out.println("\n----------------");
        charSayisiTers(menü);
        System.out.println("\n----------------");
        charSayisinaGöreKücüktenBüyüge(menü);
        System.out.println("\n----------------");
        sonHarfineGöreTerSirali(menü);
        System.out.println("\n----------------");
        karakterCiftKareTekrarsiz(menü);
        System.out.println("\n----------------");
        //karakterSayisiKontrol(menü);
        System.out.println("\n----------------");


    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBüyükHarfTekrarsiz(List<String> menü) {
        menü.stream().sorted().map(String::toUpperCase).distinct().forEach(t -> System.out.print(t + " "));
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void charSayisiTers(List<String> menü) {
        menü.stream().map(String::length).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void charSayisinaGöreKücüktenBüyüge(List<String> menü) {
        menü.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfineGöreTerSirali(List<String> menü) {
        menü.stream().sorted(Comparator.
                comparing(t -> t.toString().
                        charAt(t.toString().length() - 1)).
                reversed()).forEach(t -> System.out.print(t + " "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareTekrarsiz(List<String> menü) {
        menü.stream().map(String::length).filter(t -> t % 2 == 0).map(t -> t * t).sorted().distinct().forEach(t -> System.out.print(t + " "));
    }

    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayisiKontrol(List<String> menü) {
        System.out.println(menü.stream().allMatch(t -> t.length() <= 7));

    }

    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void wIleBaslama(List<String> menü) {
        System.out.println(menü.stream().noneMatch(t -> t.startsWith("w")) ? "var" : "yok");
    }

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakterSayisiMax(List<String> menü) {
        menü.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).findFirst();
    }

    // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.



}
