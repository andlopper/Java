package application;

import entities.Employee;
import entities.OutsourvedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CompanyEmployees {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of employees: ");
        int n = sc.nextInt();
        String name;
        int hours;
        double valuePerHour, additionalCharge;
        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:\nOutsourced (y/n)? ", i);
            if (sc.next().charAt(0) == 'n'){ //Reaproveitar o código usando o if somente ao final
                System.out.printf("Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.printf("Hours: ");
                hours = sc.nextInt();
                System.out.printf("Value per hour: ");
                valuePerHour = sc.nextDouble();
                employees.add(new Employee(name, hours, valuePerHour));
            }
            else {
                System.out.printf("Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.printf("Hours: ");
                hours = sc.nextInt();
                System.out.printf("Value per hour: ");
                valuePerHour = sc.nextDouble();
                System.out.printf("Additional charge: ");
                additionalCharge = sc.nextDouble();
                employees.add(new OutsourvedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }
}
