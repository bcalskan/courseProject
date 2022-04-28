package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        boslukluPrint(sayi); //4 2 6 11 -5 7 3 15
        System.out.println("\n  ***  ");
        boslukluPrint1(sayi); //42611-57315
        System.out.println("\n  ***  ");
        boslukluPrint2(sayi);//4 2 6 11 -5 7 3 15
        System.out.println("\n  ***  ");
        ciftBoslukluYazdir(sayi); // 4 2 6
        System.out.println("\n  ***  ");
        ciftBoslukluYazdir1(sayi); // 4 2 6
        System.out.println("\n  ***  ");
        otuzdörttenKücükCift(sayi);

    }

    //Task : Functional Programming kullanarak list elemanlarini aralarinda bosluk olacak sekilde print ediniz.
    public static void boslukluPrint(List<Integer> sayi) {
        sayi.stream().forEach(t -> System.out.print(t + " "));
    }

    //Task : Functional Programming kullanarak list elemanlarini aralarinda bosluk olacak sekilde print ediniz.
    public static void boslukluPrint1(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print); //--> bosluksuz yazdirir seed gerekir
    }

    public static void print(int a) {
        System.out.print(a + " ");
    }

    //Task : Functional Programming kullanarak list elemanlarini aralarinda bosluk olacak sekilde print ediniz.
    public static void boslukluPrint2(List<Integer> sayi) {
        sayi.stream().forEach(Lambda1::print);
    }

    //ciftBul
    public static boolean ciftMi(int a) {
        return a % 2 == 0;
    }

    //Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz
    public static void ciftBoslukluYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).forEach(Lambda1::print);
    }

    public static void ciftBoslukluYazdir1(List<Integer> sayi) {
        sayi.stream().filter(Lambda1::ciftMi).forEach(Lambda1::print);
    }

    //Task: functional prog ile list elemanlarinin 34den kücük cift olanlarini ayni satirda aralarina bosluk birakarak print
    public static void otuzdörttenKücükCift(List<Integer> sayi) {
        sayi.stream().filter(t -> t < 34).filter(Lambda1::ciftMi).forEach(Lambda1::print);
    }

}
