package main.Lessons;

import java.io.NotActiveException;
import java.util.Scanner;

public class Task6 {
    public static Scanner in;
    public static int translate2;
    public static boolean bool = false;


    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void getMeters(double count) {
        double miles = count * 0.000621;
        double yards = count * 1.093613;
        double ft = count * 3.28084;
        System.out.println("Результат:");
        System.out.println("Метры: " + count);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + ft);
        bool = true;

    }

    public static void getMiles(double count) {
        double meters = count * 1609;
        double yards = count * 1760;
        double ft = count * 5280;
        System.out.println("Результат:");
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + count);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + ft);
        bool = true;

    }

    public static void getYards(double count) {
        double meters = count * 0.9144;
        double miles = count * 0.000561;
        double ft = count * 0.333;
        System.out.println("Результат:");
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + count);
        System.out.println("Футы: " + ft);
        bool = true;

    }

    public static void getFt(double count) {
        double meters = count * 0.3048;
        double miles = count * 0.1894;
        double yards = count * 3;
        System.out.println("Результат:");
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + count);
        bool = true;

    }


    public static void main(String[] args) throws NotActiveException {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int translate1 = scanner().nextInt();

        if (translate1 == 1) {
            throw new NotActiveException("Извините, я не умею конвертировать массу");
        }
        if (!(translate1 == 2)) {
            throw new NotActiveException("Выбран некорректный тип конвертации");
        }

        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        translate2 = scanner().nextInt();

        System.out.println("Введите число");
        double count = scanner().nextDouble();

        System.out.println(translate2);

        if (translate2 == 1) {
            getMeters(count);
        }
        if (translate2 == 2) {
            getMiles(count);
        }
        if (translate2 == 3) {
            getYards(count);
        }
        if (translate2 == 4) {
            getFt(count);
        }
        if (bool = false)
            throw new NotActiveException("Выбран некорретный индекс величины: " + translate2);
    }

}