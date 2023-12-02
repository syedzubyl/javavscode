
public class fib {
public Long[] fi(int n) {
	Long a[] = new Long[n];
	if(n>=1) {
		a[0]=(long)1;
	}
	if(n>=2) {
		a[1]=(long)1;
	}
	for(int i =2 ; i<n;i++) {
		a[i] =a[i-1]+a[i-2];
		
	}
	return a;
} 
}
