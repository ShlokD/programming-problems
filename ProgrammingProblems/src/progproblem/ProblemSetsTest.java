package progproblem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

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
	
	@Test
	public void lastOccurenceTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = { 1, 2, 2, 2, 2, 3, 5 };
		int target = 2;
		int expected = 4;
		assertEquals(expected, pSets.lastOccurence(numbers, target));
		assertEquals(-1, pSets.lastOccurence(numbers, 4));
	}
	
	@Test
	public void fisherYatesShuffleTest() {
		ProblemSets pSets = new ProblemSets();
		int[] numbers = { 1, 2, 3, 4, 5};
		int[] result = pSets.fisherYatesShuffle(numbers);
		assertNotEquals(Arrays.toString(result), Arrays.toString(numbers));
	}
	
	@Test
	public void largestNumberFromSetTest() {
		ProblemSets pSets = new ProblemSets();
		String[] numbers = {"546", "54", "548", "60"};
		String expected = "6054854654";
		assertEquals(expected, pSets.largestNumberFromSet(numbers));
	}
	
	@Test
	public void maxProfitTest() {
		ProblemSets pSets = new ProblemSets();
		int[] rates = {1, 5, 2, 3, 7, 6, 4, 5};
		int expected = 10;
		int actual = pSets.maxProfit(rates);
		assertEquals(expected, actual);
	}
	
	@Test
	public void stringDerivationTest() {
		ProblemSets pSets = new ProblemSets();
		String first = "ABCD";
		String second = "DABC";
		String third = "DACB";
		assertEquals(true, pSets.checkStringDerivation(first, second));
		assertEquals(false, pSets.checkStringDerivation(first, third));	
	}
	
	public String getActivityString(Set<TimeActivity> activitySet) {
		StringBuilder activityStringBuilder = new StringBuilder();
		for(TimeActivity timeActivity: activitySet) {
			activityStringBuilder.append(timeActivity.toString());
		}
		
		return activityStringBuilder.toString();
	}
	
	
	@Test
	public void scheduleActivityTest() {
		ProblemSets pSets = new ProblemSets();
		ArrayList<TimeActivity> activities = new ArrayList<>();
		activities.add(new TimeActivity(1, 4));
		activities.add(new TimeActivity(3, 5));
		activities.add(new TimeActivity(0, 6));
		activities.add(new TimeActivity(5, 7));
		activities.add(new TimeActivity(3, 8));
		activities.add(new TimeActivity(5, 9));
		activities.add(new TimeActivity(6, 10));
		activities.add(new TimeActivity(8, 11));
		activities.add(new TimeActivity(8, 12));
		activities.add(new TimeActivity(2, 13));
		activities.add(new TimeActivity(12, 14));
		
		Set<TimeActivity> expected = new LinkedHashSet<>();
		expected.add(new TimeActivity(1, 4));
		expected.add(new TimeActivity(5, 7));
		expected.add(new TimeActivity(8, 11));
		expected.add(new TimeActivity(12, 14));
		
		Set<TimeActivity> actual = pSets.activitySelection(activities);
		assertEquals(getActivityString(expected), getActivityString(actual));
	}
	
	@Test
	public void binaryPermutationsTest() {
		ProblemSets pSets = new ProblemSets();
		String argumentString = new String("11?01?");
		String[] permutations = {"110010", "110011", "111010", "111011"};
		List<String> expected =  Arrays.asList(permutations);
		List<String> actual = pSets.binaryPermutations(argumentString);
		for(String actualString: actual) {
			assertTrue(expected.contains(actualString));
		}
	}
	
	@Test
	public void LPSArrayTest() {
		ProblemSets pSets = new ProblemSets();
		String text = "BCAB";
		int[] expected = new int[]{0, 0, 0, 1};
		int[] actual = pSets.generateLPSArray(text);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void KMPStringMatchTest() {
		ProblemSets pSets = new ProblemSets();
		String text = "AABCAABCAB";
		String pattern = "BCAB";
		int expected = 6;
		int actual = pSets.KMPStringMatch(text, pattern);
		assertEquals(expected, actual);
	}
	
	@Test
	public void MemoizedFibonacciTest() {
		ProblemSets pSets = new ProblemSets();
		int argument1 = 25;
		int argument2 = 9;
		long expected1 = 46368;
		long actual1 = pSets.getNthFibonacciNumberMemoized(argument1);
		long expected2 = 34;
		long actual2 = pSets.getNthFibonacciNumberMemoized(argument2);
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		
	}
	
	@Test
	public void SumPrimePowersTest() {
		ProblemSets pSets = new ProblemSets();
		int number = 90;
		int expected = 4;
		int actual = pSets.sumOfPrimeFactorsPowers(number);
		assertEquals(expected, actual);
	}
	
	@Test
	public void metaStringTest() {
		ProblemSets pSets = new ProblemSets();
		String s1 = "geeks";
		String s2 = "keegs";
		assertEquals(true, pSets.metaStrings(s1, s2));
		assertEquals(false, pSets.metaStrings(s1, s1));
	}

}
