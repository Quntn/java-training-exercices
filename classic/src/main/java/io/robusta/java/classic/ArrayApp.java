package io.robusta.java.classic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

	int[] buildArray(int a, int b, int c) {

		int[] myArray = { a, b, c };
		return myArray;
	}

	boolean equality(int[] array1, int[] array2) {

		int i;
		for (i = 0; i <array1.length && i < array2.length; i++) {

			if (array1[i] == array2[i]) {
				///i++;
				
			} else {
				System.out.println("no equals");
				
				return false;
			}
			
		}
		return true;
	}

	String asString(int[] numbers) {

		String newArray = "";
		for (int i : numbers) {
			newArray += Integer.toString(i) + ":";
		}

		System.out.println(newArray);
		return newArray;

	}

	String asStringJoin(int[] numbers) {
		String newArray = "";
		int j=0;
		for (int i : numbers) {
			j++;
			if (j == numbers.length) {

				newArray += Integer.toString(i);
			}else{
				newArray += Integer.toString(i) + ":";
			}
		}

		System.out.println(newArray);
		return newArray;
	}

	String asString(String[] strings) {
		
		
		
		return null;
	}

	String asString(Card[] cards) {
		return null;
	}

}
