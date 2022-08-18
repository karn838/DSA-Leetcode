package Lec17;

import java.util.Scanner;

public class book_allocation_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int[] pages = new int[nob];
			for(int i=0;i<pages.length;i++)
			{
				pages[i]=sc.nextInt();
			}
		System.out.println(maximumbookread(pages,nos));
		}
	}
public static int maximumbookread(int[]pages,int nos)
{
	int lo=0;
	int hi=0;
	for(int i=0;i<pages.length;i++)
	{
		hi = hi+pages[i];
	}
	int ans =0;
	while(lo<=hi)
	{	int mid = (lo+hi)/2;
		if(isitpossible(pages,mid,nos)==true) {
		ans = mid;
		hi = mid-1;
	}
	else
	{
		lo = mid+1;
	}}
	return ans;}
public static boolean isitpossible(int[] pages,int mid,int nos)
{
	int student =1;
	int read_page = 0;
	int i = 0;
	while(i<pages.length)
	{	if(read_page+pages[i]<=mid)
	{
		read_page+=pages[i];
		i++;
	}
	else {
		student++;
		read_page = 0;
	}
	
	if(student>nos)
	{
		return false;
	}}
	return true;
}
}
