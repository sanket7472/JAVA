package arrays.twoDArray;

public class ScienceLab {

	/*
	 * calculate how much energy generated within the given seconds 
	 * initial energy ----> 5
	 * increase rate -----> 3
	 * calculate energy after 3 sec ?
	 * expected output ---> 24 
	 * */
	
	public static void main(String[] args) {
		int initialEner = 5;
		int rate = 3;
		int time = 3;
		totalEnergy(initialEner, rate, time);
	}
	public static void totalEnergy(int i, int rate, int time) {
		// i is a initial energy
		// rate --> rate of increase 
	
		int sum=i;
		for (int j = 0; j < time-1; j++) {
			
			i+=rate;
			sum+=i;
		}
		System.out.println(sum);
	}
}
