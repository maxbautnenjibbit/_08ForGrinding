public class ABOhneComputer {

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
    }

    // k = 6
    public static void a() {
        int k = 0;

        for (int i = 0; i < 4; i = i + 1) {
            k = k + i;
        }
        System.out.println("Wert von k: " + k);
    }

    // k = 2
    public static void b() {
        int k = 0;

        for (int i = 2; i < 4; i = i + 2) {
            k = k + i;
        }

        System.out.println("Wert von k: " + k);
    }

    // k = 30
    public static void c() {
        int k = 0;

        for (int i = 1; i < 4; i = i + 1) {
            for (int j = 0; j < 5; j++) {
                k = k + i;
            }
        }

        System.out.println("Wert von k: " + k);
    }

    // k = 22
    public static void d() {
        int k = 0;

        for (int i = 1, j = 5; (i < 4 && j > 1); i = i + 1, j = j - 1) {
            k = k + i * j;
        }

        System.out.println("Wert von k: " + k);
    }

    /*
    public static void main(String[] args) {
        int k = 0;

        for (int i = 1; i < 4; i = i + 1)
        {
            k = k + 1;
        }
        System.out.println("Wert von k: " + k);
    }
    */
    public static void e() {
        int k = 0;
        int i = 1;

        while (i < 3) {
            k = k + i;
            i++;
        }

        System.out.println("Wert von k: " + k);
    }
}
