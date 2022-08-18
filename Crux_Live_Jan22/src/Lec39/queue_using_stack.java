package Lec39;
import Lec38.dynamic_stack;
public class queue_using_stack {
	private dynamic_stack data;
	
	public queue_using_stack() {
		this.data=new dynamic_stack();
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}
	public void enqueue(int x) throws Exception
	{
		this.data.push(x);
	}
	public int dequeue() throws Exception {
		dynamic_stack temp = new dynamic_stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x = this.data.pop();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
	public int getFront() throws Exception {
		dynamic_stack temp = new dynamic_stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x = this.data.peak();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
}
