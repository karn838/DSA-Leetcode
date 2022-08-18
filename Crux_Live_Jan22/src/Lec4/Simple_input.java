package Lec4;

import java.util.Scanner;

public class Simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		while(true) {
			 n = sc.nextInt();
			sum = sum+1;
			
			if(sum<0) {
				 System.out.println(n);
			}
			else{
				break;
		}
				
     
	}

	}}
