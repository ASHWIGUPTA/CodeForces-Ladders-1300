import java.util.Scanner;

public class SoftDrinking {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int l=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int p=scan.nextInt();
		int nl=scan.nextInt();
		int np=scan.nextInt();
		
		int r= k*l/nl;
		int u=c*d;
		int z=p/np;
		System.out.println(Math.min(r, Math.min(u, z))/n);
	}
}
