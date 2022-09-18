package in.ineuron.Many_to_one_Association;


//Dependent class 
public class Student1 {
	
	private int sId;
	private String sName;
	private int age;
	
	//performing constructor Injection
	public Student1(int sId, String sName, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
