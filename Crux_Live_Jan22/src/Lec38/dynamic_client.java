package Lec38;

public class dynamic_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_stack ds = new dynamic_stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.println(ds.peak());
		ds.push(60);
		ds.Display();
		ds.push(100);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(500);
		ds.Display();
	}

}
