package lambdaTekrar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q16 {
    /*  TASK :
           Write a method which accepts  string as parameter and prints the sum of digits
           present in thr given string
           input :"ade1r4d3"
           output : 8
           trick : Use --> Character.isDigit()
                       --> Integer.valueOf()
            */
    public static void main(String[] args) {
        String str = "ade1r4d3";
        String str1[] = str.split("");
        List<String> list = new ArrayList<>(Arrays.asList(str1));

        System.out.println(list.stream().map(t-> t.replaceAll("\\D","0")).
                mapToInt(t -> Integer.valueOf(t)).sum());
    }
}
