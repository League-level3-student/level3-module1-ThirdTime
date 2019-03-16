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

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	// To do: solve the last test, which isn't working now because it begins with a }
	private boolean doBracketsMatch(String b) {
		Stack <String> bracketList = new Stack<>();
		
		for(int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if(c == '{') {
				bracketList.push("{");
			} else if (c == '}') {
				bracketList.pop();
			}
			System.out.println(c);
		}
		if(bracketList.empty()) {
			return true;
		} else 
			return false;
	}

}