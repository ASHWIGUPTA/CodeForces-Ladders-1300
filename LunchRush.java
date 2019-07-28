import java.util.Scanner;

public class LunchRush {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int y = scan.nextInt();
		int j = 0;
		int r=scan.nextInt();
		int h=scan.nextInt();
		if(h>y)
			j=r-h+y;
		else
			j=r;
		
		for (int i = 1; i < a; i++) {
			int f = scan.nextInt();
			int t = scan.nextInt();
			if (t <= y && j < f) {
				j = f;
			} else if (t > y && j < (f - t + y)) {
				j = f - t + y;

			}
		}
		System.out.println(j);
	}

}
