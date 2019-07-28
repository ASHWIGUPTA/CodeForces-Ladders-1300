import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int c = 0, min = scan.nextInt();
		int max = min;

		for (int i = 1; i < a; i++) {
			int r = scan.nextInt();
			if (r < min) {
				c++;
				min = r;
			} else if (r > max) {
				c++;
				max = r;
			}
		}
		System.out.println(c);
	}
}
