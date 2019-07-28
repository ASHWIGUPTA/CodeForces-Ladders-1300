import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int temp = 0;
		for (int i = 0; i < a; i++) {
			int j = scan.nextInt();
			int k = scan.nextInt();
			temp += k - j;
			if (temp > max) {
				max = temp;
			}

		}
		System.out.println(max);
	}
}
