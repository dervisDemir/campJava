package campJavaHomework3;

public class InstructorManager extends UserManager {
	
	public void deleteComment(Student student)
    {
        System.out.println(student.getFirstName()+" adl� ��rencinin yorumu silindi.");
    }
    public void  uploadLesson()
    {
        System.out.println("Ders y�klendi.");
    }
    public void deleteLesson()
    {
        System.out.println("Ders silindi.");
    }
    

}
