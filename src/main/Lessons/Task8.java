package main.Lessons;

import java.io.NotActiveException;
import java.util.Scanner;

public class Task8 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }
    public static int sumNumber = 0;
    public static void main(String[] args) throws NotActiveException {
        System.out.println("Пожалуйста, введите число:");
        long number = scanner().nextLong();
        if (!(number == Math.abs(number)))
            throw new NotActiveException("Введено не натуральное число");
        for (int i = 0; i <= number; i++) {
            if (!(i%2 == 0)){
                sumNumber = sumNumber + i;
            }
        }
        System.out.println(sumNumber);
    }
}