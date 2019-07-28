import java.util.Scanner;

public class FlippingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 0;
		int max = 0;
		int one=0;
		for (int i = 0; i < n; i++) {
			int r = scan.nextInt();
			if (r == 0) {
				j++;
				if (max <= j) {
					max = j;
				}
			} else {
				one++;
				j--;
				if (j < 0) {
					j = 0;
				}
			}

		}
		System.out.println(max>0?max+one:n-1);

	}
}
