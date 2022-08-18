package Lec5;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		if(n>='a'&&n<='z')
		{
			System.out.println("lowercase");
		}
		else if(n>='A'&&n<='Z')
		{
			System.out.println("UPPERCASE");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
