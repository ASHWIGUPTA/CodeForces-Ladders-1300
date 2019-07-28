import java.util.Scanner;

public class Kitahara {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x1 = scan.nextInt();
int c=0;
int y=0;
for (int i = 0; i < x1; i++) {
	int z=scan.nextInt();
	if(z==100) {
		c++;
	}else
		y++;
	}
if(y%2==0 && c%2!=0)
{System.out.println("NO");
return;
}
else {
System.out.println("YES");

}
}

}
