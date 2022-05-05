package lambdaTekrar.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    /*  TASK :
     *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */

    public static void main(String[] args) {
        int arr[] = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        ciftleriYazdir(list);
    }

    private static void ciftleriYazdir(List<Integer> list) {

    }
}
