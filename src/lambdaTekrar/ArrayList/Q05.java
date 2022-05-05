package lambdaTekrar.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Q05 {
    /*  TASK :
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int toplam = 0;
        double ort = 0;
        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i);
        }
        ort = toplam / list.size();

        ortalama(list, ort);


    }

    private static void ortalama(List<Integer> list, double ort) {
        list.stream().filter(t -> t > ort).forEach(t -> System.out.print(t + ", "));
    }

}
