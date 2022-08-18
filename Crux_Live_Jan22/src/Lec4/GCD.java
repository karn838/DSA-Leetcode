package Lec4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		if(divisor<dividend) {
	    
		while(dividend%divisor!=0)
		{ 
			int rem = dividend%divisor;
			
			dividend  = divisor;
			divisor = rem;
		}
       System.out.println(divisor);
	}

}}
