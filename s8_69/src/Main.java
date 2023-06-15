import entities.Employee;
import entities.Rectangle;
import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Rectangle r = new Rectangle();
//        System.out.print("Enter width: ");
//        r.width = sc.nextDouble();
//        System.out.print("Enter height: ");
//        r.height = sc.nextDouble();
//        System.out.printf("Area: %.2f\n", r.area());
//        System.out.printf("Perimeter: %.2f\n", r.perimeter());
//        System.out.printf("Diagonal: %.2f\n", r.diagonal());

//        Employee e = new Employee();
//        System.out.print("Name: ");
//        e.name = sc.nextLine();
//        System.out.print("Gross Salary: ");
//        e.grossSalary = sc.nextDouble();
//        System.out.print("Tax: ");
//        e.tax = sc.nextDouble();
//
//        System.out.println(e);
//
//        System.out.print("Percentage to increase: ");
//        e.increaseSalary(sc.nextDouble());
//
//        System.out.println(e);



        Student s = new Student();
        System.out.print("Name: ");
        s.name = sc.nextLine();
        System.out.print("Grade 1: ");
        s.n1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        s.n2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        s.n3 = sc.nextDouble();
        System.out.println("FINAL GRADE = " + s.finalGrade());
        s.status();

    }
}
