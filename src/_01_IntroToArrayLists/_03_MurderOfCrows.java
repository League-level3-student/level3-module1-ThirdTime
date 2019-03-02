package _01_IntroToArrayLists;

/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 3
 *    A Murder of Crows
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=n/a
*/

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class _03_MurderOfCrows {

	ArrayList<Crow> theMurder = new ArrayList<Crow>();

	public static void main(String[] args) {
		_03_MurderOfCrows murderOfCrows = new _03_MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();
	}

	private void findTheDiamond() {
		boolean diamondFound = false;
		for (int i = 0; i < theMurder.size(); i++) {
			for (int j = 0; j < theMurder.get(i).getStomachContents().size(); j++) {
				if (theMurder.get(i).getStomachContents().get(j) == "diamond") {
					System.out.println("The guilty crow is " + theMurder.get(i).getName() + ".");
					diamondFound = true;
					break;
				}
			}
			if (diamondFound) {
				if (i == 1) {
					System.out.println(i + " innocent crow died before the diamond was found.");
				} else if (i == 0) {
					System.out.println("No innocent crows died before the diamond was found.");
				} else {
					System.out.println(i + " innocent crows died before the diamond was found.");
				}
				break;
			}
		}
	}

	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("diamond");
	}
}

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();

	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}

	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}

	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0)
			return "carrion";
		else if (randomness == 1)
			return "snail";
		else if (randomness == 2)
			return "acorn";
		else if (randomness == 3)
			return "spider";
		else
			return "grub";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}

}
