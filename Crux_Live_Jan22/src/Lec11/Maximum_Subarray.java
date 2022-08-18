package Lec11;
import java.util.*;
public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	  System.out.print(maximumsubarray(arr));
	    }
	public static int maximumsubarray(int[] arr)
	{   int ans=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++)
	    {
	        int prev_sum=0;
	        
	            for(int j=i;j<arr.length;j++)
	            {
	                prev_sum+=arr[j];
	                ans=Math.max(ans,prev_sum);
	            } 
	        
	    }
	    return ans;
	}
	}
