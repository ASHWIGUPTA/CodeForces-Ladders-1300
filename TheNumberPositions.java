import java.util.Scanner;

public class TheNumberPositions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = scan.nextInt();
		int j = scan.nextInt();
		System.out.println(Math.min(n - i, j + 1));
	}
}
