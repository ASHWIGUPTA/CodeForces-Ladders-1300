package con1181;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChungaChanga {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int y=scan.nextInt();
	int z=scan.nextInt();
	int rx=x%z;
	int ry=y%z;
	int re=0;
	double p=x/z+y/z+(rx+ry)/z;
	int r=Math.min(z-rx, z-ry);
	if(rx!=0 && ry!=0 && rx+ry>=z) {
		re=Math.min(z-rx, z-ry);
	}
	System.out.println(new DecimalFormat("#").format(p)+" "+re);
	}
}
