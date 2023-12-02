import java.util.Scanner;

public class bin_mid {
	public static int bin_arr(int a[],int start,int stop) {
		if (start>=stop){
			return 0;
		}
		else if(start == stop -1 ) {
			return a[start];
		}
		else {
			int mid =(start+stop)/2;
			return bin_arr(a,start,mid)+bin_arr(a,mid,stop);
		}
		
	}
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the space for array:");
	int a=s.nextInt();
	int[] arr =new int[a];
	System.out.println("Enter the element for array");
	for(int i=0; i<a; i++) {
		
		int ele=s.nextInt();
		arr[i]=ele;
	}
	System.out.println("The binary recursion results are:");
	System.out.print("[");
	for (int i:arr) {
		System.out.print(i+",");
	}
	System.out.print("]");
	 int sum = arr[a- 1] + bin_arr(arr, 0, a - 1);
	System.out.println("the sun of Array is "+sum);
}

}
