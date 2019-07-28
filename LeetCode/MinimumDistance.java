package LeetCode;

public class MinimumDistance {
	public static void main(String[] args) {
		char[] aa = "abc".toCharArray();
		char[] r = "abc".toCharArray();
		int arr[][] = new int[aa.length + 1][r.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = i;
		}
		for (int i = 0; i <= r.length; i++) {
			arr[0][i] = i;
		}

		for (int i = 1; i <= aa.length; i++) {
			for (int j = 1; j <= r.length; j++) {
				if (r[j-1] == aa[i-1])
					arr[i][j] = arr[i - 1][j - 1];
				else {
					arr[i][j] = Math.min(arr[i - 1][j - 1], Math.min(arr[i][j - 1], arr[i - 1][j])) + 1;
				}

			}
		}
		System.out.println(arr[aa.length][r.length]);
	}
}
