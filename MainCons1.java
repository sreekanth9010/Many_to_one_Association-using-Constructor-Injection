package in.ineuron.Many_to_one_Association;

public class MainCons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 student = new Student1(100002,"Sreekanth",22);
		
		Course course1 =new Course(11,"Java",1000,student);
		
		Course course2 =new Course(12,"JavaScript",1200,student);
		
		Course course3 =new Course(13,"Dbms",1300,student);
		
		course1.display();
		System.out.println();
		course2.display();
		System.out.println();
		course3.display();

	}

}
