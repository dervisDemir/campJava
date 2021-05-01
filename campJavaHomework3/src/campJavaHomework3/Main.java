package campJavaHomework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Instructor instructor = new Instructor();
        instructor.setInstructorId("engin");
        instructor.setInstructorPassword("Ankara2021");
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("DEMÝROÐ");
        instructor.setEmail("engindemirog@outlook.com");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);
        instructorManager.addComment(instructor);
        instructorManager.deleteComment(instructor);
        instructorManager.uploadLesson();
        instructorManager.deleteLesson();
        instructorManager.editComment(instructor);

        
        Student student = new Student();
        student.setStudentId("beterAnkara");
        student.setStudentPassword("Ankara12");
        student.setId(2);
        student.setFirstName("Derviþ");
        student.setLastName("DEMÝR");
        student.setEmail("dervisdemirank@hotmail.com");

        StudentManager studentManager = new StudentManager(); // nesne türettik.

        studentManager.login(student);
        studentManager.addComment(student);
        studentManager.deleteComment(student);
        studentManager.editComment(student);
        studentManager.inspection(student); 

	}

}
