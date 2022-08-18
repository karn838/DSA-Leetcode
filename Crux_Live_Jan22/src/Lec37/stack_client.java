package Lec37;

public class stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		s.Display();
		System.out.println(s.peak());
		s.push(60);
		s.Display();
		//s.push(70);
	}

}
