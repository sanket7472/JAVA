import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get range from user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
		int j= 1;
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(j + ": "+num + " ");
				j++;
            }
        }
       
    }
}
