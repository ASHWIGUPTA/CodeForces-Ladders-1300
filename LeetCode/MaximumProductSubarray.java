package LeetCode;

public class MaximumProductSubarray {
public static void main(String[] args) {
   int []arr= {2,3,-2,4};
	int min=Integer.MIN_VALUE;
int pro =arr[0];
if(arr.length==1)
   // return arr[0];
     System.out.println(arr[0]);
int re=1;
for (int i = 1; i < arr.length; i++) {
	int temp =pro*arr[i];
if(temp>arr[i]) {
	pro+=temp;
	if(min<pro) {
		min=pro;
	}
}else {
	pro=temp*re;
if(pro>min) {
	min=pro;
}else {
	re=temp;
	pro=arr[i];
}
	
}

}
System.out.println(min);
}
}
