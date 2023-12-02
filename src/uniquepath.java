
public class uniquepath {
public static void main(String[] args) {
	int[][] dp = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7,8,9},
		    {10,11,12}
		};
	for(int i =0; i<dp.length; i++) {
		for(int j =0; j<dp[i].length; j++) {
			System.out.print(dp[i][j]+" ");
		}
		System.out.println();
	}
}
}
