package _GuestBook;

public class RegularGuest implements Guest {
	RegularGuest(String name){
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
