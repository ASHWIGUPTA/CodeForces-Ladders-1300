import java.util.Scanner;

public class YoungPhysicist {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int i=scan.nextInt();
int ab[]=new int[3];
for (int j = 0; j < 3*i; j++) {
	ab[j%3]=ab[j%3]+scan.nextInt();
}
if(ab[0]==0 && ab[1]==0 &&ab[2]==0) {
	System.out.println("YES");
}else
{
	System.out.println("NO");
}
}
}
