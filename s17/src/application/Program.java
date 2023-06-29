package application;

import model.entities.Product;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] products = line.split(",");
                Product product = new Product(products[0], Double.parseDouble(products[1]), Integer.parseInt(products[2]));

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("out/summary.csv", true))){
                    bw.write(product.getName() + "," + product.total());
                    bw.newLine();
                }
                catch (IOException e){
                    e.getMessage();
                }

                line = br.readLine();
            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
