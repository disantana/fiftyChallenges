package br.com.fiftychallenge.challenge;

import java.util.HashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Challenge1 {

  private static final Logger logger = LogManager.getLogger(Challenge1.class);

  /**
   * Description: How are duplicates removed from an array without using any library?
   */

  public void run() {
    // TODO: code resolution
    logger.info("Challenge 1 - start");
  }

  public HashSet<Integer> findMissingNumber(int[] numbers) {
    sort(numbers);
    return compare(numbers);
    
  }

  protected int[] sort(int[] numbers) {
    int aux = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if ((j + 1) <= numbers.length - 1 && numbers[j] > numbers[j + 1]) {
          aux = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = aux;
        }
      }
    }
    aux = 0;
    return numbers;

  }

  protected HashSet<Integer> compare(int[] numbers) {
    HashSet<Integer> set = new HashSet<Integer>();
      for (int i = 0; i < numbers.length - 1; i++) {
        if (i != numbers[i]) {
          set.add(i);
        }
      }
      return set;
  }

}
