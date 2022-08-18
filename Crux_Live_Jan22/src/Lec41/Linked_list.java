package Lec41;

public class Linked_list {

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
	public void addatindex(int item,int k) throws Exception {
		if(k<0 || k>size)
		{
			throw new Exception("index ki value range se baaahar hai");
		}
		if(k==0) {
			addfirst(item);
		}
		else if(k==size) {
			addlast(item);;
		}
		else {
			Node nn = new Node(item);
			Node k_1th = getnode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			this.size++;
		}
	}
	public int getfirst() throws Exception {
		if(head==null) {
			throw new Exception("linkedlist khaali hai");
		}
		return this.head.data;
	}
	public int getlast() throws Exception {
		if(this.head==null) {
			throw new Exception("linkedlist khaali hai");
		}
		return this.tail.data;
	}
	public int getatindex(int k) throws Exception {
		return this.getnode(k).data;
	}
	private Node getnode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("index out of bound");
		}
		Node temp = head;
		for(int i=1;i<=k;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int removefirst() {
		Node temp = this.head;
		this.head = this.head.next;
		temp.next=null;
		this.size--;
		return temp.data;
	}
	public int removelast() throws Exception {
		if(this.head==null) {
			throw new Exception("linkedlist khaali hai");
		}
		if(this.size==1) {
			return removefirst();
		}
		Node temp = getnode(size-2);
		int rv = tail.data;
		this.tail=temp;
		this.tail.next=null;
		this.size--;
		return rv;
	}

public int removeatindex(int k) throws Exception {
	if(k<0|| k>=size) {
		throw new Exception("linkedlist khaali hai");}
	if(k==0) {
		return removefirst();}
	else if(k==this.size-1) {
		return removelast();
	}
	else {
		Node kth = getnode(k);
		Node k_1th = getnode(k-1);
		k_1th.next = kth.next;
		kth.next=null;
		this.size--;
		return kth.data;
		
	}
	}
	public void display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		System.out.println(".");
}}
