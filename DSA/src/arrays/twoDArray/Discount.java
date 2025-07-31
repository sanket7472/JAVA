package arrays.twoDArray;

public class Discount {
	// this is a repeated question from Tech Mahendra
/* 
 * company owner want give discount on some orders
 * but the condition is the order amount should be divisible by the quantity of product ordered.
 * if the quantity is positive then the orders are ready but if the quantity is negative 
 * the product is out of stock and complete later
 * 
 * inputs :-> 1) number of orders ---- >  7
 * 			  2) quantity of each product {array} ar[7] -- > {9,-13,8,-7,-8,18,10} 
 * 			  3) amount of order --->  18
 * 
 * output :->   2 product should be get discount. 
 * */
	
	public static void noOfProduct(int n, int [] ar, int amt) {
		
		int ct = 0;
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]>0 && amt%ar[i]==0 || ar[i]<0 && amt%ar[i]==0) {
				ct++;
			}
		}
		System.out.println(ct + " Product should get the discount ");
	}
	
	public static void main(String[] args) {
		int [] a = {9,-13,-6,-7,-8,18,10};
		int n = 7;
		int amt = 18;
		noOfProduct(n, a, amt);
	}
}
