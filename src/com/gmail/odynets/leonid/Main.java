package com.gmail.odynets.leonid;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int oddNumber = 0;
		
		for(int element:array) {
			if (element % 2 != 0) {
				oddNumber += 1;
			}
		}
		System.out.println("Odd number = " + oddNumber);
	}

}
