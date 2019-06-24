import java.util.Scanner;

public class JzzhuAndChildren {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int p = scan.nextInt() / m;
			if (p >= l) {
				l = p;
				y = i;
			}
		}
		System.out.println(y + 1);
	}

}
