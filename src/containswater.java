
public class containswater {
public static void main(String[] args) {
	int []height= {1,8,6,2,5,4,8,3,7};
	int l =0; int r=height.length-1; int ans=0;
	while(l<r) {
	int minheight =Math.min(height[l], height[r]);
	System.out.println("min"+minheight +"right"+r);
		ans =Math.max(ans, minheight*(r-l));
		if(height[l]<height[r]) {
			l++;
		}
		else {
			r--;
		}
	}
	System.out.println(ans);
}
}
