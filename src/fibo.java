import java.util.Scanner;

public class fibo {
public static void main(String[] arr) {
	Scanner a =new Scanner(System.in);
	System.out.println("Enter the element how much length needed:");
	int ai = a.nextInt();
	int ar[] =new int[ai];
	
	for (int i =0; i<ai; i++) {
		System.out.println("enter element insert in array:");
		int element =a.nextInt();
		ar[i]=element;
	}
	
	System.out.println("/n Linear Recursion:");
	System.out.println("---------------------");
	System.out.println("/n Given list of number is:");
	for(int j=0; j<arr.length; j++) {
		System.out.print(arr[j]+" ");
	}
	a.close();
	System.out.println("the Sum of given lits of arrys is"+ sun(ar,ai));
}
public static int sun(int arr[],int len) {
	if (len == 0) {
		return 0;
	}else {
		return arr[len-1]+sun(arr,len-1);
	}
	
	}
}
