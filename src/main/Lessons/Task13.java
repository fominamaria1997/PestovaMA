package main.Lessons;


import java.util.ArrayList;
import java.util.Scanner;

public class Task13 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String string1;


    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите фразу:");

        string1 = scanner().nextLine();
        string1 = string1
                .replaceAll("[а-яА-Я\\d]", "")
                .replaceAll("\\s+", " ")
                .trim();
        System.out.println(string1.trim());
        System.out.println(string1.split(" ").length);

    }

}
