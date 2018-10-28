import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MainTest {
		
	@Test
	public void testMain() {
		String[] args = {};
		Main.main(args);		
	}

	@Test
	public void testCase1() {
		String[] testCase = {"Philips II","Stephen VI", "Stephen VII", "Kenji XVII","James V","Bob XL"};
		String[] expectedResult = {"Bob XL", "James V","Kenji XVII","Philips II","Stephen VI","Stephen VII"};
		assertArrayEquals(expectedResult, Main.getSortedList(testCase));
	}
	
	@Test
	public void testCase2() {
		String[] testCase = {"Louis IX","Louis VIII","David II"};
		String[] expectedResult = {"David II","Louis VIII","Louis IX"};
		assertArrayEquals(expectedResult, Main.getSortedList(testCase));
	}
	
	@Test
	public void testCase3() {
		String[] testCase = {"George VI", "William II", "Elizabeth I", "William I"};
		String[] expectedResult = {"Elizabeth I","George VI","William I","William II"};
		assertArrayEquals(expectedResult, Main.getSortedList(testCase));
	}

}
