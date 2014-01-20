package com.henchao.sort.algorithms;

import java.util.List;

import com.henchao.sort.utilities.ListElement;

public class BubbleSort {
	
	public static List beginSort(List toBeSorted, int size){
		if (size == 2) {
			bubbleSortComparison(toBeSorted, 0);
		} else {
			for (int j = 0; j < size - 1; j++ ){
				bubbleSortComparison(toBeSorted, j);
			}
			beginSort(toBeSorted, size-1);
		}
		return toBeSorted;
	}
	
	private static void bubbleSortComparison(List<ListElement> toBeCompared, int index) {
		if (toBeCompared.get(index).isGreaterThan(toBeCompared.get(index+1))){
			ListElement temp = toBeCompared.get(index);
			toBeCompared.set(index, toBeCompared.get(index + 1));
			toBeCompared.set(index + 1, temp);
		}
	}
	
}
