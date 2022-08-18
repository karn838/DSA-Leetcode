package Lec4;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n!=0) {
			int digit = n%10;
			ans = ans*10+digit;
			n/=10;
		}
        System.out.println(ans);
	}

}
