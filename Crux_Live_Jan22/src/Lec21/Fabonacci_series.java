package Lec21;

public class Fabonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fabo(n));
	}
public static int fabo(int n)
{
	if (n==0 || n==1) {
		return n;
	}
	int f1=fabo(n-1);
	int f2 =fabo(n-2);
	return f1+f2;
}
}
