import java.util.Scanner;

public class VasilyTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		int p = (Math.abs(x) + Math.abs(y));
		if (x > 0 && y > 0)
			System.out.println("0 " + p + " " + p+" "+0);
		else if (x < 0 && y >= 0)
			System.out.println(-p + " 0 0 " + p);
		else if (x >= 0 && y < 0)
			System.out.println("0 " + (-p) + " " + p + " 0");
		else
			System.out.println(-p + " 0 0 " + -p);

}
}
