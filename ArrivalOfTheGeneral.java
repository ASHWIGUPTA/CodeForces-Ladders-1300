import java.util.Scanner;

public class ArrivalOfTheGeneral {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	int min=Integer.MAX_VALUE;
	int mindiff=0;
	int max=Integer.MIN_VALUE;
	int maxdiff=0;
	for (int i = 0; i < t; i++) {
		int j=scan.nextInt();
	if(min>=j) {
		min=j;
		mindiff=i;
	}
	if(max<j) {
		max=j;
		maxdiff=i;
	}
	}
	if(mindiff<=maxdiff) {
		mindiff=t-mindiff+maxdiff-2;
	}else
	{

		mindiff=t-mindiff+maxdiff-1;
	}
	System.out.println(mindiff);
	}
}
