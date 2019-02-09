package _GuestBook;

public class RegularGuest implements Guest {
	private String name;
	RegularGuest(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	public String getListing() {
		return name;
	}
	
}
