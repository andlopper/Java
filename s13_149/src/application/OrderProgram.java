package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.next();
        System.out.printf("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        System.out.println("Enter oder data:");
        System.out.printf("Status: ");
        String status = sc.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, date));

        System.out.printf("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.printf("Enter #%d item data:", i);
            System.out.printf("\nProduct name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.printf("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.printf("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


        sc.close();
    }
}
