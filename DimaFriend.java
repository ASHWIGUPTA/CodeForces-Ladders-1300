import java.util.Scanner;

public class DimaFriend {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int ark,top=0,i,temp,s=0;
	ark=scan.nextInt();
	for (i=0;i<ark;i++)
	{temp=scan.nextInt();
		top+=temp;
	}
	top--;
	for (i=1;i<=5;i++)
		if ((top+i)%(ark+1)!=0)
			s++;
	System.out.println(s);
}
}
