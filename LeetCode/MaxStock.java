package LeetCode;

public class MaxStock {
public static void main(String[] args) {
	int prices[]= {3,3,5,0,1,0,1,4,7};
	int k=3;
	int n=prices.length;
	int[][] dp = new int[k+1][n];
	    for (int i = 1; i <= k; i++) {
	    	int localMax = dp[i-1][0] - prices[0];
	    	for (int j = 1; j < n; j++) {
	    		dp[i][j] = Math.max(dp[i][j-1],  prices[j] + localMax);
	    		localMax = Math.max(localMax, dp[i-1][j] - prices[j]);
	    	System.out.print(localMax+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    System.out.println();
	    for (int j = 0; j < dp.length; j++) {
			for (int j2 = 0; j2 < dp[0].length; j2++) {
				System.out.print(dp[j][j2]+" ");
			}
			System.out.println();
		}
}
}
