class RotateNum  {
	/*
		rotary number is the number which is rotate with each iteration 
		123 ---> 312 -----> 231 ----> 123
	*/
	public static void main(String[] args) {
		int num = 12345;
		int rot = rotate(num);
	
		do{

			System.out.println(rot);
			  rot = rotate(rot);
			

		}while (rot != rotate(num));	
				// 12345 != 51234
	}
	public static int rotate(int num){
		int last = num%10;
		num/=10;
		int ct = count(num);
		return last*power(ct)+num;
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
	public static int power(int ct){
		int pow = 1;
		for (int i = 1;i<=ct ;i++ ) {
			pow *= 10;
		}
		return pow;
	}
}