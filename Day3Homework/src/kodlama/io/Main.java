package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(12345);
		user1.setAge(29);
		user1.setEmail("oguzhanktn@hotmail.com");
		user1.setFirstName("Oðuzhan");
		user1.setLastName("Kotan");
		
		Student student1 = new Student();
		student1.setAge(29);
		student1.setEmail("oguzhanktn@hotmail.com");
		student1.setFirstName("Oðuzhan");
		student1.setLastName("Kotan");
		student1.setId(12345);
		student1.schoolName = "Yeni Yüzyýl Üniversitesi";
		
		Student student2 = new Student();
		student2.setAge(25);
		student2.setEmail("aliveli@hotmail.com");
		student2.setFirstName("Ali");
		student2.setLastName("Veli");
		student2.setId(54321);
		student2.schoolName = "Ýstanbul Teknik Üniversitesi";
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.periodOfExperienceInTheIndustry = "13 yýl";
		instructor1.profession = "Yazýlým Uzmaný";
		
		StudentManager studentManager = new StudentManager();
		
		Student[] students = {student1,student2};
		
		studentManager.addMultiple(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
	}

}
