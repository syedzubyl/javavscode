
public class pow50 {
public static double mypow(double x,int n) {
	
	if (n == 0) {
		return 1;
	}
	if(n<0) {
		n=-n;
		x=1/x;
	}
	
	double temp = mypow(x,n/2);
	
	if(n%2 == 0) {
		return temp*temp;
	}else {
		return x* temp * temp;
	}
}
}
