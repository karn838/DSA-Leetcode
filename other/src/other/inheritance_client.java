package other;

public class inheritance_client {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/*
		 * inheritance_parent obj = new inheritance_parent(); 
		 * System.out.println(obj.d);
		 * System.out.println(obj.d1); 
		 * obj.fun();
		 *  obj.fun1();
		 */
        
        //case 2
		/*
		 * inheritance_parent obj = new inheritance_child(); 
		 * System.out.println(obj.d);
		 * System.out.println(obj.d1);
		 * System.out.println(((inheritance_child)(obj)).d2); 
		 * obj.fun();
		 * ((inheritance_child)(obj)).fun2(); 
		 * obj.fun();
		 */
	
        //case 3
		/*
		 * inheritance_child obj = new inheritance_parent(); child class can't be
		 * inherited in parent class it will give compilation erroe
		 */        
		//case 4
		inheritance_child obj = new inheritance_child();
		System.out.println(obj.d);
		System.out.println(((inheritance_parent)(obj)).d);
		obj.fun();
	    obj.fun1();
	}

}
