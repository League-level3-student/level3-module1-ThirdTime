package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	private boolean doBracketsMatch(String b) {
		Stack<String> bracketList = new Stack<>();

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				bracketList.push("{");
			} else if (b.charAt(i) == '}' && !bracketList.empty()) {
				bracketList.pop();
			}
			System.out.println(b.charAt(i));
		}
		if (bracketList.empty()) {
			return true;
		} else
			return false;
	}

}