package Lec37;

public class queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue qq = new queue();
		qq.Enqueue(10);
		qq.Enqueue(20);
		qq.Enqueue(30);
		qq.Enqueue(40);
		qq.Display();
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
		qq.Display();
		qq.Enqueue(50);
		qq.Enqueue(60);
		qq.Enqueue(70);
		qq.Display();
	}

}
