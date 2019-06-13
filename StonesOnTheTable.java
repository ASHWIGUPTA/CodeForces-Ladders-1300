import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		String p = scan.next();
		int c = 0;
		for (int i = 0; i < p.length() - 1; i++) {
				if(p.charAt(i)==p.charAt(i+1)) {
					c++;
				}
		}
		System.out.println(c);
	}
}
