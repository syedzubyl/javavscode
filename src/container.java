
public class container {
public int cap(int[] arr){
	int left =0;
	int right =arr.length-1;
	int ans =0;
	int capcity;
	while(left<right) {
		capcity=(right-left)*Math.min(arr[left],arr[right]);
		if(capcity<ans) {
			ans=capcity;
		}
		if(arr[left]<arr[right]) {
			left++;
		}
		else {
			right--;
		}
	}
	return ans;
	
}
}
