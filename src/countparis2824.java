
public class countparis2824 {
public static void main(String[] args) {
	int[] arr= {-1, 1, 2, 3, 1};
	int target = 2;
	int count =0;
	for(int i =0; i<arr.length; i++) {
		for(int j =i+1; j<arr.length; j++) {
			if(arr[i] + arr[j]< target) {
				count++;
			}
		}
	}
	
	System.out.println(count);
}
}
