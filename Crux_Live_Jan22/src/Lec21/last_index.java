package Lec21;
import java.util.*;
public class last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[]arr = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int item = sc.nextInt();
	        int i=arr.length-1;
	        firstoccurence(arr,item,i);
	    }
	  public static void firstoccurence(int[]arr,int item,int i)
	     {
	    	 if(i<0) {
	    		 return ;
	    	 }
	    	 if(arr[i]==item) {
	    		 System.out.println(i+"");
	    		 return;
	    	 }
	    	 firstoccurence(arr,item,i-1);
	     }
	}
	
