import java.util.Scanner;

public class PresentLena {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i <=2*n+1; i++) {
			if (i < n + 1) {
				int r=1;
				for (int j = i; j <n; j++) {
					System.out.println(" ");
				}
				for (int j = 0; j < r; j++) {
					System.out.println();
				}
			}

		}
	}

}
