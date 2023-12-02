import java.util.Scanner;

public class linarray {
	public static int arr(int arr[],int x) {
		int a=x-1;
		int result,sum;
		System.out.print("Each time"+a);
		if (x == 0) { 
		return 0;}
		else {
			 result= arr[x -1]+arr(arr,x-1);
		     sum=result;
		     for(int m: arr) {
		    	 System.out.println("---M"+m);
		     }
		     for(int t=0; t<arr.length-1;t++) {
		    	 System.out.println("contains in array"+arr[x-=1]);
		    	
		     }
		     System.out.print("....--->"+sum);
		     
		}
		return result;
		
		
	}
public static void main(String[] args) {
	Scanner x =new Scanner(System.in);
	System.out.println("enter how much array sapce needed");
	int a=x.nextInt();
	int [] arr= new int[a];
	for(int i=0; i<a; i++) {
		System.out.println("Enter the element each by each:");
		int ele = x.nextInt();
		arr[i]=ele;
	}
	System.out.println("The element you given");
	for(int i : arr) {
		System.out.print(i+"+");
	}
	System.out.println("The sum of array is:"+arr(arr,a));
}
}
