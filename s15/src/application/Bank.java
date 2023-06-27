package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.printf("Number: ");
            int number = sc.nextInt();
            System.out.printf("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.printf("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.printf("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account a = new Account(number, holder, balance, withdrawLimit);

            System.out.printf("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            a.withdraw(amount);
            System.out.printf("New balance: " + String.format("%.2f", a.getBalance()));

        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}
