import java.util.Scanner;

public class PashmakGarden {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
int x3,x4,y3,y4;
		if(x1 == x2){
			int l = (y2 > y1 ? y2 - y1 : y1 - y2);
			y3 = y1;
			x3 = x1 + l;
			y4 = y2;
			x4 = x2 + l;
		}
		else if(y1 == y2){
			int l = (x2 > x1 ? x2 - x1 : x1 - x2);
			x3 = x1;
			y3 = y1 + l;
			x4 = x2;
			y4 = y2 + l;
		}
		else{
			if(Math.abs(x1 - x2) != Math.abs(y1 - y2)){
				
				System.out.println(-1);
				return ;
			}
			else{
				x3 = x2;
				y3 = y1;
				x4 = x1;
				y4 = y2;
			}
		}System.out.println(x3+" "+y3+" "+x4+" "+y4);
		

	}
}
