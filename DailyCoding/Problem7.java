package DailyCoding;

public class Problem7 {
	public static void main(String[] args) {
		String r = "111";
		int c = 0;
		for (int i = 0; i < args.length; i++) {
			c++;
			if (i < r.length() - 1 && Integer.parseInt(r.substring(i, i + 2)) < 26) {
				c++;
			}
			if (i > 0 && Integer.parseInt(r.substring(i - 1, i + 1)) < 26) {
				c++;
			}
		}
	}
}
