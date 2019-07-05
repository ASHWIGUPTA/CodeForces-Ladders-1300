import java.util.Scanner;

public class PresentFromLena {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = n;
		int o = 0;
		for (int i = 0; i < 2 * n + 1; i++) {
 
			if (i < n + 1) {
				int k = r;
 
				for (int j = 0; j < k; j++) {
					System.out.print("  ");
				}
				int c = 0;
				for (int j = k; j <= n; j++) {
					System.out.print(c++);
					if(j<n)
						System.out.print(" ");	
				
				}
				c--;
				if(k<n)
					System.out.print(" ");
				for (int j = k; j < n; j++) {
					c--;
					System.out.print((c) );
					if(j<n-1)
					System.out.print(" ");
				}
				r--;
				
				System.out.println();
			} else {
				int k = ++o;
				// System.out.println(k+" kk");
				for (int j = 0; j < k; j++) {
					System.out.print("  ");
				}
				int z = 2 * n + 1 - i;
				int c = 0;
				for (int j = 0; j < z; j++) {
					System.out.print(c++ );
					if(j<z-1)
						System.out.print(" ");	
				
				}
				c--;
				if(z-1>0)
					System.out.print(" ");
				for (int j = 0; j < z-1; j++) {
					c--;
					System.out.print((c));
					if(j<z-2)
						System.out.print(" ");	
				}
				System.out.println();
			}
 
		}
	}
}