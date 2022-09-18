package in.ineuron.Many_to_one_Association;


//Target class
public class Student {
	
	private int sId;
	private String sName;
	private int age;
	
	
	//Has a variable
	private Branch branch;
	
	//Performing constructor Injection
	public Student(int sId, String sName, int age,Branch branch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		this.branch=branch;
	}

	
	//Getters and setters to get and set the values 
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
	
	public void setBranch(Branch branch)
	{
		this.branch=branch;
	}
	
	public Branch getBranch()
	{
		return branch;
	}
	
	public void display()
	{
		System.out.println("****************Student Details ********************");
		System.out.println("The studnet id is  ::  "+sId);
		System.out.println("The student name is :: "+sName);
		System.out.println("The student age is ::"+age);
		
		System.out.println("********************Branch Details **************");
		System.out.println("The branch id is ::"+branch.getbId());
		System.out.println("The branch location is :: "+branch.getbLocation());
	}
	
	

}
