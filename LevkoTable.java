import java.util.Scanner;

public class LevkoTable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					// System.out.print(k+" ");
					b.append(k + " ");
				else
					// System.out.print(0+" ");
					b.append(0 + " ");
			}
			System.out.println(b.toString().trim());
			b = new StringBuilder();
		}

	}
}
