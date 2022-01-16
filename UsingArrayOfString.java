package com.phase1;

public class UsingArrayOfString {

	public static void main(String[] args) {
	
		String[] stringArray1 = new String[] {"R","S","T"};
		String[] stringArray2 = {"R","S","T"};
		
		String[] stringArray3 = new String[3];
		stringArray3[0] = "R";
		stringArray3[1] = "S";
		stringArray3[2] = "T";
		for (int i = 0; i < stringArray3.length; i++) {
			System.out.println(stringArray3[i]);
			}
		System.out.println( stringArray3.length);

	}

}
