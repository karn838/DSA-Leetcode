package Lec35;


public class Student_client {
	public static void main(String[] args) {
		Student s = new Student();
		s.name="ramu";
		s.age=90;
		System.out.println(s.name);
		System.out.println(s.age);
	
		Student s1 = new Student();
		s1.name="raj";
		s1.age=20;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s.indroduce_yourself();
		s1.indroduce_yourself();
	}
		
 
}
