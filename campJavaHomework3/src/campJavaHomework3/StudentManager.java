package campJavaHomework3;

public class StudentManager extends UserManager {
	
	public void inspection(Student student){
        System.out.println(student.getFirstName()+": yoklaman�z al�nd�.");
    }

	public void uploadHomework(){
        System.out.println("�dev y�klendi.");
    }
}
