package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Enter department's name: ");
        String department = sc.nextLine();
        System.out.printf("Enter worker data: \nName: ");
        String name = sc.nextLine();
        System.out.printf("Level: ");
        String level = sc.next();
        System.out.printf("Base salary: ");
        double salary = sc.nextDouble();

        Worker w = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

        System.out.printf("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.printf("Enter contract #%d data:\nDate (DD/MM/YYYY): ", i+1);
            Date date = sdf.parse(sc.next());
            System.out.printf("Value per hour: ");
            double valueHour = sc.nextDouble();
            System.out.printf("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract hc = new HourContract(date, valueHour, duration);
            w.addContract(hc);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + w.getName());
        System.out.println("Department: " + w.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", w.income(year, month)));

        sc.close();
    }
}
