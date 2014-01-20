package com.henchao.sort;

import java.util.List;

import com.henchao.sort.algorithms.BubbleSort;
import com.henchao.sort.utilities.ListGenerator;

public class SortingEngine {

	public static void main(String[] args) {
		List unsortedElements = ListGenerator.generateRandomIntegerList(10);
		
		System.out.println(unsortedElements);
		System.out.println(BubbleSort.beginSort(unsortedElements, unsortedElements.size()));
	}
}
