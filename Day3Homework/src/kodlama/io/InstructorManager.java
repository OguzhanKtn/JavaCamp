package kodlama.io;

public class InstructorManager extends UserManager{
		
	public void add(Instructor instructor) {
		System.out.println("Eðitmen Sisteme eklendi: " + instructor.getFirstName() + " "+ instructor.getLastName());
	}
}
