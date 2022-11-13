public class PalindromeNumbers {

    /*
    Bisschen schwieriger
    */
    public static void main(String[] args) {
        System.out.print("Palindromzahlen: ");

        int d = 0;
        for (int i = 0; i < 1000; i++) {
            String a = String.valueOf(i);
            String b = "";

            char[] chars = a.toCharArray();

            for (int i1 = chars.length - 1; i1 >= 0; i1--) {
                b += chars[i1];
            }

            if (a.equals(b)) {
                if (d == 10) {
                    System.out.println();
                    d = 0;
                } else {
                    d++;
                }

                System.out.print(a + ", ");
            }
        }
    }

}
