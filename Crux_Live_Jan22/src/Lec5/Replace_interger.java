package Lec5;

import java.util.Scanner;

public class Replace_interger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    long n= sc.nextLong();
	    if(n==0){
	        System.out.println(5);

	    }else{
	    long sum=0;
	    long multi = 1;
	    while(n>0){
	        long rem=n%10;
	        if (rem==0){
	            rem=5;
	        }
	        sum+=rem*multi;
	        multi*=10;
	        n/=10;
	    }
	    System.out.println(sum);
	    }
	    }
	}