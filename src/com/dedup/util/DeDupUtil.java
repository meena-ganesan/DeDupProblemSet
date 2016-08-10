package com.dedup.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeDupUtil {
	
	public static int[] removeDuplicate_UsingArray(int[] intArray) {
		int[] tempArray = new int[intArray.length];
		tempArray[0] = intArray[0];
		int index = 1;
		for (int i=1; i<intArray.length; i++) {
			if(!contains(tempArray,intArray[i])) {
				tempArray[index++] = intArray[i];
			}
		}
		int[] result = new int[index];
		System.arraycopy(tempArray, 0, result, 0, index);
		return result;
	}

	public static boolean contains(int[] intArray, int value) {
		for (int i=0; i<intArray.length; i++) {
			if(intArray[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] removeDuplicates_UsingSet(int[] intArray) {
		Set<Integer> intSet = new HashSet<>();
		for (int i=0; i< intArray.length; i++) {
			intSet.add(intArray[i]);
		}
		return convertToIntArray(intSet);
	}
	
	public static int[] removeDuplicate_UsingList(int[] intArray){
		List<Integer> intList = new ArrayList<>();
		for (int i=0; i< intArray.length; i++) {
			if(!intList.contains(intArray[i])) {
				intList.add(intArray[i]);
			}
		}
		return convertToIntArray(intList);
	}
	
	public static int[] convertToIntArray(Collection<Integer> col) {
		int[] result = new int[col.size()];

		int index = 0;
		for(Integer element : col) {
			result[index] = element.intValue();
			index++;
		}
		return result;
	}
}
