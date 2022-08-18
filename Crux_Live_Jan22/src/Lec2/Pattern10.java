package Lec2;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i = i+1;
			}
			int j = 1;
			int k = 2*n-1;
			while(j<=k)
			{
				System.out.print("*"+" ");
				j=j+1;
			}
			space = space+1;
			n = n-1;
			System.out.println();
			sc.close();
		}

	}

}
