import java.util.Scanner;
class GoodPrimeFromRange {
	public static void main(String[] args) {
		System.out.print("Enter range :");
		int range = new Scanner (System.in).nextInt();


		System.out.println("Good prime numbers from 1 to "+ range);
		for (int i = 2;i<=range ;i++ ) {
				boolean flag = true;
			for (int j = 2;j<i ;j++ ) {
				
				if(i%j==0){
					flag = false;
					break;
				}
			}
			
			if (flag) {
				for (int j = i;j>0 ;j/=10 ) {
					
					int rem = j%10;
					if (!(rem==2||rem==3||rem==5||rem==7)) {
						flag = false;
						break;
					}
				}
			if (flag) {
				System.out.print(i +" ");
				
			}
			}

		}
	}
}