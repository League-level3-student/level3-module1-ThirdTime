package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		double bigNum;
		double smallNum;
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack <Double> stack = new Stack <>();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random randomNumGenerator = new Random();
		for(int i = 0; i <= 100; i++) {
			stack.push(randomNumGenerator.nextDouble()*100);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String num1String = JOptionPane.showInputDialog(null, "Please enter a number between 0-100.");
		String num2String = JOptionPane.showInputDialog(null, "Please enter another number between 0-100.");
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		
		if(num1>num2) {
			bigNum = num1;
			smallNum = num2;
		} else {
			bigNum = num2;
			smallNum = num1;
		}
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("Popping off elements from "+ smallNum + " - " + bigNum + ":\n");
		for(int i = 0; i<stack.size(); i++){
			double currentNumBeingPopped;
			currentNumBeingPopped = stack.pop();
			if(currentNumBeingPopped >= smallNum && currentNumBeingPopped <= bigNum) {
				System.out.println(currentNumBeingPopped);
			} 
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
