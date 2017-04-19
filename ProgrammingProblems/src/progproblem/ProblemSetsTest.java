package progproblem;

import static org.junit.Assert.*;

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
	
	@Test
	public void dutchNationalFlagProblemTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {2, 0, 1, 2, 0, 0, 1, 2, 1, 1};
		int[] expected = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2};
		assertArrayEquals(expected, pSets.dutchNationalFlagProblem(numbers));
	}
	
	@Test
	public void equilibriumElementTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {1, 2, 3, 4, 3, 2, 1};
		int expected = 4;
		assertEquals(expected, pSets.equilibriumElement(numbers));
	}
	
	@Test
	public void isAnagramTest() {
		ProblemSets pSets = new ProblemSets();
		String first = "motherinlaw";
		String second = "womanhitler";
		String third = "ladyhitler";
		assertEquals(true, pSets.isAnagram(first, second));
		assertEquals(false, pSets.isAnagram(first, third));
	}
	
	@Test
	public void smallestMissingElementTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = {0, 1, 2, 5};
		int expected = 3;
		assertEquals(expected, pSets.smallestMissingElement(numbers, 0, numbers.length - 1));
	}

}
