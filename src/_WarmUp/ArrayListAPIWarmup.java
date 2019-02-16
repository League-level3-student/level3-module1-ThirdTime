package _WarmUp;

import java.util.ArrayList;

public class ArrayListAPIWarmup {
	public static void main(String[] args) {
		System.out.println("CONTAINS:");
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		System.out.println(nums.contains(3));
		System.out.println(nums.contains(2));

		System.out.println("INDEX OF:");
		ArrayList<String> listOfFruits = new ArrayList<>();
		listOfFruits.add("strawberry");
		listOfFruits.add("kiwi");
		System.out.println(listOfFruits.indexOf("kiwi"));
		System.out.println(listOfFruits.indexOf("apple"));

		System.out.println("REMOVE:");
		ArrayList<Cat> catList = new ArrayList<>();
		catList.add(new Cat("kitty"));
		catList.add(new Cat("whiskers"));
		catList.add(new Cat("kitty"));
		System.out.println(catList.remove(new Cat("kitty")));
	}
}
