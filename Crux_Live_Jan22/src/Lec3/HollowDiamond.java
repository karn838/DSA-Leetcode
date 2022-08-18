package Lec3;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int i;
       int j;
       int c1 = (n-1)/2;
       int c2 = 3*n/2-1;
       for(i = 0;i<n;i++)
       {
    	   for(j=0;j<n;j++)
    	   {
    		   if(i+j<=c1||i-j>=c1||j-i>=c1||i+j>=c2)
    		   {
    			   System.out.print("*"+"\t");
    		   }
    		   else
    		   {
    			   System.out.print(" "+"\t");
    		   }
    	   }
    	   System.out.println();
       }}}
       

