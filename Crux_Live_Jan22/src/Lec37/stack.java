package Lec37;

public class stack {
	protected int[]data;
	protected int top=0;
	 public stack() {
		 this.data = new int[5];
	 }
	public stack(int cap) {
	 this.data=new int[cap];
	 }
	 public boolean isEmpty() {
		 return top==0;
	 }
	 public boolean isfull() {
		 return top==this.data.length;
	 }
	 public void push(int item) throws Exception {
		 if(isfull()) {
			 throw new Exception("sun be stack full hogya");
		 }
		 this.data[this.top]=item;
		 this.top++;
	 }
	 public int pop() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("sun be stack empty hai");
		 }
		 this.top--;
		 return this.data[this.top];
	 }
	 public int peak() throws Exception {
		 if(isEmpty()) {
			 throw new Exception("sun be stack empty hai");
		 }
		 return this.data[this.top-1];
	 }
	 public int size() {
		 return this.top;
	 }
	 public void Display() {
		 for(int i=0;i<top;i++) {
			 System.out.print(this.data[i]+" ");
		 }
		 System.out.println();
	 }
}
