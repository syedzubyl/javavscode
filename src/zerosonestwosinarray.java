
public class zerosonestwosinarray {
public static void main(String[] args) {
	int a[] = {0,2,1,2,0};
	int n =5;
	int an[] =new int[10000];
	for(int i=0; i<a.length; i++) {
		if(a[i]< a[i+1]) {
			an[i] =a[i];
		}
		else {
			an[i]=a[i+1];
		}
	}
	for(int az : an) {
		System.out.println(az);
	}
}
}
