class I_Pattern {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == n - 1 || i == 1 || j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}