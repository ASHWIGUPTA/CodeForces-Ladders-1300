import java.util.Scanner;
 
public class TPrimes {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[10000001];
		for(int i=2;i<=1000000;i++)
		{
			a[i]=1;
		}
		for(int i=2;i<=1000;i++)
		{
			for(int j=2*i;j<=1000000;j+=i)
			{
				a[j]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			long b=s.nextLong();
			double x=Math.sqrt(b);
			if(x==(int)x && a[(int)x]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
