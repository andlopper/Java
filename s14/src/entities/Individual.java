package entities;

public class Individual extends Person{
    private double health;

    public Individual(String name, Double anualIncome, double health) {
        super(name, anualIncome);
        this.health = health;
    }

    @Override
    public double taxesPaid() {
        if (anualIncome < 20000.00)
            return (anualIncome * 0.15) - (health * 0.5);
        else
            return anualIncome * 0.25 - (health * 0.5);
    }
}
