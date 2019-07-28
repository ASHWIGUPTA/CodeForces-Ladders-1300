package LeetCode;

public class Test {
public static void main(String[] args) {
	System.out.println(myPow(2.1,3));
}
public static double myPow(double x, int n) {
if(n>0) {
	return call(x,n);
}else
	return 1/call(x,n);
   
}
private static double call(double x, int n) {
	// TODO Auto-generated method stub
if(n==0)
	return 1;
if(n==1)
	return x;
double temp=call(x,n/2);
if(n%2==0)
	return temp*temp;
else
	return temp*temp*x;
}
}
