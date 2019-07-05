import java.util.Arrays;
import java.util.Scanner;

public class FootballCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String r = scan.next();
		char t = r.charAt(0);
		int j = 1;
		int i;
		for (i = 1; i < r.length(); i++) {
			if (t == r.charAt(i)) {
				j++;

				if (j == 7) {
					System.out.println("YES");
					// break;
					return;
				}
			} else {
				j = 1;
				t = r.charAt(i);
			}

		}

		System.out.println("NO");
	}
}
