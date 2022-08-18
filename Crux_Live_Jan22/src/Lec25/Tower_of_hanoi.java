package Lec25;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printstep(n,"A","B","C");
	}

	public static void printstep(int n, String s, String h,String d) {
		// TODO Auto-generated method stub
		//s-->source h-->helper d-->destination
	if(n==0)
	{
		return ;
	}
	printstep(n-1,s,d,h);
	System.out.println("Move "+n+"th from "+s+" to "+d);
	printstep(n-1,h,s,d);
	}

}
