import java.util.Scanner;

public class LightsOut {
public static void main(String[] args) {
	int a[][]=new int [3][3];
	Scanner scan = new Scanner(System.in);
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			a[i][j]=scan.nextInt()%2;
		}
	}
	System.out.println(((a[0][0]+a[0][1]+a[1][0])%2==0?1:0)+ ""+((a[0][0]+a[0][1]+a[0][2]+a[1][1])%2==0?1:0)+""+((a[0][2]+a[0][1]+a[1][2])%2==0?1:0));
	System.out.println(((a[1][1]+a[0][0]+a[1][0]+a[2][0])%2==0?1:0)+ ""+((a[1][1]+a[0][1]+a[1][2]+a[1][0]+a[2][1])%2==0?1:0)+""+((a[0][2]+a[1][1]+a[1][2]+a[2][2])%2==0?1:0));
	System.out.println(((a[2][0]+a[2][1]+a[1][0])%2==0?1:0)+ ""+((a[2][0]+a[2][1]+a[2][2]+a[1][1])%2==0?1:0)+""+((a[2][2]+a[2][1]+a[1][2])%2==0?1:0));

}
}