package Test;

public class Seive {
public static void main(String[] args) {
int arr []=seive(100);	
int c=0;
for (int i = 2; i < arr.length; i++) {
	if(arr[i]==0) {
		System.out.print(i+",");
c++;
	}
}
System.out.println();
System.out.println(c);
primeFactor(arr,60);
//System.out.println();
//System.out.println(pow(2,10));
}



private static int pow(int i, int j) {
	int mod=1000000007;
	if(j==0)
		return 1;
	if(j==1)
		return i;
	int g=(pow(i,j/2)+mod)%mod;
	if(j%2==0)
	{
		return  (g*g+mod)%mod;
	}
	else {
		return  (g*g*i+mod)%mod;
	}
	}



private static void primeFactor(int[] arr, int i) {
	System.out.println();
	for (int j2 = 2; i>1; j2++) {
		
		if(arr[j2]==0 && i%j2==0  ) {
		int c=0;
		//int h=i;	
		while(i%j2==0) {
				c++;
				i=i/j2;
				}
		System.out.print(j2+"^"+c+" ");			

	}	
}
	}

private static int[] seive(int i) {
	int arr[]=new int[i];
	for (int j = 2; j*j <= i; j++) {
		for (int j2 = j*j; j2 <i; j2=j2+j) {
				arr[j2]=j;
		}
	}
	return arr;
}

}
