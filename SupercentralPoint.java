import java.util.Scanner;

public class SupercentralPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		int ax[]=new int[a];
		int ay[]=new int[a];
		
		for (int i = 0; i < a; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			ax[i]=x;
			ay[i]=y;
			
			if (x < xmin) {
				xmin = x;
			} else if (x > xmax) {
				xmax = x;
			}
			if (y < ymin) {
				ymin = y;
			} else if (y > ymax) {
				ymax = y;
			}
		}
		System.out.println(xmin+" xmax "+xmax+" ymin "+ymin+" ymax"+ymax);
		
		int c=0;
		for (int i = 0; i < a; i++) {
			if(ax[i]>xmin &&ay[i]>ymin &&ax[i]<xmax &&ay[i]<ymax ) {
				c++;
			}
		}
		System.out.println(c);

	}
}
