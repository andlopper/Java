package entities;

public class Company extends Person{
    private double employees;

    public Company(String name, Double anualIncome, double employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    @Override
    public double taxesPaid() {
        if (employees < 10)
            return anualIncome * 0.16;
        else
            return anualIncome * 0.14;
    }
}
