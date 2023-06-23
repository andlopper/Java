package entities;

public abstract class Person {
    protected String name;
    protected Double anualIncome;

    public Person() {
    }

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public abstract double taxesPaid();
}
