
public class equilibrium {
public static void main(String[] args) {
	int[] a = {1, 4, 9, 3, 8, 2, 6};
	int lsum =0, rsum =0,totaleq =0;
	int n =a.length;
	for (int i=0; i<n; i++) {
		rsum+=a[i];
	}
	for(int j =0; j<n ; j++) {
		rsum=rsum-a[j];
		if(rsum == lsum) {
			System.out.println(j+1);
		}
		lsum=lsum+a[j];
	}
	System.out.println(-1);
}
}
