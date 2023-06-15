package utils;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public Sum() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), i;
        double[] v = new double[n];
        double sum = 0;

        for (i = 0; i<v.length; i++){
            v[i] = sc.nextDouble();
            sum += v[i];
        }

        System.out.print("VALUES = ");
        for (i = 0; i<v.length; i++){
            System.out.printf("%.1f ", v[i]);
        }
        System.out.println("\nSUM = " + sum);
        System.out.println("AVERAGE = " + (sum / v.length));

        sc.close();
    }
}
