package LeetCode;

public class WaterStore {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9,8,6,7,6,5,4,3,2,1};
int sum=0;
int x[]=new int [arr.length];
int y[]=new int [arr.length];
int min=Integer.MIN_VALUE;
for (int i = y.length-1; i >= 0; i--) {
	if(min<arr[i]) {
		min=arr[i];
	}
	y[i]=min;
	
}
 min=Integer.MIN_VALUE;

for (int i = 0; i <x.length; i++) {
	if(min<arr[i]) {
		min=arr[i];
	}
	x[i]=min;
}


int su=0;
for (int i = 0; i < y.length; i++) {
	su=su-arr[i]+Math.min(x[i], y[i]);
//System.out.println(arr[i]+" x  " +x[i]+" y "+y[i]+" su "+su);
}
System.out.println(su);
		/*
		 * for (int i = 0; i < arr.length; i++) { int t=0; for (int j = i+1; j <
		 * arr.length; j++) { // System.out.println(); if(arr[i]>arr[j]) {
		 * t=t+(arr[i]-arr[j]); }else if(arr[i]<arr[j]) { sum+=t; i=j-1; break; }else {
		 * break; }
		 * 
		 * System.out.println(sum+" t "+t+" i is "+i+" j is "+
		 * j+" arr[i] "+arr[i]+" arr[j] "+arr[j]); } } System.out.println(sum);
		 */}
}
