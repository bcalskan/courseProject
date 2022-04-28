package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda2 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        ciftKareYazdir(sayi);
        System.out.println("\n----------------");
        tekKüpYazdir(sayi);
        System.out.println("\n----------------");
        ciftKarekökYazdir(sayi);
        System.out.println("\n----------------");
        enBüyükElemanYazdir(sayi);
        System.out.println("\n----------------");
        ciftKareEnBüyük(sayi);
        System.out.println("\n----------------");
        elemanlariTopla(sayi);
        System.out.println("\n----------------");
        ciftElemenlarCarpimi(sayi);
        System.out.println("\n----------------");



    }

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void ciftKareYazdir(List<Integer> sayi) {
        sayi.stream().filter(Lambda1::ciftMi).map(t -> t * t).forEach(Lambda1::print);
    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edin
    public static void tekKüpYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 != 0).map(t -> (t * t * t) + 1).forEach(Lambda1::print);
    }

    // Task : Functional Programming ile listin cift elemanlarinin karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarekökYazdir(List<Integer> sayi) {
        sayi.stream().filter(Lambda1::ciftMi).map(Math::sqrt).forEach(t -> System.out.print(t + " "));
    }

    // Task : list'in en buyuk elemanini yazdiriniz
    public static void enBüyükElemanYazdir(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Math::max));
        System.out.println(" ");
        Optional<Integer> max = sayi.stream().reduce(Math::max);
        System.out.println("Iki adimda max bulundu : " + max);
    }

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKareEnBüyük(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(Lambda1::ciftMi).map(t -> t * t).reduce(Math::max));
    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz. --->Lambda expression
    public static void elemanlariTopla(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(0, (a, b) -> a + b));
        System.out.println(" ");
        int toplam = sayi.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Toplam : " + toplam);
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemenlarCarpimi(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(Lambda1::ciftMi).reduce(1, (a, b) -> (a * b)));
    }
}
