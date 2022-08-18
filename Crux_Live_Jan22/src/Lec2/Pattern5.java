package Lec2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    
        int row = 1;
        int star = n;
        int space = 0;
        while(row<=n)
        {
        	int i = 1;
        	while(i<=space)
        	{
        		System.out.print("  ");
        		i = i+1;
        	}
        	int j=1;
        	while(j<=star)
        	{
        		System.out.print("*"+" ");
        		j = j+1;
        	}
        	space = space+1;
        	star = star-1;
        	row = row+1;
        	System.out.println();
        	sc.close();
        }
	}

	}

