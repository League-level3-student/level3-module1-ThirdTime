package _WarmUp;

import java.util.Stack;

public class StackWarmup {
	public static void main(String[] args) {

		Stack<Double> prices = new Stack<>();
		prices.push(3.23);
		prices.push(27.6);
		System.out.println("top: "+ prices.peek());
		prices.peek();
		prices.clear();
		prices.push(256.0);
		prices.push(0.001);
		double aPrice = prices.pop();
		prices.push(7.8);
		while(!prices.empty()) {
			System.out.println(prices.pop());
		}
		System.out.println(aPrice);
	}
}
