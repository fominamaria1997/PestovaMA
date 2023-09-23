package main.Lessons;

import java.math.BigDecimal;
import java.util.Scanner;

public class FinalTask1 {
    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите актуальный курс доллара: ");
        float USA = scanner().nextFloat();
        System.out.println("Пожалуйста, введите количество рублей: ");
        double amount = scanner().nextDouble();
        BigDecimal result = new BigDecimal(amount / USA);
        System.out.println("Итого: " + result.setScale(2, BigDecimal.ROUND_DOWN) + " долларов");
    }
}
