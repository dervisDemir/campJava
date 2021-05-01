package campJavaHomework3;

public class StudentManager extends UserManager {
	
	public void inspection(Student student){
        System.out.println(student.getFirstName()+": yoklamanýz alýndý.");
    }

	public void uploadHomework(){
        System.out.println("Ödev yüklendi.");
    }
}
