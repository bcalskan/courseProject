package lambdaTekrar.ArrayList;

import java.util.*;

public class Q01 {

    /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eleman sayisi : ");
        int elemanSayisi = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(i + 1 + ". eleman : ");
            list.add(scan.nextInt());
        }
        farkBul(list);

    }

    private static void farkBul(List<Integer> list) {
//        Optional<Integer> min = list.stream().reduce(Math::min);
//        Optional<Integer> max = list.stream().reduce(Math::max);

        System.out.println("Fark : " + (Collections.max(list) - Collections.min(list)));
    }

    /*
    public static void minMAxFark2(Integer arr[]){

    Integer max = Arrays
            .stream(arr)
            .mapToInt(v -> v)
            .max().orElseThrow();

    Integer min = Arrays
            .stream(arr)
            .mapToInt(v -> v)
            .min().orElseThrow();
    System.out.println(max - min);
     */


}
