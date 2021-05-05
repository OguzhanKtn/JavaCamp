package Entities;

public class Campaign {
	
	String name;
	int discount;

	public Campaign() {
		
	}

	public Campaign(String name, int discount) {
	
		this.name = name;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
