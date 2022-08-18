package Lec38;

public class dynamicqueue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue dq = new dynamic_queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.Display();
	}

}
