
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++)
		{
		    int n=Integer.parseInt(br.readLine());
		    String str[]=br.readLine().split(" ");
		    int arr[]=new int[n];
		    for(int k=0;k<n;k++)
		    {
		        arr[k]=Integer.parseInt(str[k]);
		    }
		    Map<Integer,Integer> map=new HashMap<>();
		    int t=-1;
		    for(int j=n-1;j>=0;j--)
		    {
		        
		        if(map.containsKey(arr[j]))
		        {
		           
		            t=j;
		            
		           
		        }
		        else{
		            map.put(arr[j],j);
		        }
		    }
		    if(t>=0)
		    {
		    System.out.println(t+1);
		    }
		    else{
		        System.out.println("-1");
		    }
		}
	}
}