package other;

public class queue_practice_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue_practice q = new queue_practice();
			{
			   q.Enqueue(10);
			   q.Enqueue(20);
			   q.Enqueue(30);
			   q.Enqueue(40);
			   q.dequeue();
			   q.dequeue();
			   q.display();
			   q.Enqueue(50);
			   q.Enqueue(60);
			   q.Enqueue(70);
			   q.display();
			}

	}

}
