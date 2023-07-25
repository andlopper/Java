package application;

import entities.AccessLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "in.txt";
        Set<AccessLog> aL = new HashSet<>();

        //Programa de log de acesso
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

        //Programa de código de estudantes
        Set<Integer> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int i, j, n, m;

        System.out.printf("How many courses? ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.printf("How many students for course %d? ", i);
            m = sc.nextInt();
            for (j = 0; j < m; j++) {
                System.out.printf("Student code: ");
                students.add(sc.nextInt());
            }
        }
        System.out.printf("Total students: " + students.size());




        sc.close();
    }
}
