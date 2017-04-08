package progproblem;

import static org.junit.Assert.*;

import java.nio.channels.Pipe;

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

}
