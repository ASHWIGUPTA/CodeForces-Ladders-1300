package LeetCode;

import java.util.Arrays;

public class JumpGame {
	public static void main(String[] args) {
		int[] nums = { 0, 2, 3 };
		int x[] = new int[nums.length];
		int r[] = new int[nums.length];
		Arrays.fill(r, Integer.MAX_VALUE);
		r[0] = 0;
		for (int i = 1; i < r.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] + j >= i) {
					if (r[i] > r[j] + 1) {
						r[i] = r[j] + 1;
						x[i] = j;
					}
				}
			}
		}
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		for (int i = 0; i < r.length; i++) {

			if (r[i] == Integer.MAX_VALUE) {
				//
				// return false;
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
//	return true;

	}
}
