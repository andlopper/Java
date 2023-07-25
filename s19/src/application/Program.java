package application;

import entities.AccessLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "in.txt";
        Set<AccessLog> aL = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] access = line.split(" ");
                aL.add(new AccessLog(access[0], access[1]));
                line = br.readLine();
            }
            System.out.println("Acessos: " + aL.size());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
