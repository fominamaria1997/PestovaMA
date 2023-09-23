package main.Lessons;

import java.util.Scanner;

public class Task4 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        int x = scanner().nextInt();
        int y = scanner().nextInt();
        int z = scanner().nextInt();
        int variable1 = (x + y + z) / 3;
        int variable2 = (int) Math.ceil(variable1 / 2);
        System.out.println(variable2);

        if (variable2 > 3)
            System.out.println("Программа выполнена корректно");

    }
}