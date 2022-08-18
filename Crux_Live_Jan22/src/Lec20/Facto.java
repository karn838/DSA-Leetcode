package Lec20;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fact(n));}
public static int fact(int n) {
	if(n==0)//base case (smaller problem)
	{
		return 1;
	}
	int fn = fact(n-1);//recursion used to solve base smaller problem
	return fn*n;//smaller problem +self work = bigger problem

}
}
