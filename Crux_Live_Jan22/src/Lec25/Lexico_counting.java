package Lec25;

public class Lexico_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 1000;
       printcount(0,n);
	}
public static void printcount(int curr,int end)
{
	if(curr>end)
	{
		return;
	}
	System.out.println(curr);
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			printcount(curr*10+i,end);
		}
}
}
