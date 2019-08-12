package LeetCode;

import java.util.Scanner;

public class ClimbingStaries {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	 int a[]=new int[n+1];
     for(int i=1;i<=n;i++){
         if(i%2==0)
             a[i]=a[i-1]+2;
         else
             a[i]=a[i-1]+1;
         
     }
     System.out.println(a[n]);
}
}
