import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] p = scan.nextLine().split(" ");
		for (int i = 0; i < p.length; i++) {
			p[i] = p[i].substring(0, 1).toUpperCase() + p[i].substring(1);
			System.out.println(p[i] + " ");
		}

	}
}
