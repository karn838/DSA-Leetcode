package Lec3;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int row = 1;
		int star = 1;
		int val =1;
		int space = n-1;
		while(row<=2*n-1)
		{
			int i = 1;
			while(i<=space)
			{
				System.out.print("\t");
				i = i+1;
			}
			int j = 1;
			int val1 = val;
			while(j<=star)
			{
				System.out.print(val1+"\t");
				if(j<=star/2)
				{
					val1=val1+1;
				}
				else
				{
					val1 = val1-1;
				}
				j = j+1;
			}   if(row<n){
				star = star+2;
				space = space-1;
				val=val+1;}
				else
				{
					star = star-2;
			        space = space+1;
			        val = val-1;
				}
				
				row = row+1;
				System.out.println();
		}
		

	}

}
