package entities;

public class OutsourvedEmployee extends Employee{
    private Double additionalCharge;

    public OutsourvedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (additionalCharge * 110) / 100;
    }
}
