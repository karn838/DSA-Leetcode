package Lec5;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
        int M = sc.nextInt();
        int N = sc.nextInt();
        int total_ayush = 0;
        int total_harshit = 0;
        int count = 1;
        while(true)
        {
        	total_ayush+=count;
        	if(total_ayush>M)
        	{
        		System.out.println("Harshit");
        		break;
        	}
        		count++;
        		total_harshit+=count;
        		if(total_harshit>N)
        		{
        			System.out.println("Aayush");
        			break;
        		}
        		count++;
        	}
        	
        

}}}
