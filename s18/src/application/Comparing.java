package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Comparing {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("list.txt"))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Collections.sort(list);
            for (Employee e : list) {
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
