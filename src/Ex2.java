import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws InterruptedException {
        a();
        //b();
        //c();
        //d();
    }

    public static void a() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void b() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze Zahl ein.");
        System.out.print("Zahl: ");

        int i = scanner.nextInt();

        for (int i1 = 1; i1 <= i; i1++) {
            System.out.println(i1);
        }

        scanner.close();
    }

    public static void c() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze Zahl ein.");
        System.out.print("Zahl: ");

        int i = scanner.nextInt();

        if (i % 2 == 1)
            i++;

        for (int i1 = i; i1 > 0; i1 -= 2) {
            System.out.println(i1);
        }

        scanner.close();
    }

    public static void d() {
        for (int i = 1; i < 20; i++) {
            if (i < 10)
                System.out.println(i);
            else
                System.out.println((20 - i));
        }
    }

}
