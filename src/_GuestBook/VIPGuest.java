package _GuestBook;

public class VIPGuest implements Guest{
	private	String name;
	VIPGuest(String name){
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public String getListing() {
		return "VIP: " + name;
	}
}
