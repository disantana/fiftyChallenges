package br.com.fiftychallenge.challenge;

import static org.junit.Assert.assertArrayEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class ChallengesTest {
	
	private static final Logger logger = LogManager.getLogger(ChallengesTest.class);
	
	@Test
	public void testChallenge1() {
		Challenge1 challenge = new Challenge1();
		int[] numbers = { 1,2,4,6 };
		int[] missing = { 3, 5 };
		int[] result = challenge.findMissingNumber(numbers);		
		assertArrayEquals(missing, result);
	}
}
