import java.util.Scanner;

public class LittlePigsWolves {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			String r = scan.next();
			for (int j = 0; j < r.length(); j++) {
				if (r.charAt(j) == '.')
					a[i][j] = -1;
				else if (r.charAt(j) == 'W')
					a[i][j] = 1;
				else
					a[i][j] = 0;

			}
		}
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < a[0].length; j++) {
		 * System.out.print(a[i][j] + " "); } System.out.println(); }
		 */
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 1) {
					if (i - 1 >= 0 && a[i - 1][j] == 0) {
						c++;
						a[i - 1][j] = a[i][j] = -1;
					} else if (j - 1 >= 0 && a[i][j - 1] == 0) {
						c++;
						a[i][j - 1] = a[i][j] = -1;
					} else if (j + 1 < m && a[i][j + 1] == 0) {
						c++;
						a[i][j + 1] = a[i][j] = -1;
					} else if (i + 1 < n && a[i + 1][j] == 0) {
						c++;
						a[i + 1][j] = a[i][j] = -1;
					}

				}
			}
			
		}System.out.println(c);
	}

}
