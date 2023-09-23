package main.Lessons;


import java.util.Scanner;

public class Task11 {

    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String number1;
    public static int number2;
    public static double number3;

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите первое число:");
        number1 = scanner().next();
        System.out.println("Пожалуйста, введите второе число:");
        number2 = scanner().nextInt();
        if (Integer.parseInt(number1) > number2) {
            System.out.println(number1);
            number3 = number2;
            System.out.println(number3);
        }
        if (Integer.parseInt(number1) < number2) {
            System.out.println(number2);
            number3 = Double.parseDouble(number1);
            System.out.println(number3);
        }
        if (Integer.parseInt(number1) == number2) {
            System.out.println("Числа равны, на экран ничего не будет выведено");
        }


    }

}