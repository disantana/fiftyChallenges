package br.com.fiftychallenge.challenge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Challenge1 {
	
	private static final Logger logger = LogManager.getLogger(Challenge1.class);
	/**
	 * Description: How do you find the missing number in a given integer array of 1 to 100?
	 */
	
	public void run() {		
		logger.info("Challenge 1 - start");
	}
	
	public int[] findMissingNumber(int[] numbers) {
		
		int[] missingNumbers = new int[100];
		int missingIndex = 0;
		
		for (int i = 0; i < numbers.length -1; i++) {
			
			int actualNumber = numbers[i];
			int nextNumber = numbers[i+1];
			int difference = nextNumber - actualNumber;
			
			if(difference > 1) {
				for(int j = missingIndex; j < difference -1; j++) {
					missingIndex++;
					missingNumbers[j] = actualNumber + j;
				}
			}
			
		}
		int[] newMissingNumber = new int[missingIndex];
		
		for (int i = 0; i < newMissingNumber.length ; i++) {
			newMissingNumber[i] = missingNumbers[i];
		}
		
		return newMissingNumber;
	}
}
