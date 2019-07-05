import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseshoe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = 3;
		int arr[] = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				r--;
			}
		}
		System.out.println(r);

	}
}
