package main.Lessons;

import java.util.Scanner;

public class FinalTask2 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String row;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите уравнение: ");
        row = scanner().nextLine();

        if (!("+"
                .equals(String.valueOf(row.charAt(1))) || "-"
                .equals(String.valueOf(row.charAt(1))) && "="
                .equals(String.valueOf(row.charAt(3)))&&(Character.isDigit(row.charAt(0))||Character.isDigit(row.charAt(2))||Character.isDigit(row.charAt(4)))

        ))
            System.out.println("Вы ыыели [ерн.");
        System.out.println();
        Boolean ReturnValue = Character.isDigit(row.charAt(0));

    }
}
