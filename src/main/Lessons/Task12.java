package main.Lessons;

import java.util.Scanner;

public class Task12 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String string;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите фразу:");
        string = scanner().nextLine();
        if (string.contains("Java"))
            System.out.println("Подстрока \"Java\" присутвует в предложении");
        else System.out.println("Подстрока \"Java\" не присутвует в предложении");

        if (string.startsWith("I like")) {
            System.out.println("Предложение начинается с подстроки \"I like\"");
        } else
            System.out.println("Предложение не начинается с подстроки \"I like\"");

        if (string.endsWith("!!!")) {
            System.out.println("Предложение заканчивается подстрокой \"!!!\"");
        } else
            System.out.println("Предложение не заканчивается с подстроки \"!!!\"");
        string = string.replace("a", "о");
        System.out.println(string.substring(7, 11));

    }


}