package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(12345);
		user1.setAge(29);
		user1.setEmail("oguzhanktn@hotmail.com");
		user1.setFirstName("O�uzhan");
		user1.setLastName("Kotan");
		
		Student student1 = new Student();
		student1.setAge(29);
		student1.setEmail("oguzhanktn@hotmail.com");
		student1.setFirstName("O�uzhan");
		student1.setLastName("Kotan");
		student1.setId(12345);
		student1.schoolName = "Yeni Y�zy�l �niversitesi";
		
		Student student2 = new Student();
		student2.setAge(25);
		student2.setEmail("aliveli@hotmail.com");
		student2.setFirstName("Ali");
		student2.setLastName("Veli");
		student2.setId(54321);
		student2.schoolName = "�stanbul Teknik �niversitesi";
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.periodOfExperienceInTheIndustry = "13 y�l";
		instructor1.profession = "Yaz�l�m Uzman�";
		
		StudentManager studentManager = new StudentManager();
		
		Student[] students = {student1,student2};
		
		studentManager.addMultiple(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
	}

}
