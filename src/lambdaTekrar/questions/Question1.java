package lambdaTekrar.questions;

import java.util.*;

public class Question1 {
   /* kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
    */

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        arrMethod(sayi);
    }

    private static void arrMethod(List<Integer> sayi) {

        Optional<Integer> max = sayi.stream().reduce(Integer::max);
        Optional<Integer> min = sayi.stream().reduce(Integer::min);
        System.out.println(Collections.max(sayi)-Collections.min(sayi));
    }




}
