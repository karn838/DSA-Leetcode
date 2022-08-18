package Lec2;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int row = 1;
		int space  = n-1;
		int l = 1;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i = i+1;
			}
			int j =1;
			int k=(2*l)-1;
			while(j<=k)
			{
				System.out.print("1"+" ");
				j = j+1;
			}
			
			int m = 1;
			while(m<=space)
			{
				System.out.print("  ");
				m = m+1;
			}
			row = row+1;
			l = l+1;
			space = space-1;
			System.out.println();
			sc.close();
			
		}

	}

}
