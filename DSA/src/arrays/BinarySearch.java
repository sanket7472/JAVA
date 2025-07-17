package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		
		binarySearch(arr, 4);
	}
	public static int binarySearch(int [] ar,int ele) {
		
		BubbleSort.bubbleSort(ar);
		
		int start = 0,end = ar.length-1,mid = (start+end)/2;
		
		while(start<=end) {
			
			if (ele == ar[mid]) {
				System.out.println(ele+" found at Index : "+ mid);
				return mid;
			}
			else if(ele > ar[mid]) {
				start = mid+1;
			}
			else if(ele < ar[mid]) {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		
		System.out.println(ele+" Not Found ");
		return -1;
	}
}
