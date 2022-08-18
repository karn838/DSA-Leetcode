package Lec4;

import java.util.Scanner;

public class no_of_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			int fact = 0;
		for(int num=2;num<=n;num++)
		{
			boolean isPrime = true;
			for(int i = 2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break;
				}
			}
 
             if(isPrime==true) {
System.out.println(num);
	  }}}}


