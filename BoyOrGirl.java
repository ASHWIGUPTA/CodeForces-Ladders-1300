import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String p = scan.next();
		HashSet b = new HashSet();
		for (int i = 0; i < p.length(); i++) {
			b.add(p.charAt(i));
		}
		if (b.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
	}
}
