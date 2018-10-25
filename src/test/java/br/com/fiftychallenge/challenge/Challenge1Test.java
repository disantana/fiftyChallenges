/**
 * 
 */
package br.com.fiftychallenge.challenge;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * @author ddpereira
 *
 */
public class Challenge1Test extends TestCase {

  /**
   * Test method for {@link br.com.fiftychallenge.challenge.Challenge1#findMissingNumber(int[])}.
   */
  @Test
  public void testFindMissingNumber() {
    fail("Not yet implemented"); // TODO
  }

  /**
   * Test method for {@link br.com.fiftychallenge.challenge.Challenge1#sort(int[])}.
   */
  @Test
  public void testSort() {
    int[] array = {3,2,1,0};
    int[] expecteds = {0,1,2,3};
    int[] actuals = new Challenge1().sort(array);
    assertArrayEquals(expecteds, actuals);
  }

  /**
   * Test method for {@link br.com.fiftychallenge.challenge.Challenge1#compare(int[], int[])}.
   */
  @Test
  public void testCompare() {
    int[] actuals = {0, 2, 3};
    Object[] expecteds = {1};
    assertArrayEquals(expecteds, new Challenge1().compare(actuals).toArray());
  }

}
