package com.henchao.sort.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {
	
	public static List generateRandomIntegerList(int size) {
		List<ListElement> l = new ArrayList<ListElement>();
		
		Random randomNumberGenerator = new Random();
		
		for (int i = 0; i < size; i++) {
			ListElement le = new ListElement(randomNumberGenerator.nextInt(size * 10));
			l.add(le);
		}
		
		return l;
	}

}
