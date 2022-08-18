package Lec18;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Short s1 = 78;
		//Byte b1 = 19;
		System.out.println(s1);
		//System.out.println(b1);
		a = a1;   //autoboxing :- when we put primitive to corresponding wrapper class 
		System.out.println(a);
		Integer ii = 100;
		int i = 10;
		i = ii;// un boxing :- when we out wrapper class to its correspondiong primitive class
		System.out.println(i);
		
		//important
		Integer b1 = 19;
		Integer b2 = 19;
		System.out.println(b1 == b2);//integer cache ki wajah se true aaega duplicate create nhi krega
		Integer c1 = 190;
		Integer c2 = 190;
		System.out.println(c1 == c2);//range exceed ho jaega is liye equal nhi hoga -128 to 127
		// Integer,long,short,byte me dublicate create nhi hoga inke liye range fix hota hai -128 to 127
		long l1 = 127l;
		long l2 = 127l;
		System.out.println(l1 == l2);
				
	}

}
