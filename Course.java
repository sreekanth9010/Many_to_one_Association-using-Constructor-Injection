package in.ineuron.Many_to_one_Association;


//Target class
public class Course {
	
	private int courseId;
	private String cName;
	private int cost;
	
	//Has a variable
	
	private Student1 student1;
	
	//Performing constructor Injection
	public Course(int courseId, String cName, int cost, Student1 student1) {
		super();
		this.courseId = courseId;
		this.cName = cName;
		this.cost = cost;
		this.student1 = student1;
	}
	
	public void display()
	{
		System.out.println("****************Course Details ********************");
		System.out.println("The course id is  ::  "+courseId);
		System.out.println("The course name is :: "+cName);
		System.out.println("The course cost is ::"+cost);
		
		System.out.println("********************Studnet Details **************");
		System.out.println("The studnet id is ::"+student1.getsId());
		System.out.println("The student Name is :: "+student1.getsName());
		System.out.println("The studnet age is :: "+student1.getAge());
	}
	
	
	
	
	

}
