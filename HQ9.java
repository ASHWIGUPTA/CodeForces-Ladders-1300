import java.util.Scanner;

public class HQ9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		if (a.contains("H") || a.contains("Q") || a.contains("9") ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
