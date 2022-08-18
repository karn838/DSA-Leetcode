package Lec39;
import Lec38.dynamic_queue;
public class queue_reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue dq = new dynamic_queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		reverse(dq);
		dq.Display();
	}
	public static void reverse(dynamic_queue dq) throws Exception{
		if(dq.isEmpty())
		{
			return;
		}
		int x = dq.dequeue();
		reverse(dq);
		dq.Enqueue(x);
	}

}
