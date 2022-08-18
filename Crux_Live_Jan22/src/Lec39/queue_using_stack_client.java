package Lec39;

public class queue_using_stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue_using_stack qs = new queue_using_stack();
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		System.out.println(qs.dequeue());
		System.out.println(qs.getFront());
	}

}
