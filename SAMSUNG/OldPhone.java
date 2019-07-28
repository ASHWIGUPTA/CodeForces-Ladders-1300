package SAMSUNG;

import java.util.Scanner;

public class OldPhone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = scan.nextInt();
		int m = scan.nextInt();

		int arr[] = new int[10];
		int no[] = new int[j];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			;
		}
		for (int i = 0; i < no.length; i++) {
			no[i] = scan.nextInt();
		}
		int o = scan.nextInt();
		System.out.println(output(arr, no, m, o, 0, 0));

	}

	private static int output(int[] arr, int[] no, int m, int o, int i, int j) {
		// TODO Auto-generated method stub
		if (j > m)
			return 0;
		if (i == o)
			return j;
		for (int j2 = 0; j2 < arr.length; j2++) {

			String q = i + "" + arr[j2];
			for (int k = 0; k < no.length; k++) {

				for (int k2 = 0; k2 < arr.length; k2++) {
					int w = 0;
					switch (arr[k]) {
					case 1:
						w = Integer.parseInt(q) + arr[k2];
						break;
					case 2:
						w = Integer.parseInt(q) - arr[k2];
						break;
					case 3:
						w = Integer.parseInt(q) * arr[k2];
						break;
					case 4:
						if (arr[k2] != 0)
							w = Integer.parseInt(q) / arr[k2];
						break;
					}
					output(arr, no, m, o, w, j+3);
				}
			}
		}

		return null;
	}

}
