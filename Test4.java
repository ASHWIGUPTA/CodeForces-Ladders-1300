import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		for (int i=0;i<n;i++) {
			if(check_x(a,x,n,i) && check_y(a,y,n,i)) {
				System.out.println(i+1);
				break;
			}
		}
		
	}
	
	public static boolean check_x(int[] a, int x, int n, int p) {
		boolean k = true;
		int l = p-x>=0?p-x:0;
		for(int i=p;i>=l;i--) {
			if(a[p]>a[i]) {
				return false;
			}
		}
		return k;
	}
	
	public static boolean check_y(int[] a, int x, int n, int p) {
		boolean k = true;
		int l = p+x<n?p+x:n-1;
		for(int i=p;i<=l;i++) {
			if(a[p]>a[i]) {
				return false;
			}
		}
		return k;
	}
}
