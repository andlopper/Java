package application;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, m, n;

        System.out.print("Digite um número: ");
        m = sc.nextInt();
        System.out.print("Digite outro número: ");
        n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.printf("Digite os valores da matriz: ");

        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
