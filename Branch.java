package in.ineuron.Many_to_one_Association;


//Dependent class
public class Branch {

	private String bId;
	private String bLocation;
	
	//Performing constructor 	Injection
	public Branch(String bId, String bLocation) {
		super();
		this.bId = bId;
		this.bLocation = bLocation;
	}

	
	
	//Getters and setters to get the value and set the value
	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbLocation() {
		return bLocation;
	}

	public void setbLocation(String bLocation) {
		this.bLocation = bLocation;
	}
	
	
	
	
	
	
}
