
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = {7,2,4,5,0};
          int temp=0;
          int size = arr.length;
          
          for(int i=0;i<size-1;i++) {
        	  int minindex =i;
        	  
        	  for(int j=i+1;j<size;j++) {
        		  if(arr[minindex]>arr[j]) {
            		  minindex=j;
            	  }
        	  }
        	  
        	 temp = arr[minindex];
        	 arr[minindex] = arr[i];
        	 arr[i] = temp;
        	  
        	  
          }
	
          for(int nums : arr) {
       	   System.out.print(nums+" ");
          }
	}
	

}
