package _GuestBook;

public class VIPGuest implements Guest{
	VIPGuest(String name){
		this.name = name;
	}
	String name;
	
	public String toString() {
		return name;
	}

	@Override
	public String getListing() {
		// TODO Auto-generated method stub
		return null;
	}
}
