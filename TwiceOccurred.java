package com.elc.java.programs;

public class TwiceOccurred {
static void twice(int arr[])
{
	
	for (int i = 0; i < arr.length; i++) {
		int count =0;
		for (int j=0; j < arr.length; j++) {
			if(j< i && arr[i]==arr[j])
			{
				break;
			}
		if(arr[i]==arr[j]  )
		{
			count++;
		}
		if(j==arr.length-1 && count==2)
		{
			System.out.println( "The twice occurred value is : "+arr[i]);
		}
		
		}
	}
}
public static void main(String[] args) {
	int arr[]= {2,3,5,6,2,5};
	TwiceOccurred.twice(arr);
}
}
