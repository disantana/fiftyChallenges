package br.com.fiftychallenge.challenge;

import java.util.BitSet;

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
		int missingCount = 0;
		
		for (int i = 0; i < numbers.length -1; i++) {
			
			int actualNumber = numbers[i];
			int nextNumber = numbers[i+1];
			int difference = nextNumber - actualNumber;
			
			if(difference > 1) {
				while(actualNumber < nextNumber - 1) {
					missingNumbers[missingCount] = ++actualNumber;
					missingCount++;
				}				
			}
			
		}
		int[] newMissingNumber = new int[missingCount];
		
		for (int i = 0; i < newMissingNumber.length ; i++) {
			newMissingNumber[i] = missingNumbers[i];
		}
		
		return newMissingNumber;
	}
	
	public int[] findMissingNumber(int[] numbers, int count) {		
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet();
		int[] missingNumbers = new int[missingCount];
		
		for (int number : numbers) {
			bitSet.set(number - 1);			
		}
		
		int lasMissingIndex = 0;
		
		for(int i = 0; i < missingCount; i++) {
			lasMissingIndex = bitSet.nextClearBit(lasMissingIndex);
			missingNumbers[i] = ++lasMissingIndex;
		}
		
		return missingNumbers;		
	}
}
