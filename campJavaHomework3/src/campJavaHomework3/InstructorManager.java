package campJavaHomework3;

public class InstructorManager extends UserManager {
	
	public void deleteComment(Student student)
    {
        System.out.println(student.getFirstName()+" adlý öðrencinin yorumu silindi.");
    }
    public void  uploadLesson()
    {
        System.out.println("Ders yüklendi.");
    }
    public void deleteLesson()
    {
        System.out.println("Ders silindi.");
    }
    

}
