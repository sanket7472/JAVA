class Armstrong {
	public static void main(String[] args) {
		if (isArmstrong(153)) {
			System.out.println("Armstrong Number");
		}
	}
	
	public static boolean isArmstrong(int num){
		int sum = 0;
		int ct = count(num);
		for (int i = num;i!=0 ;i/=10 ) {
			sum += power(i%10 ,ct );
		}
		return sum==num;
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0){
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int num , int ct){
		int pow = 1;
		for (int i = 1;i<=ct ;i++ ) {
			pow *= num;
		}
		return pow;
	}
}