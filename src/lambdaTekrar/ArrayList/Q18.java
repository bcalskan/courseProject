package lambdaTekrar.ArrayList;

import java.util.Arrays;

public class Q18 {

     /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
     */


    public static void main(String[] args) {

        String str = "Javacilar cook afilli";
        String arr[] = str.split("");
        Arrays.sort(arr);
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            sayac = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].charAt(0) == arr[j].charAt(0)) {
                    sayac++;
                } else {
                    i = j-1;
                    break;
                }
            }
            System.out.print(arr[i].charAt(0) + " = " + sayac+" ");
        }


    }
}
