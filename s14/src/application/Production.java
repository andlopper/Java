package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Production {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Enter the number of products: ");
        int n = sc.nextInt();
        String name;
        double price, customsFee;
        Date manufacureDate;
        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:\nCommon, used or imported (c/u/i)? ", i);
            char c = sc.next().charAt(0);
            System.out.printf("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.printf("Price: ");
            price = sc.nextDouble();
            if (c == 'i'){
                System.out.printf("Customs fee: ");
                customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
            if (c == 'u'){
                System.out.printf("Manufacture date (DD/MM/YYYY): ");
                manufacureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufacureDate));
            }
            if (c == 'c'){
                products.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
