import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (scan.nextInt() + scan.nextInt() + scan.nextInt() > 1) {
				c++;
			}

		}
		System.out.println(c);
	}
}
