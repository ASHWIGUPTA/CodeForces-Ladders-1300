import java.util.Scanner;

public class IntrestingNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(divideBy(n));
	}

	private static int divideBy(int n) {
		int j = n;
		int r = 0;
		while (j != 0) {
			r = r + j % 10;
			j = j / 10;
		}
		return r % 4 == 0 ? n : divideBy(n + 1);

	}
}
