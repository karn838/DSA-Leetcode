package Lec20;

public class print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		inc(n);
	}
public static void inc(int n)
{
	if(n==0) {
		return ;
	}
	System.out.println(n);
	inc(n-1);
}
}
