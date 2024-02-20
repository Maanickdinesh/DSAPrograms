
public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 7, 8, 9, 10, 14 };
		int target = 14;
        int result = binarySearch(arr,target,0,arr.length);
        if(result !=-1) {
			System.out.println("Element found in "+ result );
		}
		else {
			System.out.println("Element not  found" );
		}
	}

	public static int binarySearch(int[] arr, int target,int left,int right) {
		// TODO Auto-generated method stub
		
			if(left<= right) {
				int mid = (left+right)/2;
				if(arr[mid]==target) {
					return mid;
				}
				
				else if(arr[mid]<target) {
					return binarySearch(arr,target,mid+1,right);
				}
				else {
					return binarySearch(arr,target,left,mid-1);
				}
			}
			
			
		
		
		
		
		return -1;
	}

}
