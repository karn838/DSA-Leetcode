package Lec4;

import java.util.Scanner;

public class Lcm_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int product = (N1*N2);
		if(N1<N2) {
	    
		while(N2%N1!=0)
		{ 
			int rem = N2%N1;
			
			N2  = N1;
			N1 = rem;
		}
       System.out.println(product/N1);
	}

}}

