package Lec14;

import java.util.Scanner;

public class Spiral_print_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][]arr = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		spiral(arr);
	}
public static void spiral(int[][]arr)
{
	int minr=0;
	int maxr=arr.length-1;
	int minc = 0;
	int maxc=arr[0].length-1;
	int total=arr.length*arr[0].length;
	int count=0;
	while(count<total) {
	for(int i=minc;i<=maxc && count<total;i++)
	{
		System.out.print(arr[minr][i]);
		count++;
	}
	minr++;
	for(int i=minr;i<=maxr && count<total;i++)
	{
		System.out.print(arr[i][maxc]);
		count++;
	}
	maxc--;
	for(int i=maxc;i>=minc && count<total;i--)
	{
		System.out.print(arr[maxr][i]);
		count++;
	}
	maxr--;
	for(int i=maxr;i>=minr && count<total;i--)
	{
		System.out.print(arr[i][minc]);
		count++;
	}
	minc++;
}
}}
