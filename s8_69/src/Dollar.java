import utils.CurrencyConverter;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dollar price:");
        double x = sc.nextDouble();
        System.out.println("How many?");
        double y = sc.nextDouble();
        System.out.println("Amount in reais: " + CurrencyConverter.totalReais(x, y));
    }
}
