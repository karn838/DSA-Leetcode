package Lec41;

public class Linked_list_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_list ll = new Linked_list();
		
		 ll.addfirst(10); ll.addfirst(20); ll.addfirst(30);
		 ll.addfirst(40);
		 ll.addfirst(50);
		 ll.addlast(60); 
		 ll.addatindex(-90, 3);
		 ll.display();
		 
		//System.out.println(ll.getfirst());
		//System.out.println(ll.getlast());
		//System.out.println(ll.getatindex(3));
	}

}
