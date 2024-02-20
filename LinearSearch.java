
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 6, 7, 8, 19 };
		int target = 8;
		int result = linearSearch(arr, target);

		if(result !=-1) {
			System.out.println("Element found in "+ result );
		}
		else {
			System.out.println("Element not  found" );
		}
	}

	public static int linearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub

		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]== target) 
				return i;
			
			
			
		}
		
		return -1;
		
	}

}
