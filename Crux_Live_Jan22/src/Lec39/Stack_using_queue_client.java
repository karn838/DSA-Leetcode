package Lec39;

public class Stack_using_queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack_using_queue st = new stack_using_queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peak());
		System.out.println(st.pop());
		System.out.println(st.peak());
	}

}
