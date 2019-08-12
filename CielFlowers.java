import java.util.Scanner;

public class CielFlowers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	String a = scan.next();
		int r = scan.nextInt();
		int g = scan.nextInt();
		int w = scan.nextInt();
		int c = 0;
		boolean flag = false;
		if (r == 0 || g == 0 || w == 0)
			flag = true;
		if (r > 0 && r >= 3) {
			c += r / 3;
			r = r % 3;
		}
		if (g > 0 && g >= 3) {
			c += g / 3;
			g = g % 3;
		}
		if (w > 0 && w >= 3) {
			c += w / 3;
			w = w % 3;
		}
		if ((w + g == 4 && r == 0) || (w + r == 4 && g == 0) || (r + g == 4 && w == 0))
			if (!flag)
				c++;

		int min = r < g ? r < w ? r : w : g < w ? g : w;
		System.out.println(min + c);
	}
}