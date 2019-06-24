import java.util.Scanner;

public class BicycleChain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int j[] = new int[b];

		for (int i = 0; i < j.length; i++) {
			j[i] = scan.nextInt();
		}
		int w = scan.nextInt();
		int e[] = new int[w];
		for (int i = 0; i < e.length; i++) {
			e[i] = scan.nextInt();
		}
		int max = 0;
		int c = 0;
		for (int i = 0; i < e.length; i++) {
			for (int k = 0; k < j.length; k++) {

				if (e[i] % j[k] == 0 && (e[i] / j[k] > max)) {
					max = e[i] / j[k];
					c = 1;
				} else if (e[i] % j[k] == 0 && e[i] / j[k] == max) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}