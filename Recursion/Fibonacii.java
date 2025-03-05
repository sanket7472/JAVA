class Fibonacii{

	public static void main(String[] args) {
		fibo(20 , 0 ,1);
	}
	public static void fibo(int num , int n1 , int n2)
	{
		if (num==0) {
			return;
		}
		System.out.print(n1+ "  ");
		int n3 = n2+n1;
		fibo(--num , n2 , n3);
	}
}