
public class Insertthetargetvalue35 {
	public int value(int arr[] , int target) {
		int left =0;
		int right =arr.length;
		int mid;
		while(left<right) {
			mid =(left+right)/2;
			if(arr[mid] >target) 
				right =mid;
			else if(arr[mid]<target)
				left =mid +1;
			else 
				return  arr[mid];
		}
		
			return arr[left];
	 }
} 
		
		