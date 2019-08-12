import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeorgeJob {
	static long d[][];

	public static void main(String[] args) throws IOException {
		//Reader scan = new Reader();
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[] r=br.readLine().split(" ");
		int n = Integer.parseInt(r[0]);
		int m = Integer.parseInt(r[1]);
		int k = Integer.parseInt(r[2]);
		d = new long[5005][5005];
		int a[] = new int[n];
		r=br.readLine().split(" ");
		long s[] = new long[5005];
		long sum = 0;
		for (int i = 1; i <=n; i++) {
			
			s[i] =Integer.parseInt(r[i-1]);
			s[i]+=s[i-1];
		}
	
int i,j;

for(i=1;i<=k;i++)
	for(j=m;j<=n;j++)
		d[i][j]=d[i][j-1]>(d[i-1][j-m]+s[j]-s[j-m])?d[i][j-1]:(d[i-1][j-m]+s[j]-s[j-m]);
System.out.println(d[k][n]);
	}
	/*	long s[] = new long[n - m + 1];
		s[0]=sum;
		
		for (int i = m; i < n; i++) {
			a[i] =Integer.parseInt(r[i]);
			s[i-m+1] = s[i - m] + a[i] - a[i-m];
		}
			
		System.out.println(call(s, m, 0, k, n));
	}


	private static long call(long[] s, int m, int i, int k, int n) {
		// TODO Auto-generated method stub
		if (k == 0 || s.length< i||m*k>(n-i))
			return 0;

		else {
			//System.out.println(k+" "+i+" "+m*k);
			
			long p = 0;
			if(i+m<=n) {
			
				if (g[i + m][k-1] != 0)
				p = s[i] + g[i + m][k-1];
			else {
			p=s[i]+(g[i + m][k-1] = call(s, m, i + m, k - 1, n));
				//p = s[i] + g[i + m][k-1];
			}}
			if(k==2500) {
				
			}
		//	System.out.println("yes");
			long w = 0;
			if(i+1<=n) {
			if (g[i + 1][k] != 0)
				w = g[i + 1][k];
			else {
				w= g[i + 1][k] = call(s, m, i + 1, k, n);
				// w=g[i+1][k];
			}
			return p> w?p:w;
			}return 0;
			}

		// return 0;
	}
	

*/	
}