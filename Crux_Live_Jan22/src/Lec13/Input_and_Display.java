package Lec13;

import java.util.Scanner;

public class Input_and_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr= new int[n][m];
		//System.out.println(arr[2][2]);
		//take input
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[0].length;j++)
		{
		arr[i][j]=sc.nextInt();	
		}
		}
		//print
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[0].length;j++)
		{
	     System.out.print(arr[i][j]);	
		}
		System.out.println();
		}
		
	}

}
