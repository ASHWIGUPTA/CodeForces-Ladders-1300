import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Books {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] r = br.readLine().split(" ");
		int n = Integer.parseInt(r[0]);
		int m = Integer.parseInt(r[1]);
		int a[] = new int[n];
		r = br.readLine().split(" ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(r[i]);
		}
		Arrays.parallelSort(a);
		int i=0;
		for ( i = 0; i < a.length; i++) {
			if(m>a[i])
				m-=a[i];
			else if(m==a[i])
				{//i++;
				break;}
			else
				break;
	System.out.println(i+"--");
		}
		System.out.println(i);
	}
}
