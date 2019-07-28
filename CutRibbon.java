import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
public static void main(String[] args) {
	Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	 
	 
    int n = input.nextInt();
    int maxc [] =new int[4001];  
    Arrays.fill(maxc, Integer.MIN_VALUE);

    int abc[] = new int[3];
    for (int i = 0; i < 3; i++) {
        abc[i] = input.nextInt();
    }
    Arrays.sort(abc);
    maxc[0]=0;
    maxc[abc[0]]=1;
    maxc[abc[1]]=1;
    maxc[abc[2]]=1;
    for (int i = 1; i <=n; i++) {
        for (int j = 0; j < 3; j++) {
            if(abc[j] > i )
                break;
            maxc[i]=Math.max(maxc[i], maxc[i-abc[j]]+1);

        }

    }

    System.out.println(maxc[n]);


}
}
