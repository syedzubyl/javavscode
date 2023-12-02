
public class increment1ofsum66 {
public static void main(String[] args) {
	int dig []= {9};
	for(int i =dig.length-1; i>=0; i--) {
		if(dig[i]<9) {
			++dig[i];
			//System.out.println(dig);
			for(int j : dig) {
				System.out.print(j);
			}
			break;
		}
		dig[i] =0;
	}
	int [] ans   = new int [dig.length+1];
	ans[0]=1;
	for(int i : ans) {
		System.out.print(i);
	
	}
	
	
}	
}
