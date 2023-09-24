package main.Lessons;


import java.util.Scanner;

public class FinalTask3 {

    public static Scanner in;

    public static <in> Scanner scanner() {
        return new Scanner(System.in);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста, введите количество строк: ");
        int n = scan.nextInt();
        scan.nextLine();

        int[] result = new int[n];
        String [] list = new String[n];
        boolean flag = false;
        int count = 0;
        int max = 0;
        String maxStr = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Строка "+(i+1)+": ");
            String str = scan.nextLine();
            list [i] = str;
            char[] charStr = str.toCharArray();

            for (int k = 0; k < charStr.length; k++) {
                flag = !(str.substring(k+1).contains(String.valueOf(charStr[k])));
                if (flag) {count=++count;}
            }
            result[i]=count;
            count=0;

            for(int m=0;m<result.length;m++){
                if(max<result[m]){
                    max=result[m];
                    maxStr=list[i];
                }
            }
        }
        System.out.print("Ответ: ");
        System.out.println(maxStr);
    }
}