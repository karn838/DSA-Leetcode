package Lec5;

import java.util.Scanner;

public class Sum_of_even_and_odd_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oddsum = 0;
		int evensum = 0;
		int num = n;
		int c= 1;
		while(num!=0)
		{
			int rem = num%10;
			if(c%2==0)
			{
				evensum+=rem;
			}
			else
			{
				oddsum+=rem;
			}
			num=num/10;
			c++;
		}
				
            System.out.println(oddsum);
            System.out.println(evensum);
	}

}
