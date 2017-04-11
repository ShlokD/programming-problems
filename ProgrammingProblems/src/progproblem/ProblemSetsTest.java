package progproblem;

import static org.junit.Assert.*;

import java.nio.channels.Pipe;
import java.util.function.IntPredicate;

import org.junit.Test;

public class ProblemSetsTest {

	@Test
	public void pairWithGivenSumTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {-4, 6, 8, 1, 3, 9, 3};
		int sum = 10;
		int[] expected = {3, 5};

		assertArrayEquals(expected, pSets.pairWithGivenSum(numbers, sum));
	}
	
	@Test
	public void sortBinaryArrayTest() {
		ProblemSets pSets = new ProblemSets();
		int[] unsortedBinaryArray = {1, 0, 1, 0, 0, 1, 0};
		int[] sortedBinaryArray = { 0, 0, 0, 0, 1, 1, 1};
		assertArrayEquals(sortedBinaryArray, pSets.binaryArraySort(unsortedBinaryArray));
	}
	
	@Test
	public void longestCommonSubsequenceTest() {
		ProblemSets pSets = new ProblemSets();
		String first = "BCADCBADC";
		String second = "BAACDADCB";
		assertEquals(6, pSets.longestCommonSubsequence(first, second));
	}
	
	@Test
	public void maxLengthSubArrayGivenSumTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {2, 4, 3, 0, -3, 1, 4, 6, 9};
		int sum = 20;
		int[] expectedSubArray = {3, 0, -3, 1, 4, 6, 9};
		assertArrayEquals(expectedSubArray, pSets.maxLengthSubArrayGivenSum(numbers, sum));
	}
	
	@Test
	public void getKthLargestElementTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {2, 4, 3, 0, -3, 1, 4, 6, 9};
		int k = 4;
		int expectedValue = 4;
		assertEquals(expectedValue, pSets.getKthLargestElement(numbers, k));
	}

}
