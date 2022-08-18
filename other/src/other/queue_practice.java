package other;

public class queue_practice {

	private int []data;
	private int front=0;
	private int size=0;
	
	public queue_practice() {
		this.data = new int[5];
	}
	public queue_practice(int cap)
	{
		this.data = new int[cap];
	}
	public boolean isEmpty()
	{
		return this.front==0;
	}
	public boolean isFull()
	{
		return this.front ==this.data.length;
	}
	public void Enqueue(int item) throws Exception
	{
		if(isFull()) {
			throw new Exception("queue full hai");
		}
		int i = (this.size+this.front)%this.data.length;
		this.data[i]=item;
		size++;
	}
	public int dequeue() throws Exception
	{
		if(isFull())
		{
			throw new Exception("queue khaali nhi hai");
		}
		int rv = this.data[this.front];
		this.front = (this.front+1)%this.data.length;
		size--;
		return rv;
		
	}
	public int getfront() throws Exception {
		if(isFull())
		{
			throw new Exception("queue khaali nhi hai");
		}
		return this.data[this.front];
		
	}
	public int size()
	{
		return this.size;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			int idx = (this.front+i)%this.data.length;
			System.out.print(this.data[idx]);
		}
		System.out.println();
	}
}
