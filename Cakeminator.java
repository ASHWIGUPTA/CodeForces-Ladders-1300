import java.util.Scanner;

public class Cakeminator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int j=scan.nextInt();
		int ar[][]=new int[a][j];
		for (int i = 0; i < a; i++) {
		String r=scan.next();
			for (int k = 0; k <j; k++) {
				ar[i][k]=r.charAt(k);
			}
		}
		int c=0;
		for (int i = 0; i < ar.length; i++) {
			int k;
			boolean flag=true;
			for ( k = 0; k < j; k++) {
				if(ar[i][k]==83)
				{
					flag=false;
					break;
				}
			}
			if(flag) {
				for ( k = 0; k <j; k++) {
					ar[i][k]=1;
					c++;
				}	
			}
		}
		
		
		for (int i = 0; i < j; i++) {
			int k;
			boolean flag=true;
			for ( k = 0; k < ar.length; k++) {
				if(ar[k][i]==83)
				{
					flag=false;
					break;
				}
			}
			if(flag) {
				for ( k = 0; k <ar.length; k++) {
					if(ar[k][i]!=1)
						c++;
				}	
			}
		}
		System.out.println(c);
		
	}
}
