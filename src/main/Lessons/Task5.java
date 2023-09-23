package main.Lessons;

import java.util.Scanner;

public class Task5 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        double count1 = scanner().nextDouble();
        double count2 = scanner().nextDouble();
        String sign = scanner().next();
        boolean boul = false;

        if (sign.equalsIgnoreCase("+")) {
            System.out.println(count1 + count2);
            boul = true;
        }
        if (sign.equalsIgnoreCase("-")) {
            System.out.println(count1 - count2);
            boul = true;
        }
        if (sign.equalsIgnoreCase("*")) {
            System.out.println(count1 * count2);
            boul = true;
        }
        if (sign.equalsIgnoreCase("/")) {
            System.out.println(count1 / count2);
            boul = true;
        }
        if (boul == false)
            System.out.println("Введен недопустимый символ");
    }
}