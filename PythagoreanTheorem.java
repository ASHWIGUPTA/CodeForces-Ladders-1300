import java.math.BigInteger;
import java.util.Scanner;

public class PythagoreanTheorem {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();	
	long c=0;
	for (int i = 1; i <n; i++) {
		for (int j = i; ((j*j)+(i*i))<=(n*n); j++) {
			int temp=i*i+j*j;
			if(((int)Math.sqrt(temp)*(int)Math.sqrt(temp))==temp)
			{
			
				c++;
			//	System.out.println("i  :"+i+" j: "+j+" temp: "+temp+" "+c);
				
			}
		}
	}
	System.out.println(c);
}
}
