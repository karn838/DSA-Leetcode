package Lec4;

import java.util.Scanner;

public class Counts_digit {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int digit = sc.nextInt();
		int count = 0;
		while(number>0)
		{
			int dig = number%10;
			if(dig == digit)
			{
				count++;
			}
			number/=10;
		}
		System.out.println(count);
	}

}

    	