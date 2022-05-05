package lambdaTekrar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q06 {
    /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	*/
    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1, -90};
        List<Integer> list = new ArrayList<>(Arrays.asList(100, 10001, -90, 845, 8787, 898, 0, 1, -90));

        maxMinBul(list);
        System.out.println("\n--------------------");
        enBüyükIkinci(list);
    }

    private static void enBüyükIkinci(List<Integer> list) {
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
    }

    private static void maxMinBul(List<Integer> list) {
        System.out.println(list.stream().reduce(Integer::max));
        System.out.println(list.stream().reduce(Integer::min));
    }
}
