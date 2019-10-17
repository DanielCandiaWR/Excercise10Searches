package com.exercise10searches.app;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		//Constants declaration
		final int ARRAY_SIZE = 10;
		
		//Variables declaration
		int numberToFind = 0;
		int indexFound = -1;
		int limitInf = 0;
		int limitSup = ARRAY_SIZE-1;
		int pivotal = (limitSup-limitInf)/2;
		int temp = 0;
		//Array declaration
		int[] mainArray = new int[ARRAY_SIZE];
		//Objects construction
		Random randomNumbers = new Random(System.nanoTime());
		Scanner scan = new Scanner(System.in);
		
		//Array Initialization
		for(int i=0;i<ARRAY_SIZE;i++) {
			mainArray[i] = randomNumbers.nextInt(101);
		}
		//Array visualization
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(mainArray[i]+" ");
		}
		
		System.out.println();
		//Sorting algorithm
		for(int i=0;i<ARRAY_SIZE;i++) {
			for(int j=0;j<ARRAY_SIZE-1;j++) {
				if(mainArray[j]>mainArray[j+1]) {
					temp = mainArray[j+1];
					mainArray[j+1] = mainArray[j];
					mainArray[j] = temp;
				}
			}
		}
		
		//Visualization of sort array
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(mainArray[i]+" ");
		}
		
		//Ask the user for the number to find
		do {
			System.out.print("\nInput the number to find inside the array (0-100): ");
			numberToFind = scan.nextInt();
			if(numberToFind<0) {
				System.out.println("Number must be zero or positive value!");
			}
		}while(numberToFind<0);
		
		//Binary Search Algorithm
		while(limitInf<=limitSup) {
			pivotal = limitInf+((limitSup-limitInf)/2);
			if(numberToFind==mainArray[pivotal]) {
				indexFound = pivotal;
				break;
			}else if(numberToFind>mainArray[pivotal]) {
				limitInf = pivotal+1;
			}else if(numberToFind<mainArray[pivotal]) {
				limitSup = pivotal-1;
			}
		}
		if(indexFound!=-1) {
			System.out.println("\nElement found at index: "+indexFound);
		}else {
			System.out.println("\nElement not present in the Array!!");
		}
	}
}
