import java.util.Scanner;

public class UnluckyTicket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String in = scan.next();
		int j = 2 * a;
		int r = j;
		boolean flag = true;
		if (in.charAt(0) > in.charAt(2 * a - 1)) {
			flag = false;
		}
		//System.out.println(flag);
		
		if (flag) {
			for (int i = 0; i < a; i++, r--) {
				if (in.charAt(i) >= in.charAt(r - 1)) {
					System.out.println("NO");
					return;
				}
			}
		} else {
			for (int i = 0; i < a; i++,r--) {
		//		System.out.println(in.charAt(i)+" "+in.charAt(r-1));
				if (in.charAt(i) <= in.charAt(r - 1)) {
					System.out.println("NO");
					return;

				}
			}
		}
		System.out.println("YES");
	}
}
