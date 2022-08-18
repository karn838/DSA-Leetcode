package Lec3;

import java.util.Scanner;

public class PascalTriangle {

	    public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
	         int i=0;
	         int k=1;
	         if(n<0 || n>100)
	         { System.out.print("error");
	         }
	         else
	         {
	             while(i<n)
	             {
	                 int j=0;
	                 while(j<=i)
	                 {
	                     if(j==0 || i==0)
	                     { k=1;
	                     }
	                     else
	                     { k=k*(i-j+1)/j;
	                     }
	                     System.out.print(k+"\t");
	                     j++;
	                 }
	                 i++;
	                 System.out.println();
	             }
	         }
	    }
	}
