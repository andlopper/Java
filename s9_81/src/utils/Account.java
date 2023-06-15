package utils;

public class Account {
    private int accNumber;
    private String name;
    private double balance;

    public Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        deposit(balance);
    }

    public Account(int accNumber, String name) {
        this.accNumber = accNumber;
        this.name = name;
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value + 5;
    }

    @Override
    public String toString() {
        return "Account " + accNumber
                + ", Holder: " + name
                + ", Balance: $ " + String.format("%.2f", balance);
    }
}
