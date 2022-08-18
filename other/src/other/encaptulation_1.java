package other;

public class encaptulation_1 {
    String name = "avnish";
    int age = 20;
    public encaptulation_1() {
    	this.name=name;
    	this.age=age;
    
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
	public void setAge1(int age) throws Exception {
		if(age<0) {
			throw new Exception("pgl hai kya age -ve nhi hota");
		}
		this.age = age;
	}
	public void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("pgl age -ve nhi hota ");
			}
			this.age=age;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(getAge());
		}
	}
}
