package Lec36;

public class student {
	private String name = "kriti";
	private int age = 80;
	public student(String name,int age) {
		this.age = age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//public void setAge1(int age)throws Exception{
	//	if(age<0) {
	//		throw new Exception("pgl hai age negative nhi hota");
	//	}
		//this.age = age;
	//}
	public void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("pgl hai kya age negative nhi hota");
			}
			this.age=age;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(getName());
		}
	}
}
