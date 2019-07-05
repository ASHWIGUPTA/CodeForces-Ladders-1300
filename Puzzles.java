import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.parallelSort(arr);
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n - s+1; i++) {
			int r = arr[i + s - 1] - arr[i];
		//	System.out.println("sum: "+r);
			if (r < min) {
				min = r;
			}
		}
		if(min==Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(min);
	}

}
