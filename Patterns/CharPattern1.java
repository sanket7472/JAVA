class CharPattern1 {
	public static void main(String[] args) {
		/*
		 * output
		 * a
		 * b c
		 * d e f
		 * g h i j
		 * k l m n o
		 */
		System.out.println(" Charecter Pattern 1 : ");
		int n = 5;
		char ch = 'a';

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + "  ");
				ch++;
			}
			System.out.println();
		}
	}
}
