package Lec4;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n = 1;
		for(int i=1;i<=n1;)
		{
			if((3*n+2)%n2!=0)
			{
				System.out.println(3*n+2);
			     i++;
			}
		n++;
		}
      
	}

}
