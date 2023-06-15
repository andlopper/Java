package application;

import utils.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        int id, n;
        String name;
        double salary;

        System.out.print("Quantidade de empregados: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.printf("Funcionário #%d:\n", i+1);
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Salário: ");
            salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.printf("Id do funcionário com aumento: ");
        id = sc.nextInt();
        System.out.printf("Porcentagem: ");
        double perc = sc.nextDouble();

        for (int i=0; i< list.size(); i++){
            Employee e = list.get(i);
            if (e.getId() == id){
                e.setSalary(perc);
                break;
            }
        }
        System.out.println("Empregados");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
