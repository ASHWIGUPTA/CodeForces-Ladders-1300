package LeetCode;

public class PerfectSqure {
	public static void main(String[] args) {
		System.out.println(numSquares(15));
	}

	static int[] sq;

	private static int numSquares(int i) {
		sq = new int[(int) Math.sqrt(i)];
		for (int j = 1; j < sq.length + 1; j++) {
			sq[j] = (int) Math.pow(j, j);
		}
		int arr[][]=new int[i+1][(int)Math.sqrt(i)+1];
		for (int j = 1; j < arr.length; j++) {
			arr[j][0]=j;
		}
		for (int j = 1; j < arr[0].length; j++) {
			arr[0][j]=j;
		}
		return call(i,sq,arr);
		

	//	return 0;
	}

	private static int call(int i, int[] sq2, int[][] arr) {
		// TODO Auto-generated method stub
	for (int j = 1; j < arr.length; j++) {
		for (int j2 = 1; j2 < arr[0].length-1; j2++) {
			if(j%sq2[j2-1]==0) {
				arr[j][j2]=Math.min(arr[j][j2-1], arr[j-1][j2])+1;
			}else {
				
			}
		}
	}
		
		return 0;
	}
}
