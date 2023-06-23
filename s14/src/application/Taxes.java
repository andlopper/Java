package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        double totalTaxes = 0;

        System.out.printf("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.printf("Tax payer #%d data:\n", i);
            System.out.printf("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (c == 'c'){
                System.out.printf("Number of employees: ");
                int employees = sc.nextInt();
                persons.add(new Company(name, anualIncome, employees));
            } else if (c == 'i') {
                System.out.printf("Health expenditures: ");
                double health = sc.nextDouble();
                persons.add(new Individual(name, anualIncome, health));
            }
        }
        
        System.out.println("\nTAXES PAID:");
        for (Person p : persons) {
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxesPaid()));
            totalTaxes += p.taxesPaid();
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
