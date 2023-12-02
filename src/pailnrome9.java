
public class pailnrome9 {
public static void main(String[] args) {
	int  x =121;
	int rev =0;
	int y =x;
	if (x <0) {
		System.out.print(false);
	}
	while(y > 0) {
		rev =rev*10+y%10;
		y=y/10;
	}
	System.out.print(rev == x);
}
}
