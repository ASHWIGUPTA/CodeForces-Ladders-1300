import java.util.Scanner;

public class LittleElephantRozdil {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int min=Integer.MAX_VALUE;
	int c=0,j=-1;
	for (int i = 0; i < n; i++) {
		int r=scan.nextInt();
		if(r<min) {
			min=r;
			c=1;
			j=i;
		}
		else if(r==min) {
			c++;
		}
	}
	if(c>1) {
		System.out.println("Still Rozdil");
	}else {
		System.out.println(j+1);
	}
	
}
}
