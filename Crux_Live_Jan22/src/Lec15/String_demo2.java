package Lec15;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "hello";
		String st = new String("hello");
		String st1 = new String("hello");
		System.out.println(st1==st); //== double equal address compare karta hai
		System.out.println(st1.equals(st)); //.equals value compare karta hai
		System.out.println(str.equals(str1));//because dono string pool me bn rahe hai to address or value dono same hoga
	}

}
