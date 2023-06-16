package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel worker;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel worker, Double baseSalary, Department department) {
        this.name = name;
        this.worker = worker;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        return 1;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", worker=" + worker +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
