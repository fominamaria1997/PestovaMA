package main.Lessons;

import java.util.Scanner;

public class FinalTask4 {

    public static void main(String[] args) {
        System.out.println("Загадка! Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        String answer = "Заархивированный вирус";
        boolean hint = false;
        boolean withoutHint = false;
        String verno = null;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите ваш ответ: ");
            verno = scan.nextLine();

            switch (verno) {
                case("Заархивированный вирус"):
                    System.out.println("Правильно!");
                    hint = true;
                    break;

                default:
                    if (withoutHint) {
                        hint = true;
                        break;

                    }  if ((verno.equalsIgnoreCase("Подсказка")) && i == 0) {
                    System.out.println("Нечто спрятанное в папку и вредит компьютеру");
                    withoutHint = true;
                    break;

                } else if (verno.equalsIgnoreCase("Подсказка") && i > 0) {
                    System.out.println("Извините, подсказка больше недоступна!");
                } else if (i<2) {
                    System.out.println("Подумай еще!");
                }
            }
            if (hint){
                break;
            }
        }
        if (!(verno.equalsIgnoreCase(answer))){
            System.out.println("Обидно! Приходи в другой раз");
        }
    }
}
