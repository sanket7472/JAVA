package arrays.twoDArray;
public class Stock {

	/*
	 * repeated question 
	 * There are n number of stocks listed 
	 * A trader want to invest some amount on a special stock.
	 * condition for investment is--> trader want to invest amount on 
	 * stock which is listed on lucky number of trader ---> k
	 * special stock is the (k)th smallest stock from the list 
	 * 
	 * */
	public static void main(String[] args) {
		int [] ar = {60,40,20,10,50,80,7,5};
		kthStock(ar, 3);
	}
	
	public static void kthStock(int [] ar,int k) {
		sort(ar);
		if (k<ar.length-1) {
			System.out.println("Stock at lucky number is : "+ar[k+1]);
		}else {
			System.out.println("lucky number is Greater than listed stocks : ");
		}
		
	}
	public static int[] sort(int [] ar) {
		
		ar = mergeSort(ar,0,ar.length-1);
		return ar;
	}

	private static int[] mergeSort(int[] ar, int start, int end) {
		
		if (start<end) {
			int mid = (start+end)/2;
			mergeSort(ar, start, mid);
			//System.out.println(Arrays.toString(ar));
			mergeSort(ar, mid+1, end);
			//System.out.println(Arrays.toString(ar));
			mergeInSameArray(ar,start, mid,end);
			//System.out.println(Arrays.toString(ar));
		}
		return ar;
	}

	private static int[] mergeInSameArray(int []a , int start, int mid, int end) {

		
		int [] ans = new int [a.length];
		int i = start,j=mid+1,k=start;
		
		while (i<=mid && j <= end) {
			
			if (a[i]<=a[j]) {
				
				ans[k++]=a[i++];
			}else if (a[i]>a[j]) {
				ans[k++]=a[j++];
			}
		}
		while (i<=mid) {
			ans[k++]=a[i++];
		}
		while (j<=end) {
			ans[k++]=a[j++];
		}
//		System.out.println(Arrays.toString(ans));
		for (int k2 = start; k2 <= end; k2++) {
			
			a[k2]=ans[k2];
		}
	return a;
	}
	
	
}
