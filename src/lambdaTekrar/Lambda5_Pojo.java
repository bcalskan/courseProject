package lambdaTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda5_Pojo {
      /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
     */

    public static void main(String[] args) {
        //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

        Üniversite gazi = new Üniversite("Gazi", "Uluslararasi Iliskiler", 549, 78);
        Üniversite ankara = new Üniversite("Ankara", "Hukuk", 214, 83);
        Üniversite izmir = new Üniversite("9 Eylül", "Halkla iliskiler", 741, 66);
        Üniversite baskent = new Üniversite("Baskent", "Siyaset", 257, 75);
        Üniversite bilkent = new Üniversite("Bilkent", "Matematik", 549, 81);

        List<Üniversite> uni = new ArrayList<>(Arrays.asList(gazi, ankara, izmir, baskent, bilkent));

        System.out.println(notKontrolEt(uni));
        System.out.println("\n----------------");

        System.out.println(ögrenciSayisiKontrol(uni));
        System.out.println("\n----------------");

        bölümKontrol(uni);
        System.out.println("\n----------------");

        ögrenciSayisiSirala(uni);
        System.out.println("\n----------------");

        notOrtSirala(uni);
        System.out.println("\n----------------");

        ögrSayisiEnAzIkinci(uni);
        System.out.println("\n----------------");

        ögrenciSayisiTopla(uni);
        System.out.println("\n----------------");

        notOrtOrtalama(uni);
        System.out.println("\n----------------");

        bölümSayisi(uni);
        System.out.println("\n----------------");

        enBüyükNotOrt(uni);
        System.out.println("\n----------------");


    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notKontrolEt(List<Üniversite> uni) {
        return uni.stream().allMatch(t -> t.getNotOrtalamasi() > 74);
    }

    //task 02-->ogrc sayilarinin 110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ögrenciSayisiKontrol(List<Üniversite> uni) {
        return uni.stream().allMatch(t -> t.getÖgrenciSayisi() > 110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean bölümKontrol(List<Üniversite> uni) {
        return uni.stream().allMatch(t -> t.getBölüm().equalsIgnoreCase("Matematik"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void ögrenciSayisiSirala(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getÖgrenciSayisi).reversed()).collect(Collectors.toList()));
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void notOrtSirala(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getNotOrtalamasi).reversed()).limit(3).collect(Collectors.toList()));
    }

    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static void ögrSayisiEnAzIkinci(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getÖgrenciSayisi)).skip(1).findFirst());
    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz
    public static void ögrenciSayisiTopla(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 63).map(t -> t.getÖgrenciSayisi()).reduce(0, (a, b) -> a + b));
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 63).mapToInt(t -> t.getÖgrenciSayisi()).sum());
    }

    //task 08--> Ogrenci sayisi 130'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void notOrtOrtalama(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 130).mapToInt(t -> t.getNotOrtalamasi()).average());
    }

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static void bölümSayisi(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getBölüm().contains("Matematik")).count());
    }

    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz
    public static void enBüyükNotOrt(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 571).mapToDouble(t -> t.getNotOrtalamasi()).max());

    }

}
