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
		int[] numbers = { 1,2,4,6,8,9,12 };
		int[] missing = { 3, 5, 7, 10, 11 };
		int[] result = challenge.findMissingNumber(numbers);
		logger.info("Numbers: "+printArray(numbers));
		logger.info("Missings: "+printArray(result));
		assertArrayEquals(missing, result);
	}
	
	@Test
	public void testChallenge1new() {
		Challenge1 challenge = new Challenge1();
		int[] numbers = { 1,2,5,8,12,13,14 };
		int[] missing = { 3, 4, 6, 7, 9, 10, 11, 15 };
		int[] result = challenge.findMissingNumber(numbers, 15);
		logger.info("Numbers: "+printArray(numbers));
		logger.info("Missings: "+printArray(result));
		assertArrayEquals(missing, result);
	}
	
	
	private String printArray(int[] array) {
		StringBuilder sb = new StringBuilder("{");		
		for (int i = 0; i < array.length; i++) {
			sb.append(String.format(" %d", array[i]));
			if(i < array.length) {
				sb.append(",");
			}
		}
		sb.append(" }");
		return sb.toString();
	}
}
