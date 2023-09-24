package main.Lessons;

import java.util.Scanner;

public class FinalTask2 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Пожалуйста, введите уравнение: ");
        String line = scan.nextLine();

        char[] arr = line.toCharArray();
        int x = line.indexOf('x');

        int result = 0;
        int a = Character.getNumericValue(arr[0]);
        int b = Character.getNumericValue(arr[2]);
        int c = Character.getNumericValue(arr[4]);

        if (arr.length < 6) {

            if (arr[1] == '+') {
                switch (x) {
                    case (0):
                        result = c - b;
                        break;
                    case (2):
                        result = c - a;
                        break;
                    case (4):
                        result = a + b;
                        break;
                }
                System.out.println("Вывод: " + result);
            } else if (arr[1] == '-') {
                switch (x) {
                    case (0):
                        result = c + b;
                        break;
                    case (2):
                        result = a - c;
                        break;
                    case (4):
                        result = a - b;
                        break;
                }
                System.out.println("Вывод: " + result);
            } else {
                System.out.println("Вы ввели некорретный математический знак");
            }
        } else {
            System.out.println("Количество символов уравнения не должно превышать 5");
        }
    }
}

