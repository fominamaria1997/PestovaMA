package main.Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static double average = 0;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите размер массива:");
        int size = scanner().nextInt();
        double[] count1 = new double[size];
        for (int i = 0; i < count1.length; i++) {
            System.out.println("Пожалуйста, введите элемент массива:");
            count1[i] = scanner().nextDouble();
            average = average + count1[i];
        }
        average = average / count1.length;
        for (int i = 0; i <= count1.length - 1; i++)
            count1[i] = count1[i] * average;
        System.out.println(Arrays.toString(count1));
    }
}