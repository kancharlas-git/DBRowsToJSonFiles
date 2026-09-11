package RSA;

public class CustomerDetails {
	private String CourseName;
	private String PurchasedDate;
	private int amount; 
	private String Location;
	
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getPurchasedDate() {
		return PurchasedDate;
	}
	public void setPurchasedDate(String purchasedDate) {
		PurchasedDate = purchasedDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
}

