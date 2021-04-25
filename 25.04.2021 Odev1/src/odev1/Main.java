package odev1;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Oğuzhan","Kotan","oguzhanktn@hotmail.com",29);
		Student student2 = new Student("Ali","Veli","aliveli@gmail.com",25);
		StudentManager studentManager = new StudentManager();
		
		Kurslar kurs1 = new Kurslar("Java-React","2 ay","Engin Demiroğ");
		Kurslar kurs2 = new Kurslar("Python","3 ay","Engin Demiroğ");
		KursManager kursManager = new KursManager();
		
		Student[] students = {
				student1,
				student2
		};
		
		Kurslar[] kurslar ={
			kurs1,kurs2
		};
		
		for(Student student:students) {
			System.out.println(student.name +" "+ student.surname);
			studentManager.addToStudent();
			
		}
		
		for(Kurslar kurs:kurslar) {
			System.out.println(kurs.kursAdi);
			kursManager.addToKurs();
				
		}
		
	}

}
