package campJavaHomework3;

public class Instructor extends User {
	
	private String instructorId;
	private String instructorPassword;
	
	public Instructor() {
		
	}
	
	

	public Instructor(String instructorId, String instructorPassword) {
		this.instructorId = instructorId;
		this.instructorPassword = instructorPassword;
	}



	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorPassword() {
		return instructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}

	
}
