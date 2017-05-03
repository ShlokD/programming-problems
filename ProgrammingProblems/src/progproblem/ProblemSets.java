package progproblem;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;


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
	
	public int[] maxLengthSubArrayGivenSum(int[] numbers, int sum) {
		if(null == numbers || numbers.length == 0) {
			return new int[0];
		}
		
		HashMap<Integer, Integer> sumMap = new HashMap<>();
		sumMap.put(0, -1);
		int maxLen = 0;
		int sumSoFar = 0;
		int length = numbers.length;
		int endIndex = length - 1;
		for(int i = 0; i < length; ++i) {
			sumSoFar += numbers[i];
			
			if(!sumMap.containsKey(sumSoFar)) {
				sumMap.put(sumSoFar, i);
			}
			
			if(sumMap.containsKey(sumSoFar - sum)) {
				endIndex = i;
				maxLen = Math.max(maxLen, i - sumMap.get(sumSoFar - sum));
			}
		}
		
		int[] maxSubArray = new int[maxLen];
		int k = 0;
		for(int i = endIndex; i > endIndex - maxLen; --i) {
			maxSubArray[maxLen - k - 1] = numbers[i];
			k++;
		}
		
		return maxSubArray;
	}
	
	public int getKthLargestElement(int[] numbers, int k) {
		if(null == numbers || numbers.length == 0) {
			return -1;
		}
		
		int length = numbers.length;
		PriorityQueue<Integer> numbersQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i<length; ++i) {
			numbersQueue.add(numbers[i]);
		}
		
		for(int i=1; i<k; i++) {
			numbersQueue.remove();
		}
		
		
		return numbersQueue.peek();
	}
	
	public int[] dutchNationalFlagProblem(int[] numbers) {
		if(null == numbers || numbers.length == 0) {
			return numbers;
		}
		int[] result = numbers;
		int start = 0;
		int middle = 0;
		int end = numbers.length - 1;
		int check = 1;
		
		while(middle <= end) {
			if(result[middle] < check) {
				int temp = result[middle];
				result[middle] = result[start];
				result[start] = temp;
				++start;
				++middle;
			} else if (result[middle] > check) {
				int temp = result[middle];
				result[middle] = result[end];
				result[end] = temp;
				--end;
			} else {
				++middle;
			}
		}
		
		return result;
	}
	
	public int equilibriumElement(int[] numbers) {
		int length = numbers.length;
		if(length == 0) {
			return -1;
		}
		int equilibriumElement = numbers[0];
		int totalSum = 0;
		for(int i=0; i<length; ++i) {
			totalSum += numbers[i];
		}
		
		int rightSum = 0;
		
		for(int i = length -1 ; i>=0; --i) {
			if(rightSum == totalSum - (numbers[i] + rightSum)) {
				equilibriumElement = numbers[i];
			}
			rightSum += numbers[i];
		}
		
		return equilibriumElement;
	}
	
	public boolean isAnagram(String first, String second) {
		if(first == null || second == null) {
			return false;
		}
		
		HashMap<Character, Integer> characterCount = new HashMap<>();
		
		for(Character c : first.toCharArray()) {
			if(characterCount.containsKey(c)) {
				characterCount.put(c, characterCount.get(c) + 1);
			} else {
				characterCount.put(c, 1);
			}
		}
		
		for(Character c: second.toCharArray()) {
			if(!characterCount.containsKey(c)) {
				return false;
			} else {
				characterCount.put(c, characterCount.get(c) - 1);
				if(characterCount.get(c) == 0) {
					characterCount.remove(c);
				}
			}
		}
		
		return characterCount.isEmpty();			
	}
	
	public int smallestMissingElement(int[] numbers, int low, int high) {
		if(numbers.length == 0) {
			return -1;
		}
		if(low > high) {
			return low;
		}
		
		int mid =  low + (high - low) / 2;
		
		if(numbers[mid] == mid) {
			return smallestMissingElement(numbers, mid+1, high);
		} else {
			return smallestMissingElement(numbers, low, mid - 1);
		}
	}
	
	public int lastOccurence(int [] numbers, int target) {
		if (numbers.length == 0) {
			return -1;
		}
		int result = -1;
		
		int low = 0;
		int high = numbers.length - 1;
		
		while(low  <= high) {
			int mid = (low + high) /2;
			
			if(numbers[mid] == target) {
				result = mid;
				low = mid + 1;
			} else if (target < numbers[mid] ) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result;
	}
}
