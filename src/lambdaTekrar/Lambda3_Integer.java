package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda3_Integer {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        minimumBul(sayi);
        System.out.println("\n---------------------------");
        bestenBüyükEnKücük(sayi);
        System.out.println("\n---------------------------");
        ciftKareKücüktenBüyüge(sayi);
        System.out.println("\n---------------------------");
        tekKareBüyüktenKücüge(sayi);
        System.out.println("\n---------------------------");

    }

    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    public static void minimumBul(List<Integer> sayi) {
        //1. yontem Method Reference --> Integer class
        System.out.println("Method Ref--> Integer : " + sayi.stream().reduce(Integer::min));
        //2. yontem Method Reference --> Math class
        System.out.println("Method Ref --> Math : " + sayi.stream().reduce(Math::min));
        //3. yontem Lambda Expression
        System.out.println("Lambda Expression : " + sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x > y ? y : x));
        //4. yontem Method Reference --> seed
        System.out.println("Seed : " + sayi.stream().reduce(Lambda3_Integer::seed));
    }

    public static int seed(int a, int b) {
        return a > b ? b : a;
    }

    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void bestenBüyükEnKücük(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 != 0).reduce(Integer::min));
    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKareKücüktenBüyüge(List<Integer> sayi) {
        sayi.stream().filter(Lambda1_Integer::ciftMi).map(t -> t * t).sorted().forEach(Lambda1_Integer::print);
    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekKareBüyüktenKücüge(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 != 0).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Lambda1_Integer::print);

    }


}
