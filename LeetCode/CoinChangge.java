package LeetCode;

public class CoinChangge {
public static void main(String[] args) {
	int arr[]= {2,5,10,1};
	System.out.println(call(arr,27));
}

private static int call(int[] arr, int i) {
	// TODO Auto-generated method stub
	int ar[]=new int[i+1];
	for (int j = 1; j < ar.length; j++) {
		ar[j]=Integer.MAX_VALUE-1;
	}

	//  for (int j = 0; j < ar.length; j++) { System.out.print(ar[j]+" "); }
	 
	ar[0]=0;
	for (int j = 0; j < arr.length; j++) {
		for (int j2 = 1; j2 <=i; j2++) {
			if(j2>=arr[j]) {
				if(ar[j2-arr[j]]+1 <ar[j2]) {
					ar[j2]=ar[j2-arr[j]]+1;
				}
			}
		}
	}
		
		
	//	  for (int j = 0; j < ar.length; j++) { System.out.print(ar[j]+" "); }
	
	
//	  for (int j = 0; j < ar.length; j++) { System.out.print(ar[j]+" "); }
	  
return ar[ar.length-1]>=2147483647?-1:(ar[ar.length-1]<0) ?-1:ar[ar.length-1];
	  
//	return ar[ar.length-1];
}
}
