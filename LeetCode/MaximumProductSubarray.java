package LeetCode;

public class MaximumProductSubarray {
public static void main(String[] args) {
   int []arr= {-3,0,1,-2};
if(arr.length==0)
	return ;
   
   int min=arr[0];
   int  max=arr[0];
   int p=arr[0];
for (int i = 1; i < arr.length; i++) {
	int x=max;
	 max=Math.max(min*arr[i], Math.max(max*arr[i],arr[i] ));
	min=Math.min(x*arr[i], Math.min(arr[i],min*arr[i] ));
	p=Math.max(p,max);
}
   System.out.println(max);
   System.out.println(p);
}
}
