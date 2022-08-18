package Lec5;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long i=1;
		long sum=0;
		while(num!=0) {
			long rem=num%10;
			sum+=i*rem;
			i*=2;
			num=num/10;
		}
		System.out.println(sum);
				

	}

}
