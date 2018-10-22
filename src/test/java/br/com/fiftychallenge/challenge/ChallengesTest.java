package br.com.fiftychallenge.challenge;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import br.com.fiftychallenge.challenge.Challenge1;

public class ChallengesTest {

	@Test
	public void testChallenge1() {
		Challenge1 challenge = new Challenge1();
		int[] numbers = { 1,2,4,5,6 };
		int[] missing = { 3 };
		int[] result = challenge.findMissingNumber(numbers);
		assertArrayEquals(missing, result);
	}
}
