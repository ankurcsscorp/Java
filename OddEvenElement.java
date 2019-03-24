package com.elc.java.programs;

import java.util.*;

public class OddEvenElement {

	static void oddEven(int arr[], int n) {
		Arrays.sort(arr);

		Vector v1 = new Vector(); 
		Vector v2 = new Vector(); 

		for (int i = 0; i < n; i++)
			if (arr[i] % 2 == 0)
				v1.add(arr[i]);
			else
				v2.add(arr[i]);

		int index = 0, i = 0, j = 0;

		boolean element = false;

		if (arr[0] % 2 == 0)
			element = true;

		while (index < n) {

		
			if (element == true) {
				arr[index] = (int) v1.get(i);
				i += 1;
				index += 1;
				element = !element;
			}

		
			else {
				arr[index] = (int) v2.get(j);
				j += 1;
				index += 1;
				element = !element;
			}
		}

		
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	
	public static void main(String[] args) {
		int arr[] = { 5,8,2,6,1,9 };
		int n = arr.length;

		OddEvenElement.oddEven(arr, n);
	}
}
