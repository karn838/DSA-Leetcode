package Lec37;

public class queue {
	protected int[] data ;
	protected int front=0;
	protected int size=0; //queue ka size btega
	
	public queue() {
		this.data= new int[5];
	}
	public queue(int cap) {
		this.data = new int[cap];
	}
	public boolean isEmpty() {
		return this.size==0;
	}
	public boolean isFull() {
		return this.size == this.data.length;
	}
	public int size() {
		return this.size;
	}
	public void Enqueue(int item) throws Exception {
		if(isFull()){
			throw new Exception("queue khali hai");
		}
		int i = (this.size+this.front)%this.data.length;
		this.data[i]=item;
		this.size++;
	}
	public int dequeue() throws Exception {
		if(isEmpty()){
			throw new Exception("queue full hai");
		}
		int rv = this.data[this.front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv; 
	}
	public int getfront() throws Exception {
		if(isEmpty()){
			throw new Exception("queue khali hai");
		}
		return this.data[this.front];
	}
	public void Display() {
		for(int i=0;i<this.size;i++) {
			int idx=(this.front+i)%this.data.length;
			System.out.print(this.data[idx]+" ");
		}
		System.out.println();
	}
}
