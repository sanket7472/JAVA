public class PalindromeString {
    public static void main(String[] args) {
        /*
         * output
         * 1
         * 212
         * 32123
         * 4321234
         * 543212345
         */

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
