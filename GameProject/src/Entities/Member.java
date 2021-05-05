package Entities;



public class Member {
	
	private int id;
	private String firstName;
	private String lastName;
	private int BirthOfYear;
	private String nationalityId;
	
	public Member() {
		
	}

	public Member(int id, String firstName, String lastName, int BirthOfYear, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.BirthOfYear = BirthOfYear;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public int getBirthOfYear() {
		return BirthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		BirthOfYear = birthOfYear;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
 