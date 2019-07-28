import java.util.HashSet;

public class GFG 
{ 
      
static int findLongestConseqSubseq(int arr[], int n) 
{    HashSet<Integer> S = new HashSet<Integer>(); 

    for (int i = 0; i < n; i++) 
        S.add(arr[i]); 
  
    int ans = 0; 
    int c=0;
    for (int i = 0; i < n; i++)  
    { 
  
        if(S.contains(arr[i]))  
        { 
  
            int j = arr[i]; 
  
            while (S.contains(j)) {
                j++;  
                c++;}
  
            ans = Math.max(ans, j - arr[i]);  
        } 
    } 
    System.out.println(c+"-------");
    return ans; 
} 
  
public static void main(String[] args)  
{ 
    int arr[] = {1, 94, 93, 1000, 5, 92, 78}; 
    int n = arr.length; 
        System.out.println(findLongestConseqSubseq(arr, n)); 
} 
} 