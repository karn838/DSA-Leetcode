package other;

public class constructor_practice {
		String name ;
		int age;
		
	public constructor_practice() {//non parametric constructor
		name="ak";
		age=20;
	}
	 public void defaultconstructor() {};//default construcotr
	public constructor_practice(String name,int age) {
		this.name="kk";
		this.age=10;
	}
	public void fun() {
		int adhar_no = 536783983;
		System.out.println(this.name+" "+ this.age+" "+adhar_no);
	}
	}