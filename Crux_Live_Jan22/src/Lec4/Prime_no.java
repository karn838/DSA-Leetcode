package Lec4;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			int fact = 0;
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				fact++;
		}}
			if(fact>=1)
			{
				System.out.println("Not Prime");
			}
			else
			{
				System.out.println("Prime");
			}




	  }}


