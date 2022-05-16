import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

        Scanner x = new Scanner(System.in);
        System.out.println("vvedite celoe chislo");
        int s = x.nextInt();
        System.out.println("celoe chislo");

        int a = 3; // вывести min значение из трех переменных
        int b = 8;
        int c = 5;
        int min = Math.min(Math.min(a, b), Math.min(b, c));
        System.out.println(min);

        int[] masiv = {1, 2, 10, 3}; // max значение массива
        int max = masiv[0];
        for (int i = 1; i < masiv.length; i++)
            max = Math.max(max, masiv[i]);
        System.out.println(max);

        int[] num = {1, 2, 3, 4, 5, 6}; // найти среднее значение из массива чисел
        int sum = 0;
        for (int z : num) {
            sum += z;
        }
        System.out.println(sum / num.length);
    }
}
