
public class pow {
public static void main(String[] args) {
     double x =2;
	int n=-2;
	double 	b =x;
	
	if(n < 0)
	{
		x =1/x;
		n =-n;
		for (int i=1; i<n; i++) {
			x = x*b;
		}
		
	
	}else {
	
	
		for (int i=1; i<n; i++) {
			x = x*b;
		}
	}
	System.out.println(x);
		
}
}
