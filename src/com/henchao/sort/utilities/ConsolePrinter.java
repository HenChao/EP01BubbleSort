package com.henchao.sort.utilities;

import java.util.List;

public class ConsolePrinter {

	public static void printArray(List<ListElement> toBePrinted){
		for (int i = 0; i < toBePrinted.size() ; i++ ){
			ListElement le = toBePrinted.get(i);
			if (le.isModified()){
				System.out.print( le.getValue() + "* ");
				le.setModified(false);
			}
			else
				System.out.print( le.getValue() + " ");
		}
		System.out.println();
	}
	
}
