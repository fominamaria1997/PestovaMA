package main.Lessons;

import java.util.Scanner;

public class Task10 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста, задайте размерность матрицы: ");
        int a = scan.nextInt();
        System.out.print("Пожалуйста, задайте размерность матрицы: ");
        int b = scan.nextInt();
        int[][] ar = new int[a][b];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println("Пожалуйста, введите 1 элемент массива ar[" + i + "][" + j + "]:");
                ar[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print("a [" + (i + 1) + "] = " + ar[i][0] * 3 + "\t");
        }
    }
}