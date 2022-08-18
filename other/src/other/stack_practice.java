package other;

public class stack_practice {
	private int[]data;
	private int top=0;
	public stack_practice() {
		this.data = new int[5];
	}
	public boolean isEmpty() {
		return this.top==0;
	}
	public boolean isFull() {
		return this.top==this.data.length;
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("stack full hai be");
		}
		this.data[this.top]=item;
		this.top++;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("sun be stack khaali hai");
		}
		this.top--;
		return this.data[this.top];
	}
	public int peak() throws Exception {
		if(isEmpty()) {
			throw new Exception("sun be stack khaali hai");
		}
		return this.data[this.top-1];
	}
	public int size() {
		return this.top;
	}
	public void display() {
		for(int i=0;i<top;i++)
		{
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}