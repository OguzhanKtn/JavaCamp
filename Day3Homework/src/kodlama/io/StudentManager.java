package kodlama.io;


public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println(student.getId() + " kaydedildi.");
	}
	
    public void addMultiple(Student[] students) {
		
		for(Student student : students) {
			add(student);
		}
	}
}
