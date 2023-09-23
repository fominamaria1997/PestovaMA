package main.Lessons;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Task14 {

    public static ArrayList<Integer> elements = new ArrayList<>();
    public static int min;
    public static int max;


    public static void main(String[] args) {
        for (int i = 0; 15 > i; i++) {
            elements.add(ThreadLocalRandom.current().nextInt(-20, 20 + 1));
        }
        max = Collections.max(elements);
        min = Collections.min(elements);

        System.out.println(max);
        System.out.println(min);
        System.out.println(Math.max(Math.abs(max), Math.abs(min)));

    }

}