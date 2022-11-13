public class Ex3 {

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("\t" + j);
            }
            System.out.print("\n");
        }
    }

}
