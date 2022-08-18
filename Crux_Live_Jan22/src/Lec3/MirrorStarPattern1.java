package Lec3;

import java.util.Scanner;

public class MirrorStarPattern1 {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row = 1;
	        int star = 1;
	        int space = n/2;//intial number of spaces should be n/2
	        while(row<=n)
	        {
	            int i = 1;
	            while(i<=space)
	            {
	                System.out.print("\t");
	                i = i+1;
	            }
	            int j = 1;
	            
	            while(j<=star)
	            {
	                System.out.print("*"+"\t");
	                j = j+1;
	            }
	                if(row<=n/2)
	                {
	                    star = star+2;
	                    row = row+1;
	                    space = space-1;
	                }
	                else
	                {
	                    star = star-2;
	                    row = row+1;
	                    space = space+1;
	                }
	                System.out.println();
	        }
	    }
	}