
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr = {4,6,12,7,9,10};
           int size = arr.length;
           int temp=0;
           System.out.println("Before Sorting");
           
           for(int nums : arr) {
        	   System.out.print(nums+" ");
           }
           System.out.println();
           System.out.println("After Sorting");
           
           for(int i=0;i<size;i++) {
        	   for(int j=0;j<size-i-1;j++) {
        		   if(arr[j]>arr[j+1]) {
        			   temp = arr[j];
        			   arr[j] = arr[j+1];
        			   arr[j+1]=temp;
        		   }
        	   }
           }
           for(int nums : arr) {
        	   System.out.print(nums+" ");
           }
           
	}

}
