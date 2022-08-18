package Lec3;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n)
		{
			int i = 1;
			while(i<=space)
			{
				System.out.print("     ");
				i = i+1;
			}
			int j = 1;
			int val = row;
			while(j<=star)
			{
				System.out.print(val+"    ");
				if(j<(star/2)+1)
				{
					val = val+1;
				}
				else
				{
					val = val-1;
				}
				j = j+1;
			}
				star = star+2;
				space = space-1;
				row = row+1;
				System.out.println();
		}
		

	}

}
