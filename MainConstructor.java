package in.ineuron.Many_to_one_Association;

public class MainConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch branch = new Branch("1002","Hyderabad");
		
		Student student1 = new Student(100,"Sreekanth",22,branch);
		Student student2 = new Student(101,"RaviKishore",25,branch);
		
		
		student1.display();
		System.out.println();
		student2.display();
	}

}
