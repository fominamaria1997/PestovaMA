package main.Lessons;

import java.util.Scanner;

public class Task7 {
    public static final String x = "Hello";
    public static final String y = "My dear";
    public static final String z = "Friend";


    public static Scanner in;
    public static String name = "Ни одной из констант нет в массиве";

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String[] constant = {x, y, z};

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите размер массива:");
        String[] count1 = new String[scanner().nextInt()];
        for (int i = 0; i < count1.length; i++) {
            System.out.println("Пожалуйста, введите элемент массива:");
            count1[i] = scanner().next();
            for (int ii = 0; ii < constant.length; ii++) {
                if (count1[i].equalsIgnoreCase(constant[ii])) {
                    name = "Данное значение имеется в константах";
                    break;
                }
            }
        }
        System.out.println(name);
    }
}