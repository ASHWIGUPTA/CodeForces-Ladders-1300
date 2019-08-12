package LeetCode;

import java.util.Arrays;

public class CountBits {
public static void main(String[] args) {
	
	int a[]=countBit(8);
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
	Arrays.sort(a);
}
}

private static int[] countBit(int i) {
	int a[]=new int [i+1];
	if(i>1) {
	a[0]=0;
	a[1]=1;}
	int p=0;
	for (int j = 2; j < a.length; j++) {
		if(isPowerOfTwo(j))
			{a[j]=1;
			p=j;}
		else {
			a[j]=1+a[j-p];
	//	System.out.println(a[j-p]+" "+p);
		}
	}
	return a;
}
static boolean isPowerOfTwo(int n) 
{ 
    if(n==0) 
    return false; 
  
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
} 
}
 