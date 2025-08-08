import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        System.out.printf(" Home Work 6 ");

        // Task 1
        System.out.println(" Task 1 ");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Task 2
        System.out.println(" Task 2 ");

        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

        // Task 3
        System.out.println(" Task 3 ");

        for (int b = 2; b < 17; b = b + 2) {
            System.out.println(b);
        }

        // Task 4
        System.out.println(" Task 4 ");

        for (int x = 10; x >= -10; x--) {
            System.out.println(x);
        }

        // Task 5
        System.out.println(" Task 5 ");

        for (int v = 1904; v <= 2096; v = v + 4) {
            System.out.println(v + " год является високосным ");
        }

        // Task 6
        System.out.println(" Task 6 ");

        for (int n = 7; n <= 98; n = n + 7) {
            System.out.println(n);
        }

        // Task 7
        System.out.println(" Task 7 ");

        for (int p = 1; p <= 512; p = p * 2) {
            System.out.println(p);
        }

        // Task 8
        System.out.println(" Task 8 ");

        int salary = 29000;
        int total = 0;
        for (int t = 1; t <= 12; t++) {
            total = total + salary;
            System.out.println(" Месяц " + t + " сумма накоплений равна " + total + " рублей ");
        }

        // Task 9
        System.out.println(" Task 9 ");

        int salary1 = 29000;
        int total1 = 0;
        for (int f = 1; f <= 12; f++) {
            total1 = total1 + (salary1 / 100);
            total1 = total1 + salary1;
            System.out.println(" Месяц " + f + " сумма накопелний равна " + total1 + " рублей ");
        }

        // Task 10
        System.out.println(" Task 10 ");

        for (int z = 1; z <= 10; z = z + 1) {
            System.out.println(" 2 * " + z + " = " + 2 * z);
        }


    }
}
