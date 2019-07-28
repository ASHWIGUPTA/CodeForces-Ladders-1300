import java.util.Scanner;

public class IncAndDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			s += arr[i];
		}
		if(s%n==0) {
			System.out.println(n);
		} else {
			System.out.println(n-1);
		}

	}
}
