import java.util.Scanner;

public class DZYLovesChessboard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int j = scan.nextInt();
		Character arr[][] = new Character[m][j];
		for (int i = 0; i < m; i++) {
			String r = scan.next();
			for (int k = 0; k < j; k++) {
				if (r.charAt(k) == '.') {
					if (((i + k) & 1) == 0) {
						arr[i][k] = 'B';
					} else
						arr[i][k] = 'W';
				} else {
					arr[i][k] = r.charAt(k);
				}

			}}
			System.out.println();
			StringBuilder rb = new StringBuilder("");
			for (int k = 0; k < m; k++) {
				for (int k2 = 0; k2 < j; k2++) {
					rb.append(arr[k][k2]);
				}
				System.out.println(rb.toString().trim());
				rb = new StringBuilder("");
			
		}
	}
}
