package DailyCoding;

import java.math.BigInteger;

public class UberHard0107 {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1 };
		BigInteger r = BigInteger.ONE;
		for (int i = 0; i < arr.length; i++) {
			r = r.multiply(BigInteger.valueOf(arr[i]));

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.divide(BigInteger.valueOf(arr[i])).intValue();
			System.out.print(arr[i] + " ");
		}

	}
}
