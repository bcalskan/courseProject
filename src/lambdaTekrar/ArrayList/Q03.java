package lambdaTekrar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03 {
    /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -5, -6};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        isaretDegistir(list);
    }

    private static void isaretDegistir(List<Integer> list) {
        list.stream().map(t -> t * (-1)).forEach(t -> System.out.print(t + " "));
    }
}
