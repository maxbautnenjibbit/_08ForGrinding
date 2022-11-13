import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze Zahl ein.");
        System.out.print("Zahl: ");

        int n = scanner.nextInt();

        System.out.println("Möchten Sie die Fakultät von " + n + " mit der While (a), Do While (b) oder mit der For (c) Schleife berechnen?");
        System.out.print("Entscheidung: ");

        String next = scanner.next();

        double f = n;
        int x = n;
        if (next.equals("a")) {
            while (x > 1) {
                x--;
                f *= x;
            }
        } else if (next.equals("b")) {
            // Hatten wir noch nicht
            do {
                x--;
                f *= x;
            } while (x > 1);
        } else {
            for (int i = x; i > 1; i--) {
                x--;
                f *= x;
            }
        }

        scanner.close();
        System.out.println("Fakultät von " + n + " ist " + f);
    }
}
