package Lec39;

import Lec38.dynamic_queue;
public class stack_using_queue {

	private dynamic_queue data;
	public stack_using_queue() {
		this.data= new dynamic_queue();
	}
   public boolean isEmpty() {
	   return this.data.isEmpty();
   }
   public int size() {
	   return this.data.size();
   }
   public boolean isFull() {
	   return this.data.isFull();
   }
   //complexity o(n)
   public void push(int item) throws Exception {
	   dynamic_queue temp = new dynamic_queue();
	   while(!this.data.isEmpty()) {
		   temp.Enqueue(data.dequeue());
	   }
	   this.data.Enqueue(item);
	   while(!temp.isEmpty()) {
		   data.Enqueue(temp.dequeue());
	   }
   }
   public int pop() throws Exception
   {
	   return this.data.dequeue();
   }
   public int peak() throws Exception
   {
	   return this.data.getfront();
   }
}
