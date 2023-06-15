package application;

import utils.Negative;
import utils.Person;
import utils.Sum;

import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        //Negative n = new Negative();
        //Sum s = new Sum();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        int i, age;
        String name;
        double height, avg = 0, under16 = 0;
        Person[] v = new Person[n];

        for (i=0; i<v.length; i++){
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();

            if (age < 16) under16++;

            System.out.print("Altura: ");
            height = sc.nextDouble();
            avg += height;
            v[i] = new Person(name, age, height);
        }

        System.out.printf("Altura média: %.2f%n", avg/v.length);

        under16 = (under16 / v.length) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", under16);

        for (i=0; i<v.length; i++){
            if (v[i].getAge() < 16){
                System.out.println(v[i].getName());
            }
        }

        sc.close();
    }
}
