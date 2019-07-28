import java.util.Scanner;

public class FancyFence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();

			if (a < 59) {
				System.out.println("NO");
			} else
				System.out.println("YES");
		}
	}
}
