package LeetCode;

public class Histogram {
public static void main(String[] args) {
	int a[]= {2,1,5,6,2,3};
	System.out.println(largestRectangleArea(a));
}


public static int largestRectangleArea(int[] heights) {
    if(heights.length == 0)
        return 0;
    //求每一个柱子的左边第一个小的柱子的下标
    int [] leftLessMin = new int[heights.length];
    leftLessMin[0] = -1;
    for(int i = 1; i < heights.length;i++){
        int l = i-1;
        while(l >=0 && heights[l] >= heights[i]){
            l = leftLessMin[l];
        }
        leftLessMin[i]=l;
    }
    System.out.println();
    for (int i = 0; i < leftLessMin.length; i++) {
		System.out.print(heights[i]+" ");
	}
    System.out.println();
    for (int i = 0; i < leftLessMin.length; i++) {
		System.out.print(leftLessMin[i]+" ");
	}
    //求每一个柱子的右边第一个小的柱子的下标
    int [] rightLessMin = new int[heights.length];
    rightLessMin[heights.length-1] =heights.length;
    for(int i = heights.length-2; i>=0;i--){
        int r = i+1;
        while(r <=heights.length-1 && heights[r] >= heights[i]){
            r = rightLessMin[r];
        }
        rightLessMin[i]=r;
    }
    System.out.println();
    for (int i = 0; i < leftLessMin.length; i++) {
		System.out.print(rightLessMin[i]+" ");
	}
    
    //求包含每个柱子的矩形区域的最大面积，选出最大的
    int maxArea = 0;
    for(int i = 0; i < heights.length;i++){
        int area = (rightLessMin[i]-leftLessMin[i]-1)*heights[i];
        maxArea = Math.max(area,maxArea);
    }
    return maxArea;
}}