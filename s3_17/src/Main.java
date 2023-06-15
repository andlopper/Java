import entities.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Medidas do triangulo X:");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double areaX = x.area();

        System.out.printf("Area triangulo X: %.2f\n", areaX);

        System.out.println("Medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaY = y.area();

        System.out.printf("Area triangulo Y: %.2f\n", areaY);

        if (areaX > areaY)
            System.out.println("Area X é maior");
        else if (areaX < areaY)
            System.out.println("Area Y é maior");
            else System.out.println("Areas são iguais");

        sc.close();
    }



}
