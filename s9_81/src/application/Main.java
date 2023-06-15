package application;

import utils.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account ac; //Declarar fora do if else

        int accNumber;
        String name;

        System.out.print("Enter account number: ");
        accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        name = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        if (sc.next().charAt(0) == 'y'){
            System.out.print("Enter initial deposit: ");
            ac = new Account(accNumber, name, sc.nextDouble());
        }
        else {
            ac = new Account(accNumber, name);
        }

        System.out.println(ac);

        System.out.print("Enter a deposit value: ");
        ac.deposit(sc.nextDouble());
        System.out.printf("Updated account data:\n" + ac);

        System.out.print("\nEnter a withdraw value: ");
        ac.withdraw(sc.nextDouble());
        System.out.printf("Updated account data:\n" + ac);

        sc.close();
    }
}