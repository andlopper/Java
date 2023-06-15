package utils;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary += (this.salary * salary / 100);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}
