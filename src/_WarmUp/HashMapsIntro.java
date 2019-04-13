package _WarmUp;

import java.util.HashMap;

public class HashMapsIntro {
	public static void main(String[] args) {
		HashMap<String, String> myPets = new HashMap<>();
		myPets.put("My Dog", "Dustin");
		myPets.put("My Cat", "Shoelaces");
		myPets.put("My Fish", "Yoyo");
		System.out.println(myPets.get("My Cat"));
		System.out.println(myPets.get("My Turtle"));
	}
}
