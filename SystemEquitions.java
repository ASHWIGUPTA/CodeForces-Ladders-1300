import java.util.Scanner;

public class SystemEquitions {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();	
	int m=in.nextInt();	
	int answer=0;
	for (int a = 0; a * a <= n && a <= m; ++a)
    {
        int b = n - a * a;
        if (a + b * b == m)
        {
            answer += 1;
        }
    }
	System.out.println(answer);
}

}
