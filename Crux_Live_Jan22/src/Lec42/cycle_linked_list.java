package Lec42;

import Lec41.Linked_list.Node;
import Lec42.middle_of_linked_list.ListNode;

public class cycle_linked_list {
	public class Node {
		// TODO Auto-generated method stub
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	private Node head;
	private int size;
	private Node tail;
	public void addfirst(int item) {
		Node nn = new Node(item);
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.next=this.head;
			this.head=nn;
			this.size++;
		}
	}
	public void addlast(int item) {
		if(this.size==0) {
			addfirst(item);
		}
		else {
			Node nn  = new Node(item);
			this.tail.next=nn;
			this.tail =nn;
			this.size++;
		}
	}
	public void createcycle() {
		//this.tail.next=this.head;  circular
		this.tail.next=this.head.next;  //cyclic
	}
	 public boolean hasCycle() {
		 Node fast = this.head;
		 Node slow = this.head;
		 while(fast!=null && fast.next!=null) {
			 fast=fast.next.next;
			 slow=slow.next;
			 if(slow==fast)
			 {
				 return true;
		 }
	    }
		 return false;
}
	public void display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		System.out.println(".");
}
	public static void main(String[] args) {
		cycle_linked_list cl =  new cycle_linked_list();
		cl.addlast(1);
		cl.addlast(2);
		cl.addlast(3);
		cl.addlast(4);
		cl.addlast(5);
		cl.addlast(6);
		cl.addlast(7);
		cl.addlast(8);
		//cl.display();
		cl.createcycle();
		//cl.display();
		System.out.println(cl.hasCycle());
	}
}
