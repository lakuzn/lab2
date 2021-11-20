import java.util.Scanner;
public class LAB2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x;
        int n;
            System.out.println("Введите число Х.");
            while (!console.hasNextInt()) {
                System.out.println("Введите число!");
                console.next();
            }
            x = console.nextInt();
        do {
            System.out.println("Введите неотрицательное число N меньше 15.");
            while (!console.hasNextInt()) {
                System.out.println("Введите число!");
                console.next();
            }
            n = console.nextInt();
        } while (n <= 0 | n >= 15);
        int result = 1;
        for (int i = 1; i<=n; i++) {
            result = result*x;
        }
        System.out.println("Результатом возведения числа X в степень N является число " + result);
    }
}
