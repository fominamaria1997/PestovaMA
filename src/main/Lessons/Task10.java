package main.Lessons;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static int[][] matrix;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите размерность матрицы:");
        int length = scanner().nextInt();
        int width = scanner().nextInt();
        ArrayList<int[]> cat = new ArrayList<>();
        matrix = new int[length][width];
        for (int i = 0; i < width; i++) {
            System.out.println("Пожалуйста, введите массив:");
            int[] ds = new int[length];
            for (int ii = 0; ii < length; ii++) {
                ds[ii] = scanner().nextInt();
            }
            cat.add(ds);


        }

    }


}