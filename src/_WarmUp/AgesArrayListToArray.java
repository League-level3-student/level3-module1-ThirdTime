package _WarmUp;

import java.util.ArrayList;

public class AgesArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(2);
		ages.add(3);
		ages.add(7);
		ages.set(0, 19);
		int total = 0;
		for(int i = 0; i < ages.size(); i++) {
			total += ages.get(i);
		}
		float average = total / (float) ages.size();
		System.out.println("average: " + average);
	}
}
