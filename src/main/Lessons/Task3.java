package main.Lessons;

public class Task3 {
    static int[] variable3 = {1, 2, 3, 4, 5};
    static int yell1 = variable3[0];
    static int yell2 = variable3[variable3.length - 1];

    public static void main(String[] args) {
        variable3[0] = yell2;
        variable3[variable3.length - 1] = yell1;
        System.out.println(variable3[0] + variable3[variable3.length / 2]);
    }
}