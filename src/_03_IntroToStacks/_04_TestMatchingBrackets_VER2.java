package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _04_TestMatchingBrackets_VER2 {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}{}"));
		assertTrue(doBracketsMatch("{[]()}"));
		assertTrue(doBracketsMatch("({})"));
		assertTrue(doBracketsMatch("[]{}()"));
		assertTrue(doBracketsMatch("{[()]}"));
		assertFalse(doBracketsMatch("{[}]"));
		assertFalse(doBracketsMatch("{(["));
	}

	private boolean doBracketsMatch(String b) {
		Stack<Character> bracketList = new Stack<>();

		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (c == '{' && c == '[' && c == '(') {
				bracketList.push(c);
			} else if (c == '}' && c == ']' && c == ')' && !bracketList.empty()) {
				bracketList.pop();
			}
			System.out.println(c);
		}
		if (bracketList.empty()) {
			return true;
		} else
			return false;
	}

}