package Lec38;

public class method_overloading {
   public static void main(String[] args) {
	System.out.println(add(2,4));
	System.out.println(add(2,4,9));
	System.out.println(add(2,4,7.9));
	System.out.println(add(2,4,3,5,6,8,8));
}
   public static int add(int a,int b) {
	   return a+b;
   }
   public static int add(int a,int b,int c) {
	   return a+b+c;
   }
   public static int add(int a,int b,double c) {
	   return(int)(a+b+c);
   }
   public static int add(int ...a) //for variable nos. of argument
   {
	   int sum=0;
	   for(int i=0;i<a.length;i++) {
	   sum = sum+a[i];}
	   return sum;
   }
}
