package campJavaHomework3;

public class Student extends User {
	
	private String  studentId;
    private String studentPassword;
    
    public Student() {
    	
    }
    
	public Student(String studentId, String studentPassword) {
		this.studentId = studentId;
		this.studentPassword = studentPassword;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
    
    

}
