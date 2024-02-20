
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 7, 8, 9, 10, 14 };
		int target = 14;
        int result = binarySearch(arr,target);
        if(result !=-1) {
			System.out.println("Element found in "+ result );
		}
		else {
			System.out.println("Element not  found" );
		}
	}

	public static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left =0;
		int right=arr.length-1;
		
		while(left <=right) {
			int mid =(left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]< target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
			
			
		}
		
		
		
		return -1;
	}

}
