
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,2,5,1,8};
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		for(int nums : arr) {
			System.out.print(nums+" ");
		}
		
		
		
		
	}

}
