import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String f=scan.next();
	String p=scan.next();
	String z=scan.next();
	
	p=p+f;
	char y[]=p.toCharArray();
	Arrays.sort(y);
	char zz[]=z.toCharArray();
	Arrays.sort(zz);
	
	if(Arrays.equals(y,zz)) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	}
}
