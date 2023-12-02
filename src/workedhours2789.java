
public class workedhours2789 {
public static void main(String[] args) {
	int arr[]= {0,1,2,3,4};
	int target =2;
	int a =0;
	
	for(int i= 0; i<arr.length; i++) {
		int b = arr[i];
		if(b >= target) {
			a++;
		}
	}
	System.out.println(a);
}
}
