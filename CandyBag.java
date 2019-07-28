import java.util.Scanner;

public class CandyBag {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int s = a * a;
		int f = 1;
		StringBuilder r = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a/2; j++) {
				r.append(f + " " + s + " ");
				s--;
				f++;
			}
			System.out.println(r.toString().trim());
			r = new StringBuilder();
		}
	}
}
