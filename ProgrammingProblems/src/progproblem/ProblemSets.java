package progproblem;

import java.util.HashMap;

import org.junit.experimental.max.MaxCore;

public class ProblemSets {
	public int[] pairWithGivenSum(int[] numbers, int sum) {
		int[] result = { -1, -1 };
		HashMap<Integer, Integer> sumMap = new HashMap<>();
		for(int i = 0; i<numbers.length; ++i) {
			if(sumMap.containsKey(sum - numbers[i])) {
				result[0] =  sumMap.get(sum -  numbers[i]).intValue();
				result[1] = i;
			} else {
				sumMap.put(numbers[i], i);
			}
		}
		
		return result;
	}
	
	public int[] binaryArraySort(int[] binaryArray) {
		int[] sortedArray = new int[binaryArray.length];
		int zeroCount = 0;
		
		for(int i=0; i<binaryArray.length; ++i) {
			if(binaryArray[i] == 0) {
				zeroCount++;
			}
		}
		
		for(int i=0; i<sortedArray.length; ++i) {
			if(zeroCount-- > 0) {
				sortedArray[i] = 0;
			} else {
				sortedArray[i] = 1;
			}
		}
		return sortedArray;
	}
	
	public int longestCommonSubsequence(String first, String second) {
		int firstLength = first.length();
		int secondLength = second.length();
		
		int[][] matchTable = new int[firstLength + 1][secondLength + 1];
		
		for(int i = 0; i<=firstLength; ++i) {
			matchTable[i][0] = 0;
		}
		
		for(int i=0; i<=secondLength; ++i) {
			matchTable[0][i] = 0;
		}
		
		for(int i = 1; i<=firstLength; ++i) {
			for(int j = 1; j<=secondLength; ++j) {
				if(first.charAt(i-1) == second.charAt(j - 1)) {
					matchTable[i][j] = matchTable[i-1][j-1] + 1;
				} else {
					matchTable[i][j] = Math.max(matchTable[i-1][j], matchTable[i][j-1]);
				}
			}
		}
		return matchTable[firstLength][secondLength];
	}
}
