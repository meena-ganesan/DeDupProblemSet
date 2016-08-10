package com.dedup;

import java.util.Arrays;

import com.dedup.util.DeDupUtil;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String ar[]) {
		long startTime;
		long endTime;
		DeDup obj = new DeDup();
		System.out.println("Input Array: " + Arrays.toString(obj.randomIntegers));
		System.out.println("Input Array size: " + obj.randomIntegers.length);
		System.out.println("------------------------------------------");
		
		startTime = System.nanoTime();
		int[] result = DeDupUtil.removeDuplicate_UsingArray(obj.randomIntegers);
		endTime = System.nanoTime();
		System.out.println("Time Taken using Array (in ns): " + (endTime - startTime));
		System.out.println("Result Array: "+ Arrays.toString(result));
		System.out.println("Result Array size: "+result.length);
		System.out.println("------------------------------------------");
		
		startTime = System.nanoTime();
		result = DeDupUtil.removeDuplicates_UsingSet(obj.randomIntegers);
		endTime = System.nanoTime();
		System.out.println("Time Taken using Set (in ns): " + (endTime - startTime));
		System.out.println("Result Array: "+ Arrays.toString(result));
		System.out.println("Result Array size: "+result.length);
		System.out.println("------------------------------------------");
		
		startTime = System.nanoTime();
		result = DeDupUtil.removeDuplicate_UsingList(obj.randomIntegers);
		endTime = System.nanoTime();
		System.out.println("Time Taken using List (in ns): " + (endTime - startTime));
		System.out.println("Result Array: "+ Arrays.toString(result));
		System.out.println("Result Array size: "+result.length);
		System.out.println("------------------------------------------");
	}

}
