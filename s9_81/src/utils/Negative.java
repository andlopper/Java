package utils;

import java.util.Locale;
import java.util.Scanner;

public class Negative {
    public Negative() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];
        int i;

        for (i=0; i<v.length; i++){
            v[i] = sc.nextInt();
        }
        for (i=0; i<v.length; i++){
            if (v[i] < 0){
                System.out.println(v[i]);
            }
        }

        sc.close();
    }
}
