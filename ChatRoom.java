import java.util.LinkedHashSet;
import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String he = "hello";
		LinkedHashSet<Character> a = new LinkedHashSet<Character>();
		String r = "";
		int j = 0;
		for (int i = 0; i < n.length(); i++) {
			if (j >= he.length()) { break; }
			if(he.charAt(j)==n.charAt(i)) {
				j++;
			}
			/*
			 * if (j >= he.length()) { break; } char ja = he.charAt(j); char ia =
			 * n.charAt(i);
			 * 
			 * if (ja == ia) { if (((i < n.length() - 1) && n.charAt(i + 1) != he.charAt(j))
			 * || ((j < he.length() - 1) && (n.charAt(i + 1) == he.charAt(j + 1)))) { j++; }
			 * } else { j = 0; }
			 */}

		if (j == he.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
