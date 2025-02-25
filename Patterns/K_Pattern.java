class K_Pattern {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= n - 1; j++) {
                if (j == n / 2 || j + i == n - 1 && i <= n / 2||i==j&&i>=n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}