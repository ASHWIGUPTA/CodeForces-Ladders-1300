import java.util.Scanner;

public class SerejaBottles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();	
		int a[] = new int[n];
        int b[] = new int[n];
        int open[] = new int[1001];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();

            open[b[i]]++;

        }
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                if (open[a[i]] > 1) {
                    ans--;
                }
            } else {

                if (open[a[i]] > 0) {

                    ans--;
                }
            }
        }
        System.out.println(ans);
	}
}
